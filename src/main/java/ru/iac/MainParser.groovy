package ru.iac

import groovy.util.slurpersupport.GPathResult
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.entity.Ip
import ru.iac.entity.Ul

import java.util.concurrent.Callable
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


    private Properties getProps() {
        return properties
    }
    private final Properties properties;
    private static Logger log = LoggerFactory.getLogger(MainParser.class);

    public MainParser() {
        properties = new Properties();
        try {
            properties.load(new FileReader("loadtoegrul.cfg"));
            threads = this.getProps().get("treadpool") as int
            maxthreads = this.getProps().get("maxthreadpool") as int

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
                return pathname.getName().endsWith(".XML")
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
            if (countFile > 2) threads = maxthreads
        }
        int countFail = 0
        for (String key : resultImport.keySet()) {
            log.info(key + "\t  - " + resultImport.get(key))
            if (resultImport.get(key) == 1) countFail++
        }
        log.info("Total amount " + resultImport.size() + "; fails " + countFail + "; percent fails " + countFail / resultImport.size() + "%")
        System.exit(0)
    }
/**
 * Main method to create threads and parsing files* 
 * @param filePath - concrete file
 * @return - result saving to db
 */
    HashMap parseFile(File filePath) {

        def DATA = new XmlSlurper().parse(filePath)

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
        } else {
            log.error("Incorrect file structure")
        }

        while (poolExecutor.getActiveCount() != 0) {
            TimeUnit.SECONDS.sleep(10)
        }

        return resultImport
    }

    /**
     * Comparator for create queue files to load* 
     */

    private class DataFileComparator implements Comparator<File> {

        @Override
        int compare(File f1, File f2) {


            String o1 = f1.getName().replaceAll("RIV_M_78021_", "").replaceAll("RUV_M_78021_", "").replaceAll("_", "").replaceAll(".XML", "")
            String o2 = f2.getName().replaceAll("RIV_M_78021_", "").replaceAll("RUV_M_78021_", "").replaceAll("_", "").replaceAll(".XML", "")
            if (Integer.parseInt(o1) > Integer.parseInt(o2)) return 1
            if (Integer.parseInt(o1) < Integer.parseInt(o2)) return -1
            return 0
        }
    }
/**
 * Thread to parse and save UL *
 */
    public class ThreadUL implements Callable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadUL(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        Object call() throws Exception {
            Ul ul = XMLParserEGRUL.parse(gPathResult)
            if (ul != null) result = EgrulService.saveUlToDB(ul)
            else log.error("Error parse file " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ul.getOgrn(), result)
            return null
        }
    }
/**
 * Thread to parse and save IP *
 */
    public class ThreadIP implements Callable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadIP(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        Object call() throws Exception {

            Ip ip = XMLParserEGRIP.parse(gPathResult);
            if (ip != null) result = EgrulService.saveIpToDB(ip)
            else log.error("Error parse file" + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ip.getOgrn(), result)
            return null
        }
    }
}
