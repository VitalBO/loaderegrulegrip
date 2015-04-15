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

    private static File filePathEgrip = new File("src\\test\\groovy\\ru\\iac\\testEGRIP.XML");
    private static File filePathEgrul = new File("src\\test\\groovy\\ru\\iac\\testEGRUL.XML");
    private static File filePathEgripOneElement = new File("src\\test\\groovy\\ru\\iac\\testEgripForTestParser.XML");
    private static File filePathEgrulOneElement = new File("src\\test\\groovy\\ru\\iac\\testEgrulForTestParser.XML");

    @Ignore("integration test with db")
    @Test
    public void testSessionFactory() {
        Session session = HibernateUtil.getSession();
        session.close();
    }

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
        }
    }

    @Test
    public void testParseEgrul() {

        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulOneElement)
        Ul ul
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            assertNotNull("Ошибка при конвертации объекта, парсер вернул null", ul)
            assertEquals(ul.getLicenzs().size(), 2)
            assertEquals(ul.getUlokved().size(), 2)
            assertEquals(ul.getIdul(), "1000000000002")
            assertEquals(1, ul.getUlokved().get(1).getMain())
        }
    }

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

/**
 * method return test instance of Ip
 * @return Ip
 */
    private static Ip getTestIp() {
        Ip ip1 = null
        new File("src\\test\\groovy\\ru\\iac\\ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        return ip1
    }
/**
 * method return test instance of Ul
 * @return Ul
 */
    private static Ul getTestUl() {
        Ul ul1 = null
        new File("src\\test\\groovy\\ru\\iac\\ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        return ul1
    }

    /**
     * save test objects to file for use in testcases
     */
    @Ignore
    @Test
    public void serializeTestObjects() {
        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip;
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it);

            new File("src\\test\\groovy\\ru\\iac\\ip.ser").withObjectOutputStream { out -> out << ip }

        }
        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulOneElement)
        Ul ul
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            new File("src\\test\\groovy\\ru\\iac\\ul.ser").withObjectOutputStream { out -> out << ul }

        }

        Ip ip1
        new File("src\\test\\groovy\\ru\\iac\\ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        println("Id ip = " + ip1.getIdip())
        Ul ul1
        new File("src\\test\\groovy\\ru\\iac\\ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        println("Id ul = " + ul1.getIdul())
    }
}





