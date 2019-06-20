package ru.spb.iac.toris.egrulegrip.loader

import org.hibernate.Session
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import ru.spb.iac.toris.egrulegrip.model.*
import ru.spb.iac.toris.egrulegrip.parser.IMainParser
import ru.spb.iac.toris.egrulegrip.repository.IDataRepository
import ru.spb.iac.toris.egrulegrip.repository.IEgrulEgripSvcRepository
import ru.spb.iac.toris.egrulegrip.utils.HibernateUtil
import ru.spb.iac.toris.egrulegrip.utils.Util

class TestParser extends Assert {

    @Autowired
    private IMainParser mainParser

    private IDataRepository dataRepository

    private IEgrulEgripSvcRepository svcRepository

    @Autowired
    private final HibernateUtil hibernateUtil


    //Old format
    //EGRIP
    private static File filePathEgrip = new File("src/test/groovy/springboot/topjava/ru/testEGRIP.XML")
    private static File filePathEgrul = new File("src/test/groovy/springboot/topjava/ru/testEGRUL.XML")
    private static File filePathEgripOneElement = new File("src/test/groovy/springboot/topjava/ru/testEgripForTestParser.XML")
    //EGRUL
    private static File filePathEgripOneElementErr = new File("src/test/groovy/springboot/topjava/ru/testEgripForTestParserErr.XML")
    private static File filePathEgrulOneElement = new File("src/test/groovy/springboot/topjava/ru/testEgrulForTestParser.XML")
    private static File filePathEgrulOneElementErr = new File("src/test/groovy/springboot/topjava/ru/testEgrulForTestParserErr.XML")

    //New format
    //EGRIP
    private static File filePathEgripNF = new File("src/test/groovy/springboot/topjava/ru/testEGRIPNF.XML")
    private static File filePathEgripNFOneElement = new File("src/test/groovy/springboot/topjava/ru/testEgripNFForTestParser.XML")
    private static File filePathEgripNFOneElementErr = new File("src/test/groovy/springboot/topjava/ru/testEgripNFForTestParserErr.XML")
    //EGRUL
    private static File filePathEgrulNF = new File("src/test/groovy/springboot/topjava/ru/testEGRULNF.XML")
    private static File filePathEgrulNFOneElement = new File("src/test/groovy/springboot/topjava/ru/testEgrulNFForTestParser.XML")
    private static File filePathEgrulNFOneElementErr = new File("src/test/groovy/springboot/topjava/ru/testEgrulNFForTestParserErr.XML")

    @Ignore("integration test with db")
    @Test
    void testSessionFactory() {

//        Properties settings = new Properties()
//        settings.put(Environment./*JPA_JDBC_*/DRIVER, this.connectConfiguration.getDriver_class())
//        settings.put(Environment./*JPA_JDBC_*/URL, this.connectConfiguration.getUrl())
//        settings.put(Environment./*JPA_JDBC_*/USER, this.connectConfiguration.getUsername())
//        settings.put(Environment./*JPA_JDBC_*/PASS/*WORD*/, this.connectConfiguration.getPassword())
//        Configuration config = new Configuration()
//        config.addProperties(settings)
//        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").applySettings(config.getProperties()).build()
//        SessionFactory factory = new Configuration().buildSessionFactory(registry)
//        Session session = factory.openSession()
        Session session = hibernateUtil.getSession()
        session.close()
    }

