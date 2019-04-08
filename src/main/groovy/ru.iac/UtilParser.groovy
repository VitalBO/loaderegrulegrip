package ru.iac

import groovy.util.slurpersupport.GPathResult
import ru.iac.entity.*

import javax.xml.stream.events.Attribute

/**
 * Created by konenkov on 02.03.2015.
 * Class contains util method to create Reference objects and check uniqueness*
 */
class UtilParser {

    public static Set<Spvidlic> getVidlic(GPathResult gPathResult, List list) {
        Set<Spvidlic> vidlicSet = new HashSet<>()
        Spvidlic spvidlic = null
        gPathResult.VIDLIC.each {
            if (it.@ID != "") {
                spvidlic = new Spvidlic(
                        idvidlic: Util.convertToBInt(it.@ID),
                        name: it.@NAME_VLIC
                )
                spvidlic = (Spvidlic) Util.check(spvidlic, list)
                vidlicSet.add(spvidlic)
            }
        }
        return vidlicSet
    }

    public static Spsostlic getSostlic(GPathResult gPathResult, List list) {
        Spsostlic spsostlic = null
        gPathResult.each {
            if (it.SOSTLIC.@ID != "")
                spsostlic = new Spsostlic(
                        idsostlic: Util.convertToInt(it.SOSTLIC.@ID),
                        name: it.SOSTLIC.@NAME
                )
        }
        spsostlic = (Spsostlic) Util.check(spsostlic, list)
        return spsostlic
    }

    public static Splicorg getLicorg(GPathResult gPathResult, List list) {
        Splicorg splicorg = null
        gPathResult.each {
            if (it.LICORG.@ID != "")
                splicorg = new Splicorg(
                        id: it.LICORG.@ID,
                        name: it.LICORG.@NAME
                )
        }
        splicorg = (Splicorg) Util.check(splicorg, list)
        return splicorg
    }

    public static Spregorg getRegorg(GPathResult gPathResult, List list) {
        Spregorg spregorg = null
        gPathResult.each {
            if (it.REGORG.@ID != "")
                spregorg = Util.check(new Spregorg(
                        idspro: Util.convertToBInt(it.REGORG.@ID),
                        name: it.REGORG.@NAME), list)
        }
        spregorg = (Spregorg) Util.check(spregorg, list)
        return spregorg
    }

    //-------------------------------------------------------------------------
    static Address getAddress(GPathResult gPathResult, List list) {
        Address address = null
        gPathResult.each {
            address = new Address(
                    okato: it.@OKATO as String,
                    indeks: it.@INDEKS as String,
                    dom: it.@DOM as String,
                    korp: it.@KORP as String,
                    kvart: it.@KVART as String
            )

            if (it.REGION.@ID != "") {
                Rg rg = new Rg(
                        idr: Util.convertToBInt(it.REGION.@ID),
                        name: it.REGION.@NAME as String,
                        kodKl: it.REGION.@KOD_KL as String
                )
                rg = (Rg) Util.check(rg, list)
                address.setIdregion(rg)
            }
            if (it.RAION.@ID != "") {
                Ds ds = new Ds(
                        idd: Util.convertToBInt(it.RAION.@ID),
                        name: it.RAION.@NAME as String,
                        kodKl: it.RAION.@KOD_KL as String

                )
                ds = (Ds) Util.check(ds, list)
                address.setIdraion(ds)
            }
            if (it.GOROD.@ID != "") {
                Ct ct = new Ct(
                        idc: Util.convertToBInt(it.GOROD.@ID),
                        name: it.GOROD.@NAME as String,
                        kodKl: it.GOROD.@KOD_KL as String

                )
                ct = (Ct) Util.check(ct, list)
                address.setIdgorod(ct)
            }
            if (it.NASPUNKT.@ID != "") {
                Cn cn = new Cn(
                        idn: Util.convertToBInt(it.NASPUNKT.@ID),
                        name: it.NASPUNKT.@NAME as String,
                        kodKl: it.NASPUNKT.@KOD_KL as String

                )
                cn = (Cn) Util.check(cn, list)
                address.setIdnasp(cn)
            }
            if (it.STREET.@ID != "") {
                St st = new St(
                        ids: Util.convertToBInt(it.STREET.@ID),
                        name: it.STREET.@NAME as String,
                        kodSt: it.STREET.@KOD_ST as String
                )
                st = (St) Util.check(st, list)
                address.setIdstreet(st)
            }

        }
        return address
    }

