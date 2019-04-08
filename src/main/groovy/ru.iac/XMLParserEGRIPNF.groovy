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
            gPathResult.����.each {
                log.debug("Start decoding IP with OGRN " + it.@������)

                //------------------ IP
                ip = new Ip(
                        idip: it.@������,
                        inn: it.@�����,
                        ogrn: it.@������,
                        dtogrn: Util.convertToDate(it.�������.@���������� as String),
                        regnum: it.�������.@������,
                        dtreg: Util.convertToDate(it.�������.@������� as String),
                        regorgname: it.�������.@������,
                        kodstatusend: it.���������.��������.@���������,
                        namestatusend: it.���������.��������.@����������,
                        dtend: Util.convertToDate(it.���������.��������.@����������� as String),
                        regnumend: it.���������.������������.@�����,
                        dtregend: Util.convertToDate(it.���������.������������.@���������� as String),
                        idregorg: UtilParser.getRegorgNew(it as GPathResult, list),
                        ogrnul: it.���������.�������.@����,
                        innul: it.���������.�������.@���,
                        namepul: it.���������.�������.@����������,
                        grnzap: it.���������.�������.���������.@�����,
                        dtzap: Util.convertToDate(it.���������.�������.���������.@���������� as String),
                        grncor: it.���������.�������.�������������.@�����,
                        dtcor: Util.convertToDate(it.���������.�������.�������������.@���������� as String),
                        idvidip: new Spvidip(
                                        id: Util.convertToInt(it.@��������),
                                        name: it.@���������
                                )

                )
                if(it.��������.��������.@���������!="") {
                    Spipstat ipstat = new Spipstat(
                            id: Util.convertToInt(it.��������.��������.@���������),
                            name: it.��������.��������.@����������
                    )
                    ip.setIdstatus(ipstat)
                }

                //------------------ IPADR
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode ip_address")
                if (it.�������.���������.@���������� != "") {
                    it.�������.each {
                        Ipadr ipadr = new Ipadr(
                                idip: ip,
                                regnum: it.���������.@�����,
                                dtstart: Util.convertToDate(it.���������.@���������� as String),
                                regnumcor: it.�������������.@�����,
                                dtcor: Util.convertToDate(it.�������������.@���������� as String),
                                kodrg: it.�������.@���������,
                                kodKl: it.�������.@�����������,
                                fulladdress: UtilParser.getAddressNew(it.�������, list),
                                address:  it.�������.������.@����������.text() + " "
                                        + it.�������.������.@���������.text() + " "
                                        + it.�������.�����.@���������.text() + " "
                                        + it.�������.�����.@��������.text() + " "
                                        + it.�������.�����.@���������.text() + " "
                                        + it.�������.�����.@��������.text() + " "
                                        + it.�������.����������.@��������������.text() + " "
                                        + it.�������.����������.@�������������.text() + " "
                                        + it.�������.�����.@���������.text() + " "
                                        + it.�������.�����.@��������.text() + " "
                                        + it.�������.@���.text() + " "
                                        + it.�������.@����.text() + " "
                                        + it.�������.@�����.text()
                        )
                        ip.setIpadr(ipadr)
                    }
                }

                //------------------ IPEMAIL
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode ip_address")
                if (it.������������.���������.@���������� != "") {
                    it.������������.each {
                        Ipemail ipemail = new Ipemail(
                                idip: ip,
                                email: it.@'E-mail',
                                regnum: it.���������.@�����,
                                dtzap: Util.convertToDate(it.���������.@���������� as String),
                                regnumcor: it.�������������.@�����,
                                dtcor: Util.convertToDate(it.�������������.@���������� as String)
                        )
                        ip.setIpemail(ipemail)
                    }
                }

                //------------------ FSS
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_FSS")
                if (it.��������.@��������� != "") {
                    it.��������.each {
                        Ipfss ipfss = new Ipfss(
                                idip: ip,
                                idfss: new Spfss(
                                        kod: it.��������.@������,
                                        name: it.��������.@�������
                                ),
                                regnomFss: it.@��������� as String,
                                dtstart: Util.convertToDate(it.@������� as String),
                                dtend: null
                        )
                        ip.setIpfss(ipfss)
                    }
                }

                //------------------ MNS
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode MNS")
                if (it.��������.@���������� != "") {
                    it.��������.each {
                        Ipmns ipmns = new Ipmns(
                                idip: ip,
                                idmns: new Spmns(
                                        kod: it.����.@�����,
                                        name: it.����.@������
                                ),
                                dtstart: Util.convertToDate(it.@���������� as String),
                                dtend: null
                        )
                        ip.setIpmns(ipmns)
                    }
                }

                //------------------ PF
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_PF")
                if (it.�������.@������� != "") {
                    it.�������.each {
                        Ippf ippf = new Ippf(
                                idip: ip,
                                idpf: new Sppf(
                                        kod: Util.convertToInt(it.�������.@�����),
                                        name: it.�������.@������
                                ),
                                dtstart: Util.convertToDate(it.@������� as String),
                                dtend: null
                        )
                        ip.setIppf(ippf)
                    }
                }

                //------------------ IPNAME
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode FL")
                if (it.����.���������.@���������� != "") {
                    it.����.each {
                        Ipname ipname = new Ipname(
                                idip: ip,
                                dtstart: Util.convertToDate(it.���������.@���������� as String),
                                famfl: it.������.@������� as String,
                                namefl: it.������.@��� as String,
                                otchfl: it.������.@�������� as String,
                                famlat: it.������.@������� as String,
                                namelat: it.������.@��� as String,
                                otchlat: it.������.@�������� as String,
                                sex: Util.convertToInt(it.@���)
                        )
                        ip.setIpname(ipname)
                    }
                }

                //------------------ CITIZEN
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode CITIZEN")
                if (it.�������.���������.@���������� != "") {
                    it.�������.each {
                        Ipcitizen ipcitizen = new Ipcitizen(
                                idip: ip,
                                dtstart: Util.convertToDate(it.���������.@���������� as String),
                                idvidcitizen: new Spvidcitizen(
                                        id: Util.convertToInt(it.@��������),
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
                if (it.�������.����������.@�������� != "") {
                    Okved okved
                    it.�������.����������.each {
                        okved = new Okved(
                                codeOkved: it.@��������,
                                name: it.@���������
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
                if (it.�������.����������.@�������� != "") {
                    Okved okved
                    it.�������.����������.each {
                        okved = new Okved(
                                codeOkved: it.@��������,
                                name: it.@���������
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
                it.����������.each {
                    Ipgosreg ipgosreg = new Ipgosreg(
                            idip: ip,
                            idreg: it.@�����,
                            regnum: it.@�����,
                            dtreg: Util.convertToDate(it.������.@����������� as String),
                            dtzap: Util.convertToDate(it.@������� as String),
                            idvidreg: UtilParser.getVidregNew(it, list),
                            idregorg: UtilParser.getRegorgNew(it, list),
                            sersvid: Util.convertToInt(it.������.@�����),
                            numsvid: Util.convertToInt(it.������.@�����)
                    )
                    if (!ipgosregList.contains(ipgosreg)) {
                        ipgosregList.add(ipgosreg)
                    }
                }
                ip.setIpgosregs(ipgosregList)

                //------------------ LICENZ
                log.trace("Decoding IP with OGRN " + ip.getIdip() + " begin decode LICENZ")
                if (it.����������.@������ != "") {
                    List<Licenz> licenzsList = new ArrayList<>()
                    Licenz licenz;
                    it.����������.each {
                        licenz = new Licenz(
                                idip: ip,
                                numlic: it.@������,
                                dtrestart: Util.convertToDate(it.@������� as String),
                                idlicorg: UtilParser.getLicorgNew(it, list),
                                idvidlic: UtilParser.getVidlicNew(it, list),
                                idsostlic: null, //UtilParser.getSostlic(it, list),//not found
                                dtstart: Util.convertToDate(it.@���������� as String),
                                dtend: Util.convertToDate(it.@������������ as String),
                                dtstop: Util.convertToDate(it.�����������.@��������������� as String),
                                orgstopname: it.�����������.@���������������
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


