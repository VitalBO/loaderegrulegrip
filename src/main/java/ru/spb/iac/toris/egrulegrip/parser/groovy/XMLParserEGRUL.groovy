package ru.spb.iac.toris.egrulegrip.parser.groovy

import groovy.util.slurpersupport.GPathResult
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import ru.spb.iac.toris.egrulegrip.model.*

//import org.slf4j.Logger
//import org.slf4j.LoggerFactory

import ru.spb.iac.toris.egrulegrip.utils.Util

/**
 * Created by konenkov on 12.02.2015.
 * Class parse EGRUL objects, return UL object*
 */
class XMLParserEGRUL {

    private static Logger log = LogManager.getLogger(XMLParserEGRUL)
    private static ArrayList<EgrulEgripEntity> list = new ArrayList<EgrulEgripEntity>()


    static Ul parse(GPathResult gPathResult) {

        Ul ul = null
        try {

            gPathResult.each {

                log.debug("Start decoding UL with OGRN " + it.@IDUL)

                log.trace("Decoding UL with OGRN " + it.@IDUL + " begin decode UL")
                ul = new Ul(
                        idul: it.@IDUL,
                        ogrn: it.@OGRN,
                        inn: it.@INN,
                        kpp: it.@KPP,
                        idstatus: new Spulstat(
                                id: Util.convertToInt(it.STATUS.@ID),
                                name: it.STATUS.@NAME),
                        idregorg: UtilParser.getRegorg(it as GPathResult, list),
                        idvidregstart: UtilParser.getVidreg(it.UL_START, list),
                        regnumstart: it.UL_START.@REGNUM as String,
                        dtregstart: Util.convertToDate(it.UL_START.@DTREG as String),
                        idregorgstart: UtilParser.getRegorg(it.UL_START, list),
                        idvidregend: UtilParser.getVidreg(it.UL_FINISH, list),
                        regnumend: it.UL_FINISH.@REGNUM as String,
                        dtregend: Util.convertToDate(it.UL_FINISH.@DTREG as String),
                        idregorgend: UtilParser.getRegorg(it.UL_FINISH, list)
                )

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode okved")
                if (it.OKVED.@KOD_OKVED != "") {
                    ArrayList<Ulokved> listUlOkved = new ArrayList<>()
                    Okved okved
                    it.OKVED.each {
                        okved = new Okved(
                                codeOkved: it.@KOD_OKVED,
                                name: it.@NAME
                        )

                        listUlOkved.add(
                                new Ulokved(
                                        idokved: okved,
                                        idul: ul,
                                        main: Util.convertToInt(it.@MAIN)
                                )
                        )
                    }
                    ul.setUlokved(listUlOkved)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ulname")
                if (it.UL_NAME.@DTSTART != "") {
                    it.UL_NAME.each {
                        Ulname ulname = new Ulname(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                namep: it.@NAMEP as String,
                                namei: it.NAMEI.@NAME as String,
                                names: it.@NAMES as String,
                                idlangi: UtilParser.getSplang(it, list)
                        )
                        if (it.OPF.@ID != "") {
                            ulname.setIdopf(
                                    new Spopf(
                                            idopf: Util.convertToInt(it.OPF.@ID),
                                            spr: it.OPF.@SPR,
                                            kodOpf: it.OPF.@KOD_OPF,
                                            name: it.OPF.@NAME
                                    )
                            )
                        }
                        ul.setUlname(ulname)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_address")
                if (it.UL_ADDRESS.@DTSTART != "") {
                    it.UL_ADDRESS.each {

                        Uladr uladr = new Uladr(
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                idul: ul,
                                fulladdress: UtilParser.getAddress(it.ADDRESS, list),
                                nameisporg: it.@NAMEISPORG as String,
                                kodgorod: it.CONTACT.@KODGOROD as String,
                                telefon: it.CONTACT.@TELEFON as String,
                                fax: it.CONTACT.@FAX as String,
                                address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())
                        )
                        if (it.VIDADR.@ID != "") {
                            uladr.setIdvidadr(
                                    new Spvidadr(
                                            id: Util.convertToInt(it.VIDADR.@ID),
                                            name: it.VIDADR.@NAME
                                    )
                            )
                        }
                        ul.setUladr(uladr)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_capital")
                if (it.UL_CAPITAL.@DTSTART != "") {
                    it.UL_CAPITAL.each {
                        Ulcapital ulcapital = new Ulcapital(
                                idul: ul,
                                idvidcap: new Spvidcap(
                                        id: Util.convertToInt(it.VIDCAP.@ID),
                                        name: it.VIDCAP.@NAME
                                ),
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                summa: Util.convertToBDec(it.@SUMMA)
                        )
                        ul.setUlcapital(ulcapital)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_rul")
                if (it.UCHR.RUL.@DTSTART != "") {
                    ArrayList<Rul> ruls = new ArrayList<>()
                    it.UCHR.RUL.each {
                        Rul rul = new Rul(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                namep: it.@NAMEP,
                                ogrn: it.@OGRN,
                                inn: it.@INN,
                                kpp: it.@KPP,
                                dtreg: Util.convertToDate(it.@DTREG as String),
                                summa: Util.convertToBDec(it.@SUMMA),
                                dtogrn: Util.convertToDate(it.@DTOGRN as String),
                                regnumst: it.@NUMST,
                                fulladdress: UtilParser.getAddress(it.ADDRESS, list),
                                idregorg: UtilParser.getRegorg(it, list)
                        )
                        ruls.add(rul)
                    }
                    ul.setRuls(ruls)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_iul")
                if (it.UCHR.IUL.@DTSTART != "") {
                    ArrayList<Iul> iuls = new ArrayList<>()
                    it.UCHR.IUL.each {
                        Iul iul = new Iul(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                namep: it.@NAMEP,
                                dtreg: Util.convertToDate(it.@DTREG as String),
                                summa: Util.convertToBDec(it.@SUMMA),
                                inadr: it.@ADRESIN,
                                idoksm: UtilParser.getOksm(it, list)
                        )
                        iuls.add(iul)
                    }
                    ul.setIuls(iuls)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_uchrfl")
                if (it.UCHR.UCHRFL.@DTSTART != "") {
                    ArrayList<Fluchr> fluchrs = new ArrayList<>()
                    it.UCHR.UCHRFL.each {
                        Fluchr fluchr = new Fluchr(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                summa: Util.convertToBDec(it.@SUMMA),
                                idfl: new Fl(
                                        famfl: it.FL.@FAM_FL,
                                        namefl: it.FL.@NAME_FL,
                                        otchfl: it.FL.@OTCH_FL,
                                        inn: it.FL.@INN
                                )
                        )
                        fluchrs.add(fluchr)
                    }
                    ul.setFluchrs(fluchrs)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode reestrao")
                if (it.REESTR_AO.@OGRN != "") {
                    it.REESTR_AO.each {
                        Reestrao reestrao = new Reestrao(
                                idul: ul,
                                ogrn: it.@OGRN as String,
                                namep: it.@NAMEP as String
                        )
                        ul.setReestrao(reestrao)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode dolgnfl")
                if (it.DOLGNFL.@DTSTART != "") {
                    ArrayList<Fldolgn> fldolgns = new ArrayList<>()
                    it.DOLGNFL.each {
                        Fldolgn fldolgn = new Fldolgn(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                dolgn: it.@DOLGN,
                                idfl: new Fl(
                                        famfl: it.FL.@FAM_FL,
                                        namefl: it.FL.@NAME_FL,
                                        otchfl: it.FL.@OTCH_FL,
                                        inn: it.FL.@INN
                                )
                        )
                        fldolgns.add(fldolgn)
                    }
                    ul.setFldolgns(fldolgns)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_upr")
                if (it.UL_UPR.@DTSTART != "") {
                    it.UL_UPR.each {
                        Ulupr ulupr = new Ulupr(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                namep: it.@NAMEP,
                                ogrn: it.@OGRN,
                                inn: it.@INN,
                                kpp: it.@KPP,
                                dtreg: Util.convertToDate(it.@DTREG as String),
                                fulladdress: UtilParser.getAddress(it.ADDRESS, list),
                                kodgorod: it.CONTACT.@KODGOROD,
                                telefon: it.CONTACT.@TELEFON,
                                fax: it.CONTACT.@FAX
                        )
                        ul.setUlupr(ulupr)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode predsh")
                if (it.PREDSH.@NAMEP != "") {
                    ArrayList<Ulpredsh> ulpredshs = new ArrayList<>()
                    it.PREDSH.each {
                        Ulpredsh ulpredsh = new Ulpredsh(
                                idul: ul,
                                dtogrn: Util.convertToDate(it.@DTOGRN as String),
                                namep: it.@NAMEP,
                                ogrn: it.@OGRN,
                                inn: it.@INN,
                                kpp: it.@KPP,
                                dtreg: Util.convertToDate(it.@DTREG as String),
                                fulladdress: UtilParser.getAddress(it.ADDRESS, list),
                                idregorg: UtilParser.getRegorg(it, list)
                        )
                        ulpredshs.add(ulpredsh)
                    }
                    ul.setUlpredshs(ulpredshs)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode preem")
                if (it.PREEM.@NAMEP != "") {
                    ArrayList<Ulpreem> ulpreems = new ArrayList<>()
                    it.PREEM.each {

                        Ulpreem ulpreem = new Ulpreem(
                                idul: ul,
                                dtogrn: Util.convertToDate(it.@DTOGRN as String),
                                namep: it.@NAMEP,
                                ogrn: it.@OGRN,
                                inn: it.@INN,
                                kpp: it.@KPP,
                                dtreg: Util.convertToDate(it.@DTREG as String),
                                fulladdress: UtilParser.getAddress(it.ADDRESS, list),
                                idregorg: UtilParser.getRegorg(it, list)
                        )
                        ulpreems.add(ulpreem)
                    }
                    ul.setUlpreems(ulpreems)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode licenz")
                if (it.LICENZ.@NUMLIC != "") {
                    List<Licenz> licenzsList = new ArrayList<>()
                    Licenz licenz;
                    it.LICENZ.each {
                        licenz = new Licenz(
                                idul: ul,
                                numlic: it.@NUMLIC,
                                dtrestart: Util.convertToDate(it.@DTRESH as String),
                                idlicorg: UtilParser.getLicorg(it, list),
                                idvidlic: UtilParser.getVidlic(it, list),
                                idsostlic: UtilParser.getSostlic(it, list),
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                dtend: Util.convertToDate(it.@DTEND as String),
                                dtstop: Util.convertToDate(it.@DTSTOP as String),
                        )

                        licenzsList.add(licenz)
                    }
                    ul.setLicenzs(licenzsList)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_ob")
                if (it.UL_OB.@DTSTART != "") {
                    List<Ulob> ulobs = new ArrayList<>()
                    it.UL_OB.each {
                        Ulob ulob = new Ulob(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                vidob: Util.convertToInt(it.@VID_OB),
                                fulladdress: UtilParser.getAddress(it.ADDRESS, list),
                                kodgorod: it.CONTACT.@KODGOROD,
                                telefon: it.CONTACT.@TELEFON,
                                fax: it.CONTACT.@FAX
                        )
                        ulobs.add(ulob)
                    }
                    ul.setUlobs(ulobs)
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode gosreg")
                List<Gosreg> gosregs = new ArrayList<>()
                it.REGEGRUL.each {
                    Gosreg gosreg = new Gosreg(
                            idul: ul,
                            idreg: it.@IDREG,
                            regnum: it.@REGNUM,
                            dtreg: Util.convertToDate(it.@DTREG as String),
                            dtzap: Util.convertToDate(it.@DTZAP as String),
                            idvidreg: UtilParser.getVidreg(it, list),
                            idregorg: UtilParser.getRegorg(it, list),
                            sersvid: Util.convertToInt(it.SVSV.@SER_SV),
                            numsvid: Util.convertToInt(it.SVSV.@NUM_SV)
                    )
                    gosregs.add(gosreg)
                }
                ul.setGosregs(gosregs)

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode mns")
                if (it.MNS.@DTSTART != "") {
                    it.MNS.each {
                        Ulmns ipmns = new Ulmns(
                                idul: ul,
                                idmns: new Spmns(
                                        kod: it.ORGAN_MNS.@KOD,
                                        name: it.ORGAN_MNS.@NAME
                                ),
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                dtend: Util.convertToDate(it.@DTEND as String)
                        )
                        ul.setUlmns(ipmns)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode pf")
                if (it.PF.@REGN_PF != "") {
                    it.PF.each {
                        Ulpf ippf = new Ulpf(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                dtend: Util.convertToDate(it.@DTEND as String),
                                regnomPf: it.@REGN_PF as String,
                                idpf: new Sppf(
                                        kod: Util.convertToInt(it.ORGAN_PF.@KOD),
                                        name: it.ORGAN_PF.@NAME
                                )

                        )
                        ul.setUlpf(ippf)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode fss")
                if (it.FSS.@REGN_FSS != "") {
                    it.FSS.each {
                        Ulfss ipfss = new Ulfss(
                                idul: ul,
                                regnomFss: it.@REGN_FSS as String,
                                idfss: new Spfss(
                                        kod: it.ORGAN_FSS.@KOD,
                                        name: it.ORGAN_FSS.@NAME
                                )
                        )
                        ul.setUlfss(ipfss)
                    }
                }

                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode foms")
                if (it.FOMS.@REGN_FOMS != "") {
                    it.FOMS.each {
                        Ulfoms ipfoms = new Ulfoms(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@DTSTART as String),
                                dtend: Util.convertToDate(it.@DTEND as String),
                                regnomFoms: it.@REGN_FOMS as String,
                                idfoms: new Spfoms(
                                        kod: it.ORGAN_FOMS.@KOD,
                                        name: it.ORGAN_FOMS.@NAME
                                )
                        )
                        ul.setUlfoms(ipfoms)
                    }
                }
            }
        } catch (Exception ex) {
            log.error("Exception while parsing UL with OGRN = " + ul.getOgrn())
            log.error(ex.message)
            return null
        }
        return ul
    }


}