    static Splang getSplang(GPathResult gPathResult, List list) {
        Splang splang = null
        gPathResult.each {
            if (it.NAMEI.LANG.@ID != "")
                splang = new Splang(
                        id: Util.convertToInt(it.NAMEI.LANG.@ID),
                        kodLang: it.NAMEI.LANG.@KOD_LANG,
                        name: it.NAMEI.LANG.@NAME
                )

        }
        splang = (Splang) Util.check(splang, list)
        return splang
    }

    static Spvidreg getVidreg(GPathResult gPathResult, List list) {
        Spvidreg spvidreg = null
        gPathResult.each {
            if (it.VIDREG.@ID != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.VIDREG.@ID),
                        name: it.VIDREG.@NAME
                )
        }
        spvidreg = (Spvidreg) Util.check(spvidreg, list)
        return spvidreg
    }

    static Oksm getOksm(GPathResult gPathResult, List list) {
        Oksm oksm = null
        gPathResult.each {
            if (it.OKSM.@ID != "")
                oksm = new Oksm(
                        id: Util.convertToInt(it.OKSM.@ID),
                        kodOksm: it.OKSM.@KOD_OKSM,
                        name: it.OKSM.@NAME
                )
            oksm = (Oksm) Util.check(oksm, list)
        }
        return oksm
    }
