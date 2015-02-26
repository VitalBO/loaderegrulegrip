package ru.iac.egrip

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.Util
import ru.iac.entity.*

/**
 * Created by konenkov on 10.02.2015.
 */
class XMLParserEGRIP {

    private static Logger log = LoggerFactory.getLogger(XMLParserEGRIP);

    public static Ip parse(String string) {

        def EGRIP_IP_DATA = new XmlSlurper().parseText(string)
        Ip ip;

        EGRIP_IP_DATA.each {
            log.debug("Start decoding IP with OGRN " + it.@IDIP)

            ip = new Ip(
                    idip: it.@IDIP,
                    inn: it.@INN,
                    ogrn: it.@OGRNIP,
                    idregorg:
                            new Spregorg(
                                    idspro: Util.convertToBInt(it.REGORG.@ID),
                                    name: it.REGORG.@NAME
                            ),
                    idstatus:
                            new Spipstat(
                                    id: Util.convertToInt(it.STATUS.@ID),
                                    name: it.STATUS.@NAME
                            ),
                    idvidip:
                            new Spvidip(
                                    id: Util.convertToInt(it.VIDIP.@ID),
                                    name: it.VIDIP.@NAME
                            ),


            )

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_FOMS")
            if (it.FOMS.@REGN_FOMS != "") {
                it.FOMS.each {

                    Ipfoms ipfoms = new Ipfoms(
                            idip: ip,
                            regnomFoms: it.@REGN_FOMS as String,
                            idfoms: new Spfoms(
                                    kod: it.ORGAN_FOMS.@KOD,
                                    name: it.ORGAN_FOMS.@NAME
                            ),
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            dtend: Util.convertToDate(it.@DTEND as String)
                    )
                    ip.setIpfoms(ipfoms)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_FSS")
            if (it.FSS.@REGN_FSS != "") {
                it.FSS.each {
                    Ipfss ipfss = new Ipfss(
                            idip: ip,
                            idfss: new Spfss(
                                    kod: it.ORGAN_FSS.@KOD,
                                    name: it.ORGAN_FSS.@NAME
                            ),
                            regnomFss: it.@REGN_FSS as String,
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            dtend: Util.convertToDate(it.@DTEND as String)
                    )
                    ip.setIpfss(ipfss)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode MNS")
            if (it.MNS.@DTSTART != "") {
                it.MNS.each {
                    Ipmns ipmns = new Ipmns(
                            idip: ip,
                            idmns: new Spmns(
                                    kod: it.ORGAN_MNS.@KOD,
                                    name: it.ORGAN_MNS.@NAME
                            ),
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            dtend: Util.convertToDate(it.@DTEND as String)
                    )
                    ip.setIpmns(ipmns)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_PF")
            if (it.PF.@REGN_PF != "") {
                it.PF.each {
                    Ippf ippf = new Ippf(
                            idip: ip,
                            idpf: new Sppf(
                                    kod: Util.convertToInt(it.ORGAN_PF.@KOD),
                                    name: it.ORGAN_PF.@NAME
                            ),
                            regnomPf: it.@REGN_PF as String,
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            dtend: Util.convertToDate(it.@DTEND as String)
                    )
                    ip.setIppf(ippf)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGOLD")
            if (it.REGOLD.@NUMOLD != "") {
                it.REGOLD.each {
                    Ipregold ipregold = new Ipregold(
                            idip: ip,
                            numold: it.@NUMOLD as String,
                            dtreg: Util.convertToDate(it.@DTREG as String),
                            idregorg: new Spregorg(
                                    idspro: Util.convertToBInt(it.REGORG.@ID),
                                    name: it.REGORG.@NAME
                            )
                    )
                    ip.setIpregold(ipregold)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode FL")
            if (it.FL.@DTSTART != "") {
                it.FL.each {
                    Ipname ipname = new Ipname(
                            idip: ip,
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            famfl: it.@FAM_FL as String,
                            namefl: it.@NAME_FL as String,
                            otchfl: it.@OTCH_FL as String,
                            famlat: it.@FAM_LAT as String,
                            namelat: it.@NAME_LAT as String,
                            otchlat: it.@OTCH_LAT as String,
                            sex: Util.convertToInt(it.@SEX)
                    )
                    ip.setIpname(ipname)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode CITIZEN")
            if (it.CITIZEN.@DTSTART != "") {
                it.CITIZEN.each {
                    Ipcitizen ipcitizen = new Ipcitizen(
                            idip: ip,
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            idvidcitizen: new Spvidcitizen(
                                    id: Util.convertToInt(it.VIDCITIZEN.@ID),
                                    name: it.VIDCITIZEN.@NAME
                            ),
                            oksm: new Oksm(
                                    id: Util.convertToInt(it.OKSM.@ID),
                                    kodOksm: it.OKSM.@KOD_OKSM,
                                    name: it.OKSM.@NAME
                            )
                    )
                    ip.setIpcitizen(ipcitizen)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode OKVED")
            if (it.OKVED.@KOD_OKVED != "") {
                ArrayList<Ipokved> listIpOkved = new ArrayList<>()
                it.OKVED.each {
                    Okved okved = new Okved(
                            codeOkved: it.@KOD_OKVED,
                            name: it.@NAME
                    )
                    listIpOkved.add(
                            new Ipokved(
                                    idokved: okved,
                                    idip: ip
                            )
                    )
                }
                ip.setIpokved(listIpOkved)
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode DOKSDN")
            if (it.DOKSDN.@DTSTART != "") {
                it.DOKSDN.each {
                    Ipdokdsn ipdokdsn = new Ipdokdsn(
                            idip: ip,
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            iddokdn: new Spdokdn(
                                    id: Util.convertToInt(it.DOKDN.@ID),
                                    name: it.DOKDN.@NAME
                            ),
                            idosndn: new Sposndn(
                                    id: Util.convertToInt(it.OSNDN.@ID),
                                    name: it.OSNDN.@NAME
                            ),
                            num: it.@NUM,
                            dt: it.@DT,
                            nameorg: it.@NAMEORG
                    )
                    ip.setIpdokdsn(ipdokdsn)
                }
            }
            
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGEGRIP")
            List<Ipgosreg> ipgosregList = new ArrayList<>()
            it.REGEGRIP.each {
                Ipgosreg ipgosreg = new Ipgosreg(
                        idip: ip,
                        idreg: it.@IDREG,
                        regnum: it.@REGNUM,
                        dtreg: Util.convertToDate(it.@DTREG as String),
                        dtzap: Util.convertToDate(it.@DTZAP as String),
                        idvidreg: new Spvidreg(
                                idvidreg: Util.convertToInt(it.VIDREG.@ID),
                                name: it.VIDREG.@NAME
                        ),
                        idregorg: new Spregorg(
                                idspro: Util.convertToBInt(it.REGORG.@ID),
                                name: it.REGORG.@NAME
                        ),
                        sersvid: Util.convertToInt(it.SVSV.@SER_SV),
                        numsvid: Util.convertToInt(it.SVSV.@NUM_SV)
                )
                ipgosregList.add(ipgosreg)
            }
            ip.setIpgosregs(ipgosregList)
            
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode LICENZ")
            if (it.LICENZ.@NUMLIC != "") {
                List<Licenz> licenzsList = new ArrayList<>()
                Licenz licenz;
                it.LICENZ.each {
                    licenz = new Licenz(
                            idip: ip,
                            numlic: it.@NUMLIC,
                            dtrestart: Util.convertToDate(it.@DTRESH as String),
                            idlicorg: new Splicorg(
                                    id: it.LICORG.@ID,
                                    name: it.LICORG.@NAME
                            ),
                            idvidlic: new Spvidlic(
                                    idvidlic: Util.convertToBInt(it.VIDLIC.@ID),
                                    name: it.VIDLIC.@NAME_VLIC
                            ),
                            idsostlic: new Spsostlic(
                                    idsostlic: Util.convertToInt(it.SOSTLIC.@ID),
                                    name: it.SOSTLIC.@NAME
                            ),
                            dtstart: Util.convertToDate(it.@DTSTART as String),
                            dtend: Util.convertToDate(it.@DTEND as String),
                            dtstop: Util.convertToDate(it.@DTSTOP as String),
                    )

                    licenzsList.add(licenz)
                }
                ip.setLicenzs(licenzsList)
            }
        }
        return ip
    }
}