    //Old format
    //@Ignore("integration test with db")
    @Test
    void testParseFileEgrip() {
 //       MainParser mp = new MainParser()
        HashMap<String, Integer> result = mainParser.parseFile(filePathEgrip)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //New format
    @Ignore("integration test with db")
    @Test
    void testParseFileEgripNF() {

        HashMap<String, Integer> result = mainParser.parseFile(filePathEgripNF)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //Old format
    @Ignore("integration test with db")
    @Test
    void testParseFileEgrul() {

        HashMap<String, Integer> result = mainParser.parseFile(filePathEgrul)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //New format
    @Ignore("integration test with db")
    @Test
    void testParseFileEgrulNF() {

        HashMap<String, Integer> result = mainParser.parseFile(filePathEgrulNF)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //Old format
    @Ignore("integration test with db")
    @Test
    void testParseFileEgrulErr() {

        HashMap<String, Integer> result = mainParser.parseFile(filePathEgrulOneElementErr)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //New format
    @Ignore("integration test with db")
    @Test
    void testParseFileEgrulNFErr() {

        HashMap<String, Integer> result = mainParser.parseFile(filePathEgrulNFOneElementErr)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 1)
        }
    }

    @Test
    void testInstanceObjects() {
        ArrayList<EgrulEntity> list = new ArrayList<EgrulEntity>()

        Ct ct1 = new Ct(idc: 10000000000001, name: "123123", kodKl: "123123")
        Ct ct2 = new Ct(idc: 10000000000001, name: "123123", kodKl: "123123")
        Ct ct3 = new Ct(idc: 10000000000201, name: "123123", kodKl: "123123")

        ct1 = Util.check(ct1, list) as Ct
        ct2 = Util.check(ct2, list) as Ct
        ct3 = Util.check(ct3, list) as Ct
        assertEquals(list.size(), 2)
        assertTrue(list.contains(ct1))
        assertTrue(list.contains(ct2))
        assertTrue(list.contains(ct3))
    }

    @Ignore("integration test with db")
    @Test
    void testAddress() {
        Uladr uladr = new Uladr(
                kodgorod: "12312",
                fulladdress: new Address(
                        okato: "123"
                )
        )
        dataRepository.saveOrUpdate(uladr)
        Session session = HibernateUtil.getSession()
        Uladr uladr1 = (Uladr) dataRepository.getNamedQuery(Uladr.FIND_BY_KODGOROD, "kodgorod", uladr.getKodgorod(), session)
        assertEquals(uladr.getKodgorod(), uladr1.getKodgorod())
        assertEquals(uladr.getFulladdress().getOkato(), uladr1.getFulladdress().getOkato())
        dataRepository.removeFromDB(uladr1)
        session.close()
    }

    //Old Format
    @Ignore
    @Test
    void testParseEgrip() {

        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it)
            assertEquals(ip.getInn(), "110200037840")
            assertEquals(ip.getIdip(), "100000000000001")
            assertEquals(ip.getLicenzs().size(), 10)
            assertEquals(ip.getIpgosregs().size(), 2)
            assertEquals(ip.getIpokved().size(), 2)
            assertEquals(ip.getIpfss().getIdfss().getKod(), "7830")
            assertEquals(1, ip.getIpokved().get(1).getMain())

        }
    }

    //New Format
    @Ignore
    @Test
    void testParseEgripNF() {

        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripNFOneElement)
        Ip ip
        EGRIP_IP_DATA.Документ.each {
            ip = XMLParserEGRIPNF.parse(it)
            assertEquals(ip.getInn(), "781435122782")
            assertEquals(ip.getIdip(), "308784733200657")
            assertEquals(ip.getLicenzs().size(), 1)
            assertEquals(ip.getIpgosregs().size(), 14)
            assertEquals(ip.getIpokved().size(), 2)
            assertEquals(ip.getIpmns().getIdmns().getKod(), "7801")
            assertEquals(1, ip.getIpokved().get(0).getMain())

        }
    }

