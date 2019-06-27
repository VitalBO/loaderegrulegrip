package ru.spb.iac.toris.egrulegrip.loader

import org.springframework.util.ResourceUtils
import ru.spb.iac.toris.egrulegrip.parser.IMainParser
import ru.spb.iac.toris.egrulegrip.parser.groovy.XMLParserEGRIP
import ru.spb.iac.toris.egrulegrip.parser.groovy.XMLParserEGRIPNF
import ru.spb.iac.toris.egrulegrip.parser.groovy.XMLParserEGRUL
import ru.spb.iac.toris.egrulegrip.parser.groovy.XMLParserEGRULNF
import ru.spb.iac.toris.egrulegrip.repository.IDataRepository
import ru.spb.iac.toris.egrulegrip.repository.IEgrulEgripSvcRepository
import ru.spb.iac.toris.egrulegrip.utils.HibernateUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.spb.iac.toris.egrulegrip.utils.Util
import ru.spb.iac.toris.egrulegrip.model.*
import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Stepwise
import org.hibernate.Session

@SpringBootTest
@Stepwise
class IntegratonParsingTest extends Specification {

    //EGRIP
    private static String filePathEgrip = "classpath:testfiles/testEGRIP.XML"
    private static String filePathEgripOneElement = "classpath:testfiles/testEgripForTestParser.XML"
    private static String filePathEgripOneElementErr = "classpath:testfiles/testEgripForTestParserErr.XML"

    private static File filePathEgripOneElementAbs = new File("src/test/resources/testfiles/testEgripForTestParser.XML")

    //EGRUL
    private static String filePathEgrul = "classpath:testfiles/testEGRUL.XML"
    private static String filePathEgrulOneElement = "classpath:testfiles/testEgrulForTestParser.XML"
    private static String filePathEgrulOneElementErr = "classpath:testfiles/testEgrulForTestParserErr.XML"

    //New format
    //EGRIP
    private static String filePathEgripNF = "classpath:testfiles/testEGRIPNF.XML"
    private static String filePathEgripNFOneElement = "classpath:testfiles/testEgripNFForTestParser.XML"
    private static String filePathEgripNFOneElementErr = "classpath:testfiles/testEgripNFForTestParserErr.XML"
    //EGRUL
    private static String filePathEgrulNF = "classpath:testfiles/testEGRULNF.XML"
    private static String filePathEgrulNFOneElement = "classpath:testfiles/testEgrulNFForTestParser.XML"
    private static String filePathEgrulNFOneElementErr = "classpath:testfiles/testEgrulNFForTestParserErr.XML"

    //Serialized data files
    private static String fileIPser = "classpath:testfiles/ip.ser"
    private static String fileULser = "classpath:testfiles/ul.ser"
    private static String fileIPNFser = "classpath:testfiles/ipNF.ser"
    private static String fileULNFser = "classpath:testfiles/ulNF.ser"

    @Autowired(required = false)
    private IMainParser mainParser

    @Autowired(required = false)
    private IDataRepository dataRepository

    @Autowired(required = false)
    private  IEgrulEgripSvcRepository egrulEgripSvcRepository

/**
 * save test objects to file for use in testcases
 */

