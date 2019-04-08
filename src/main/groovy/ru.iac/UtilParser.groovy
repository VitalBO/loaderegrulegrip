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
            case "�������� �������":
                id = 1
                break
            case "���������� �������":
                id = 2
                break
            case "�������� ����":
                id = 3
                break
            case "������ ������":
                id = 4
                break
            case "������ ����":
                id = 5
                break
            case "�����������":
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
            if (it.@����� != "")
                spregorg = Util.check(new Spregorg(
                        idspro: Util.convertToBInt(it.@�����),
                        name: it.@������,
                        address: it.@�����), list)
            else if (it.@������ != "")
                spregorg = Util.check(new Spregorg(
                        idspro: Util.convertToBInt(it.@������),
                        name: it.@������,
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
            if (it.@���������� != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.@����������),
                        name: it.@�����������
                )
            if (it.@������������ != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.@������������),
                        name: it.@�������������
                )
            if (it.@������� != "")
                spvidreg = new Spvidreg(
                        idvidreg: Util.convertToInt(it.@�������),
                        name: it.@����������
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
                    //okato: it.@����� as String,//no tag in new formats
                    indeks: it.@������ as String,
                    dom: it.@��� as String,
                    korp: it.@������ as String,
                    kvart: it.@����� as String
            )

            if (it.������.@���������� != "") {
                Rg rg = new Rg(
                        idr: new BigInteger((it.������.@����������.text() +" "+ it.������.@���������.text()).hashCode()),//Util.convertToBInt(it.@���������) +1100000,//no appropriate tag in new format
                        name: (it.������.@���������� as String) +" "+(it.������.@��������� as String),
                        kodKl: it.@��������� as String,
                        typeRg: it.������.@��������� as String,
                        nameRg: it.������.@���������� as String
                )
                rg = (Rg) Util.check(rg, list)
                address.setIdregion(rg)
            }
            if (it.�����.@��������� != "") {
                Ds ds = new Ds(
                        idd: new BigInteger((it.�����.@���������.text() +" "+ it.�����.@��������.text()).hashCode()),//Util.convertToBInt(it.@�����������),//no appropriate tag in new format
                        name: (it.�����.@��������� as String) +" "+(it.�����.@�������� as String),
                        typeDs: it.�����.@�������� as String,
                        nameDs: it.�����.@��������� as String
                        //kodKl: null//it.@����������� as String//no appropriate tag in new format. ����������� ???

                )
                ds = (Ds) Util.check(ds, list)
                address.setIdraion(ds)
            }
            if (it.�����.@��������� != "") {
                Ct ct = new Ct(
                        idc: new BigInteger((it.�����.@���������.text() +" "+ it.�����.@��������.text()).hashCode()),//Util.convertToBInt(it.@�����������),//no appropriate tag in new format
                        name: (it.�����.@��������� as String)+" "+(it.�����.@�������� as String),
                        typeCt: it.�����.@�������� as String,
                        nameCt: it.�����.@��������� as String
                        //kodKl: null//it.@����������� as String//no appropriate tag in new format. ����������� ???

                )
                ct = (Ct) Util.check(ct, list)
                address.setIdgorod(ct)
            }
            if (it.����������.@�������������� != "") {
                Cn cn = new Cn(
                        idn: new BigInteger((it.����������.@��������������.text() + " "+ it.����������.@�������������.text()).hashCode()),//Util.convertToBInt(it.@�����������),//no appropriate tag in new format
                        name: (it.����������.@�������������� as String)+ " "+(it.����������.@�������������),//find appropriate tag for new formats
                        typeCn: it.����������.@������������� as String,
                        nameCn: it.����������.@�������������� as String
                        //kodKl: null//it.@����������� as String//find appropriate tag for new formats

                )
                cn = (Cn) Util.check(cn, list)
                address.setIdnasp(cn)
            }
            if (it.�����.@��������� != "") {
                St st = new St(
                        ids: new BigInteger((it.�����.@���������.text() +" "+ it.�����.@��������.text()).hashCode()),//Util.convertToBInt(it.@�����������),//no appropriate tag in new format
                        name: (it.�����.@��������� as String)+" "+(it.�����.@�������� as String),
                        kodSt: it.@����������� as String,//�������.����������� ???
                        typeSt: it.�����.@�������� as String,
                        nameSt: it.�����.@��������� as String
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
            if (it.@���� != "")
                oksm = new Oksm(
                        id: Util.convertToInt(it.@����),
                        kodOksm: it.@����,
                        name: it.@���������
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
            if (it.������������.text() != "")
                splicorg = new Splicorg(
                        id: new BigInteger(it.������������.text().hashCode()),//not found
                        name: it.������������.text()
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
            if (it.��������������.text() != "") {
                spvidlic = new Spvidlic(
                        idvidlic: new BigInteger(it.��������������.text().hashCode()),//not found
                        name: it.��������������.text()
                )
                spvidlic = (Spvidlic) Util.check(spvidlic, list)
                vidlicSet.add(spvidlic)
            }
        }
        return vidlicSet
    }
    //-------------------------------------------------------------------------
}
