package ru.iac.egrip

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.PersistEgrip
import ru.iac.Util
import ru.iac.entity.*

/**
 * Created by konenkov on 10.02.2015.
 */
class XMLParserEGRIP {

    private static Logger log = LoggerFactory.getLogger(XMLParserEGRIP);

    public static HashMap<String, String> parse(File filePath) {

        def EGRIP_IP_DATA = new XmlSlurper().parse(filePath)
        HashMap<String, String> resultImport = new HashMap<>();


        EGRIP_IP_DATA.IP.each {
            log.debug("Start decoding IP with OGRN " + it.@IDIP)

            Ip ip = new Ip(
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

            //PersistEgrip.saveOrUpdate(ip)
            if (it.FOMS.@REGN_FOMS != "") {
                it.FOMS.each {
                    Spfoms spfoms = (Spfoms) PersistEgrip.getFromDBbyNaturalId(Spfoms.getName(), it.ORGAN_FOMS.@KOD as String)
                    if (spfoms == null) {
                        spfoms = new Spfoms(
                                kod: it.ORGAN_FOMS.@KOD,
                                name: it.ORGAN_FOMS.@NAME
                        )
                        PersistEgrip.saveOrUpdate(spfoms)
                    }
                    //Ipfoms ipfoms = (Ipfoms) PersistEgrip.getFromDB(Ipfoms.getName(), ip.getIdip() as BigInteger)
                    //if (ipfoms == null) 

                    Ipfoms ipfoms = new Ipfoms()
                    ipfoms.setIdip(ip)
                    ipfoms.setRegnomFoms(it.@REGN_FOMS as String)
                    ipfoms.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipfoms.setDtend(Util.convertToDate(it.@DTEND))
                    ipfoms.setIdfoms(spfoms)
                    ip.setIpfoms(ipfoms)

                }
            }
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_FSS")

            if (it.FSS.@REGN_FSS != "") {
                it.FSS.each {
                    Spfss spfss = (Spfss) PersistEgrip.getFromDBbyNaturalId(Spfss.getName(), it.ORGAN_FSS.@KOD as String)
                    if (spfss == null) {
                        spfss = new Spfss(
                                kod: it.ORGAN_FSS.@KOD,
                                name: it.ORGAN_FSS.@NAME
                        )
                        PersistEgrip.saveOrUpdate(spfss)
                    }
/*                    Ipfss ipfss = (Ipfss) PersistEgrip.getFromDB(Ipfss.getName(), ip.getIdip() as Integer)
                    if (ipfss == null) */
                    Ipfss ipfss = new Ipfss()
                    ipfss.setIdip(ip)
                    ipfss.setIdfss(spfss)
                    ipfss.setRegnomFss(it.@REGN_FSS as String)
                    ipfss.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipfss.setDtend(Util.convertToDate(it.@DTEND))
                    ip.setIpfss(ipfss)

                }
            }
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode MNS")

            if (it.MNS.@DTSTART != "") {
                it.MNS.each {
                    Spmns spmns = (Spmns) PersistEgrip.getFromDBbyNaturalId(Spmns.getName(), it.ORGAN_MNS.@KOD as String)
                    if (spmns == null) {
                        spmns = new Spmns(
                                kod: it.ORGAN_MNS.@KOD,
                                name: it.ORGAN_MNS.@NAME
                        )
                        PersistEgrip.saveOrUpdate(spmns)
                    }
                    //Ipmns ipmns = (Ipmns) PersistEgrip.getFromDB(Ipmns.getName(), ip.getIdip() as Integer)
                    //if (ipmns == null) 
                    Ipmns ipmns = new Ipmns()
                    ipmns.setIdip(ip)
                    ipmns.setIdmns(spmns)
                    ipmns.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipmns.setDtend(Util.convertToDate(it.@DTEND))
                    ip.setIpmns(ipmns)
                }
            }

            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGN_PF")

            if (it.PF.@REGN_PF != "") {
                it.PF.each {
                    Sppf sppf = (Sppf) PersistEgrip.getFromDBbyNaturalId(Sppf.getName(), it.ORGAN_PF.@KOD as String)
                    if (sppf == null) {
                        sppf = new Sppf(
                                kod: Util.convertToInt(it.ORGAN_PF.@KOD),
                                name: it.ORGAN_PF.@NAME
                        )
                        PersistEgrip.saveOrUpdate(sppf)
                    }
                    //Ippf ippf = (Ippf) PersistEgrip.getFromDB(Ippf.getName(), ip.getIdip() as Integer)
                    //if (ippf == null) 
                    Ippf ippf = new Ippf()
                    ippf.setIdip(ip)
                    ippf.setDtstart(Util.convertToDate(it.@DTSTART))
                    ippf.setDtend(Util.convertToDate(it.@DTEND))
                    ippf.setRegnomPf(it.@REGN_PF as String)
                    ippf.setIdpf(sppf)
                    ip.setIppf(ippf)
                }
            }
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGOLD")

            if (it.REGOLD.@NUMOLD != "") {
                it.REGOLD.each {
                    //Ipregold ipregold = (Ipregold) PersistEgrip.getFromDB(Ipregold.getName(), ip.getIdip() as Integer)
                    //if (ipregold == null) 
                    Ipregold ipregold = new Ipregold()
                    ipregold.setIdip(ip)
                    ipregold.setNumold(it.@NUMOLD as String)
                    ipregold.setDtreg(Util.convertToDate(it.@DTREG))
                    ipregold.setIdregorg(new Spregorg(
                            idspro: Util.convertToBInt(it.REGORG.@ID),
                            name: it.REGORG.@NAME))
                    ip.setIpregold(ipregold)
                    //PersistEgrip.saveOrUpdate(ipregold)
                }
            }
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode FL")

            if (it.FL.@DTSTART != "") {
                it.FL.each {
                    //Ipname ipname = (Ipname) PersistEgrip.getFromDB(Ipregold.getName(), ip.getIdip() as Integer)
                    //if (ipname == null) 
                    Ipname ipname = new Ipname()
                    ipname.setIdip(ip)
                    ipname.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipname.setFamfl(it.@FAM_FL as String)
                    ipname.setNamefl(it.@NAME_FL as String)
                    ipname.setOtchfl(it.@OTCH_FL as String)
                    ipname.setFamlat(it.@FAM_LAT as String)
                    ipname.setNamelat(it.@NAME_LAT as String)
                    ipname.setOtchlat(it.@OTCH_LAT as String)
                    ipname.setSex(Util.convertToInt(it.@SEX))
                    ip.setIpname(ipname)
                    //PersistEgrip.saveOrUpdate(ipname)
                }
            }
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode CITIZEN")

            if (it.CITIZEN.@DTSTART != "") {
                it.CITIZEN.each {
                    //Ipcitizen ipcitizen = (Ipcitizen) PersistEgrip.getFromDB(Ipcitizen.getName(), ip.getIdip() as Integer)
                    //if (ipcitizen == null)
                    Ipcitizen ipcitizen = new Ipcitizen()
                    ipcitizen.setIdip(ip)
                    ipcitizen.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipcitizen.setIdvidcitizen(new Spvidcitizen(
                            id: Util.convertToInt(it.VIDCITIZEN.@ID),
                            name: it.VIDCITIZEN.@NAME)
                    )
                    ipcitizen.setOksm(
                            new Oksm(
                                    id: Util.convertToInt(it.OKSM.@ID),
                                    kodOksm: it.OKSM.@KOD_OKSM,
                                    name: it.OKSM.@NAME

                            )
                    )
                    ip.setIpcitizen(ipcitizen)
                    //PersistEgrip.saveOrUpdate(ipcitizen)
                }
            }
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode OKVED")

            if (it.OKVED.@KOD_OKVED != "") {
                ArrayList<Ipokved> listIpOkved = new ArrayList<>()
                it.OKVED.each {
                    Okved okved = (Okved) PersistEgrip.getNamedQuery(Okved.FIND_BY_CODEOKVED, "codeOkved", it.@KOD_OKVED as String)
                    if (okved == null) {
                        okved = new Okved(
                                codeOkved: it.@KOD_OKVED,
                                name: it.@NAME
                        )
                        PersistEgrip.saveOrUpdate(okved)
                    }
                    listIpOkved.add(
                            new Ipokved(
                                    idokved: okved,
                                    idip: ip
                            )
                    )

                }
                ip.setIpokved(listIpOkved)
            }
// TODO make load DOKDSN, at files at 12.2014, I did not find this data
            log.debug("Decoding IP with OGRN " + ip.getIdip() + " begin decode REGEGRIP")

            List<Ipgosreg> ipgosregList = new ArrayList<>()
            it.REGEGRIP.each {
                Spregorg spregorg = (Spregorg) PersistEgrip.getFromDB(Spregorg.getName(), Util.convertToBInt(it.REGORG.@ID))
                if (spregorg == null) {
                    spregorg = new Spregorg(
                            idspro: Util.convertToBInt(it.REGORG.@ID),
                            name: it.REGORG.@NAME)
                    PersistEgrip.saveOrUpdate(spregorg)
                }
                Ipgosreg ipgosreg = new Ipgosreg(
                        idip: ip,
                        idreg: it.@IDREG,
                        regnum: it.@REGNUM,
                        dtreg: Util.convertToDate(it.@DTREG),
                        dtzap: Util.convertToDate(it.@DTZAP),
                        idvidreg: new Spvidreg(
                                idvidreg: Util.convertToInt(it.VIDREG.@ID),
                                name: it.VIDREG.@NAME
                        ),
                        idregorg: spregorg,
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
                    Splicorg splicorg = (Splicorg) PersistEgrip.getFromDB(Splicorg.getName(), it.LICORG.@ID as String)
                    if (splicorg == null) {
                        splicorg = new Splicorg(
                                id: it.LICORG.@ID,
                                name: it.LICORG.@NAME
                        )
                        PersistEgrip.saveOrUpdate(splicorg)
                    }

                    Spsostlic spsostlic = (Spsostlic) PersistEgrip.getFromDB(Spsostlic.getName(), Util.convertToInt(it.SOSTLIC.@ID))
                    if (spsostlic == null) {
                        spsostlic = new Spsostlic(
                                idsostlic: Util.convertToInt(it.SOSTLIC.@ID),
                                name: it.SOSTLIC.@NAME
                        )
                        PersistEgrip.saveOrUpdate(spsostlic)
                    }

                    Spvidlic spvidlic = null
                    if (it.VIDLIC.@ID != "") {
                        spvidlic = (Spvidlic) PersistEgrip.getFromDB(Spvidlic.getName(), Util.convertToBInt(it.VIDLIC.@ID))
                        if (spvidlic == null) {
                            spvidlic = new Spvidlic(
                                    idvidlic: Util.convertToBInt(it.VIDLIC.@ID),
                                    name: it.VIDLIC.@NAME_VLIC

                            )
                            PersistEgrip.saveOrUpdate(spvidlic)
                        }
                    }
                    licenz = new Licenz(
                            idip: ip,
                            numlic: it.@NUMLIC,
                            dtrestart: Util.convertToDate(it.@DTRESH),
                            idlicorg: splicorg,
                            idvidlic: spvidlic,
                            idsostlic: spsostlic,
                            dtstart: Util.convertToDate(it.@DTSTART),
                            dtend: Util.convertToDate(it.@DTEND),
                            dtstop: Util.convertToDate(it.@DTSTOP),
                    )

                    licenzsList.add(licenz)
                }
                ip.setLicenzs(licenzsList)
            }
            log.debug("Start saving IP with OGRN " + ip.getIdip() + " to DB")
            try {
                PersistEgrip.saveOrUpdate(ip)
                log.info("Save to EGRIP IP with OGRN " + ip.getOgrn())
                resultImport.put(ip.getOgrn(), "Success")
            } catch (Exception | MissingPropertyException ex) {
                log.debug("Error saving EGRIP IP with OGRN " + ip.getOgrn())
                log.debug(ex.printStackTrace())
                resultImport.put(ip.getOgrn(), "Fail")
            }

        }
        return resultImport
    }

}

