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

            gPathResult.СвЮЛ.each {

                log.debug("Start decoding UL with OGRN " + it.@ОГРН)

                log.trace("Decoding UL with OGRN " + it.@ОГРН + " begin decode UL")
                //------------------ UL
                ul = new Ul(
                        idul: it.@ОГРН,
                        dtform: Util.convertToDate(it.@ДатаВып as String),////
                        ogrn: it.@ОГРН,
                        inn: it.@ИНН,
                        kpp: it.@КПП,
                        dtogrn: Util.convertToDate(it.@ДатаОГРН as String),////
                        /*idstatus: null,new Spulstat(
                                id: Util.convertToInt(it.СвСтатус.СвСтатус.@КодСтатусЮЛ),
                                name: it.СвСтатус.СвСтатус.@НаимСтатусЮЛ
                        ),*/
                        idregorg: UtilParser.getRegorgNew(it.СвРегОрг as GPathResult, list),
                        idvidregstart: UtilParser.getVidregNew(it.СвОбрЮЛ.СпОбрЮЛ, list),
                        regnumstart: it.СвОбрЮЛ.ГРНДата.@ГРН as String,
                        dtregstart: Util.convertToDate(it.СвОбрЮЛ.ГРНДата.@ДатаЗаписи as String),
                        idregorgstart: UtilParser.getRegorgNew(it.СвОбрЮЛ, list),
                        idvidregend: UtilParser.getVidregNew(it.СвПрекрЮЛ.СпПрекрЮЛ, list),
                        regnumend: it.СвПрекрЮЛ.ГРНДата.@ГРН as String,
                        dtregend: Util.convertToDate(it.СвПрекрЮЛ.ГРНДата.@ДатаЗаписи as String),
                        idregorgend: UtilParser.getRegorgNew(it.СвПрекрЮЛ.СвРегОрг, list)
                )
                if(it.СвСтатус.СвСтатус.@КодСтатусЮЛ!=""){
                    Spulstat ulstat = new Spulstat(
                            id: Util.convertToInt(it.СвСтатус.СвСтатус.@КодСтатусЮЛ),
                            name: it.СвСтатус.СвСтатус.@НаимСтатусЮЛ
                    )
                    ul.setIdstatus(ulstat)
                }

                //------------------ OKVED, ULOKVED
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode okved")
                ArrayList<Ulokved> listUlOkved = new ArrayList<>()
                if (it.СвОКВЭД.СвОКВЭДОсн.@КодОКВЭД != "") {
                    Okved okved
                    it.СвОКВЭД.СвОКВЭДОсн.each {
                        okved = new Okved(
                                codeOkved: it.@КодОКВЭД,
                                name: it.@НаимОКВЭД,
                                regnum: it.ГРНДата.@ГРН,
                                dtreg: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                versOkved: it.@ПрВерсОКВЭД
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
                if (it.СвОКВЭД.СвОКВЭДДоп.@КодОКВЭД != "") {
                    Okved okved
                    it.СвОКВЭД.СвОКВЭДДоп.each {
                        okved = new Okved(
                                codeOkved: it.@КодОКВЭД,
                                name: it.@НаимОКВЭД,
                                regnum: it.ГРНДата.@ГРН,
                                dtreg: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                versOkved: it.@ПрВерсОКВЭД
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
                if (it.СвНаимЮЛ.ГРНДата.@ДатаЗаписи != "") {
                    it.each {
                        Ulname ulname = new Ulname(
                                idul: ul,
                                dtstart: Util.convertToDate(it.СвНаимЮЛ.ГРНДата.@ДатаЗаписи as String),
                                regnum: it.СвНаимЮЛ.ГРНДата.@ГРН,
                                namep: it.СвНаимЮЛ.@НаимЮЛПолн as String,
                                //namei: it.NAMEI.@NAME as String,//not found in NewFormats !!!
                                names: it.СвНаимЮЛ.@НаимЮЛСокр as String
                                //idlangi: UtilParser.getSplang(it, list)//not found in NewFormats !!!
                        )
                        if (it.@КодОПФ != "") {
                            ulname.setIdopf(
                                    new Spopf(
                                            idopf: Util.convertToInt(it.@КодОПФ),//!!!!!!
                                            spr: it.@СпрОПФ,
                                            kodOpf: it.@КодОПФ,
                                            name: it.@ПолнНаимОПФ
                                    )
                            )
                        }
                        ul.setUlname(ulname)
                    }
                }
                //------------------ ULADR, SPVIADR
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_address")
                if (it.СвАдресЮЛ.АдресРФ.ГРНДата.@ДатаЗаписи != "") {
                    it.СвАдресЮЛ.each {
                        Uladr uladr = new Uladr(
                                dtstart: Util.convertToDate(it.АдресРФ.ГРНДата.@ДатаЗаписи as String),
                                idul: ul,
                                regnum: it.ГРНДата.@ГРН,
                                kodKl: it.АдресРФ.@КодАдрКладр,
                                fulladdress: UtilParser.getAddressNew(it.АдресРФ, list),//
                                //nameisporg: it.@NAMEISPORG as String, //not found in new formats
                                //kodgorod: it.CONTACT.@KODGOROD as String, //not found in new formats
                                //telefon: it.CONTACT.@TELEFON as String, //not found in new formats
                                //fax: it.CONTACT.@FAX as String, //not found in new formats
                                address: it.АдресРФ.Регион.@НаимРегион.text() + " "
                                        + it.АдресРФ.Регион.@ТипРегион.text() + " "
                                        + it.АдресРФ.Район.@НаимРайон.text() + " "
                                        + it.АдресРФ.Город.@ТипГород.text() + " "
                                        + it.АдресРФ.Город.@НаимГород.text() + " "
                                        + it.АдресРФ.НаселПункт.@ТипНаселПункт.text() + " "
                                        + it.АдресРФ.НаселПункт.@НаимНаселПункт.text() + " "
                                        + it.АдресРФ.Улица.@ТипУлица.text() + " "
                                        + it.АдресРФ.Улица.@НаимУлица.text() + " "
                                        + it.АдресРФ.@Дом.text() + " "
                                        + it.АдресРФ.@Корп.text() + " "
                                        + it.АдресРФ.@Кварт.text()
                        )
                        ul.setUladr(uladr)
                    }
                }
                //------------------ ULCAPITAL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_capital")
                if (it.СвУстКап.ГРНДата.@ДатаЗаписи != "") {
                    it.СвУстКап.each {
                        Ulcapital ulcapital = new Ulcapital(
                                idul: ul,
                                regnum: it.ГРНДата.@ГРН,
                                idvidcap: UtilParser.getVidcapNew(it.@НаимВидКап as String),//new Spvidcap(
                                       // id: 1,
                                        //null, //Util.convertToInt(it.VIDCAP.@ID),//not found
                                        //name: it.@НаимВидКап
                                //),
                                dtstart: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                summa: Util.convertToBDec(it.@СумКап)

                        )
                        ul.setUlcapital(ulcapital)
                    }
                }
                //------------------ UCHR_RUL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_rul")
                if (it.СвУчредит.УчрЮЛРос.ГРНДатаПерв.@ДатаЗаписи != "") {
                    ArrayList<Rul> ruls = new ArrayList<>()
                    it.СвУчредит.УчрЮЛРос.each {
                        Rul rul = new Rul(
                                idul: ul,
                                dtstart: Util.convertToDate(it.ГРНДатаПерв.@ДатаЗаписи as String),
                                namep: it.НаимИННЮЛ.@НаимЮЛПолн,
                                ogrn: it.НаимИННЮЛ.@ОГРН,
                                inn: it.НаимИННЮЛ.@ИНН,
                                kpp: it.НаимИННЮЛ.@КПП,
                                dtreg: Util.convertToDate(it.НаимИННЮЛ.ДоляУстКап.ГРНДата.@ДатаЗаписи as String),
                                summa: Util.convertToBDec(it.НаимИННЮЛ.ДоляУстКап.@НоминСтоим),
                                dtogrn: Util.convertToDate(it.НаимИННЮЛ.ГРНДата.@ДатаЗаписи as String),
                                regnumst: it.НаимИННЮЛ.ГРНДата.@ГРН,
                                fulladdress: null,//UtilParser.getAddress(it.ADDRESS, list),//not found
                                idregorg: null //UtilParser.getRegorg(it, list)//not found
                        )
                        ruls.add(rul)
                    }
                    ul.setRuls(ruls)
                }
                //------------------ UCHR_IUL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_iul")
                if (it.СвУчредит.УчрЮЛИн.ДоляУстКап.ГРНДата.@ДатаЗаписи != "") {
                    ArrayList<Iul> iuls = new ArrayList<>()
                    it.СвУчредит.УчрЮЛИн.each {
                        Iul iul = new Iul(
                                idul: ul,
                                dtstart: Util.convertToDate(it.ДоляУстКап.ГРНДата.@ДатаЗаписи as String),//!!!
                                namep: it.НаимИННЮЛ.@НаимЮЛПолн,
                                dtreg: Util.convertToDate(it.СвРегИн.@ДатаРег as String),
                                summa: Util.convertToBDec(it.ДоляУстКап.@НоминСтоим),
                                inadr: it.СвРегИн.@АдрСтр,
                                idoksm: UtilParser.getOksmNew(it.СвУчредит.УчрЮЛИн.СвРегИн, list)
                        )
                        iuls.add(iul)
                    }
                    ul.setIuls(iuls)
                }
                //------------------ UCHR_UCHRFL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode uchr_uchrfl")
                if (it.СвУчредит.УчрФЛ.ДоляУстКап.ГРНДата.@ДатаЗаписи != "") {
                    ArrayList<Fluchr> fluchrs = new ArrayList<>()
                    it.СвЮЛ.СвУчредит.УчрФЛ.each {
                        Fluchr fluchr = new Fluchr(
                                idul: ul,
                                regnum: it.ГРНДатаПерв.@ГРН,
                                dtstart: Util.convertToDate(it.ГРНДатаПерв.@ДатаЗаписи as String),
                                regnumd: it.ДоляУстКап.ГРНДата.@ГРН,
                                dtstartd: Util.convertToDate(it.ДоляУстКап.ГРНДата.@ДатаЗаписи as String),
                                summa: Util.convertToBDec(it.ДоляУстКап.@НоминСтоим),
                                percent: Util.convertToBDec(it.ДоляУстКап.РазмерДоли.@Процент),
                                idfl: new Fl(
                                        famfl: it.СвФЛ.@Фамилия,
                                        namefl: it.СвФЛ.@Имя,
                                        otchfl: it.СвФЛ.@Отчество,
                                        inn: it.СвФЛ.@ИННФЛ,
                                        regnumfl: it.СвФЛ.ГРНДатаПерв.@ГРН,
                                        dtstartfl: Util.convertToDate(it.СвФЛ.ГРНДатаПерв.@ДатаЗаписи as String)

                                )
                        )
                        fluchrs.add(fluchr)
                    }
                    ul.setFluchrs(fluchrs)
                }
                //------------------ REESTR_AO
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode reestrao")
                if (it.СвДержРеестрАО.ДержРеестрАО.@ОГРН != "") {
                    it.СвДержРеестрАО.ДержРеестрАО.each {
                        Reestrao reestrao = new Reestrao(
                                idul: ul,
                                ogrn: it.@ОГРН as String,
                                namep: it.@НаимЮЛПолн as String
                        )
                        ul.setReestrao(reestrao)
                    }
                }
                //------------------ DOLGNFL
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode dolgnfl")
                if (it.СведДолжнФЛ.СвДолжн.ГРНДата.@ДатаЗаписи != "") {
                    ArrayList<Fldolgn> fldolgns = new ArrayList<>()
                    it.СведДолжнФЛ.each {
                        Fldolgn fldolgn = new Fldolgn(
                                idul: ul,
                                regnum: it.ГРНДатаПерв.@ГРН,
                                dtstart: Util.convertToDate(it.ГРНДатаПерв.@ДатаЗаписи as String),
                                dolgn: it.СвДолжн.@НаимДолжн,
                                dolgnvid: it.СвДолжн.@ВидДолжн,
                                dolgnvidname: it.СвДолжн.@НаимВидДолжн,
                                regnumd: it.СвДолжн.ГРНДата.@ГРН,
                                dtstartd: Util.convertToDate(it.СвДолжн.ГРНДата.@ДатаЗаписи as String),
                                idfl: new Fl(
                                        famfl: it.СвФЛ.@Фамилия,
                                        namefl: it.СвФЛ.@Имя,
                                        otchfl: it.СвФЛ.@Отчество,
                                        inn: it.СвФЛ.@ИННФЛ,
                                        regnumfl: it.СвФЛ.ГРНДатаПерв.@ГРН,
                                        dtstartfl: Util.convertToDate(it.СвФЛ.ГРНДатаПерв.@ДатаЗаписи as String)
                                )
                        )
                        fldolgns.add(fldolgn)
                    }
                    ul.setFldolgns(fldolgns)
                }
                //------------------ UL_UPR
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_upr")
                if (it.СвУпрОрг.НаимИННЮЛ.ГРНДата.@ДатаЗаписи != "") {
                    it.СвУпрОрг.each {
                        Ulupr ulupr = new Ulupr(
                                idul: ul,
                                dtstart: Util.convertToDate(it.НаимИННЮЛ.ГРНДата.@ДатаЗаписи as String),
                                namep: it.НаимИННЮЛ.@НаимЮЛПолн,
                                ogrn: it.НаимИННЮЛ.@ОГРН,
                                inn: it.НаимИННЮЛ.@ИНН,
                                kpp: it.НаимИННЮЛ.@КПП,
                                dtreg: Util.convertToDate(it.ГРНДатаПерв.@ДатаЗаписи as String),
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
                if (it.СвПредш.@НаимЮЛПолн != "") {
                    ArrayList<Ulpredsh> ulpredshs = new ArrayList<>()
                    it.СвПредш.each {
                        Ulpredsh ulpredsh = new Ulpredsh(
                                idul: ul,
                                dtogrn: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                namep: it.@НаимЮЛПолн,
                                ogrn: it.@ОГРН,
                                inn: it.@ИНН,
                                kpp: it.@КПП,
                                dtreg: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                fulladdress: null, //UtilParser.getAddress(it.ADDRESS, list),//not found
                                idregorg:  null //UtilParser.getRegorg(it, list)//not found
                        )
                        ulpredshs.add(ulpredsh)
                    }
                    ul.setUlpredshs(ulpredshs)
                }
                //------------------ PREEM
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode preem")
                if (it.СвПреем.@НаимЮЛПолн != "") {
                    ArrayList<Ulpreem> ulpreems = new ArrayList<>()
                    it.СвПреем.each {

                        Ulpreem ulpreem = new Ulpreem(
                                idul: ul,
                                dtogrn: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                namep: it.@НаимЮЛПолн,
                                ogrn: it.@ОГРН,
                                inn: it.@ИНН,
                                kpp: it.@КПП,
                                dtreg: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                fulladdress: null, //UtilParser.getAddress(it.ADDRESS, list),//not found
                                idregorg: null //UtilParser.getRegorg(it, list)//not found
                        )
                        ulpreems.add(ulpreem)
                    }
                    ul.setUlpreems(ulpreems)
                }
                //------------------ LICENZ
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode licenz")
                if (it.СвЛицензия.@НомЛиц != "") {
                    List<Licenz> licenzsList = new ArrayList<>()
                    Licenz licenz;
                    it.СвЛицензия.each {
                        licenz = new Licenz(
                                idul: ul,
                                numlic: it.@НомЛиц,
                                dtrestart: Util.convertToDate(it.@ДатаЛиц as String),
                                idlicorg: UtilParser.getLicorgNew(it, list),
                                idvidlic: UtilParser.getVidlicNew(it, list),
                                idsostlic: null, //UtilParser.getSostlic(it, list),//not found
                                dtstart: Util.convertToDate(it.@ДатаНачЛиц as String),
                                dtend: Util.convertToDate(it.@ДатаОкончЛиц as String),
                                dtstop: Util.convertToDate(it.СвПриостЛиц.@ДатаПриостЛиц as String)
                        )

                        licenzsList.add(licenz)
                    }
                    ul.setLicenzs(licenzsList)
                }
                //------------------ UL_OB
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode ul_ob")
                if (it.СвПодразд.isEmpty() == false){
                    List<Ulob> ulobs = new ArrayList<>()
                    if (it.СвПодразд.СвФилиал.ГРНДата.@ДатаЗаписи != "") {
                        it.СвПодразд.СвФилиал.each {
                            Ulob ulob = new Ulob(
                                    idul: ul,
                                    dtstart: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                    vidob: 100080, //Код вида подразделения (Филиал)
                                    fulladdress: UtilParser.getAddressNew(it.АдрМНРФ, list),
                                    kodgorod: null, //it.CONTACT.@KODGOROD,//not found
                                    telefon: null, //it.CONTACT.@TELEFON,//not found
                                    fax: null //it.CONTACT.@FAX//not found
                            )
                            ulobs.add(ulob)
                        }
                    }
                    if (it.СвПодразд.СвПредстав.@ДатаЗаписи != "") {
                        it.UL_OB.each {
                            Ulob ulob = new Ulob(
                                    idul: ul,
                                    dtstart: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                    vidob: 100081, //Код вида подразделения (Представительство)
                                    fulladdress: UtilParser.getAddressNew(it.АдрМНРФ, list),
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
                it.СвЗапЕГРЮЛ.each {
                    Gosreg gosreg = new Gosreg(
                            idul: ul,
                            idreg: it.@ИдЗап,
                            regnum: it.@ГРН,
                            dtreg: Util.convertToDate(it.СвСвид.@ДатаВыдСвид as String),
                            dtzap: Util.convertToDate(it.@ДатаЗап as String),
                            idvidreg: UtilParser.getVidregNew(it.ВидЗап, list),
                            idregorg: UtilParser.getRegorgNew(it.СвРегОрг, list),
                            sersvid: Util.convertToInt(it.СвСвид.@Серия),
                            numsvid: Util.convertToInt(it.СвСвид.@Номер)
                    )
                    List<Sppreddok> preddoks = new ArrayList<>()
                    it.СведПредДок.each {
                        Sppreddok preddok = new Sppreddok(
                                //idreg: gosreg,
                                numdok: it.НомДок.text(),
                                name: it.НаимДок.text(),
                                dtdok: Util.convertToDate(it.ДатаДок as String),
                        )
                        preddoks.add(preddok)
                    }
                    gosreg.setSppreddoks(preddoks)
                    gosregs.add(gosreg)
                }
                ul.setGosregs(gosregs)
                //------------------ MNS
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode mns")
                if (it.СвУчетНО.@ДатаПостУч != "") {
                    it.СвУчетНО.each {
                        Ulmns ipmns = new Ulmns(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@ДатаПостУч as String),
                                regnum: it.ГРНДата.@ГРН,
                                dtzap: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                idmns: new Spmns(
                                        kod: it.СвНО.@КодНО,
                                        name: it.СвНО.@НаимНО
                                )
                                //dtend: null //Util.convertToDate(it.@DTEND as String)//not found
                        )
                        ul.setUlmns(ipmns)
                    }
                }
                //------------------ PF
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode pf")
                if (it.СвРегПФ.@ДатаРег != "") {
                    it.СвРегПФ.each {
                        Ulpf ulpf = new Ulpf(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@ДатаРег as String),
                                regnomPf: it.@РегНомПФ as String,
                                regnum: it.ГРНДата.@ГРН,
                                dtzap: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                idpf: new Sppf(
                                        kod: Util.convertToInt(it.СвОргПФ.@КодПФ),
                                        name: it.СвОргПФ.@НаимПФ
                                )

                        )
                        ul.setUlpf(ulpf)
                    }
                }
                //------------------ FSS
                log.trace("Decoding UL with OGRN " + ul.getIdul() + " begin decode fss")
                if (it.СвРегФСС.@РегНомФСС != "") {
                    it.СвРегФСС.each {
                        Ulfss ulfss = new Ulfss(
                                idul: ul,
                                dtstart: Util.convertToDate(it.@ДатаРег as String),
                                regnomFss: it.@РегНомФСС as String,
                                regnum: it.ГРНДата.@ГРН,
                                dtzap: Util.convertToDate(it.ГРНДата.@ДатаЗаписи as String),
                                idfss: new Spfss(
                                        kod: it.СвОргФСС.@КодФСС,
                                        name: it.СвОргФСС.@НаимФСС
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
