package ru.spb.iac.toris.egrulegrip.parser.groovy

import groovy.util.slurpersupport.GPathResult
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import ru.spb.iac.toris.egrulegrip.model.*

//import org.slf4j.Logger
//import org.slf4j.LoggerFactory

import ru.spb.iac.toris.egrulegrip.utils.Util

/**
 * Created by bogdanov on 06.02.2019.
 * Class parse new format of the EGRIP object, return IP - entity with all connections *
 */

class XMLParserEGRIPNF {
    private static Logger log = LogManager.getLogger(XMLParserEGRIPNF)
    private static ArrayList<EgrulEgripEntity> list = new ArrayList<EgrulEgripEntity>()

    static Ip parse(GPathResult gPathResult) {

        Ip ip = null
        try {
            gPathResult.СвИП.each {
                log.debug("Start decoding IP with OGRN " + it.@ОГРНИП)

                //------------------ IP
                ip = new Ip(
                        idip: it.@ОГРНИП,
                        inn: it.@ИННФЛ,
                        ogrn: it.@ОГРНИП,
                        dtogrn: Util.convertToDate(it.СвРегИП.@ДатаОГРНИП as String),
                        regnum: it.СвРегИП.@РегНом,
                        dtreg: Util.convertToDate(it.СвРегИП.@ДатаРег as String),
                        regorgname: it.СвРегИП.@НаимРО,
                        kodstatusend: it.СвПрекращ.СвСтатус.@КодСтатус,
                        namestatusend: it.СвПрекращ.СвСтатус.@НаимСтатус,
                        dtend: Util.convertToDate(it.СвПрекращ.СвСтатус.@ДатаПрекращ as String),
                        regnumend: it.СвПрекращ.ГРНИПДатаТип.@ГРНИП,
                        dtregend: Util.convertToDate(it.СвПрекращ.ГРНИПДатаТип.@датаЗаписи as String),
                        idregorg: UtilParser.getRegorgNew(it as GPathResult, list),
                        ogrnul: it.СвПрекращ.СвНовЮЛ.@ОГРН,
                        innul: it.СвПрекращ.СвНовЮЛ.@ИНН,
                        namepul: it.СвПрекращ.СвНовЮЛ.@НаимЮЛПолн,
                        grnzap: it.СвПрекращ.СвНовЮЛ.ГРНИПДата.@ГРНИП,
                        dtzap: Util.convertToDate(it.СвПрекращ.СвНовЮЛ.ГРНИПДата.@ДатаЗаписи as String),
                        grncor: it.СвПрекращ.СвНовЮЛ.ГРНИПДатаИспр.@ГРНИП,
                        dtcor: Util.convertToDate(it.СвПрекращ.СвНовЮЛ.ГРНИПДатаИспр.@ДатаЗаписи as String),
                        idvidip: new Spvidip(
                                        id: Util.convertToInt(it.@КодВидИП),
                                        name: it.@НаимВидИП
                                )

                )
                if(it.СвСтатус.СвСтатус.@КодСтатус!="") {
                    Spipstat ipstat = new Spipstat(
                            id: Util.convertToInt(it.СвСтатус.СвСтатус.@КодСтатус),
                            name: it.СвСтатус.СвСтатус.@НаимСтатус
                    )
                    ip.setIdstatus(ipstat)
                }

                //------------------ IPADR
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode ip_address")
                if (it.СвАдрМЖ.ГРНИПДата.@ДатаЗаписи != "") {
                    it.СвАдрМЖ.each {
                        Ipadr ipadr = new Ipadr(
                                idip: ip,
                                regnum: it.ГРНИПДата.@ГРНИП,
                                dtstart: Util.convertToDate(it.ГРНИПДата.@ДатаЗаписи as String),
                                regnumcor: it.ГРНИПДатаИспр.@ГРНИП,
                                dtcor: Util.convertToDate(it.ГРНИПДатаИспр.@ДатаЗаписи as String),
                                kodrg: it.АдресРФ.@КодРегион,
                                kodKl: it.АдресРФ.@КодАдрКладр,
                                fulladdress: UtilParser.getAddressNew(it.АдресРФ, list),
                                address:  it.АдресРФ.Регион.@НаимРегион.text() + " "
                                        + it.АдресРФ.Регион.@ТипРегион.text() + " "
                                        + it.АдресРФ.Район.@НаимРайон.text() + " "
                                        + it.АдресРФ.Район.@ТипРайон.text() + " "
                                        + it.АдресРФ.Город.@НаимГород.text() + " "
                                        + it.АдресРФ.Город.@ТипГород.text() + " "
                                        + it.АдресРФ.НаселПункт.@НаимНаселПункт.text() + " "
                                        + it.АдресРФ.НаселПункт.@ТипНаселПункт.text() + " "
                                        + it.АдресРФ.Улица.@НаимУлица.text() + " "
                                        + it.АдресРФ.Улица.@ТипУлица.text() + " "
                                        + it.АдресРФ.@Дом.text() + " "
                                        + it.АдресРФ.@Корп.text() + " "
                                        + it.АдресРФ.@Кварт.text()
                        )
                        ip.setIpadr(ipadr)
                    }
                }

                //------------------ IPEMAIL
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode ip_address")
                if (it.СвАдрЭлПочты.ГРНИПДата.@ДатаЗаписи != "") {
                    it.СвАдрЭлПочты.each {
                        Ipemail ipemail = new Ipemail(
                                idip: ip,
                                email: it.@'E-mail',
                                regnum: it.ГРНИПДата.@ГРНИП,
                                dtzap: Util.convertToDate(it.ГРНИПДата.@ДатаЗаписи as String),
                                regnumcor: it.ГРНИПДатаИспр.@ГРНИП,
                                dtcor: Util.convertToDate(it.ГРНИПДатаИспр.@ДатаЗаписи as String)
                        )
                        ip.setIpemail(ipemail)
                    }
                }

                //------------------ FSS
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_FSS")
                if (it.СвРегФСС.@РегНомФСС != "") {
                    it.СвРегФСС.each {
                        Ipfss ipfss = new Ipfss(
                                idip: ip,
                                idfss: new Spfss(
                                        kod: it.СвОргФСС.@КодФСС,
                                        name: it.СвОргФСС.@НаимФСС
                                ),
                                regnomFss: it.@РегНомФСС as String,
                                dtstart: Util.convertToDate(it.@ДатаРег as String),
                                dtend: null
                        )
                        ip.setIpfss(ipfss)
                    }
                }

                //------------------ MNS
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode MNS")
                if (it.СвУчетНО.@ДатаПостУч != "") {
                    it.СвУчетНО.each {
                        Ipmns ipmns = new Ipmns(
                                idip: ip,
                                idmns: new Spmns(
                                        kod: it.СвНО.@КодНО,
                                        name: it.СвНО.@НаимНО
                                ),
                                dtstart: Util.convertToDate(it.@ДатаПостУч as String),
                                dtend: null
                        )
                        ip.setIpmns(ipmns)
                    }
                }

                //------------------ PF
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_PF")
                if (it.СвРегПФ.@ДатаРег != "") {
                    it.СвРегПФ.each {
                        Ippf ippf = new Ippf(
                                idip: ip,
                                idpf: new Sppf(
                                        kod: Util.convertToInt(it.СвОргПФ.@КодПФ),
                                        name: it.СвОргПФ.@НаимПФ
                                ),
                                dtstart: Util.convertToDate(it.@ДатаРег as String),
                                dtend: null
                        )
                        ip.setIppf(ippf)
                    }
                }

                //------------------ IPNAME
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode FL")
                if (it.СвФЛ.ГРНИПДата.@ДатаЗаписи != "") {
                    it.СвФЛ.each {
                        Ipname ipname = new Ipname(
                                idip: ip,
                                dtstart: Util.convertToDate(it.ГРНИПДата.@ДатаЗаписи as String),
                                famfl: it.ФИОРус.@Фамилия as String,
                                namefl: it.ФИОРус.@Имя as String,
                                otchfl: it.ФИОРус.@Отчество as String,
                                famlat: it.ФИОЛат.@Фамилия as String,
                                namelat: it.ФИОЛат.@Имя as String,
                                otchlat: it.ФИОЛат.@Отчество as String,
                                sex: Util.convertToInt(it.@Пол)
                        )
                        ip.setIpname(ipname)
                    }
                }

                //------------------ CITIZEN
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode CITIZEN")
                if (it.СвГражд.ГРНИПДата.@ДатаЗаписи != "") {
                    it.СвГражд.each {
                        Ipcitizen ipcitizen = new Ipcitizen(
                                idip: ip,
                                dtstart: Util.convertToDate(it.ГРНИПДата.@ДатаЗаписи as String),
                                idvidcitizen: new Spvidcitizen(
                                        id: Util.convertToInt(it.@ВидГражд),
                                        name: null
                                ),
                                oksm: UtilParser.getOksmNew(it, list)
                        )
                        ip.setIpcitizen(ipcitizen)
                    }
                }

                //------------------ OKVED
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode okved")
                ArrayList<Ipokved> listIpOkved = new ArrayList<>()
                if (it.СвОКВЭД.СвОКВЭДОсн.@КодОКВЭД != "") {
                    Okved okved
                    it.СвОКВЭД.СвОКВЭДОсн.each {
                        okved = new Okved(
                                codeOkved: it.@КодОКВЭД,
                                name: it.@НаимОКВЭД
                        )

                        listIpOkved.add(
                                new Ipokved(
                                        idokved: okved,
                                        idip: ip,
                                        main: 1
                                )
                        )
                    }
                }
                if (it.СвОКВЭД.СвОКВЭДДоп.@КодОКВЭД != "") {
                    Okved okved
                    it.СвОКВЭД.СвОКВЭДДоп.each {
                        okved = new Okved(
                                codeOkved: it.@КодОКВЭД,
                                name: it.@НаимОКВЭД
                        )

                        listIpOkved.add(
                                new Ipokved(
                                        idokved: okved,
                                        idip: ip,
                                        main: 0
                                )
                        )
                    }
                }
                ip.setIpokved(listIpOkved)

                //------------------ REGEGRIP
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGEGRIP")
                List<Ipgosreg> ipgosregList = new ArrayList<>()
                it.СвЗапЕГРИП.each {
                    Ipgosreg ipgosreg = new Ipgosreg(
                            idip: ip,
                            idreg: it.@ИдЗап,
                            regnum: it.@ГРНИП,
                            dtreg: Util.convertToDate(it.СвСвид.@ДатаВыдСвид as String),
                            dtzap: Util.convertToDate(it.@ДатаЗап as String),
                            idvidreg: UtilParser.getVidregNew(it, list),
                            idregorg: UtilParser.getRegorgNew(it, list),
                            sersvid: Util.convertToInt(it.СвСвид.@Серия),
                            numsvid: Util.convertToInt(it.СвСвид.@Номер)
                    )
                    if (!ipgosregList.contains(ipgosreg)) {
                        ipgosregList.add(ipgosreg)
                    }
                }
                ip.setIpgosregs(ipgosregList)

                //------------------ LICENZ
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode LICENZ")
                if (it.СвЛицензия.@НомЛиц != "") {
                    List<Licenz> licenzsList = new ArrayList<>()
                    Licenz licenz;
                    it.СвЛицензия.each {
                        licenz = new Licenz(
                                idip: ip,
                                numlic: it.@НомЛиц,
                                dtrestart: Util.convertToDate(it.@ДатаЛиц as String),
                                idlicorg: UtilParser.getLicorgNew(it, list),
                                idvidlic: UtilParser.getVidlicNew(it, list),
                                idsostlic: null, //UtilParser.getSostlic(it, list),//not found
                                dtstart: Util.convertToDate(it.@ДатаНачЛиц as String),
                                dtend: Util.convertToDate(it.@ДатаОкончЛиц as String),
                                dtstop: Util.convertToDate(it.СвПриостЛиц.@ЛицОргПриостЛиц as String),
                                orgstopname: it.СвПриостЛиц.@ЛицОргПриостЛиц
                        )

                        licenzsList.add(licenz)
                    }
                    ip.setLicenzs(licenzsList)
                }
            }
        } catch (Exception ex) {
            log.error("Exception while parsing IP with OGRN = " + ip.getOgrn())
            log.error(ex.message)
            return null
        }
        return ip
    }
}


