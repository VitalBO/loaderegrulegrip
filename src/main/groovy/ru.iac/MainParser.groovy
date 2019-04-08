package ru.iac

import groovy.util.slurpersupport.GPathResult
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.xml.sax.SAXParseException
import ru.iac.entity.Ip
import ru.iac.entity.Ul

import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 * Created by konenkov on 17.02.2015.
 * Main class to execute loading to db for egrul/egrip*
 */
public class MainParser {
    HashMap<String, Integer> resultImport = new HashMap<>()
    private int threads = 1
    private int maxthreads = 10
    private int countFilesToMaxThreads

    private Properties getProps() {
        return properties
    }
    private final Properties properties;
    private static Logger log = LoggerFactory.getLogger(MainParser.class);

    public MainParser() {
        properties = new Properties();
        try {
            properties.load(new FileReader("loadtoegrul.properties"));
            threads = this.getProps().get("threadpool") as int
            maxthreads = this.getProps().get("maxthreadpool") as int
            countFilesToMaxThreads = this.getProps().get("countFileToMaxThreads") as int

        } catch (IOException e) {
            System.out.println("Config not found.");
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        MainParser mainParser = new MainParser()
        mainParser.parse(mainParser.getProps().get("pathToFile") as File)

    }
/**
 * Method to create files queue *
 * @param filePath - directory with files
*/
    public void parse(File filePath) {

        Comparator<File> comparator = new DataFileComparator();
        PriorityQueue<File> queue =
                new PriorityQueue<File>(10, comparator);

        for (File temp : filePath.listFiles(new FileFilter() {
            @Override
            boolean accept(File pathname) {
                return pathname.getName().toUpperCase().endsWith(".XML")
            }
        })) {
            queue.add(temp)
        }
        int countFile = 0
        while (queue.peek() != null) {
            File temp = queue.poll()
            log.info("Start parsing file " + temp.getName())
            resultImport.putAll(parseFile(temp))
            countFile++
            if (countFile > countFilesToMaxThreads) threads = maxthreads
        }
        int countFail = 0
        for (String key : resultImport.keySet()) {
            log.info(key + "\t  - " + resultImport.get(key))
            if (resultImport.get(key) == 1) countFail++
        }
        log.info("Total amount " + resultImport.size() + "; fails " + countFail + "; percent fails " + resultImport.size() * countFail / 100 + "%")
        System.exit(0)
    }
/**
 * Main method to create threads and parsing files*
 * @param filePath - concrete file
 * @return - result saving to db
 */
    HashMap parseFile(File filePath) {
        def DATA
        try {
            DATA = new XmlSlurper().parse(filePath)
        } catch (SAXParseException e) {
            log.error("Error parsing file " + filePath.getName(), e)
            resultImport.put("File: " + filePath.getName() + " error parsing", Util.ERROR)
            return resultImport
        }
        ThreadPoolExecutor poolExecutor = Executors.newFixedThreadPool(threads) as ThreadPoolExecutor
        HibernateUtil.getSession().close()
        if (DATA.IP.@IDDOK != "") {
            DATA.IP.each {
                poolExecutor.submit(new ThreadIP(filePath, it))
            }
        } else if (DATA.UL.@IDDOK != "") {
            DATA.UL.each {
                poolExecutor.submit(new ThreadUL(filePath, it))
            }
        } else if (DATA.@ИдФайл ==~ /VO_RUGFO.*/){
            DATA.Документ.each{
                poolExecutor.submit(new ThreadULnew(filePath, it))
            }
        } else if (DATA.@ИдФайл ==~ /VO_RIGFO.*/){
            DATA.Документ.each {
                poolExecutor.submit(new ThreadIPnew(filePath, it))
            }
        } else {
            log.error("Incorrect file structure")
        }
        while (poolExecutor.getActiveCount() != 0) {
            TimeUnit.SECONDS.sleep(10)
        }
        poolExecutor.shutdown()
        return resultImport
    }
/**
 * Comparator for create queue files to load*
 */
    private class DataFileComparator implements Comparator<File> {

        @Override
        int compare(File f1, File f2) {

            if(f1.getName().length()<40 & f2.getName().length()<40){
                String o1 = f1.getName().substring(12).replaceAll("_", "").toUpperCase().replaceAll(".XML", "")
                String o2 = f2.getName().substring(12).replaceAll("_", "").toUpperCase().replaceAll(".XML", "")
                if (Integer.parseInt(o1) > Integer.parseInt(o2)) return 1
                if (Integer.parseInt(o1) < Integer.parseInt(o2)) return -1
                return 0
            }
            if (f1.getName().length()>40 & f2.getName().length()>40){
                String o1 = f1.getName().substring(28).replaceAll("-","").toUpperCase().replaceAll(".XML", "")
                String o2 = f2.getName().substring(28).replaceAll("-","").toUpperCase().replaceAll(".XML", "")
                if (o1.compareTo(o2)>0) return 1
                if (o1.compareTo(o2)<0) return -1
                return 0
            }
            if (f1.getName().length()<40 & f2.getName().length()>40) return 1
            if (f1.getName().length()>40 & f2.getName().length()<40) return -1
        }
    }
/**
 * Thread to parse and save UL *
 */
    public class ThreadUL implements Runnable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadUL(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        void run() {
            Ul ul = XMLParserEGRUL.parse(gPathResult)
            if (ul != null) result = EgrulService.saveUlToDB(ul)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ul.getOgrn(), result)
        }
    }
/**
 * Thread to parse and save UL (New Formats)*
 */
    public class ThreadULnew implements Runnable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadULnew(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        void run() {
            Ul ul = XMLParserEGRULNF.parse(gPathResult)
            if (ul != null) result = EgrulService.saveUlToDB(ul)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ul.getOgrn(), result)
        }
    }
/**
 * Thread to parse and save IP *
 */
    public class ThreadIP implements Runnable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadIP(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        void run() {

            Ip ip = XMLParserEGRIP.parse(gPathResult);
            if (ip != null) result = EgrulService.saveIpToDB(ip)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ip.getOgrn(), result)
        }
    }
/**
 * Thread to parse and save IP (New Formats)*
 */
    public class ThreadIPnew implements Runnable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadIPnew(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        void run() {

            Ip ip = XMLParserEGRIPNF.parse(gPathResult);
            if (ip != null) result = EgrulService.saveIpToDB(ip)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ip.getOgrn(), result)
        }
    }
}