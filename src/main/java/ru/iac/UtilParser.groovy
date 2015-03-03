package ru.iac

import groovy.util.slurpersupport.GPathResult
import ru.iac.entity.*

/**
 * Created by konenkov on 02.03.2015.
 */
class UtilParser {

    public static Spvidlic getVidlic(GPathResult gPathResult, List list) {
        Spvidlic spvidlic = null
        gPathResult.each {
            if (it.VIDLIC.@ID != "")
                spvidlic = new Spvidlic(
                        idvidlic: Util.convertToBInt(it.VIDLIC.@ID),
                        name: it.VIDLIC.@NAME_VLIC
                )
        }
        spvidlic = (Spvidlic) Util.check(spvidlic, list)
        return spvidlic
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

    static Address getAddress(GPathResult gPathResult, List list) {
        Address address = null
        gPathResult.each {
            address = new Address(
                    okato: it.@OKATO as String,
                    indeks: it.@INDEKS as String)

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

}
