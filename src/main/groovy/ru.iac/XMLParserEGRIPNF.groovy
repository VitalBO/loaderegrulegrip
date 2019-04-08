package ru.iac

import groovy.util.slurpersupport.GPathResult
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.UtilParser
import ru.iac.entity.*

/**
 * Created by bogdanov on 06.02.2019.
 * Class parse new format of the EGRIP object, return IP - entity with all connections *
 */

class XMLParserEGRIPNF {
    private static Logger log = LoggerFactory.getLogger(XMLParserEGRIPNF);
    private static ArrayList<EgrulEntity> list = new ArrayList<EgrulEntity>()

    public static Ip parse(GPathResult gPathResult) {

        Ip ip = null;
        try {
            gPathResult.砚认.each {
                log.debug("Start decoding IP with OGRN " + it.@蚊型认)

                //------------------ IP
                ip = new Ip(
                        idip: it.@蚊型认,
                        inn: it.@韧驮�,
                        ogrn: it.@蚊型认,
                        dtogrn: Util.convertToDate(it.砚绣闳�.@泥蜞蚊型认 as String),
                        regnum: it.砚绣闳�.@绣阃铎,
                        dtreg: Util.convertToDate(it.砚绣闳�.@泥蜞绣� as String),
                        regorgname: it.砚绣闳�.@袜桁形,
                        kodstatusend: it.砚橡尻疣�.砚羊囹篑.@暑溲蜞蝮�,
                        namestatusend: it.砚橡尻疣�.砚羊囹篑.@袜桁羊囹篑,
                        dtend: Util.convertToDate(it.砚橡尻疣�.砚羊囹篑.@泥蜞橡尻疣� as String),
                        regnumend: it.砚橡尻疣�.眯腿夏囹嘁栾.@眯腿�,
                        dtregend: Util.convertToDate(it.砚橡尻疣�.眯腿夏囹嘁栾.@溧蜞青镨耔 as String),
                        idregorg: UtilParser.getRegorgNew(it as GPathResult, list),
                        ogrnul: it.砚橡尻疣�.砚皖廪�.@蚊型,
                        innul: it.砚橡尻疣�.砚皖廪�.@韧�,
                        namepul: it.砚橡尻疣�.砚皖廪�.@袜桁匏项腠,
                        grnzap: it.砚橡尻疣�.砚皖廪�.眯腿夏囹�.@眯腿�,
                        dtzap: Util.convertToDate(it.砚橡尻疣�.砚皖廪�.眯腿夏囹�.@泥蜞青镨耔 as String),
                        grncor: it.砚橡尻疣�.砚皖廪�.眯腿夏囹嗳耧�.@眯腿�,
                        dtcor: Util.convertToDate(it.砚橡尻疣�.砚皖廪�.眯腿夏囹嗳耧�.@泥蜞青镨耔 as String),
                        idvidip: new Spvidip(
                                        id: Util.convertToInt(it.@暑渎桎认),
                                        name: it.@袜桁妈淙�
                                )

                )
                if(it.砚羊囹篑.砚羊囹篑.@暑溲蜞蝮�!="") {
                    Spipstat ipstat = new Spipstat(
                            id: Util.convertToInt(it.砚羊囹篑.砚羊囹篑.@暑溲蜞蝮�),
                            name: it.砚羊囹篑.砚羊囹篑.@袜桁羊囹篑
                    )
                    ip.setIdstatus(ipstat)
                }

                //------------------ IPADR
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode ip_address")
                if (it.砚冷鹛�.眯腿夏囹�.@泥蜞青镨耔 != "") {
                    it.砚冷鹛�.each {
                        Ipadr ipadr = new Ipadr(
                                idip: ip,
                                regnum: it.眯腿夏囹�.@眯腿�,
                                dtstart: Util.convertToDate(it.眯腿夏囹�.@泥蜞青镨耔 as String),
                                regnumcor: it.眯腿夏囹嗳耧�.@眯腿�,
                                dtcor: Util.convertToDate(it.眯腿夏囹嗳耧�.@泥蜞青镨耔 as String),
                                kodrg: it.冷疱裥�.@暑湫邈桀�,
                                kodKl: it.冷疱裥�.@暑淅漯孰噤�,
                                fulladdress: UtilParser.getAddressNew(it.冷疱裥�, list),
                                address:  it.冷疱裥�.绣汨铐.@袜桁绣汨铐.text() + " "
                                        + it.冷疱裥�.绣汨铐.@诣镄邈桀�.text() + " "
                                        + it.冷疱裥�.朽轭�.@袜桁朽轭�.text() + " "
                                        + it.冷疱裥�.朽轭�.@诣镄嚅铐.text() + " "
                                        + it.冷疱裥�.妙痤�.@袜桁妙痤�.text() + " "
                                        + it.冷疱裥�.妙痤�.@诣锩铕钿.text() + " "
                                        + it.冷疱裥�.袜皴胂箜牝.@袜桁袜皴胂箜牝.text() + " "
                                        + it.冷疱裥�.袜皴胂箜牝.@诣锿囫咫象黻�.text() + " "
                                        + it.冷疱裥�.与桷�.@袜桁与桷�.text() + " "
                                        + it.冷疱裥�.与桷�.@诣镉腓鲟.text() + " "
                                        + it.冷疱裥�.@念�.text() + " "
                                        + it.冷疱裥�.@暑痫.text() + " "
                                        + it.冷疱裥�.@殊囵�.text()
                        )
                        ip.setIpadr(ipadr)
                    }
                }

                //------------------ IPEMAIL
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode ip_address")
                if (it.砚冷疠胂铟螓.眯腿夏囹�.@泥蜞青镨耔 != "") {
                    it.砚冷疠胂铟螓.each {
                        Ipemail ipemail = new Ipemail(
                                idip: ip,
                                email: it.@'E-mail',
                                regnum: it.眯腿夏囹�.@眯腿�,
                                dtzap: Util.convertToDate(it.眯腿夏囹�.@泥蜞青镨耔 as String),
                                regnumcor: it.眯腿夏囹嗳耧�.@眯腿�,
                                dtcor: Util.convertToDate(it.眯腿夏囹嗳耧�.@泥蜞青镨耔 as String)
                        )
                        ip.setIpemail(ipemail)
                    }
                }

                //------------------ FSS
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_FSS")
                if (it.砚绣阍蜒.@绣阃铎匝� != "") {
                    it.砚绣阍蜒.each {
                        Ipfss ipfss = new Ipfss(
                                idip: ip,
                                idfss: new Spfss(
                                        kod: it.砚勿阍蜒.@暑湓蜒,
                                        name: it.砚勿阍蜒.@袜桁匝�
                                ),
                                regnomFss: it.@绣阃铎匝� as String,
                                dtstart: Util.convertToDate(it.@泥蜞绣� as String),
                                dtend: null
                        )
                        ip.setIpfss(ipfss)
                    }
                }

                //------------------ MNS
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode MNS")
                if (it.砚喻弪臀.@泥蜞项耱喻 != "") {
                    it.砚喻弪臀.each {
                        Ipmns ipmns = new Ipmns(
                                idip: ip,
                                idmns: new Spmns(
                                        kod: it.砚臀.@暑渫�,
                                        name: it.砚臀.@袜桁臀
                                ),
                                dtstart: Util.convertToDate(it.@泥蜞项耱喻 as String),
                                dtend: null
                        )
                        ip.setIpmns(ipmns)
                    }
                }

                //------------------ PF
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_PF")
                if (it.砚绣阆�.@泥蜞绣� != "") {
                    it.砚绣阆�.each {
                        Ippf ippf = new Ippf(
                                idip: ip,
                                idpf: new Sppf(
                                        kod: Util.convertToInt(it.砚勿阆�.@暑湎�),
                                        name: it.砚勿阆�.@袜桁显
                                ),
                                dtstart: Util.convertToDate(it.@泥蜞绣� as String),
                                dtend: null
                        )
                        ip.setIppf(ippf)
                    }
                }

                //------------------ IPNAME
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode FL")
                if (it.砚运.眯腿夏囹�.@泥蜞青镨耔 != "") {
                    it.砚运.each {
                        Ipname ipname = new Ipname(
                                idip: ip,
                                dtstart: Util.convertToDate(it.眯腿夏囹�.@泥蜞青镨耔 as String),
                                famfl: it.匀涡篑.@脏扈腓� as String,
                                namefl: it.匀涡篑.@褥� as String,
                                otchfl: it.匀涡篑.@悟麇耱忸 as String,
                                famlat: it.匀嗡囹.@脏扈腓� as String,
                                namelat: it.匀嗡囹.@褥� as String,
                                otchlat: it.匀嗡囹.@悟麇耱忸 as String,
                                sex: Util.convertToInt(it.@项�)
                        )
                        ip.setIpname(ipname)
                    }
                }

                //------------------ CITIZEN
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode CITIZEN")
                if (it.砚灭噫�.眯腿夏囹�.@泥蜞青镨耔 != "") {
                    it.砚灭噫�.each {
                        Ipcitizen ipcitizen = new Ipcitizen(
                                idip: ip,
                                dtstart: Util.convertToDate(it.眯腿夏囹�.@泥蜞青镨耔 as String),
                                idvidcitizen: new Spvidcitizen(
                                        id: Util.convertToInt(it.@妈涿疣驿),
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
                if (it.砚问螺�.砚问螺奈耥.@暑湮事菽 != "") {
                    Okved okved
                    it.砚问螺�.砚问螺奈耥.each {
                        okved = new Okved(
                                codeOkved: it.@暑湮事菽,
                                name: it.@袜桁问螺�
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
                if (it.砚问螺�.砚问螺哪铒.@暑湮事菽 != "") {
                    Okved okved
                    it.砚问螺�.砚问螺哪铒.each {
                        okved = new Okved(
                                codeOkved: it.@暑湮事菽,
                                name: it.@袜桁问螺�
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
                it.砚青锱眯认.each {
                    Ipgosreg ipgosreg = new Ipgosreg(
                            idip: ip,
                            idreg: it.@蠕青�,
                            regnum: it.@眯腿�,
                            dtreg: Util.convertToDate(it.砚砚桎.@泥蜞蔓溲忤� as String),
                            dtzap: Util.convertToDate(it.@泥蜞青� as String),
                            idvidreg: UtilParser.getVidregNew(it, list),
                            idregorg: UtilParser.getRegorgNew(it, list),
                            sersvid: Util.convertToInt(it.砚砚桎.@彦痂�),
                            numsvid: Util.convertToInt(it.砚砚桎.@皖戾�)
                    )
                    if (!ipgosregList.contains(ipgosreg)) {
                        ipgosregList.add(ipgosreg)
                    }
                }
                ip.setIpgosregs(ipgosregList)

                //------------------ LICENZ
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode LICENZ")
                if (it.砚髓鲥礴��.@皖焖桷 != "") {
                    List<Licenz> licenzsList = new ArrayList<>()
                    Licenz licenz;
                    it.砚髓鲥礴��.each {
                        licenz = new Licenz(
                                idip: ip,
                                numlic: it.@皖焖桷,
                                dtrestart: Util.convertToDate(it.@泥蜞髓� as String),
                                idlicorg: UtilParser.getLicorgNew(it, list),
                                idvidlic: UtilParser.getVidlicNew(it, list),
                                idsostlic: null, //UtilParser.getSostlic(it, list),//not found
                                dtstart: Util.convertToDate(it.@泥蜞袜魉桷 as String),
                                dtend: Util.convertToDate(it.@泥蜞侮铐魉桷 as String),
                                dtstop: Util.convertToDate(it.砚橡桀耱髓�.@髓鑫疸橡桀耱髓� as String),
                                orgstopname: it.砚橡桀耱髓�.@髓鑫疸橡桀耱髓�
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


