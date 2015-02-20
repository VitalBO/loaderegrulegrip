package ru.iac.egrul

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.EgrulDBDAO
import ru.iac.Util
import ru.iac.entity.*

/**
 * Created by konenkov on 12.02.2015.
 */
public class XMLParserEGRUL {

    private static Logger log = LoggerFactory.getLogger(XMLParserEGRUL);


    public static HashMap<String, String> parse(File filePath) {

        def EGRIP_UL_DATA = new XmlSlurper().parse(filePath)
        HashMap<String, String> resultImport = new HashMap<>();
        EGRIP_UL_DATA.UL.each {
            log.debug("Start decoding UL with OGRN " + it.@IDUL)
            Spregorg idregorgend = null
            if (it.UL_FINISH.REGORG.@ID != "") {
                idregorgend = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.UL_FINISH.REGORG.@ID))
                if (idregorgend == null) {
                    idregorgend = new Spregorg(
                            idspro: Util.convertToBInt(it.UL_FINISH.REGORG.@ID),
                            name: it.UL_FINISH.REGORG.@NAME
                    )
                    EgrulDBDAO.saveOrUpdate(idregorgend)
                }
            }
            Spregorg idregorgstart = null
            if (it.UL_START.REGORG.@ID != "") {
                idregorgstart = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.UL_START.REGORG.@ID))
                if (idregorgstart == null) {
                    idregorgstart = new Spregorg(
                            idspro: Util.convertToBInt(it.UL_START.REGORG.@ID),
                            name: it.UL_START.REGORG.@NAME
                    )
                    EgrulDBDAO.saveOrUpdate(idregorgstart)
                }
            }
            Spregorg idregorg = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.REGORG.@ID))
            if (idregorg == null) {
                idregorg =
                        new Spregorg(
                                idspro: Util.convertToBInt(it.REGORG.@ID),
                                name: it.REGORG.@NAME
                        )
                EgrulDBDAO.saveOrUpdate(idregorg)
            }
            Spvidreg spvidregend = null
            if (it.UL_FINISH.VIDREG.@ID != "") {
                spvidregend = (Spvidreg) EgrulDBDAO.getFromDB(Spvidreg.getName(), Util.convertToInt(it.UL_FINISH.VIDREG.@ID))
                if (spvidregend == null) {
                    spvidregend =
                            new Spvidreg(
                                    idvidreg: Util.convertToInt(it.UL_FINISH.VIDREG.@ID),
                                    name: it.UL_FINISH.VIDREG.@NAME

                            )
                    EgrulDBDAO.saveOrUpdate(spvidregend)
                }
            }
            Spvidreg spvidregstart = null
            if (it.UL_START.VIDREG.@ID != "") {
                spvidregstart = (Spvidreg) EgrulDBDAO.getFromDB(Spvidreg.getName(), Util.convertToInt(it.UL_START.VIDREG.@ID))
                if (spvidregstart == null) {
                    spvidregstart =
                            new Spvidreg(
                                    idvidreg: Util.convertToInt(it.UL_START.VIDREG.@ID),
                                    name: it.UL_FINISH.VIDREG.@NAME

                            )
                    EgrulDBDAO.saveOrUpdate(spvidregstart)
                }
            }
            log.debug("Decoding UL with OGRN " + it.@IDUL + " begin decode UL")
            Ul ul = new Ul(
                    idul: it.@IDUL,
                    ogrn: it.@OGRN,
                    inn: it.@INN,
                    kpp: it.@KPP,
                    idstatus:
                            new Spulstat(
                                    id: Util.convertToInt(it.STATUS.@ID),
                                    name: it.STATUS.@NAME,
                            ),
                    idregorg: idregorg,
                    idvidregstart: spvidregstart,
                    regnumstart: it.UL_START.@REGNUM as String,
                    dtregstart: Util.convertToDate(it.UL_START.@DTREG),
                    idregorgstart: idregorgstart,
                    idvidregend: spvidregend,
                    regnumend: it.UL_FINISH.@REGNUM as String,
                    dtregend: Util.convertToDate(it.UL_FINISH.@DTREG),
                    idregorgend: idregorgend
            )
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode okved")
            if (it.OKVED.@KOD_OKVED != "") {
                ArrayList<Ulokved> listUlOkved = new ArrayList<>()
                it.OKVED.each {
                    Okved okved = (Okved) EgrulDBDAO.getNamedQuery(Okved.FIND_BY_CODEOKVED, "codeOkved", it.@KOD_OKVED as String)
                    if (okved == null) {
                        okved = new Okved(
                                codeOkved: it.@KOD_OKVED,
                                name: it.@NAME
                        )
                    }
                    EgrulDBDAO.saveOrUpdate(okved)
                    listUlOkved.add(
                            new Ulokved(
                                    idokved: okved,
                                    idul: ul
                            )
                    )

                }
                ul.setUlokved(listUlOkved)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode ulname")
            if (it.UL_NAME.@DTSTART != "") {
                it.UL_NAME.each {
                    Splang splang = null
                    if (it.NAMEI.LANG.@ID != "") {
                        splang = (Splang) EgrulDBDAO.getFromDB(Splang.getName(), Util.convertToInt(it.NAMEI.LANG.@ID))
                        if (splang == null) {
                            splang =
                                    new Splang(
                                            id: Util.convertToInt(it.NAMEI.LANG.@ID),
                                            kodLang: it.NAMEI.LANG.@KOD_LANG,
                                            name: it.NAMEI.LANG.@NAME
                                    )
                            EgrulDBDAO.saveOrUpdate(splang)
                        }
                    }
                    Ulname ulname = new Ulname()
                    ulname.setIdul(ul)
                    ulname.setDtstart(Util.convertToDate(it.@DTSTART))
                    ulname.setNamep(it.@NAMEP as String)
                    ulname.setNames(it.@NAMES as String)
                    ulname.setNamei(it.NAMEI.@NAME as String)
                    ulname.setIdlangi(splang)
                    ulname.setIdopf(
                            new Spopf(
                                    idopf: Util.convertToInt(it.OPF.@ID),
                                    spr: it.OPF.@SPR,
                                    kodOpf: it.OPF.@KOD_OPF,
                                    name: it.OPF.@NAME
                            )
                    )
                    ul.setUlname(ulname)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_address")
            if (it.UL_ADDRESS.@DTSTART != "") {
                it.UL_ADDRESS.each {
/*                    Uladr uladr = (Uladr) PersistEgrip.getNamedQuery(Uladr.FIND_BY_IDUL, "idul", ul.getIdul())
                    if (uladr == null) uladr = new Uladr()*/
                    Uladr uladr = new Uladr(
                            address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())
                    )
                    uladr.setDtstart(Util.convertToDate(it.@DTSTART))
                    uladr.setIdul(ul)
                    uladr.setIdvidadr(
                            new Spvidadr(
                                    id: Util.convertToInt(it.VIDADR.@ID),
                                    name: it.VIDADR.@NAME
                            )
                    )
                    it.ADDRESS.each {
                        if (it.REGION.@ID != "") {
                            Rg rg = new Rg(
                                    idr: new BigInteger(it.REGION.@ID as String),
                                    name: it.REGION.@NAME as String,
                                    kodKl: it.REGION.@KOD_KL as String
                            )
                            EgrulDBDAO.saveOrUpdate(rg)
                        }
                        if (it.RAION.@ID != "") {
                            Ds ds = new Ds(
                                    idd: new BigInteger(it.RAION.@ID as String),
                                    name: it.RAION.@NAME as String,
                                    kodKl: it.RAION.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ds)
                        }
                        if (it.GOROD.@ID != "") {
                            Ct ct = new Ct(
                                    idc: new BigInteger(it.GOROD.@ID as String),
                                    name: it.GOROD.@NAME as String,
                                    kodKl: it.GOROD.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ct)
                        }
                        if (it.NASPUNKT.@ID != "") {
                            Cn cn = new Cn(
                                    idn: new BigInteger(it.NASPUNKT.@ID as String),
                                    name: it.NASPUNKT.@NAME as String,
                                    kodKl: it.NASPUNKT.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(cn)
                        }
                        if (it.STREET.@ID != "") {
                            St st = new St(
                                    ids: new BigInteger(it.STREET.@ID as String),
                                    name: it.STREET.@NAME as String,
                                    kodSt: it.STREET.@KOD_ST as String

                            )
                            EgrulDBDAO.saveOrUpdate(st)
                        }
                    }


                    uladr.setNameisporg(it.@NAMEISPORG as String)
                    uladr.setOkato(it.ADDRESS.@OKATO as String)
                    uladr.setIndeks(it.ADDRESS.@INDEKS as String)
                    uladr.setIdregion(it.ADDRESS.REGION.@ID as String)
                    uladr.setIdraion(it.ADDRESS.RAION.@ID as String)
                    uladr.setIdgorod(it.ADDRESS.GOROD.@ID as String)
                    uladr.setIdnasp(it.ADDRESS.NASPUNKT.@ID as String)
                    uladr.setIdstreet(it.ADDRESS.STREET.@ID as String)
                    uladr.setDom(it.ADDRESS.@DOM as String)
                    uladr.setKorp(it.ADDRESS.@KORP as String)
                    uladr.setKvart(it.ADDRESS.@KVART as String)
                    uladr.setKodgorod(it.CONTACT.@KODGOROD as String)
                    uladr.setTelefon(it.CONTACT.@TELEFON as String)
                    uladr.setFax(it.CONTACT.@FAX as String)
/*                    String temp = (it.ADDRESS.REGION.@NAME.text()) + " " + (it.ADDRESS.RAION.@NAME.text())+ " " +
                            + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " +
                            + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text())+ " " + (it.ADDRESS.@KORP.text()) + " "+
                            + (it.ADDRESS.@KVART.text())
                    uladr.setAddress(temp)*/
                    ul.setUladr(uladr)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_capital")

            if (it.UL_CAPITAL.@DTSTART != "") {
                it.UL_CAPITAL.each {
                    Ulcapital ulcapital = new Ulcapital()
                    ulcapital.setIdul(ul)
                    ulcapital.setIdvidcap(
                            new Spvidcap(
                                    id: Util.convertToInt(it.VIDCAP.@ID),
                                    name: it.VIDCAP.@NAME
                            )
                    )
                    ulcapital.setDtstart(Util.convertToDate(it.@DTSTART))
                    ulcapital.setSumma(Util.convertToBDec(it.@SUMMA))
                    ul.setUlcapital(ulcapital)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_rul")
            if (it.UCHR.RUL.@DTSTART != "") {
                ArrayList<Rul> ruls = new ArrayList<>()
                it.UCHR.RUL.each {
                    Spregorg idregorgrul = null
                    if (it.UCHR.RUL.REGORG.@ID != "") {
                        idregorgrul = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.REGORG.@ID))
                        if (idregorgrul == null) {
                            idregorgrul =
                                    new Spregorg(
                                            idspro: Util.convertToBInt(it.REGORG.@ID),
                                            name: it.REGORG.@NAME
                                    )
                            EgrulDBDAO.saveOrUpdate(idregorgrul)
                        }
                    }
                    it.ADDRESS.each {
                        if (it.REGION.@ID != "") {
                            Rg rg = new Rg(
                                    idr: new BigInteger(it.REGION.@ID as String),
                                    name: it.REGION.@NAME as String,
                                    kodKl: it.REGION.@KOD_KL as String
                            )
                            EgrulDBDAO.saveOrUpdate(rg)
                        }
                        if (it.RAION.@ID != "") {
                            Ds ds = new Ds(
                                    idd: new BigInteger(it.RAION.@ID as String),
                                    name: it.RAION.@NAME as String,
                                    kodKl: it.RAION.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ds)
                        }
                        if (it.GOROD.@ID != "") {
                            Ct ct = new Ct(
                                    idc: new BigInteger(it.GOROD.@ID as String),
                                    name: it.GOROD.@NAME as String,
                                    kodKl: it.GOROD.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ct)
                        }
                        if (it.NASPUNKT.@ID != "") {
                            Cn cn = new Cn(
                                    idn: new BigInteger(it.NASPUNKT.@ID as String),
                                    name: it.NASPUNKT.@NAME as String,
                                    kodKl: it.NASPUNKT.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(cn)
                        }
                        if (it.STREET.@ID != "") {
                            St st = new St(
                                    ids: new BigInteger(it.STREET.@ID as String),
                                    name: it.STREET.@NAME as String,
                                    kodSt: it.STREET.@KOD_ST as String

                            )
                            EgrulDBDAO.saveOrUpdate(st)
                        }
                    }
                    Rul rul = new Rul(
                            idul: ul,
                            dtstart: Util.convertToDate(it.@DTSTART),
                            namep: it.@NAMEP,
                            ogrn: it.@OGRN,
                            inn: it.@INN,
                            kpp: it.@KPP,
                            dtreg: Util.convertToDate(it.@DTREG),
                            summa: Util.convertToBDec(it.@SUMMA),
                            dtogrn: Util.convertToDate(it.@DTOGRN),
                            regnumst: it.@NUMST,
                            okato: it.ADDRESS.@OKATO as String,
                            indeks: Util.convertToInt(it.ADDRESS.@INDEKS),
                            idregion: it.ADDRESS.REGION.@ID as String,
                            idraion: it.ADDRESS.RAION.@ID,
                            idgorod: it.ADDRESS.GOROD.@ID,
                            idnasp: it.ADDRESS.NASPUNKT.@ID,
                            idstreet: it.ADDRESS.STREET.@ID as String,
                            dom: it.ADDRESS.@DOM as String,
                            korp: it.ADDRESS.@KORP as String,
                            kvart: it.ADDRESS.@KVART as String,
                            idregorg: idregorgrul,
                            address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())
                    )
                    ruls.add(rul)
                }
                ul.setRuls(ruls)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_iul")

            if (it.UCHR.IUL.@DTSTART != "") {
                ArrayList<Iul> iuls = new ArrayList<>()
                it.UCHR.IUL.each {
                    Iul iul = new Iul(
                            idul: ul,
                            dtstart: Util.convertToDate(it.@DTSTART),
                            namep: it.@NAMEP,
                            dtreg: Util.convertToDate(it.@DTREG),
                            summa: Util.convertToBDec(it.@SUMMA),
                            inadr: it.@ADRESIN,
                            idoksm:
                                    new Oksm(
                                            id: Util.convertToInt(it.OKSM.@ID),
                                            kodOksm: it.OKSM.@KOD_OKSM,
                                            name: it.OKSM.@NAME
                                    )
                    )
                    iuls.add(iul)
                }
                ul.setIuls(iuls)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_uchrfl")

            if (it.UCHR.UCHRFL.@DTSTART != "") {
                ArrayList<Fluchr> fluchrs = new ArrayList<>()
                it.UCHR.UCHRFL.each {
                    Fluchr fluchr = new Fluchr(
                            idul: ul,
                            dtstart: Util.convertToDate(it.@DTSTART),
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
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode reestrao")

            if (it.REESTR_AO.@OGRN != "") {
                it.REESTR_AO.each {
                    Reestrao reestrao = new Reestrao()
                    reestrao.setIdul(ul)
                    reestrao.setOgrn(it.@OGRN as String)
                    reestrao.setNamep(it.@NAMEP as String)
                    ul.setReestrao(reestrao)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode dolgnfl")

            if (it.DOLGNFL.@DTSTART != "") {
                ArrayList<Fldolgn> fldolgns = new ArrayList<>()
                it.DOLGNFL.each {
                    Fldolgn fldolgn = new Fldolgn(
                            idul: ul,
                            dtstart: Util.convertToDate(it.@DTSTART),
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
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_upr")

            if (it.UL_UPR.@DTSTART != "") {
                it.UL_UPR.each {
                    it.ADDRESS.each {
                        if (it.REGION.@ID != "") {
                            Rg rg = new Rg(
                                    idr: new BigInteger(it.REGION.@ID as String),
                                    name: it.REGION.@NAME as String,
                                    kodKl: it.REGION.@KOD_KL as String
                            )
                            EgrulDBDAO.saveOrUpdate(rg)
                        }
                        if (it.RAION.@ID != "") {
                            Ds ds = new Ds(
                                    idd: new BigInteger(it.RAION.@ID as String),
                                    name: it.RAION.@NAME as String,
                                    kodKl: it.RAION.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ds)
                        }
                        if (it.GOROD.@ID != "") {
                            Ct ct = new Ct(
                                    idc: new BigInteger(it.GOROD.@ID as String),
                                    name: it.GOROD.@NAME as String,
                                    kodKl: it.GOROD.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ct)
                        }
                        if (it.NASPUNKT.@ID != "") {
                            Cn cn = new Cn(
                                    idn: new BigInteger(it.NASPUNKT.@ID as String),
                                    name: it.NASPUNKT.@NAME as String,
                                    kodKl: it.NASPUNKT.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(cn)
                        }
                        if (it.STREET.@ID != "") {
                            St st = new St(
                                    ids: new BigInteger(it.STREET.@ID as String),
                                    name: it.STREET.@NAME as String,
                                    kodSt: it.STREET.@KOD_ST as String

                            )
                            EgrulDBDAO.saveOrUpdate(st)
                        }
                    }
                    Ulupr ulupr = new Ulupr(
                            idul: ul,
                            dtstart: Util.convertToDate(it.@DTSTART),
                            namep: it.@NAMEP,
                            ogrn: it.@OGRN,
                            inn: it.@INN,
                            kpp: it.@KPP,
                            dtreg: Util.convertToDate(it.@DTREG),
                            okato: it.ADDRESS.@OKATO as String,
                            indeks: Util.convertToInt(it.ADDRESS.@INDEKS),
                            idregion: it.ADDRESS.REGION.@ID as String,
                            idraion: it.ADDRESS.RAION.@ID,
                            idgorod: it.ADDRESS.GOROD.@ID,
                            idnasp: it.ADDRESS.NASPUNKT.@ID,
                            idstreet: it.ADDRESS.STREET.@ID as String,
                            dom: it.ADDRESS.@DOM as String,
                            korp: it.ADDRESS.@KORP as String,
                            kvart: it.ADDRESS.@KVART as String,
                            kodgorod: it.CONTACT.@KODGOROD,
                            telefon: it.CONTACT.@TELEFON,
                            fax: it.CONTACT.@FAX,
                            address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())

                    )
                    ul.setUlupr(ulupr)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode predsh")

            if (it.PREDSH.@NAMEP != "") {
                ArrayList<Ulpredsh> ulpredshs = new ArrayList<>()
                it.PREDSH.each {
                    Spregorg idregorgrpred = null
                    if (it.PREDSH.REGORG.@ID != "") {
                        idregorgrpred = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.REGORG.@ID))
                        if (idregorgrpred == null) {
                            idregorgrpred =
                                    new Spregorg(
                                            idspro: Util.convertToBInt(it.REGORG.@ID),
                                            name: it.REGORG.@NAME
                                    )
                            EgrulDBDAO.saveOrUpdate(idregorgrpred)
                        }
                    }
                    it.ADDRESS.each {
                        if (it.REGION.@ID != "") {
                            Rg rg = new Rg(
                                    idr: new BigInteger(it.REGION.@ID as String),
                                    name: it.REGION.@NAME as String,
                                    kodKl: it.REGION.@KOD_KL as String
                            )
                            EgrulDBDAO.saveOrUpdate(rg)
                        }
                        if (it.RAION.@ID != "") {
                            Ds ds = new Ds(
                                    idd: new BigInteger(it.RAION.@ID as String),
                                    name: it.RAION.@NAME as String,
                                    kodKl: it.RAION.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ds)
                        }
                        if (it.GOROD.@ID != "") {
                            Ct ct = new Ct(
                                    idc: new BigInteger(it.GOROD.@ID as String),
                                    name: it.GOROD.@NAME as String,
                                    kodKl: it.GOROD.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ct)
                        }
                        if (it.NASPUNKT.@ID != "") {
                            Cn cn = new Cn(
                                    idn: new BigInteger(it.NASPUNKT.@ID as String),
                                    name: it.NASPUNKT.@NAME as String,
                                    kodKl: it.NASPUNKT.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(cn)
                        }
                        if (it.STREET.@ID != "") {
                            St st = new St(
                                    ids: new BigInteger(it.STREET.@ID as String),
                                    name: it.STREET.@NAME as String,
                                    kodSt: it.STREET.@KOD_ST as String

                            )
                            EgrulDBDAO.saveOrUpdate(st)
                        }
                    }
                    Ulpredsh ulpredsh = new Ulpredsh(
                            idul: ul,
                            dtogrn: Util.convertToDate(it.@DTOGRN),
                            namep: it.@NAMEP,
                            ogrn: it.@OGRN,
                            inn: it.@INN,
                            kpp: it.@KPP,
                            dtreg: Util.convertToDate(it.@DTREG),
                            okato: it.ADDRESS.@OKATO as String,
                            indeks: Util.convertToInt(it.ADDRESS.@INDEKS),
                            idregion: it.ADDRESS.REGION.@ID as String,
                            idraion: it.ADDRESS.RAION.@ID,
                            idgorod: it.ADDRESS.GOROD.@ID,
                            idnasp: it.ADDRESS.NASPUNKT.@ID,
                            idstreet: it.ADDRESS.STREET.@ID as String,
                            dom: it.ADDRESS.@DOM as String,
                            korp: it.ADDRESS.@KORP,
                            kvart: it.ADDRESS.@KVART,
                            idregorg: idregorgrpred,
                            address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())
                    )
                    ulpredshs.add(ulpredsh)
                }
                ul.setUlpredshs(ulpredshs)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode preem")

            if (it.PREEM.@NAMEP != "") {
                ArrayList<Ulpreem> ulpreems = new ArrayList<>()
                it.PREEM.each {
                    Spregorg idregorgrpreem = null
                    if (it.PREDSH.REGORG.@ID != "") {
                        idregorgrpreem = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.REGORG.@ID))
                        if (idregorgrpreem == null) {
                            idregorgrpreem =
                                    new Spregorg(
                                            idspro: Util.convertToBInt(it.REGORG.@ID),
                                            name: it.REGORG.@NAME
                                    )
                            EgrulDBDAO.saveOrUpdate(idregorgrpreem)
                        }
                    }
                    it.ADDRESS.each {
                        if (it.REGION.@ID != "") {
                            Rg rg = new Rg(
                                    idr: new BigInteger(it.REGION.@ID as String),
                                    name: it.REGION.@NAME as String,
                                    kodKl: it.REGION.@KOD_KL as String
                            )
                            EgrulDBDAO.saveOrUpdate(rg)
                        }
                        if (it.RAION.@ID != "") {
                            Ds ds = new Ds(
                                    idd: new BigInteger(it.RAION.@ID as String),
                                    name: it.RAION.@NAME as String,
                                    kodKl: it.RAION.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ds)
                        }
                        if (it.GOROD.@ID != "") {
                            Ct ct = new Ct(
                                    idc: new BigInteger(it.GOROD.@ID as String),
                                    name: it.GOROD.@NAME as String,
                                    kodKl: it.GOROD.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ct)
                        }
                        if (it.NASPUNKT.@ID != "") {
                            Cn cn = new Cn(
                                    idn: new BigInteger(it.NASPUNKT.@ID as String),
                                    name: it.NASPUNKT.@NAME as String,
                                    kodKl: it.NASPUNKT.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(cn)
                        }
                        if (it.STREET.@ID != "") {
                            St st = new St(
                                    ids: new BigInteger(it.STREET.@ID as String),
                                    name: it.STREET.@NAME as String,
                                    kodSt: it.STREET.@KOD_ST as String

                            )
                            EgrulDBDAO.saveOrUpdate(st)
                        }
                    }
                    
                    Ulpreem ulpreem = new Ulpreem(
                            idul: ul,
                            dtogrn: Util.convertToDate(it.@DTOGRN),
                            namep: it.@NAMEP,
                            ogrn: it.@OGRN,
                            inn: it.@INN,
                            kpp: it.@KPP,
                            dtreg: Util.convertToDate(it.@DTREG),
                            okato: it.ADDRESS.@OKATO as String,
                            indeks: Util.convertToInt(it.ADDRESS.@INDEKS),
                            idregion: it.ADDRESS.REGION.@ID as String,
                            idraion: it.ADDRESS.RAION.@ID,
                            idgorod: it.ADDRESS.GOROD.@ID,
                            idnasp: it.ADDRESS.NASPUNKT.@ID,
                            idstreet: it.ADDRESS.STREET.@ID as String,
                            dom: it.ADDRESS.@DOM as String,
                            korp: it.ADDRESS.@KORP,
                            kvart: it.ADDRESS.@KVART,
                            idregorg: idregorgrpreem,
                            address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())
                    )
                    ulpreems.add(ulpreem)
                }
                ul.setUlpreems(ulpreems)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode licenz")

            if (it.LICENZ.@NUMLIC != "") {
                List<Licenz> licenzsList = new ArrayList<>()
                Licenz licenz;
                it.LICENZ.each {
                    Splicorg splicorg = (Splicorg) EgrulDBDAO.getFromDB(Splicorg.getName(), it.LICORG.@ID as String)
                    if (splicorg == null) {
                        splicorg = new Splicorg(
                                id: it.LICORG.@ID as String,
                                name: it.LICORG.@NAME
                        )
                        EgrulDBDAO.saveOrUpdate(splicorg)
                    }

                    Spsostlic spsostlic = (Spsostlic) EgrulDBDAO.getFromDB(Spsostlic.getName(), Util.convertToInt(it.SOSTLIC.@ID))
                    if (spsostlic == null) {
                        spsostlic = new Spsostlic(
                                idsostlic: Util.convertToInt(it.SOSTLIC.@ID),
                                name: it.SOSTLIC.@NAME
                        )
                        EgrulDBDAO.saveOrUpdate(spsostlic)
                    }

                    Spvidlic spvidlic = null
                    if (it.VIDLIC.@ID != "") {
                        spvidlic = (Spvidlic) EgrulDBDAO.getFromDB(Spvidlic.getName(), Util.convertToBInt(it.VIDLIC.@ID))
                        if (spvidlic == null) {
                            spvidlic = new Spvidlic(
                                    idvidlic: Util.convertToBInt(it.VIDLIC.@ID),
                                    name: it.VIDLIC.@NAME_VLIC

                            )
                            EgrulDBDAO.saveOrUpdate(spvidlic)
                        }
                    }
                    licenz = new Licenz(
                            idul: ul,
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
                ul.setLicenzs(licenzsList)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_ob")

            if (it.UL_OB.@DTSTART != "") {
                List<Ulob> ulobs = new ArrayList<>()

                it.UL_OB.each {
                    it.ADDRESS.each {
                        if (it.REGION.@ID != "") {
                            Rg rg = new Rg(
                                    idr: new BigInteger(it.REGION.@ID as String),
                                    name: it.REGION.@NAME as String,
                                    kodKl: it.REGION.@KOD_KL as String
                            )
                            EgrulDBDAO.saveOrUpdate(rg)
                        }
                        if (it.RAION.@ID != "") {
                            Ds ds = new Ds(
                                    idd: new BigInteger(it.RAION.@ID as String),
                                    name: it.RAION.@NAME as String,
                                    kodKl: it.RAION.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ds)
                        }
                        if (it.GOROD.@ID != "") {
                            Ct ct = new Ct(
                                    idc: new BigInteger(it.GOROD.@ID as String),
                                    name: it.GOROD.@NAME as String,
                                    kodKl: it.GOROD.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(ct)
                        }
                        if (it.NASPUNKT.@ID != "") {
                            Cn cn = new Cn(
                                    idn: new BigInteger(it.NASPUNKT.@ID as String),
                                    name: it.NASPUNKT.@NAME as String,
                                    kodKl: it.NASPUNKT.@KOD_KL as String

                            )
                            EgrulDBDAO.saveOrUpdate(cn)
                        }
                        if (it.STREET.@ID != "") {
                            St st = new St(
                                    ids: new BigInteger(it.STREET.@ID as String),
                                    name: it.STREET.@NAME as String,
                                    kodSt: it.STREET.@KOD_ST as String

                            )
                            EgrulDBDAO.saveOrUpdate(st)
                        }
                    }
                    Ulob ulob = new Ulob(
                            idul: ul,
                            dtstart: Util.convertToDate(it.@DTSTART),
                            vidob: Util.convertToInt(it.@VID_OB),
                            okato: it.ADDRESS.@OKATO as String,
                            indeks: Util.convertToInt(it.ADDRESS.@INDEKS),
                            idregion: it.ADDRESS.REGION.@ID as String,
                            idraion: it.ADDRESS.RAION.@ID,
                            idgorod: it.ADDRESS.GOROD.@ID,
                            idnasp: it.ADDRESS.NASPUNKT.@ID,
                            idstreet: it.ADDRESS.STREET.@ID as String,
                            dom: it.ADDRESS.@DOM as String,
                            korp: it.ADDRESS.@KORP,
                            kvart: it.ADDRESS.@KVART,
                            kodgorod: it.CONTACT.@KODGOROD,
                            telefon: it.CONTACT.@TELEFON,
                            fax: it.CONTACT.@FAX,
                            address: it.ADDRESS.REGION.@NAME.text() + " " + (it.ADDRESS.RAION.@NAME.text()) + " " + (it.ADDRESS.GOROD.@NAME.text()) + " " + (it.ADDRESS.NASPUNKT.@NAME.text()) + " " + (it.ADDRESS.STREET.@NAME.text()) + " " + (it.ADDRESS.@DOM.text()) + " " + (it.ADDRESS.@KORP.text()) + " " + (it.ADDRESS.@KVART.text())
                    )
                    ulobs.add(ulob)
                }
                ul.setUlobs(ulobs)
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode gosreg")

            List<Gosreg> gosregs = new ArrayList<>()
            it.REGEGRUL.each {
                Spregorg spregorg = (Spregorg) EgrulDBDAO.getFromDB(Spregorg.getName(), Util.convertToBInt(it.REGORG.@ID))
                if (spregorg == null) {
                    spregorg = new Spregorg(
                            idspro: Util.convertToBInt(it.REGORG.@ID),
                            name: it.REGORG.@NAME)
                    EgrulDBDAO.saveOrUpdate(spregorg)
                }

                Spvidreg spvidreg = (Spvidreg) EgrulDBDAO.getFromDB(Spvidreg.getName(), Util.convertToInt(it.VIDREG.@ID))
                if (spvidreg == null) {
                    spvidreg = new Spvidreg(
                            idvidreg: Util.convertToInt(it.VIDREG.@ID),
                            name: it.VIDREG.@NAME
                    )
                    EgrulDBDAO.saveOrUpdate(spvidreg)
                }

                Gosreg gosreg = new Gosreg(
                        idul: ul,
                        idreg: it.@IDREG,
                        regnum: it.@REGNUM,
                        dtreg: Util.convertToDate(it.@DTREG),
                        dtzap: Util.convertToDate(it.@DTZAP),
                        idvidreg: spvidreg,
                        idregorg: spregorg,
                        sersvid: Util.convertToInt(it.SVSV.@SER_SV),
                        numsvid: Util.convertToInt(it.SVSV.@NUM_SV)
                )
                gosregs.add(gosreg)
            }
            ul.setGosregs(gosregs)
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode mns")

            if (it.MNS.@DTSTART != "") {
                it.MNS.each {
                    Spmns spmns = (Spmns) EgrulDBDAO.getFromDBbyNaturalId(Spmns.getName(), it.ORGAN_MNS.@KOD as String)
                    if (spmns == null) {
                        spmns = new Spmns(
                                kod: it.ORGAN_MNS.@KOD,
                                name: it.ORGAN_MNS.@NAME
                        )
                        EgrulDBDAO.saveOrUpdate(spmns)
                    }
                    //Ulmns ipmns = (Ulmns) PersistEgrip.getFromDB(Ulmns.getName(), ul.getIdip() as Integer)
                    //if (ipmns == null)
                    Ulmns ipmns = new Ulmns()
                    ipmns.setIdul(ul)
                    ipmns.setIdmns(spmns)
                    ipmns.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipmns.setDtend(Util.convertToDate(it.@DTEND))
                    ul.setUlmns(ipmns)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode pf")

            if (it.PF.@REGN_PF != "") {
                it.PF.each {
                    Sppf sppf = (Sppf) EgrulDBDAO.getFromDBbyNaturalId(Sppf.getName(), it.ORGAN_PF.@KOD as String)
                    if (sppf == null) {
                        sppf = new Sppf(
                                kod: Util.convertToInt(it.ORGAN_PF.@KOD),
                                name: it.ORGAN_PF.@NAME
                        )
                        EgrulDBDAO.saveOrUpdate(sppf)
                    }
                    //Ulpf ippf = (Ulpf) PersistEgrip.getFromDB(Ulpf.getName(), ul.getIdip() as Integer)
                    //if (ippf == null)
                    Ulpf ippf = new Ulpf()
                    ippf.setIdul(ul)
                    ippf.setDtstart(Util.convertToDate(it.@DTSTART))
                    ippf.setDtend(Util.convertToDate(it.@DTEND))
                    ippf.setRegnomPf(it.@REGN_PF as String)
                    ippf.setIdpf(sppf)
                    ul.setUlpf(ippf)
                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode fss")

            if (it.FSS.@REGN_FSS != "") {
                it.FSS.each {
                    Spfss spfss = (Spfss) EgrulDBDAO.getFromDBbyNaturalId(Spfss.getName(), it.ORGAN_FSS.@KOD as String)
                    if (spfss == null) {
                        spfss = new Spfss(
                                kod: it.ORGAN_FSS.@KOD,
                                name: it.ORGAN_FSS.@NAME
                        )
                        EgrulDBDAO.saveOrUpdate(spfss)
                    }
/*                    Ulfss ipfss = (Ulfss) PersistEgrip.getFromDB(Ulfss.getName(), ul.getIdip() as Integer)
                    if (ipfss == null) */
                    Ulfss ipfss = new Ulfss()
                    ipfss.setIdul(ul)
                    ipfss.setIdfss(spfss)
                    ipfss.setRegnomFss(it.@REGN_FSS as String)
                    ipfss.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipfss.setDtend(Util.convertToDate(it.@DTEND))
                    ul.setUlfss(ipfss)

                }
            }
            log.debug("Decoding UL with OGRN " + ul.getIdul() + " begin decode foms")

            if (it.FOMS.@REGN_FOMS != "") {
                it.FOMS.each {
                    Spfoms spfoms = (Spfoms) EgrulDBDAO.getFromDBbyNaturalId(Spfoms.getName(), it.ORGAN_FOMS.@KOD as String)
                    if (spfoms == null) {
                        spfoms = new Spfoms(
                                kod: it.ORGAN_FOMS.@KOD,
                                name: it.ORGAN_FOMS.@NAME
                        )
                        EgrulDBDAO.saveOrUpdate(spfoms)
                    }
                    //Ulfoms ipfoms = (Ulfoms) PersistEgrip.getFromDB(Ulfoms.getName(), ul.getIdip() as BigInteger)
                    //if (ipfoms == null)

                    Ulfoms ipfoms = new Ulfoms()
                    ipfoms.setIdul(ul)
                    ipfoms.setRegnomFoms(it.@REGN_FOMS as String)
                    ipfoms.setDtstart(Util.convertToDate(it.@DTSTART))
                    ipfoms.setDtend(Util.convertToDate(it.@DTEND))
                    ipfoms.setIdfoms(spfoms)
                    ul.setUlfoms(ipfoms)

                }
            }
            log.debug("Start saving UL with OGRN " + ul.getOgrn() + " to DB")
            try {
                EgrulDBDAO.saveOrUpdate(ul)
                log.info("Save to EGRUL UL with OGRN " + ul.getOgrn())
                resultImport.put(ul.getOgrn(), "Success")
            } catch (Exception ex) {
                log.error("Error saving EGRUL UL with OGRN " + ul.getOgrn())
                log.error(ex.printStackTrace())
                resultImport.put(ul.getOgrn(), "Fail")
            }
        }
        return resultImport

    }
}