    def "Serialization of the xml-files with UL and IP data"(){
        expect:"Files serialized and deserialized"

        def EGRIP_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgripOneElement))
        Ip ip
        EGRIP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it)
            new File (ResourceUtils.getURL(fileIPser).getFile()).withObjectOutputStream { out -> out << ip }
        }

        def EGRUL_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgrulOneElement))
        Ul ul
        EGRUL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            new File (ResourceUtils.getURL(fileULser).getFile()).withObjectOutputStream { out -> out << ul }
        }

        Ip ip1
        ResourceUtils.getFile(fileIPser).withObjectInputStream { instream ->
            ip1 = instream.readObject()
        }
        println("Id ip = " + ip1.getIdip())

        Ul ul1
        ResourceUtils.getFile(fileULser).withObjectInputStream { instream ->
            ul1 = instream.readObject()
        }
        println("Id ul = " + ul1.getIdul())
    }

    def "Serialization of the new xml-files with UL and IP data"(){
        expect:"Files serialized and deserialized"

        def EGRIP_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgripNFOneElement))
        Ip ip
        EGRIP_DATA.Документ.each {
            ip = XMLParserEGRIPNF.parse(it)
            new File (ResourceUtils.getURL(fileIPNFser).getFile()).withObjectOutputStream { out -> out << ip }
        }

        def EGRUL_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgrulNFOneElement))
        Ul ul
        EGRUL_DATA.Документ.each {
            ul = XMLParserEGRULNF.parse(it)
            new File (ResourceUtils.getURL(fileULNFser).getFile()).withObjectOutputStream { out -> out << ul }
        }

        Ip ip1
        ResourceUtils.getFile(fileIPNFser).withObjectInputStream { instream ->
            ip1 = instream.readObject()
        }
        println("Id ip = " + ip1.getIdip())

        Ul ul1
        ResourceUtils.getFile(fileULNFser).withObjectInputStream { instream ->
            ul1 = instream.readObject()
        }
        println("Id ul = " + ul1.getIdul())
    }

    //@Ignore
    def "Should be able to parse xml-file and save IP to db"() {
        expect: "File with IP data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgrip))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse xml-file with one element and save IP to db"() {
        expect: "File with IP data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgripOneElement))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse xml-file and save UL to db"() {
        expect: "File with UL data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgrul))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse xml-file with one element and save UL to db"() {
        expect: "File with UL data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgrulOneElement))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse new xml-file and save IP to db"() {
        expect: "File with IP data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgripNF))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse new xml-file with one element and save IP to db"() {
        expect: "File with IP data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgripNFOneElement))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse new xml-file and save UL to db"() {
        expect: "File with UL data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgrulNF))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should be able to parse new xml-file with one element and save UL to db"() {
        expect: "File with UL data is parsed and saved to db"
        HashMap<String, Integer> result = mainParser.parseFile(ResourceUtils.getFile(filePathEgrulNFOneElement))
        for (String key : result.keySet()) {
            println(key + "\t  - " + result.get(key))
            assert result.get(key) == 0
        }
    }

    //@Ignore
    def "Should create instance objects"(){
        when:
        ArrayList<EgrulEgripEntity> list = new ArrayList<EgrulEgripEntity>()
        Ct ct1 = new Ct(idc: 10000000000001, name: "123123", kodKl: "123123")
        Ct ct2 = new Ct(idc: 10000000000001, name: "123123", kodKl: "123123")
        Ct ct3 = new Ct(idc: 10000000000201, name: "123123", kodKl: "123123")
        ct1 = Util.check(ct1, list) as Ct
        ct2 = Util.check(ct2, list) as Ct
        ct3 = Util.check(ct3, list) as Ct
        then:
        assert list.size == 2
        assert list.contains(ct1)
        assert list.contains(ct2)
        assert list.contains(ct3)
    }

    //@Ignore
    def "Should correct save and remove address"() {
        when:
        Uladr uladr = new Uladr(
                kodgorod: "12312",
                fulladdress: new Address(
                        okato: "123"
                )
        )
        dataRepository.saveOrUpdate(uladr)
        Session session = HibernateUtil.getSession();
        Uladr uladr1 = (Uladr) dataRepository.getNamedQuery(Uladr.FIND_BY_KODGOROD, "kodgorod", uladr.getKodgorod(), session);
        then:
        assert uladr.getKodgorod() == uladr1.getKodgorod()
        assert uladr.getFulladdress().getOkato() == uladr1.getFulladdress().getOkato()
        dataRepository.removeFromDB(uladr1)
        session.close()
    }

    //@Ignore
    def "Should correct parse file with IP data"(){
        when:
        def EGRIP_IP_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgripOneElement))
        Ip ip
        then:
        EGRIP_IP_DATA.IP.each {
            ip = XMLParserEGRIP.parse(it)
            assert ip.getInn() == "110200037840"
            assert ip.getIdip() == "100000000000001"
            assert ip.getLicenzs().size() == 10
            assert ip.getIpgosregs().size() == 2
            assert ip.getIpokved().size() == 2
            assert ip.getIpfss().getIdfss().getKod() == "7830"
            assert 1 == ip.getIpokved().get(1).getMain()

        }
    }

    //@Ignore
    def "Should correct parse new file with IP data"(){
        when:
        def EGRIP_IP_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgripNFOneElement))
        Ip ip
        then:
        EGRIP_IP_DATA.Документ.each {
            ip = XMLParserEGRIPNF.parse(it)
            assert ip.getInn() == "781435122782"
            assert ip.getIdip() == "308784733200657"
            assert ip.getLicenzs().size() == 1
            assert ip.getIpgosregs().size() == 14
            assert ip.getIpokved().size() == 2
            assert ip.getIpmns().getIdmns().getKod() == "7801"
            assert 1 == ip.getIpokved().get(0).getMain()
        }
    }

    //@Ignore
    def "Should correct parse file with UL data"(){
        when:
        def EGRIP_UL_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgrulOneElement))
        Ul ul
        then:
        EGRIP_UL_DATA.UL.each {
            ul = XMLParserEGRUL.parse(it)
            assert ul.getLicenzs().get(1).getIdvidlic().size() == 6
            assert ul.getLicenzs().size() == 2
            assert ul.getUlokved().size() == 2
            assert ul.getUlname().getIdopf().getIdopf() == 100047
            assert ul.getUladr().getFulladdress().getDom() == "4"
            assert ul.getUladr().getFulladdress().getKorp() == "ЛИТЕР К"
            assert ul.getUladr().getFulladdress().getKvart() == "3, 4, 18Н"
            assert ul.getIdul() == "1000000000002"
            assert 1 == ul.getUlokved().get(1).getMain()
        }
    }

    //@Ignore
    def "Should correct parse new file with UL data"(){
        when:
        def EGRIP_UL_DATA = new XmlSlurper().parse(ResourceUtils.getFile(filePathEgrulNFOneElement))
        Ul ul
        then:
        EGRIP_UL_DATA.Документ.each {
            ul = XMLParserEGRULNF.parse(it)
            assert ul.getUlokved().size() == 11
            assert ul.getUlname().getIdopf().getIdopf() == 12300
            assert ul.getUladr().getFulladdress().getDom() == "ДОМ 31"
            assert ul.getUladr().getFulladdress().getKvart() == "КВАРТИРА 5"
            assert ul.getIdul() == "1147847267039"
            assert 1 == ul.getUlokved().get(0).getMain()
        }
    }

    //@Ignore
    def "Should catch error while parsing incorrect xml-file with IP data"() {
        when:
        HashMap map = mainParser.parseFile(ResourceUtils.getFile(filePathEgripOneElementErr))
        then:
        assert map.values().contains(Util.ERROR)
    }

    //@Ignore
    def "Should catch error while parsing incorrect new xml-file with IP data"() {
        when:
        HashMap map = mainParser.parseFile(ResourceUtils.getFile(filePathEgripNFOneElementErr))
        then:
        assert map.values().contains(Util.ERROR)
    }

    //@Ignore
    def "Should catch error while parsing incorrect xml-file with UL data"() {
        when:
        HashMap map = mainParser.parseFile(ResourceUtils.getFile(filePathEgrulOneElementErr))
        then:
        assert map.values().contains(Util.ERROR)
    }

    //@Ignore
    def "Should catch error while parsing incorrect new xml-file with UL data"() {
        when:
        HashMap map = mainParser.parseFile(ResourceUtils.getFile(filePathEgrulNFOneElementErr))
        then:
        assert map.values().contains(Util.ERROR)
    }

    @Ignore
    def "Should save and remove Ip-test-object to db"() {
        when:
        Ip ip1 = getTestIp()
        egrulEgripSvcRepository.saveIpToDB(ip1)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "100000000000001")
        then:
        assert ip1.getInn() == ip2.getInn()
        assert ip1.getLicenzs().size() == ip2.getLicenzs().size()
        assert ip1.getIpfoms().getIdfoms().getName() == ip2.getIpfoms().getIdfoms().getName()
        dataRepository.removeFromDB(ip2)
    }

    @Ignore
    def "Should save and remove new Ip-test-object to db"() {
        when:
        Ip ip1 = getTestIpNF()
        egrulEgripSvcRepository.saveIpToDB(ip1)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "308784733200657")
        then:
        assert ip1.getInn() == ip2.getInn()
        assert ip1.getLicenzs().size() == ip2.getLicenzs().size()
        dataRepository.removeFromDB(ip2)
    }

    //@Ignore
    def "Should save and remove Ul-test-object to db"() {
        when:
        Ul ul1 = getTestUl()
        egrulEgripSvcRepository.saveUlToDB(ul1)
        Ul ul2 = (Ul) dataRepository.getFromDB(Ul.getName(), "1000000000002")
        then:
        assert ul1.getInn() == ul2.getInn()
        assert ul1.getLicenzs().size() == ul2.getLicenzs().size()
        assert ul1.getUlfoms().getIdfoms().getName() == ul2.getUlfoms().getIdfoms().getName()
        dataRepository.removeFromDB(ul2)
    }

    //@Ignore
    def "Should save and remove new Ul-test-object to db"() {
        when:
        Ul ul1 = getTestUlNF()
        egrulEgripSvcRepository.saveUlToDB(ul1)
        Ul ul2 = (Ul) dataRepository.getFromDB(Ul.getName(), "1147847267039")
        then:
        assert ul1.getInn() == ul2.getInn()
        assert ul1.getUlokved().size() == ul2.getUlokved().size()
        assert ul1.getUlmns().getIdmns().getName() == ul2.getUlmns().getIdmns().getName()
        dataRepository.removeFromDB(ul2)
    }

    //@Ignore
    def "Should update persisted Ip in db"() {
        when:
        Ip ip1 = getTestIp()
        egrulEgripSvcRepository.saveIpToDB(ip1)
        Ip ip3 = getTestIp()
        ip3.getLicenzs().add(new Licenz(
                idip: ip3,
                numlic: "test"
        )
        )
        ip3.getLicenzs().get(0).setNumlic("test2")
        egrulEgripSvcRepository.saveIpToDB(ip3)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "100000000000001")
        then:
        assert ip3.getInn() == ip2.getInn()
        assert ip3.getLicenzs().size() == ip2.getLicenzs().size()
        dataRepository.removeFromDB(ip2)
    }

    //@Ignore
    def "Should update persisted new-Ip in db"() {
        when:
        Ip ip1 = getTestIpNF()
        egrulEgripSvcRepository.saveIpToDB(ip1)
        Ip ip3 = getTestIpNF()
        ip3.getLicenzs().add(new Licenz(
                idip: ip3,
                numlic: "test"
        )
        )
        ip3.getLicenzs().get(0).setNumlic("test2")
        egrulEgripSvcRepository.saveIpToDB(ip3)
        Ip ip2 = (Ip) dataRepository.getFromDB(Ip.getName(), "308784733200657")
        then:
        assert ip3.getInn() == ip2.getInn()
        assert ip3.getLicenzs().size() == ip2.getLicenzs().size()
        dataRepository.removeFromDB(ip2)
    }

/**
 * method return test instance of Ip (Old Format)
 * @return Ip
 */
    private static Ip getTestIp() {
        Ip ip1 = null
        ResourceUtils.getFile("classpath:testfiles/ip.ser").withObjectInputStream { instream ->
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
        ResourceUtils.getFile("classpath:testfiles/ipNF.ser").withObjectInputStream { instream ->
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
        ResourceUtils.getFile("classpath:testfiles/ul.ser").withObjectInputStream { instream ->
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
        ResourceUtils.getFile("classpath:testfiles/ulNF.ser").withObjectInputStream { instream ->
            instream.eachObject {
                ul1 = it
            }
        }
        return ul1
    }
}