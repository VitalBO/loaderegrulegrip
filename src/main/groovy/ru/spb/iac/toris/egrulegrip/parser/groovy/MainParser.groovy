package ru.spb.iac.toris.egrulegrip.parser.groovy

import groovy.util.slurpersupport.GPathResult
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.xml.sax.SAXParseException
import ru.spb.iac.toris.egrulegrip.configuration.AppConfiguration
import ru.spb.iac.toris.egrulegrip.model.Ip
import ru.spb.iac.toris.egrulegrip.model.Ul
import ru.spb.iac.toris.egrulegrip.parser.IMainParser
import ru.spb.iac.toris.egrulegrip.repository.EgrulEgripSvcRepository
import ru.spb.iac.toris.egrulegrip.utils.Util

import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

@Service
class MainParser implements  IMainParser{
      private static Logger log = LogManager.getLogger(MainParser.class)

    HashMap<String, Integer> resultImport = new HashMap<>()

    private final AppConfiguration appConfiguration

    @Autowired
    private final EgrulEgripSvcRepository egrulEgripSvcRepository

    private int threads = 1
    private int maxthreads = 10
    private int countFilesToMaxThreads
    private String tmpDataDir;

    @Autowired
    MainParser(AppConfiguration appConfiguration) {
        this.appConfiguration=appConfiguration


        try {
            threads = appConfiguration.getThreads()
            maxthreads = appConfiguration.getMaxthreads()
            countFilesToMaxThreads = appConfiguration.getCountFilesToMaxThreads()
            tmpDataDir = appConfiguration.getTmpDataDir()

        } catch (IOException e) {
            System.out.println("Config not found.")
            System.out.println(e.getMessage())
            System.exit(1)
        }
    }

/**
 * Method to create files queue *
 * @param filePath - directory with files
*/
    HashMap parse(File filePath) {
        filePath.listFiles()
        Comparator<File> comparator = new DataFileComparator()
        PriorityQueue<File> queue =
                new PriorityQueue<File>(10, comparator)

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
        log.info("Total amount " + resultImport.size() + "; fails " + countFail + "; percent fails " +  countFail /resultImport.size()* 100 + "%")
        //System.exit(0)
        return resultImport
    }
    HashMap parse(File[] filePath) {
        Comparator<File> comparator = new DataFileComparator()
        PriorityQueue<File> queue =
                new PriorityQueue<File>(10, comparator)

        for (File temp : filePath) {
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
        log.info("Total amount " + resultImport.size() + "; fails " + countFail + "; percent fails " + countFail / resultImport.size() *  100 + "%")
        //System.exit(0)
        return resultImport
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

    @Override
    void parse() {
        parse(new File(appConfiguration.getTmpDataDir()))
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
    class ThreadUL implements Runnable {
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
            if (ul != null) result = egrulEgripSvcRepository.saveUlToDB(ul)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ul.getOgrn(), result)
        }
    }
/**
 * Thread to parse and save UL (New Formats)*
 */
    class ThreadULnew implements Runnable {
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
            if (ul != null) result = egrulEgripSvcRepository.saveUlToDB(ul)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ul.getOgrn(), result)
        }
    }
/**
 * Thread to parse and save IP *
 */
    class ThreadIP implements Runnable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadIP(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        void run() {

            Ip ip = XMLParserEGRIP.parse(gPathResult)
            if (ip != null) result = egrulEgripSvcRepository.saveIpToDB(ip)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ip.getOgrn(), result)
        }
    }
/**
 * Thread to parse and save IP (New Formats)*
 */
    class ThreadIPnew implements Runnable {
        GPathResult gPathResult
        File filePath
        int result

        ThreadIPnew(File filePath, GPathResult gPathResult) {
            this.filePath = filePath
            this.gPathResult = gPathResult
        }

        @Override
        void run() {

            Ip ip = XMLParserEGRIPNF.parse(gPathResult)
            if (ip != null) result = egrulEgripSvcRepository.saveIpToDB(ip)
            else log.error("Error parse file: " + filePath.getName())
            resultImport.put("File: " + filePath.getName() + ", OGRN: " + ip.getOgrn(), result)
        }
    }
}