    //Old Format
    @Ignore
    @Test
    void testParseEgrul() {

        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulOneElement)
        Ul ul
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            assertNotNull("Ошибка при конвертации объекта, парсер вернул null", ul)
            assertEquals(ul.getLicenzs().get(1).getIdvidlic().size(), 6)
            assertEquals(ul.getLicenzs().size(), 2)
            assertEquals(ul.getUlokved().size(), 2)
            assertEquals(ul.getUlname().getIdopf().getIdopf(), 100047)
            assertEquals(ul.getUladr().getFulladdress().getDom(), "4")
            assertEquals(ul.getUladr().getFulladdress().getKorp(), "ЛИТЕР К")
            assertEquals(ul.getUladr().getFulladdress().getKvart(), "3, 4, 18Н")
            assertEquals(ul.getIdul(), "1000000000002")
            assertEquals(1, ul.getUlokved().get(1).getMain())
        }
    }

    //New Format
    @Ignore
    @Test
    void testParseEgrulNF() {

        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulNFOneElement)
        Ul ul
        EGRIP_UL_DATA.Документ.each {
            ul = XMLParserEGRULNF.parse(it)
            assertNotNull("Ошибка при конвертации объекта, парсер вернул null", ul)
            assertEquals(ul.getUlokved().size(), 11)
            assertEquals(ul.getUlname().getIdopf().getIdopf(), 12300)
            assertEquals(ul.getUladr().getFulladdress().getDom(), "ДОМ 31")
            assertEquals(ul.getUladr().getFulladdress().getKvart(), "КВАРТИРА 5")
            assertEquals(ul.getIdul(), "1147847267039")
            assertEquals(1, ul.getUlokved().get(0).getMain())
        }
    }

    //Old Format
    @Ignore
    @Test
    void testParseEgripErr() {
        HashMap map = mainParser.parseFile(filePathEgripOneElementErr)
        assertTrue(map.values().contains(Util.ERROR))

    }

    //New Format
    @Ignore
    @Test
    void testParseEgripNFErr() {
        HashMap map = mainParser.parseFile(filePathEgripNFOneElementErr)
        assertTrue(map.values().contains(Util.ERROR))

    }

    //Old Format
    @Ignore("integration test with db")
    @Test
    void testPersistEgrip() {
        Ip ip1 = getTestIp()
        svcRepository.saveIpToDB(ip1)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "100000000000001")
        assertEquals(ip1.getInn(), ip2.getInn())
        assertEquals(ip1.getLicenzs().size(), ip2.getLicenzs().size())
        assertEquals(ip1.getIpfoms().getIdfoms().getName(), ip2.getIpfoms().getIdfoms().getName())
        dataRepository.removeFromDB(ip2)
    }

    //New Format
    @Ignore("integration test with db")
    @Test
    void testPersistEgripNF() {
        Ip ip1 = getTestIpNF()
        svcRepository.saveIpToDB(ip1)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "308784733200657")
        assertEquals(ip1.getInn(), ip2.getInn())
        assertEquals(ip1.getLicenzs().size(), ip2.getLicenzs().size())
