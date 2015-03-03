package ru.iac

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.entity.Ip
import ru.iac.entity.Ul

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/**
 * Created by konenkov on 17.02.2015.
 */
public class MainParser {
    HashMap<String, Integer> resultImport = new HashMap<>()

    private Properties getProps() {
        return properties
    }
    private final Properties properties;
    private static Logger log = LoggerFactory.getLogger(MainParser.class);

    public MainParser() {
        properties = new Properties();
        try {
            properties.load(new FileReader("loadtoegrul.cfg"));
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

    public void parse(File filePath) {

        Comparator<File> comparator = new DataFileComparator();
        PriorityQueue<File> queue =
                new PriorityQueue<File>(10, comparator);

        for (File temp : filePath.listFiles(new FileFilter() {
            @Override
            boolean accept(File pathname) {
                if (pathname.getName().endsWith(".XML")) {
                    return true
                } else return false
            }
        })) {
            queue.add(temp)
        }
        int threads = 1
        while (queue.peek() != null) {
            File temp = queue.poll()
            log.debug("Start parsing file " + temp.getName())
            resultImport = parseFile(temp, threads)
            if (threads < 10) threads++
            //println(queue.poll().getName())
        }

        for (String key : resultImport.keySet()) {
            log.info(key + "\t  - " + resultImport.get(key))
        }

        System.exit(0)
    }

    HashMap parseFile(File filePath, int treadpool) {
        def DATA = new XmlSlurper().parse(filePath)
        Ul ul
        Ip ip
        int result
        ExecutorService service = Executors.newFixedThreadPool(treadpool);

        if (DATA.IP.@IDDOK != "") {
            DATA.IP.each {
                service.submit(new Runnable() {
                    @Override
                    void run() {
                        ip = XMLParserEGRIP.parse(it);
                        if (ip != null) result = EgrulService.saveIpToDB(ip)
                        else log.error("Error parse file" + filePath.getName())
                        resultImport.put("File: " + filePath.getName() + ", OGRN: " + ip.getOgrn(), result)
                    }
                })

            }
        } else if (DATA.UL.@IDDOK != "") {
            DATA.UL.each {
                service.submit(new Runnable() {
                    @Override
                    void run() {
                        ul = XMLParserEGRUL.parse(it)
                        if (ul != null) result = EgrulService.saveUlToDB(ul)
                        else log.error("Error parse file" + filePath.getName())
                        resultImport.put("File: " + filePath.getName() + ", OGRN: " + ul.getOgrn(), result)
                    }
                })
            }
        } else {
            log.error("Incorrect file structure")
        }
        service.awaitTermination(2, TimeUnit.HOURS)
        return resultImport
    }


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
}
