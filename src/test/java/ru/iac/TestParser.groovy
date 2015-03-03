package ru.iac

import org.hibernate.Session
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import ru.iac.entity.*

/**
 * Created by konenkov on 20.02.2015.
 */
public class TestParser extends Assert {

    private static File allfiles = new File("d:\\temp2\\all_egrul_test\\")
    private static File filePathEgrip = new File("src\\test\\java\\ru\\iac\\testEGRIP.XML");
    private static File filePathEgrul = new File("src\\test\\java\\ru\\iac\\testEGRUL.XML");
    private static File filePathEgripOneElement = new File("src\\test\\java\\ru\\iac\\testEgripForTestParser.XML");
    private static File filePathEgrulOneElement = new File("src\\test\\java\\ru\\iac\\testEgrulForTestParser.XML");
    private static File badFile = new File("src\\test\\java\\ru\\iac\\ip.ser");


    @Test
    public void testSessionFactory() {
        Session session = EgrulDAO.openSession();
        session.close();
    }

    @Test
    public void testGetByNaturalId() {

        Spfoms spfoms = new Spfoms();
        spfoms.setName("asdddd");
        spfoms.setKod("109");
        EgrulDAO.saveOrUpdate(spfoms);
        Spfoms spfoms1 = (Spfoms) EgrulDAO.getFromDBbyNaturalId(Spfoms.class.getName(), "109");
        assertEquals(spfoms.getKod(), spfoms1.getKod());
        EgrulDAO.removeFromDB(spfoms);
    }

/*    @Test
    public void testNamedQuery() {
        Session session = HibernateUtil.getSession()
        Spfoms spfoms = new Spfoms();
        spfoms.setName("asdddd");
        spfoms.setKod("109");
        Spfoms spfoms3 = new Spfoms(
                name: "asdddd",
                kod: "109"
        )
        spfoms = EgrulDAO.saveOrUpdateRef(spfoms) as Spfoms;
        Spfoms spfoms1 = (Spfoms) EgrulDAO.getNamedQuery(Spfoms.FIND_BY_NAME, "name", "asdddd", session);
        spfoms3 = EgrulDAO.saveOrUpdateRef(spfoms3) as Spfoms;
        assertEquals(spfoms.getKod(), spfoms1.getKod());
        assertEquals(spfoms.getKod(), spfoms3.getKod())
        spfoms = EgrulDAO.saveOrUpdateRef(spfoms) as Spfoms;
        assertEquals(spfoms.getKod(), spfoms1.getKod());
        EgrulDAO.removeFromDB(spfoms);
        session.close()
    }*/

    @Test
    public void testCallProcedure() {
        EgrulDAO.callProcedure();
    }

    @Test
    public void testInstanceObjects() {
        ArrayList<EgrulEntity> list = new ArrayList<EgrulEntity>()

        Ct ct1 = new Ct(idc: 10000000000001, name: "123123", kodKl: "123123")
        Ct ct2 = new Ct(idc: 10000000000001, name: "123123", kodKl: "123123")
        Ct ct3 = new Ct(idc: 10000000000201, name: "123123", kodKl: "123123")

        ct1 = Util.check(ct1, list)
        ct2 = Util.check(ct2, list)
        ct3 = Util.check(ct3, list)
        assertEquals(list.size(), 2)
    }

    @Test
    public void testAddress() {

        Uladr uladr = new Uladr(
                kodgorod: "12312",
                fulladdress: new Address(
                        okato: "123"
                )
        )
        EgrulDAO.saveOrUpdate(uladr)
        Uladr uladr1 = (Uladr) EgrulDAO.getNamedQuery(Uladr.FIND_BY_KODGOROD, "kodgorod", "12312");
        assertEquals(uladr.getKodgorod(), uladr1.getKodgorod())
        assertEquals(uladr.getFulladdress().getOkato(), uladr1.getFulladdress().getOkato())
        EgrulDAO.removeFromDB(uladr1)

    }

    @Test
    public void testMainParser() {

        MainParser mp = new MainParser()
        mp.parse(allfiles)

    }

    @Test
    public void testParseEgrip() {

        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip;
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it);
            assertEquals(ip.getInn(), "110200037840");
            assertEquals(ip.getIdip(), "100000000000001");
            assertEquals(ip.getLicenzs().size(), 2);
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
            assertEquals(ul.getLicenzs().size(), 2)
            assertEquals(ul.getUlokved().size(), 2)
            assertEquals(ul.getIdul(), "1000000000002")
        }
    }

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

    @Test
    public void testPersistEgripUpdate() {
        Ip ip1 = getTestIp()
        EgrulService.saveIpToDB(ip1)
        ip1 = null
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
 * method return test instance of Ip* 
 * @return Ip
 */
    private static Ip getTestIp() {
        Ip ip1 = null
        new File("src\\test\\java\\ru\\iac\\ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        return ip1
    }
/**
 * method return test instance of Ul*
 * @return Ul
 */
    private static Ul getTestUl() {
        Ul ul1 = null
        new File("src\\test\\java\\ru\\iac\\ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        return ul1
    }

    /**
     * save test objects to file for use in testcases* 
     */
    @Ignore
    @Test
    public void serializeTestObjects() {
        def EGRIP_IP_DATA = new XmlSlurper().parse(filePathEgripOneElement)
        Ip ip;
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it);

            new File("src\\test\\java\\ru\\iac\\ip.ser").withObjectOutputStream { out -> out << ip }

        }
        def EGRIP_UL_DATA = new XmlSlurper().parse(filePathEgrulOneElement)
        Ul ul
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            new File("src\\test\\java\\ru\\iac\\ul.ser").withObjectOutputStream { out -> out << ul }

        }

        Ip ip1
        new File("src\\test\\java\\ru\\iac\\ip.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ip1 = it
            }
        }
        println("Id ip = " + ip1.getIdip())
        Ul ul1
        new File("src\\test\\java\\ru\\iac\\ul.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        println("Id ul = " + ul1.getIdul())
    }
}





