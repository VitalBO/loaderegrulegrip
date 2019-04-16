package ru.iac

import org.hibernate.Session
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import ru.iac.entity.*

/**
 * Created by konenkov on 20.02.2015.
 */
public class ParserTest extends Assert {

    //Old format
    //EGRIP
    private static File filePathEgrip = new File("src/test/groovy/ru/iac/testEGRIP.XML");
    private static File filePathEgrul = new File("src/test/groovy/ru/iac/testEGRUL.XML");
    private static File filePathEgripOneElement = new File("src/test/groovy/ru/iac/testEgripForTestParser.XML");
    //EGRUL
    private static File filePathEgripOneElementErr = new File("src/test/groovy/ru/iac/testEgripForTestParserErr.XML");
    private static File filePathEgrulOneElement = new File("src/test/groovy/ru/iac/testEgrulForTestParser.XML");
    private static File filePathEgrulOneElementErr = new File("src/test/groovy/ru/iac/testEgrulForTestParserErr.XML");

    //New format
    //EGRIP
    private static File filePathEgripNF = new File("src/test/groovy/ru/iac/testEGRIPNF.XML");
    private static File filePathEgripNFOneElement = new File("src/test/groovy/ru/iac/testEgripNFForTestParser.XML");
    private static File filePathEgripNFOneElementErr = new File("src/test/groovy/ru/iac/testEgripNFForTestParserErr.XML");
    //EGRUL
    private static File filePathEgrulNF = new File("src/test/groovy/ru/iac/testEGRULNF.XML");
    private static File filePathEgrulNFOneElement = new File("src/test/groovy/ru/iac/testEgrulNFForTestParser.XML");
    private static File filePathEgrulNFOneElementErr = new File("src/test/groovy/ru/iac/testEgrulNFForTestParserErr.XML");

    @Ignore("integration test with db")
    @Test
    public void testSessionFactory() {
        Session session = HibernateUtil.getSession();
        session.close();
    }

    //Old format
    @Ignore("integration test with db")
    @Test
    public void testParseFileEgrip() {
        MainParser mp = new MainParser()
        HashMap<String, Integer> result = mp.parseFile(filePathEgrip)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //New format
    @Ignore("integration test with db")
    @Test
    public void testParseFileEgripNF() {
        MainParser mp = new MainParser()
        HashMap<String, Integer> result = mp.parseFile(filePathEgripNF)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //Old format
    @Ignore("integration test with db")
    @Test
    public void testParseFileEgrul() {
        MainParser mp = new MainParser()
        HashMap<String, Integer> result = mp.parseFile(filePathEgrul)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //New format
    @Ignore("integration test with db")
    @Test
    public void testParseFileEgrulNF() {
        MainParser mp = new MainParser()
        HashMap<String, Integer> result = mp.parseFile(filePathEgrulNF)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //Old format
    @Ignore("integration test with db")
    @Test
    public void testParseFileEgrulErr() {
        MainParser mp = new MainParser()
        HashMap<String, Integer> result = mp.parseFile(filePathEgrulOneElementErr)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 0)
        }
    }

    //New format
    @Ignore("integration test with db")
    @Test
    public void testParseFileEgrulNFErr() {
        MainParser mp = new MainParser()
        HashMap<String, Integer> result = mp.parseFile(filePathEgrulNFOneElementErr)
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assertEquals(result.get(key), 1)
        }
    }

    @Test
    public void testInstanceObjects() {
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
    public void testAddress() {
        Uladr uladr = new Uladr(
                kodgorod: "12312",
                fulladdress: new Address(
                        okato: "123"
                )
        )
        EgrulDAO.saveOrUpdate(uladr)
        Session session = HibernateUtil.getSession();
        Uladr uladr1 = (Uladr) EgrulDAO.getNamedQuery(Uladr.FIND_BY_KODGOROD, "kodgorod", uladr.getKodgorod(), session);
        assertEquals(uladr.getKodgorod(), uladr1.getKodgorod())
        assertEquals(uladr.getFulladdress().getOkato(), uladr1.getFulladdress().getOkato())
        EgrulDAO.removeFromDB(uladr1)
        session.close()
    }

    //Old Format
    @Test
    public void testParseEgrip() {

        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip;
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it);
            assertEquals(ip.getInn(), "110200037840");
            assertEquals(ip.getIdip(), "100000000000001");
            assertEquals(ip.getLicenzs().size(), 10);
            assertEquals(ip.getIpgosregs().size(), 2);
            assertEquals(ip.getIpokved().size(), 2);
            assertEquals(ip.getIpfss().getIdfss().getKod(), "7830");
            assertEquals(1, ip.getIpokved().get(1).getMain())

        }
    }

