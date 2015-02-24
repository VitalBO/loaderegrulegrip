package ru.iac

import org.hibernate.Session
import org.junit.Assert
import ru.iac.egrip.XMLParserEGRIP
import ru.iac.entity.*

/**
 * Created by konenkov on 20.02.2015.
 */
public class Test extends Assert {

    Ip ip
    private static File filePathEgrip = new File("src\\test\\java\\ru\\iac\\testEGRIP.XML");
    private static File filePathEgrul = new File("src\\test\\java\\ru\\iac\\testEGRUL.XML");

    @org.junit.Test
    public void xmlParserEGRIPTest() {
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathEgrip));

            String line = bufferedReader.readLine();
            int temp = 0;

            while (line != null) {
                if (line.startsWith("    <IP IDDOK=")) temp = 1;
                if (temp == 1) sb.append(line);
                if (line.endsWith("</IP>")) {
                    break;
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Ip ip = XMLParserEGRIP.parse(sb.toString());
        assertEquals(ip.getInn(), "110200037840");
        assertEquals(ip.getIdip(), "304110235200092");
        assertEquals(ip.getLicenzs().size(), 2);
        assertEquals(ip.getIpgosregs().size(), 2);
        assertEquals(ip.getIpokved().size(), 2);
        assertEquals(ip.getIpfss().getIdfss().getKod(), "7830");
    }

    @org.junit.Test
    public void xmlParserEGRULTest() {

        MainParser.parse(filePathEgrul);
        //System.out.println(tempIP.get(0).toString());

    }

    @org.junit.Test
    public void testMain() {

        MainParser.parse(filePathEgrul);
        //System.out.println(tempIP.get(0).toString());
    }

    @org.junit.Test
    public void testSessionFactory() {
        Session session = HibernateUtil.getSession();
        session.close();
    }


    @org.junit.Test
    public void testGetByNaturalId() {

        Spfoms spfoms = new Spfoms();
        spfoms.setName("asdddd");
        spfoms.setKod("109");
        EgrulDBDAO.saveOrUpdate(spfoms);
        Spfoms spfoms1 = (Spfoms) EgrulDBDAO.getFromDBbyNaturalId(Spfoms.class.getName(), "109");
        assertEquals(spfoms.getKod(), spfoms1.getKod());
        EgrulDBDAO.removeFromDB(spfoms);

    }


    @org.junit.Test
    public void testNamedQuery() {
        Spfoms spfoms = new Spfoms();
        spfoms.setName("asdddd");
        spfoms.setKod("109");
        EgrulDBDAO.saveOrUpdate(spfoms);
        Spfoms spfoms1 = (Spfoms) EgrulDBDAO.getNamedQuery(Spfoms.FIND_BY_NAME, "name", "asdddd");
        assertEquals(spfoms.getKod(), spfoms1.getKod());
        EgrulDBDAO.removeFromDB(spfoms);
    }


    @org.junit.Test
    public void testCallProcedure() {
        EgrulDBDAO.callProcedure();
    }

    @org.junit.Test
    public void testPersistEgrip() {
        Ip ip1 = getTestIp()
        EgrulDBDAO.saveIpToDB(ip1)
        Ip ip2 = (Ip) EgrulDBDAO.getFromDB(Ip.getName(), "100000000000001")
        assertEquals(ip1.getInn(), ip2.getInn())
        assertEquals(ip1.getLicenzs().size(),ip2.getLicenzs().size())
        assertEquals(ip1.getIpfoms().getIdfoms().getName(), ip2.getIpfoms().getIdfoms().getName())
    }

    private Ip getTestIp() {
        ip = new Ip(
                idip: "100000000000001",
                inn: "01321321321321321",
                ogrn: "304110235200092",
                idregorg:
                        new Spregorg(
                                idspro: 78086,
                                name: "Межрайонная инспекция Федеральной налоговой службы №15 по Санкт-Петербургу"
                        ),
                idstatus:
                        new Spipstat(
                                id: 1011,
                                name: "Физическое лицо прекратило деятельность в качестве индивидуального предпринимателя на основании собственного решения"
                        ),
                idvidip:
                        new Spvidip(
                                id: 1,
                                name: "Индивидуальный предприниматель"
                        ),
        )

        Ipfoms ipfoms = new Ipfoms(
                idip: ip,
                regnomFoms: 874010600276328,
                idfoms: new Spfoms(
                        kod: 87,
                        name: "Фонд обязательного медицинского страхования Республики Коми"
                ),
                dtstart: Util.convertToDate("25.03.1996"),
                dtend: Util.convertToDate("25.03.1996")
        )
        ip.setIpfoms(ipfoms)

        Ipfss ipfss = new Ipfss(
                idip: ip,
                idfss: new Spfss(
                        kod: 7830,
                        name: "Филиал №30 Санкт-Петербургского регионального отделения Фонда социального страхования Российской Федерации"
                ),
                regnomFss: 110521175878303,
                dtstart: Util.convertToDate("24.06.2013"),
                dtend: Util.convertToDate("24.06.2013")
        )
        ip.setIpfss(ipfss)

        Ipmns ipmns = new Ipmns(
                idip: ip,
                idmns: new Spmns(
                        kod: 7811,
                        name: "Межрайонная инспекция Федеральной налоговой службы №24 по Санкт-Петербургу"
                ),
                dtstart: Util.convertToDate("01.11.2012"),
                dtend: Util.convertToDate("20.10.2014")
        )
        ip.setIpmns(ipmns)

        Ippf ippf = new Ippf(
                idip: ip,
                idpf: new Sppf(
                        kod: "088010",
                        name: "Государственное Учреждение Управление Пенсионного фонда РФ по Невскому району Санкт-Петербурга"
                ),
                regnomPf: "088010086138",
                dtstart: Util.convertToDate("23.11.2012"),
                dtend: Util.convertToDate("21.10.2014")
        )
        ip.setIppf(ippf)

        Ipregold ipregold = new Ipregold(
                idip: ip,
                numold: "2182 К",
                dtreg: Util.convertToDate("25.11.2003"),
                idregorg: new Spregorg(
                        idspro: 11003,
                        name: "Администрация муниципального образования `Город Ухта`"
                )
        )
        ip.setIpregold(ipregold)

        Ipname ipname = new Ipname(
                idip: ip,
                dtstart: Util.convertToDate("25.11.2003"),
                famfl: "ШАЛАЕВСКАЯ",
                namefl: "ТАТЬЯНА",
                otchfl: "ИСААКОВНА",
                famlat: "Laal",
                namelat: "assss",
                otchlat: "asdddd",
                sex: 2
        )
        ip.setIpname(ipname)

        Ipcitizen ipcitizen = new Ipcitizen(
                idip: ip,
                dtstart: Util.convertToDate("17.12.2004"),
                idvidcitizen: new Spvidcitizen(
                        id: 1,
                        name: "Гражданин Российской Федерации"
                ),
                oksm: new Oksm(
                        id: 643,
                        kodOksm: "RUS",
                        name: "Российская Федерация"
                )
        )
        ip.setIpcitizen(ipcitizen)

        ArrayList<Ipokved> listIpOkved = new ArrayList<>()
        Okved okved = new Okved(
                codeOkved: "52.41",
                name: "Розничная торговля текстильными и галантерейными изделиями"
        )
        listIpOkved.add(
                new Ipokved(
                        idokved: okved,
                        idip: ip
                )
        )
        ip.setIpokved(listIpOkved)

        Ipdokdsn ipdokdsn = new Ipdokdsn(
                idip: ip,
                dtstart: Util.convertToDate("17.12.2004"),
                iddokdn: new Spdokdn(
                        id: 111111,
                        name: "testtt iddoksdn"
                ),
                idosndn: new Sposndn(
                        id: 111111,
                        name: "test idosndn"
                ),
                num: "asd",
                dt: Util.convertToDate("17.12.2004"),
                nameorg: "asdasda"
        )
        ip.setIpdokdsn(ipdokdsn)

        List<Ipgosreg> ipgosregList = new ArrayList<>()
        Ipgosreg ipgosreg = new Ipgosreg(
                idip: ip,
                idreg: "147847321000068",
                regnum: "414784732100224",
                dtreg: Util.convertToDate("17.11.2014"),
                dtzap: Util.convertToDate("17.11.2014"),
                idvidreg: new Spvidreg(
                        idvidreg: 2404100,
                        name: "Внесение сведений о регистрации в ФСС РФ"
                ),
                idregorg: new Spregorg(
                        idspro: 78086,
                        name: "Межрайонная инспекция Федеральной налоговой службы №15 по Санкт-Петербургу"
                ),
                sersvid: 121321,
                numsvid: 123112
        )
        ipgosregList.add(ipgosreg)
        ip.setIpgosregs(ipgosregList)

        List<Licenz> licenzsList = new ArrayList<>()
        Licenz licenz;
        licenz = new Licenz(
                idip: ip,
                numlic: "78-038759",
                dtrestart: Util.convertToDate("27.06.2003"),
                idlicorg: new Splicorg(
                        id: "67847038000138",
                        name: "Лицензионная палата Санкт-Петербурга"
                ),
                idvidlic: new Spvidlic(
                        idvidlic: 1630220,
                        name: "Розничная продажа алк. продукции, лицензируемая субъектами РФ или органами МСУ"
                ),
                idsostlic: new Spsostlic(
                        idsostlic: 1,
                        name: "Действующая"
                ),
                dtstart: Util.convertToDate("27.06.2003"),
                dtend: Util.convertToDate("27.06.2003"),
                dtstop: Util.convertToDate("27.06.2003"),
        )

        licenzsList.add(licenz)
        ip.setLicenzs(licenzsList)
        return ip
    }

}