//        assertEquals(ip1.getIpfoms().getIdfoms().getName(), ip2.getIpfoms().getIdfoms().getName())
        dataRepository.removeFromDB(ip2)
    }

    //Old Format
    @Ignore("integration test with db")
    @Test
    void testPersistEgrul() {
        Ul ul1 = getTestUl()
        svcRepository.saveUlToDB(ul1)
        Ul ul2 = (Ul) dataRepository.getFromDB(Ul.getName(), "1000000000002")
        assertEquals(ul1.getInn(), ul2.getInn())
        assertEquals(ul1.getLicenzs().size(), ul2.getLicenzs().size())
        assertEquals(ul1.getUlfoms().getIdfoms().getName(), ul2.getUlfoms().getIdfoms().getName())
        dataRepository.removeFromDB(ul2)
    }

    //New Format
    @Ignore("integration test with db")
    @Test
    void testPersistEgrulNF() {
        Ul ul1 = getTestUlNF()
        svcRepository.saveUlToDB(ul1)
        Ul ul2 = (Ul) dataRepository.getFromDB(Ul.getName(), "1147847267039")
        assertEquals(ul1.getInn(), ul2.getInn())
        assertEquals(ul1.getUlokved().size(), ul2.getUlokved().size())
        assertEquals(ul1.getUlmns().getIdmns().getName(), ul2.getUlmns().getIdmns().getName())
        dataRepository.removeFromDB(ul2)
    }

    //Old Format
    @Ignore("integration test with db")
    @Test
    void testPersistEgripUpdate() {
        Ip ip1 = getTestIp()
        svcRepository.saveIpToDB(ip1)
        Ip ip3 = getTestIp()
        ip3.getLicenzs().add(new Licenz(
                idip: ip3,
                numlic: "test"
        )
        )
        ip3.getLicenzs().get(0).setNumlic("test2")
        svcRepository.saveIpToDB(ip3)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "100000000000001")
        assertEquals(ip3.getInn(), ip2.getInn())
        assertEquals(ip3.getLicenzs().size(), ip2.getLicenzs().size())
        dataRepository.removeFromDB(ip2)
    }

    //New Format
    @Ignore("integration test with db")
    @Test
    void testPersistEgripNFUpdate() {
        Ip ip1 = getTestIpNF()
        svcRepository.saveIpToDB(ip1)
        Ip ip3 = getTestIpNF()
        ip3.getLicenzs().add(new Licenz(
                idip: ip3,
                numlic: "test"
        )
        )
        ip3.getLicenzs().get(0).setNumlic("test2")
        svcRepository.saveIpToDB(ip3)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "308784733200657")
        assertEquals(ip3.getInn(), ip2.getInn())
        assertEquals(ip3.getLicenzs().size(), ip2.getLicenzs().size())
        dataRepository.removeFromDB(ip2)
    }

/**
 * method return test instance of Ip (Old Format)
 * @return Ip
 */
    private static Ip getTestIp() {
        Ip ip1 = null
        new File("src/test/groovy/ru/topjava/ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        return ip1
    }
/**
 * method return test instance of Ip (New Format)
 * @return Ip
 */
    private static Ip getTestIpNF() {
        Ip ip1 = null
        new File("src/test/groovy/ru/topjava/ipNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        return ip1
    }

/**
 * method return test instance of Ul (Old Format)
 * @return Ul
 */
    private static Ul getTestUl() {
        Ul ul1 = null
        new File("src/test/groovy/ru/topjava/ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        return ul1
    }
/**
 * method return test instance of Ul (New Format)
 * @return Ul
 */
    private static Ul getTestUlNF() {
        Ul ul1 = null
        new File("src/test/groovy/ru/topjava/ulNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        return ul1
    }

    /**
     * save test objects to file for use in testcases
     */

    //Old Format
    @Ignore
    @Test
    void serializeTestObjects() {
        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it)

            new File("src/test/groovy/ru/topjava/ip.ser").withObjectOutputStream { out -> out << ip }

        }
        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulOneElement)
        Ul ul
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            new File("src/test/groovy/ru/topjava/ul.ser").withObjectOutputStream { out -> out << ul }

        }

        Ip ip1
        new File("src/test/groovy/ru/topjava/ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        println("Id ip = " + ip1.getIdip())
        Ul ul1
        new File("src/test/groovy/ru/topjava/ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        println("Id ul = " + ul1.getIdul())
    }

    //New Format
    @Ignore
    @Test
    void serializeTestObjectsNF() {
        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripNFOneElement)
        Ip ip
        EGRIP_IP_DATA.Документ.each {
            ip = XMLParserEGRIPNF.parse(it)

            new File("src/test/groovy/ru/topjava/ipNF.ser").withObjectOutputStream { out -> out << ip }

        }

        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulNFOneElement)
        Ul ul
        EGRIP_UL_DATA.Документ.each {
            ul = XMLParserEGRULNF.parse(it)
            new File("src/test/groovy/ru/topjava/ulNF.ser").withObjectOutputStream { out -> out << ul }

        }

        Ip ip1
        new File("src/test/groovy/ru/topjava/ipNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        println("Id ip = " + ip1.getIdip())
        Ul ul1
        new File("src/test/groovy/ru/topjava/ulNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        println("Id ul = " + ul1.getIdul())
    }
}
