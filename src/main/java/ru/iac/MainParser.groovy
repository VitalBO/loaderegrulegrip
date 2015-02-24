package ru.iac

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.egrip.XMLParserEGRIP
import ru.iac.egrul.XMLParserEGRUL
import ru.iac.entity.Ip

/**
 * Created by konenkov on 17.02.2015.
 */
public class MainParser {

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
        parse(mainParser.getProps().get("pathToFile") as File)

    }

    public static void parse(File filePath) {

        def DATA = new XmlSlurper().parse(filePath)
        HashMap<String, String> resultImport = null

        if (DATA.IP.@IDDOK != "") {
            resultImport = XMLParserEGRIP.parse(filePath)
        } else if (DATA.UL.@IDDOK != "") {
            resultImport = XMLParserEGRUL.parse(filePath)
        } else {
            log.info("Incorrect file structure")
        }
Ip ip = null;
        log.debug("Start saving IP with OGRN " + ip.getIdip() + " to DB")
        try {
            EgrulDBDAO.saveOrUpdate(ip)
            log.info("Save to EGRIP IP with OGRN " + ip.getOgrn())
            resultImport.put(ip.getOgrn(), "Success")
        } catch (Exception ex) {
            log.debug("Error saving EGRIP IP with OGRN " + ip.getOgrn())
            log.debug(ex.printStackTrace())
            resultImport.put(ip.getOgrn(), "Fail")
        }
        
        
        
        log.debug("Call procedure to linking EAS ID to ULADR table")
        EgrulDBDAO.callProcedure()
        
        for (Map.Entry<String, String> entry : resultImport.entrySet()) {
            if (entry.getValue().equals("Fail"))
            log.info(entry.getKey() + " " + entry.getValue())

        }
        System.exit(0)
    }
}