////////////////////////////////////////////////////////////////////////////////////////////

    //-------------- getVidcap for new format ---------------------------------
    public static Spvidcap getVidcapNew(String captypename){
        def id;
        switch(captypename) {
            case "Уставный капитал":
                id = 1
                break
            case "Складочный капитал":
                id = 2
                break
            case "Уставный фонд":
                id = 3
                break
            case "Паевые взносы":
                id = 4
                break
            case "Паевой фонд":
                id = 5
                break
            case "Отсутствует":
                id = 6
                break
            default:
                id = 7
                break
        }
        return new Spvidcap(
                id:id,
                name:captypename
        )
    }
    //--------------------------------------------------------------------------

    //-------------- getRegorg for new format ---------------------------------
    public static Spregorg getRegorgNew(GPathResult gPathResult, List list) {
        Spregorg spregorg = null
        gPathResult.each {
            if (it.@КодНО != "")
                spregorg = Util.check(new Spregorg(
                        idspro: Util.convertToBInt(it.@КодНО),
                        name: it.@НаимНО,
                        address: it.@АдрРО), list)
            else if (it.@РегНом != "")
                spregorg = Util.check(new Spregorg(
                        idspro: Util.convertToBInt(it.@РегНом),
                        name: it.@НаимРО,
                        address: null), list)
        }
        spregorg = (Spregorg) Util.check(spregorg, list)
        return spregorg
    }
    //--------------------------------------------------------------------------
    //--------------------------- getVidreg for new format --------------------
    static Spvidreg getVidregNew(GPathResult gPathResult, List list) {
        Spvidreg spvidreg = null
        gPathResult.each {
            if (it.@КодСпОбрЮЛ != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.@КодСпОбрЮЛ),
                        name: it.@НаимСпОбрЮЛ
                )
            if (it.@КодСпПрекрЮЛ != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.@КодСпПрекрЮЛ),
                        name: it.@НаимСпПрекрЮЛ
                )
            if (it.@КодСПВЗ != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.@КодСПВЗ),
                        name: it.@НаимВидЗап
                )
            spvidreg = (Spvidreg) Util.check(spvidreg, list)
        }
        return spvidreg
    }

    //-------------------------------------------------------------------------
    //-------------- getAddress for new format ---------------------------------
    static Address getAddressNew(GPathResult gPathResult, List list) {
        Address address = null
        gPathResult.each {
            address = new Address(
                    //okato: it.@ОКАТО as String,//no tag in new formats
                    indeks: it.@Индекс as String,
                    dom: it.@Дом as String,
                    korp: it.@Корпус as String,
                    kvart: it.@Кварт as String
            )

            if (it.Регион.@НаимРегион != "") {
                Rg rg = new Rg(
                        idr: new BigInteger((it.Регион.@НаимРегион.text() +" "+ it.Регион.@ТипРегион.text()).hashCode()),//Util.convertToBInt(it.@КодРегион) +1100000,//no appropriate tag in new format
                        name: (it.Регион.@НаимРегион as String) +" "+(it.Регион.@ТипРегион as String),
                        kodKl: it.@КодРегион as String,
                        typeRg: it.Регион.@ТипРегион as String,
                        nameRg: it.Регион.@НаимРегион as String
                )
                rg = (Rg) Util.check(rg, list)
                address.setIdregion(rg)
            }
            if (it.Район.@НаимРайон != "") {
                Ds ds = new Ds(
                        idd: new BigInteger((it.Район.@НаимРайон.text() +" "+ it.Район.@ТипРайон.text()).hashCode()),//Util.convertToBInt(it.@КодАдрКладр),//no appropriate tag in new format
                        name: (it.Район.@НаимРайон as String) +" "+(it.Район.@ТипРайон as String),
                        typeDs: it.Район.@ТипРайон as String,
                        nameDs: it.Район.@НаимРайон as String
                        //kodKl: null//it.@КодАдрКладр as String//no appropriate tag in new format. КодАдрКладр ???

                )
                ds = (Ds) Util.check(ds, list)
                address.setIdraion(ds)
            }
            if (it.Город.@НаимГород != "") {
                Ct ct = new Ct(
                        idc: new BigInteger((it.Город.@НаимГород.text() +" "+ it.Город.@ТипГород.text()).hashCode()),//Util.convertToBInt(it.@КодАдрКладр),//no appropriate tag in new format
                        name: (it.Город.@НаимГород as String)+" "+(it.Город.@ТипГород as String),
                        typeCt: it.Город.@ТипГород as String,
                        nameCt: it.Город.@НаимГород as String
                        //kodKl: null//it.@КодАдрКладр as String//no appropriate tag in new format. КодАдрКладр ???

                )
                ct = (Ct) Util.check(ct, list)
                address.setIdgorod(ct)
            }
            if (it.НаселПункт.@НаимНаселПункт != "") {
                Cn cn = new Cn(
                        idn: new BigInteger((it.НаселПункт.@НаимНаселПункт.text() + " "+ it.НаселПункт.@ТипНаселПункт.text()).hashCode()),//Util.convertToBInt(it.@КодАдрКладр),//no appropriate tag in new format
                        name: (it.НаселПункт.@НаимНаселПункт as String)+ " "+(it.НаселПункт.@ТипНаселПункт),//find appropriate tag for new formats
                        typeCn: it.НаселПункт.@ТипНаселПункт as String,
                        nameCn: it.НаселПункт.@НаимНаселПункт as String
                        //kodKl: null//it.@КодАдрКладр as String//find appropriate tag for new formats

                )
                cn = (Cn) Util.check(cn, list)
                address.setIdnasp(cn)
            }
            if (it.Улица.@НаимУлица != "") {
                St st = new St(
                        ids: new BigInteger((it.Улица.@НаимУлица.text() +" "+ it.Улица.@ТипУлица.text()).hashCode()),//Util.convertToBInt(it.@КодАдрКладр),//no appropriate tag in new format
                        name: (it.Улица.@НаимУлица as String)+" "+(it.Улица.@ТипУлица as String),
                        kodSt: it.@КодАдрКладр as String,//АдресРФ.КодАдрКладр ???
                        typeSt: it.Улица.@ТипУлица as String,
                        nameSt: it.Улица.@НаимУлица as String
                )
                st = (St) Util.check(st, list)
                address.setIdstreet(st)
            }

        }
        return address
    }
    //-------------------------------------------------------------------------
    //-------------- getOksm for new format -----------------------------------
    static Oksm getOksmNew(GPathResult gPathResult, List list) {
        Oksm oksm = null
        gPathResult.each {
            if (it.@ОКСМ != "")
                oksm = new Oksm(
                        id: Util.convertToInt(it.@ОКСМ),
                        kodOksm: it.@ОКСМ,
                        name: it.@НаимСтран
                )
            oksm = (Oksm) Util.check(oksm, list)
        }
        return oksm
    }
    //-------------------------------------------------------------------------

    //-----------------------getLicorg for new formats-----------------------
    public static Splicorg getLicorgNew(GPathResult gPathResult, List list) {
        Splicorg splicorg = null
        gPathResult.each {
            if (it.ЛицОргВыдЛиц.text() != "")
                splicorg = new Splicorg(
                        id: new BigInteger(it.ЛицОргВыдЛиц.text().hashCode()),//not found
                        name: it.ЛицОргВыдЛиц.text()
                )
        }
        splicorg = (Splicorg) Util.check(splicorg, list)
        return splicorg
    }
    //-------------------------------------------------------------------------

    //----------------------getVidlic for new formats--------------------------
    public static Set<Spvidlic> getVidlicNew(GPathResult gPathResult, List list) {
        Set<Spvidlic> vidlicSet = new HashSet<>()
        Spvidlic spvidlic = null
        gPathResult.each {
            if (it.НаимЛицВидДеят.text() != "") {
                spvidlic = new Spvidlic(
                        idvidlic: new BigInteger(it.НаимЛицВидДеят.text().hashCode()),//not found
                        name: it.НаимЛицВидДеят.text()
                )
                spvidlic = (Spvidlic) Util.check(spvidlic, list)
                vidlicSet.add(spvidlic)
            }
        }
        return vidlicSet
    }
    //-------------------------------------------------------------------------
}