    //New Format
    @Test
    public void testParseEgripNF() {

        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripNFOneElement)
        Ip ip;
        EGRIP_IP_DATA.Документ.each {
            ip = XMLParserEGRIPNF.parse(it);
            assertEquals(ip.getInn(), "781435122782");
            assertEquals(ip.getIdip(), "308784733200657");
            assertEquals(ip.getLicenzs().size(), 1);
            assertEquals(ip.getIpgosregs().size(), 14);
            assertEquals(ip.getIpokved().size(), 2);
            assertEquals(ip.getIpmns().getIdmns().getKod(), "7801");
            assertEquals(1, ip.getIpokved().get(0).getMain())

        }
    }

    //Old Format
    @Test
    public void testParseEgrul() {

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
    @Test
    public void testParseEgrulNF() {

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
    @Test
    public void testParseEgripErr() {

        MainParser mainParser = new MainParser()
        HashMap map = mainParser.parseFile(filePathEgripOneElementErr)
        assertTrue(map.values().contains(Util.ERROR))

    }

    //New Format
    @Test
    public void testParseEgripNFErr() {

        MainParser mainParser = new MainParser()
        HashMap map = mainParser.parseFile(filePathEgripNFOneElementErr)
        assertTrue(map.values().contains(Util.ERROR))

    }

    //Old Format
    @Ignore("integration test with db")
    @Test
    public void testPersistEgrip() {
        Ip ip1 = getTestIp()
        EgrulService.saveIpToDB(ip1)
        Ip ip2 = (Ip) EgrulDAO.getFromDB(Ip.getName(), "100000000000001")
        assertEquals(ip1.getInn(), ip2.getInn())
        assertEquals(ip1.getLicenzs().size(), ip2.getLicenzs().size())
        assertEquals(ip1.getIpfoms().getIdfoms().getName(), ip2.getIpfoms().getIdfoms().getName())
        EgrulDAO.removeFromDB(ip2)
    }

    //New Format
    @Ignore("integration test with db")
    @Test
    public void testPersistEgripNF() {
        Ip ip1 = getTestIpNF()
        EgrulService.saveIpToDB(ip1)
        Ip ip2 = (Ip) EgrulDAO.getFromDB(Ip.getName(), "308784733200657")
        assertEquals(ip1.getInn(), ip2.getInn())
        assertEquals(ip1.getLicenzs().size(), ip2.getLicenzs().size())
//        assertEquals(ip1.getIpfoms().getIdfoms().getName(), ip2.getIpfoms().getIdfoms().getName())
        EgrulDAO.removeFromDB(ip2)
    }

    //Old Format
    @Ignore("integration test with db")
    @Test
    public void testPersistEgrul() {
        Ul ul1 = getTestUl()
        EgrulService.saveUlToDB(ul1)
        Ul ul2 = (Ul) EgrulDAO.getFromDB(Ul.getName(), "1000000000002")
        assertEquals(ul1.getInn(), ul2.getInn())
        assertEquals(ul1.getLicenzs().size(), ul2.getLicenzs().size())
        assertEquals(ul1.getUlfoms().getIdfoms().getName(), ul2.getUlfoms().getIdfoms().getName())
        EgrulDAO.removeFromDB(ul2)
    }

    //New Format
    @Ignore("integration test with db")
    @Test
    public void testPersistEgrulNF() {
        Ul ul1 = getTestUlNF()
        EgrulService.saveUlToDB(ul1)
        Ul ul2 = (Ul) EgrulDAO.getFromDB(Ul.getName(), "1147847267039")
        assertEquals(ul1.getInn(), ul2.getInn())
        assertEquals(ul1.getUlokved().size(), ul2.getUlokved().size())
        assertEquals(ul1.getUlmns().getIdmns().getName(), ul2.getUlmns().getIdmns().getName())
        EgrulDAO.removeFromDB(ul2)
    }

    //Old Format
    @Ignore("integration test with db")
    @Test
    public void testPersistEgripUpdate() {
        Ip ip1 = getTestIp()
        EgrulService.saveIpToDB(ip1)
        Ip ip3 = getTestIp()
        ip3.getLicenzs().add(new Licenz(
                idip: ip3,
                numlic: "test"
        )
        )
        ip3.getLicenzs().get(0).setNumlic("test2")
        EgrulService.saveIpToDB(ip3)
        Ip ip2 = (Ip) EgrulDAO.getFromDB(Ip.getName(), "100000000000001")
        assertEquals(ip3.getInn(), ip2.getInn())
        assertEquals(ip3.getLicenzs().size(), ip2.getLicenzs().size())
        EgrulDAO.removeFromDB(ip2)
    }

    //New Format
    @Ignore("integration test with db")
    @Test
    public void testPersistEgripNFUpdate() {
        Ip ip1 = getTestIpNF()
        EgrulService.saveIpToDB(ip1)
        Ip ip3 = getTestIpNF()
        ip3.getLicenzs().add(new Licenz(
                idip: ip3,
                numlic: "test"
        )
        )
        ip3.getLicenzs().get(0).setNumlic("test2")
        EgrulService.saveIpToDB(ip3)
        Ip ip2 = (Ip) EgrulDAO.getFromDB(Ip.getName(), "308784733200657")
        assertEquals(ip3.getInn(), ip2.getInn())
        assertEquals(ip3.getLicenzs().size(), ip2.getLicenzs().size())
        EgrulDAO.removeFromDB(ip2)
    }

/**
 * method return test instance of Ip (Old Format)
 * @return Ip
 */
    private static Ip getTestIp() {
        Ip ip1 = null
        new File("src/test/groovy/ru/iac/ip.ser").withObjectInputStream { instream ->
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
        new File("src/test/groovy/ru/iac/ipNF.ser").withObjectInputStream { instream ->
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
        new File("src/test/groovy/ru/iac/ul.ser").withObjectInputStream { instream ->
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
        new File("src/test/groovy/ru/iac/ulNF.ser").withObjectInputStream { instream ->
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
    public void serializeTestObjects() {
        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip;
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it);

            new File("src/test/groovy/ru/iac/ip.ser").withObjectOutputStream { out -> out << ip }

        }
        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulOneElement)
        Ul ul
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            new File("src/test/groovy/ru/iac/ul.ser").withObjectOutputStream { out -> out << ul }

        }

        Ip ip1
        new File("src/test/groovy/ru/iac/ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        println("Id ip = " + ip1.getIdip())
        Ul ul1
        new File("src/test/groovy/ru/iac/ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        println("Id ul = " + ul1.getIdul())
    }

    //New Format
    @Ignore
    @Test
    public void serializeTestObjectsNF() {
        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripNFOneElement)
        Ip ip;
        EGRIP_IP_DATA.Документ.each {
            ip = XMLParserEGRIPNF.parse(it);

            new File("src/test/groovy/ru/iac/ipNF.ser").withObjectOutputStream { out -> out << ip }

        }

        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulNFOneElement)
        Ul ul
        EGRIP_UL_DATA.Документ.each {
            ul = XMLParserEGRULNF.parse(it)
            new File("src/test/groovy/ru/iac/ulNF.ser").withObjectOutputStream { out -> out << ul }

        }

        Ip ip1
        new File("src/test/groovy/ru/iac/ipNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        println("Id ip = " + ip1.getIdip())
        Ul ul1
        new File("src/test/groovy/ru/iac/ulNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        println("Id ul = " + ul1.getIdul())
    }
}
