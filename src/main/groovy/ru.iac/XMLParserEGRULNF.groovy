package ru.iac

import groovy.util.slurpersupport.GPathResult
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.iac.entity.*
/**
 * Created by bogdanov on 06.02.2019.
 * Class parse new format of the EGRUL objects, return UL object*
 */

class XMLParserEGRULNF {
    private static Logger log = LoggerFactory.getLogger(XMLParserEGRULNF);
    private static ArrayList<EgrulEntity> list = new ArrayList<EgrulEntity>()


    public static Ul parse(GPathResult gPathResult) {

        Ul ul = null
        try {

            gPathResult.����.each {

                log.debug("Start decoding UL with OGRN " + it.@����)

                log.trace("Decoding UL with OGRN " + it.@���� + " begin decode UL")
                //------------------ UL
                ul = new Ul(
                        idul: it.@����,
                        dtform: Util.convertToDate(it.@������� as String),////
                        ogrn: it.@����,
                        inn: it.@���,
                        kpp: it.@���,
                        dtogrn: Util.convertToDate(it.@�������� as String),////
                        /*idstatus: null,new Spulstat(
                                id: Util.convertToInt(it.��������.��������.@�����������),
                                name: it.��������.��������.@������������
                        ),*/
                        idregorg: UtilParser.getRegorgNew(it.�������� as GPathResult, list),
                        idvidregstart: UtilParser.getVidregNew(it.�������.�������, list),
                        regnumstart: it.�������.�������.@��� as String,
                        dtregstart: Util.convertToDate(it.�������.�������.@���������� as String),
                        idregorgstart: UtilParser.getRegorgNew(it.�������, list),
                        idvidregend: UtilParser.getVidregNew(it.���������.���������, list),
                        regnumend: it.���������.�������.@��� as String,
                        dtregend: Util.convertToDate(it.���������.�������.@���������� as String),
                        idregorgend: UtilParser.getRegorgNew(it.���������.��������, list)
                )
                if(it.��������.��������.@�����������!=""){
                    Spulstat ulstat = new Spulstat(
                            id: Util.convertToInt(it.��������.��������.@�����������),
                            name: it.��������.��������.@������������
                    )
                    ul.setIdstatus(ulstat)
                }

                //------------------ OKVED, ULOKVED
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode okved")
                ArrayList<Ulokved> listUlOkved = new ArrayList<>()
                if (it.�������.����������.@�������� != "") {
                    Okved okved
                    it.�������.����������.each {
                        okved = new Okved(
                                codeOkved: it.@��������,
                                name: it.@���������,
                                regnum: it.�������.@���,
                                dtreg: Util.convertToDate(it.�������.@���������� as String),
                                versOkved: it.@�����������
                        )

                        listUlOkved.add(
                                new Ulokved(
                                        idokved: okved,
                                        idul: ul,
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
                                name: it.@���������,
                                regnum: it.�������.@���,
                                dtreg: Util.convertToDate(it.�������.@���������� as String),
                                versOkved: it.@�����������
                        )

                        listUlOkved.add(
                                new Ulokved(
                                        idokved: okved,
                                        idul: ul,
                                        main: 0
                                )
                        )
                    }
                }
                if (!listUlOkved.empty)
                    ul.setUlokved(listUlOkved)

                //------------------ ULNAME, SPOPF
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ulname")
                if (it.��������.�������.@���������� != "") {
                    it.each {
                        Ulname ulname = new Ulname(
                                idul: ul,
                                dtstart: Util.convertToDate(it.��������.�������.@���������� as String),
                                regnum: it.��������.�������.@���,
                                namep: it.��������.@���������� as String,
                                //namei: it.NAMEI.@NAME as String,//not found in NewFormats !!!
                                names: it.��������.@���������� as String
                                //idlangi: UtilParser.getSplang(it, list)//not found in NewFormats !!!
                        )
                        if (it.@������ != "") {
                            ulname.setIdopf(
                                    new Spopf(
                                            idopf: Util.convertToInt(it.@������),//!!!!!!
                                            spr: it.@������,
                                            kodOpf: it.@������,
                                            name: it.@�����������
                                    )
                            )
                        }
                        ul.setUlname(ulname)
                    }
                }
                //------------------ ULADR, SPVIADR
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_address")
                if (it.���������.�������.�������.@���������� != "") {
                    it.���������.each {
                        Uladr uladr = new Uladr(
                                dtstart: Util.convertToDate(it.�������.�������.@���������� as String),
                                idul: ul,
                                regnum: it.�������.@���,
                                kodKl: it.�������.@�����������,
                                fulladdress: UtilParser.getAddressNew(it.�������, list),//
                                //nameisporg: it.@NAMEISPORG as String, //not found in new formats
                                //kodgorod: it.CONTACT.@KODGOROD as String, //not found in new formats
                                //telefon: it.CONTACT.@TELEFON as String, //not found in new formats
                                //fax: it.CONTACT.@FAX as String, //not found in new formats
                                address: it.�������.������.@����������.text() + " "
                                        + it.�������.������.@���������.text() + " "
                                        + it.�������.�����.@���������.text() + " "
                                        + it.�������.�����.@��������.text() + " "
                                        + it.�������.�����.@���������.text() + " "
                                        + it.�������.����������.@�������������.text() + " "
                                        + it.�������.����������.@��������������.text() + " "
                                        + it.�������.�����.@��������.text() + " "
                                        + it.�������.�����.@���������.text() + " "
                                        + it.�������.@���.text() + " "
                                        + it.�������.@����.text() + " "
                                        + it.�������.@�����.text()
                        )
                        ul.setUladr(uladr)
                    }
                }
                //------------------ ULCAPITAL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_capital")
                if (it.��������.�������.@���������� != "") {
                    it.��������.each {
                        Ulcapital ulcapital = new Ulcapital(
                                idul: ul,
                                regnum: it.�������.@���,
                                idvidcap: UtilParser.getVidcapNew(it.@���������� as String),//new Spvidcap(
                                       // id: 1,
                                        //null, //Util.convertToInt(it.VIDCAP.@ID),//not found
                                        //name: it.@����������
                                //),
                                dtstart: Util.convertToDate(it.�������.@���������� as String),
                                summa: Util.convertToBDec(it.@������)

                        )
                        ul.setUlcapital(ulcapital)
                    }
                }
                //------------------ UCHR_RUL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_rul")
                if (it.���������.��������.�����������.@���������� != "") {
                    ArrayList<Rul> ruls = new ArrayList<>()
                    it.���������.��������.each {
                        Rul rul = new Rul(
                                idul: ul,
                                dtstart: Util.convertToDate(it.�����������.@���������� as String),
                                namep: it.���������.@����������,
                                ogrn: it.���������.@����,
                                inn: it.���������.@���,
                                kpp: it.���������.@���,
                                dtreg: Util.convertToDate(it.���������.����������.�������.@���������� as String),
                                summa: Util.convertToBDec(it.���������.����������.@����������),
                                dtogrn: Util.convertToDate(it.���������.�������.@���������� as String),
                                regnumst: it.���������.�������.@���,
                                fulladdress: null,//UtilParser.getAddress(it.ADDRESS, list),//not found
                                idregorg: null //UtilParser.getRegorg(it, list)//not found
                        )
                        ruls.add(rul)
                    }
                    ul.setRuls(ruls)
                }
                //------------------ UCHR_IUL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_iul")
                if (it.���������.�������.����������.�������.@���������� != "") {
                    ArrayList<Iul> iuls = new ArrayList<>()
                    it.���������.�������.each {
                        Iul iul = new Iul(
                                idul: ul,
                                dtstart: Util.convertToDate(it.����������.�������.@���������� as String),//!!!
                                namep: it.���������.@����������,
                                dtreg: Util.convertToDate(it.�������.@������� as String),
                                summa: Util.convertToBDec(it.����������.@����������),
                                inadr: it.�������.@������,
                                idoksm: UtilParser.getOksmNew(it.���������.�������.�������, list)
                        )
                        iuls.add(iul)
                    }
                    ul.setIuls(iuls)
                }
                //------------------ UCHR_UCHRFL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_uchrfl")
                if (it.���������.�����.����������.�������.@���������� != "") {
                    ArrayList<Fluchr> fluchrs = new ArrayList<>()
                    it.����.���������.�����.each {
                        Fluchr fluchr = new Fluchr(
                                idul: ul,
                                regnum: it.�����������.@���,
                                dtstart: Util.convertToDate(it.�����������.@���������� as String),
                                regnumd: it.����������.�������.@���,
                                dtstartd: Util.convertToDate(it.����������.�������.@���������� as String),
                                summa: Util.convertToBDec(it.����������.@����������),
                                percent: Util.convertToBDec(it.����������.����������.@�������),
                                idfl: new Fl(
                                        famfl: it.����.@�������,
                                        namefl: it.����.@���,
                                        otchfl: it.����.@��������,
                                        inn: it.����.@�����,
                                        regnumfl: it.����.�����������.@���,
                                        dtstartfl: Util.convertToDate(it.����.�����������.@���������� as String)

                                )
                        )
                        fluchrs.add(fluchr)
                    }
                    ul.setFluchrs(fluchrs)
                }
                //------------------ REESTR_AO
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode reestrao")
                if (it.��������������.������������.@���� != "") {
                    it.��������������.������������.each {
                        Reestrao reestrao = new Reestrao(
                                idul: ul,
                                ogrn: it.@���� as String,
                                namep: it.@���������� as String
                        )
                        ul.setReestrao(reestrao)
                    }
                }
                //------------------ DOLGNFL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode dolgnfl")
                if (it.�����������.�������.�������.@���������� != "") {
                    ArrayList<Fldolgn> fldolgns = new ArrayList<>()
                    it.�����������.each {
                        Fldolgn fldolgn = new Fldolgn(
                                idul: ul,
                                regnum: it.�����������.@���,
                                dtstart: Util.convertToDate(it.�����������.@���������� as String),
                                dolgn: it.�������.@���������,
                                dolgnvid: it.�������.@��������,
                                dolgnvidname: it.�������.@������������,
                                regnumd: it.�������.�������.@���,
                                dtstartd: Util.convertToDate(it.�������.�������.@���������� as String),
                                idfl: new Fl(
                                        famfl: it.����.@�������,
                                        namefl: it.����.@���,
                                        otchfl: it.����.@��������,
                                        inn: it.����.@�����,
                                        regnumfl: it.����.�����������.@���,
                                        dtstartfl: Util.convertToDate(it.����.�����������.@���������� as String)
                                )
                        )
                        fldolgns.add(fldolgn)
                    }
                    ul.setFldolgns(fldolgns)
                }
                //------------------ UL_UPR
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_upr")
                if (it.��������.���������.�������.@���������� != "") {
                    it.��������.each {
                        Ulupr ulupr = new Ulupr(
                                idul: ul,
                                dtstart: Util.convertToDate(it.���������.�������.@���������� as String),
                                namep: it.���������.@����������,
                                ogrn: it.���������.@����,
                                inn: it.���������.@���,
                                kpp: it.���������.@���,
                                dtreg: Util.convertToDate(it.�����������.@���������� as String),
                                fulladdress: null, //UtilParser.getAddress(it.ADDRESS, list),//not found
                                kodgorod: null, //it.CONTACT.@KODGOROD,//not found
                                telefon: null, //it.CONTACT.@TELEFON,//not found
                                fax: null //it.CONTACT.@FAX//not found
                        )
                        ul.setUlupr(ulupr)
                    }
                }
                //------------------ PREDSH
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode predsh")
                if (it.�������.@���������� != "") {
                    ArrayList<Ulpredsh> ulpredshs = new ArrayList<>()
                    it.�������.each {
                        Ulpredsh ulpredsh = new Ulpredsh(
                                idul: ul,
                                dtogrn: Util.convertToDate(it.�������.@���������� as String),
                                namep: it.@����������,
                                ogrn: it.@����,
                                inn: it.@���,
                                kpp: it.@���,
                                dtreg: Util.convertToDate(it.�������.@���������� as String),
                                fulladdress: null, //UtilParser.getAddress(it.ADDRESS, list),//not found
                                idregorg:  null //UtilParser.getRegorg(it, list)//not found
                        )
                        ulpredshs.add(ulpredsh)
                    }
                    ul.setUlpredshs(ulpredshs)
                }
                //------------------ PREEM
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode preem")
                if (it.�������.@���������� != "") {
                    ArrayList<Ulpreem> ulpreems = new ArrayList<>()
                    it.�������.each {

                        Ulpreem ulpreem = new Ulpreem(
                                idul: ul,
                                dtogrn: Util.convertToDate(it.�������.@���������� as String),
                                namep: it.@����������,
                                ogrn: it.@����,
                                inn: it.@���,
                                kpp: it.@���,
                                dtreg: Util.convertToDate(it.�������.@���������� as String),
                                fulladdress: null, //UtilParser.getAddress(it.ADDRESS, list),//not found
                                idregorg: null //UtilParser.getRegorg(it, list)//not found
                        )
                        ulpreems.add(ulpreem)
                    }
                    ul.setUlpreems(ulpreems)
                }
                //------------------ LICENZ
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode licenz")
                if (it.����������.@������ != "") {
                    List<Licenz> licenzsList = new ArrayList<>()
                    Licenz licenz;
                    it.����������.each {
                        licenz = new Licenz(
                                idul: ul,
                                numlic: it.@������,
                                dtrestart: Util.convertToDate(it.@������� as String),
                                idlicorg: UtilParser.getLicorgNew(it, list),
                                idvidlic: UtilParser.getVidlicNew(it, list),
                                idsostlic: null, //UtilParser.getSostlic(it, list),//not found
                                dtstart: Util.convertToDate(it.@���������� as String),
                                dtend: Util.convertToDate(it.@������������ as String),
                                dtstop: Util.convertToDate(it.�����������.@������������� as String)
                        )

                        licenzsList.add(licenz)
                    }
                    ul.setLicenzs(licenzsList)
                }
                //------------------ UL_OB
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_ob")
                if (it.���������.isEmpty() == false){
                    List<Ulob> ulobs = new ArrayList<>()
                    if (it.���������.��������.�������.@���������� != "") {
                        it.���������.��������.each {
                            Ulob ulob = new Ulob(
                                    idul: ul,
                                    dtstart: Util.convertToDate(it.�������.@���������� as String),
                                    vidob: 100080, //��� ���� ������������� (������)
                                    fulladdress: UtilParser.getAddressNew(it.�������, list),
                                    kodgorod: null, //it.CONTACT.@KODGOROD,//not found
                                    telefon: null, //it.CONTACT.@TELEFON,//not found
                                    fax: null //it.CONTACT.@FAX//not found
                            )
                            ulobs.add(ulob)
                        }
                    }
                    if (it.���������.����������.@���������� != "") {
                        it.UL_OB.each {
                            Ulob ulob = new Ulob(
                                    idul: ul,
                                    dtstart: Util.convertToDate(it.�������.@���������� as String),
                                    vidob: 100081, //��� ���� ������������� (�����������������)
                                    fulladdress: UtilParser.getAddressNew(it.�������, list),
                                    kodgorod: null, //it.CONTACT.@KODGOROD,//not found
                                    telefon: null, //it.CONTACT.@TELEFON,//not found
                                    fax: null //it.CONTACT.@FAX//not found
                            )
                            ulobs.add(ulob)
                        }
                    }
                    ul.setUlobs(ulobs)
                }

                //------------------ REGEGRUL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode gosreg")
                List<Gosreg> gosregs = new ArrayList<>()
                it.����������.each {
                    Gosreg gosreg = new Gosreg(
                            idul: ul,
                            idreg: it.@�����,
                            regnum: it.@���,
                            dtreg: Util.convertToDate(it.������.@����������� as String),
                            dtzap: Util.convertToDate(it.@������� as String),
                            idvidreg: UtilParser.getVidregNew(it.������, list),
                            idregorg: UtilParser.getRegorgNew(it.��������, list),
                            sersvid: Util.convertToInt(it.������.@�����),
                            numsvid: Util.convertToInt(it.������.@�����)
                    )
                    List<Sppreddok> preddoks = new ArrayList<>()
                    it.�����������.each {
                        Sppreddok preddok = new Sppreddok(
                                //idreg: gosreg,
                                numdok: it.������.text(),
                                name: it.�������.text(),
                                dtdok: Util.convertToDate(it.������� as String),
                        )
                        preddoks.add(preddok)
                    }
                    gosreg.setSppreddoks(preddoks)
                    gosregs.add(gosreg)
                }
                ul.setGosregs(gosregs)
                //------------------ MNS
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode mns")
                if (it.��������.@���������� != "") {
                    it.��������.each {
                        Ulmns ipmns = new Ulmns(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@���������� as String),
                                regnum: it.�������.@���,
                                dtzap: Util.convertToDate(it.�������.@���������� as String),
                                idmns: new Spmns(
                                        kod: it.����.@�����,
                                        name: it.����.@������
                                )
                                //dtend: null //Util.convertToDate(it.@DTEND as String)//not found
                        )
                        ul.setUlmns(ipmns)
                    }
                }
                //------------------ PF
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode pf")
                if (it.�������.@������� != "") {
                    it.�������.each {
                        Ulpf ulpf = new Ulpf(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@������� as String),
                                regnomPf: it.@�������� as String,
                                regnum: it.�������.@���,
                                dtzap: Util.convertToDate(it.�������.@���������� as String),
                                idpf: new Sppf(
                                        kod: Util.convertToInt(it.�������.@�����),
                                        name: it.�������.@������
                                )

                        )
                        ul.setUlpf(ulpf)
                    }
                }
                //------------------ FSS
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode fss")
                if (it.��������.@��������� != "") {
                    it.��������.each {
                        Ulfss ulfss = new Ulfss(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@������� as String),
                                regnomFss: it.@��������� as String,
                                regnum: it.�������.@���,
                                dtzap: Util.convertToDate(it.�������.@���������� as String),
                                idfss: new Spfss(
                                        kod: it.��������.@������,
                                        name: it.��������.@�������
                                )
                        )
                        ul.setUlfss(ulfss)
                    }
                }
                //------------------ FOMS
                /*log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode foms")
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
                }*/
            }
        } catch (Exception ex) {
            log.error("Exception while parsing UL with OGRN = " + ul.getOgrn())
            log.error(ex.message)
            return null
        }
        return ul
    }
}
