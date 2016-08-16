/**
 * Copyright (c) minuteproject, minuteproject@gmail.com
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * More information on minuteproject:
 * twitter @minuteproject
 * wiki http://minuteproject.wikispaces.com
 * blog http://minuteproject.blogspot.net
 *
 */
/**
 * template reference :
 * - Minuteproject version : 0.8.8
 * - name      : DomainEntityJPA2Annotation
 * - file name : DomainEntityJPA2Annotation.vm
 * - time      : 2015/02/12 �.�. at 10:23:32 MSK
 */
package ru.iac.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Ulupr</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulupr entity</p>
 */
@Entity(name = "Ulupr")
@Table(name = "\"ULUPR\"")
@NamedQueries({
        @NamedQuery(name = "Ulupr.findAll", query = "SELECT ulupr FROM Ulupr ulupr")
        , @NamedQuery(name = "Ulupr.findByIdul", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.idul = :idul")

        , @NamedQuery(name = "Ulupr.findByDtstart", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.dtstart = :dtstart")

        , @NamedQuery(name = "Ulupr.findByNamep", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.namep = :namep")
        , @NamedQuery(name = "Ulupr.findByNamepContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.namep like :namep")

        , @NamedQuery(name = "Ulupr.findByOgrn", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.ogrn = :ogrn")
        , @NamedQuery(name = "Ulupr.findByOgrnContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.ogrn like :ogrn")

        , @NamedQuery(name = "Ulupr.findByDtreg", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.dtreg = :dtreg")

        , @NamedQuery(name = "Ulupr.findByInn", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.inn = :inn")
        , @NamedQuery(name = "Ulupr.findByInnContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.inn like :inn")

        , @NamedQuery(name = "Ulupr.findByKpp", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.kpp = :kpp")
        , @NamedQuery(name = "Ulupr.findByKppContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.kpp like :kpp")


        , @NamedQuery(name = "Ulupr.findByKodgorod", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.kodgorod = :kodgorod")
        , @NamedQuery(name = "Ulupr.findByKodgorodContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.kodgorod like :kodgorod")

        , @NamedQuery(name = "Ulupr.findByTelefon", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.telefon = :telefon")
        , @NamedQuery(name = "Ulupr.findByTelefonContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.telefon like :telefon")

        , @NamedQuery(name = "Ulupr.findByFax", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.fax = :fax")
        , @NamedQuery(name = "Ulupr.findByFaxContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.fax like :fax")

        , @NamedQuery(name = "Ulupr.findByGihdAdate", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ulupr.findByGihdChdate", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ulupr.findByGihdDdate", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ulupr.findByGihdIdUser", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ulupr.findByGihdAIdPackage", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ulupr.findByGihdChIdPackage", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ulupr.findByGihdDIdPackage", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ulupr.findByRowCheckSum", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ulupr.findByRowCheckSumContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.rowCheckSum like :rowCheckSum")

})

public class Ulupr implements Serializable {
    public static final String FIND_ALL = "Ulupr.findAll";
    public static final String FIND_BY_IDUL = "Ulupr.findByIdul";
    public static final String FIND_BY_DTSTART = "Ulupr.findByDtstart";
    public static final String FIND_BY_NAMEP = "Ulupr.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING = "Ulupr.findByNamepContaining";
    public static final String FIND_BY_OGRN = "Ulupr.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING = "Ulupr.findByOgrnContaining";
    public static final String FIND_BY_DTREG = "Ulupr.findByDtreg";
    public static final String FIND_BY_INN = "Ulupr.findByInn";
    public static final String FIND_BY_INN_CONTAINING = "Ulupr.findByInnContaining";
    public static final String FIND_BY_KPP = "Ulupr.findByKpp";
    public static final String FIND_BY_KPP_CONTAINING = "Ulupr.findByKppContaining";
    public static final String FIND_BY_KODGOROD = "Ulupr.findByKodgorod";
    public static final String FIND_BY_KODGOROD_CONTAINING = "Ulupr.findByKodgorodContaining";
    public static final String FIND_BY_TELEFON = "Ulupr.findByTelefon";
    public static final String FIND_BY_TELEFON_CONTAINING = "Ulupr.findByTelefonContaining";
    public static final String FIND_BY_FAX = "Ulupr.findByFax";
    public static final String FIND_BY_FAX_CONTAINING = "Ulupr.findByFaxContaining";
    public static final String FIND_BY_GIHDADATE = "Ulupr.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulupr.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulupr.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulupr.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulupr.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulupr.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulupr.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulupr.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ulupr.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Embedded
    Address fulladdress;
    @SequenceGenerator(name = "ULUPRSEQ", sequenceName = "SEQ_ULUPR", allocationSize = 1)
    @Id
    @Column(name = "IDULUPR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULUPRSEQ")
    private Integer idulupr;
    @OneToOne
    @JoinColumn(name = "IDUL")
    private Ul idul;
    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;
    @Column(name = "NAMEP", length = 1000, nullable = true, unique = false)
    private String namep;
    @Column(name = "OGRN", length = 20, nullable = true, unique = false)
    private String ogrn;
    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;
    @Column(name = "INN", length = 20, nullable = true, unique = false)
    private String inn;
    @Column(name = "KPP", length = 10, nullable = true, unique = false)
    private String kpp;
    @Column(name = "KODGOROD", length = 5, nullable = true, unique = false)
    private String kodgorod;
    @Column(name = "TELEFON", length = 20, nullable = true, unique = false)
    private String telefon;
    @Column(name = "FAX", length = 20, nullable = true, unique = false)
    private String fax;
    @Column(name = "GIHD__ADATE", nullable = true, unique = false)
    private Date gihdAdate;
    @Column(name = "GIHD__CHDATE", nullable = true, unique = false)
    private Date gihdChdate;
    @Column(name = "GIHD__DDATE", nullable = true, unique = false)
    private Date gihdDdate;
    @Column(name = "GIHD__ID_USER", nullable = true, unique = false)
    private Integer gihdIdUser;
    @Column(name = "GIHD__A_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdAIdPackage;
    @Column(name = "GIHD__CH_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdChIdPackage;
    @Column(name = "GIHD__D_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdDIdPackage;
    @Column(name = "ROW_CHECK_SUM", nullable = true, unique = false)
    private String rowCheckSum;


    /**
     * Default constructor
     */
    public Ulupr() {
    }


    /**
     * All field constructor
     */
    public Ulupr(
            Integer idulupr,
            Ul idul,
            Date dtstart,
            String namep,
            String ogrn,
            Date dtreg,
            String inn,
            String kpp,
            String okato,
            Integer indeks,
            String idregion,
            String idraion,
            String idgorod,
            String idnasp,
            String idstreet,
            String dom,
            String korp,
            String kvart,
            String kodgorod,
            String telefon,
            String fax,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idulupr,
                idul,
                dtstart,
                namep,
                ogrn,
                dtreg,
                inn,
                kpp,
                kodgorod,
                telefon,
                fax,
                gihdAdate,
                gihdChdate,
                gihdDdate,
                gihdIdUser,
                gihdAIdPackage,
                gihdChIdPackage,
                gihdDIdPackage,
                rowCheckSum
                , true);
    }


    public Ulupr(
            Integer idulupr,
            Ul idul,
            Date dtstart,
            String namep,
            String ogrn,
            Date dtreg,
            String inn,
            String kpp,
            String kodgorod,
            String telefon,
            String fax,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum
            , boolean setRelationship) {
        //primary keys
        setIdulupr(idulupr);
        //attributes
        setIdul(idul);
        setDtstart(dtstart);
        setNamep(namep);
        setOgrn(ogrn);
        setDtreg(dtreg);
        setInn(inn);
        setKpp(kpp);
        setKodgorod(kodgorod);
        setTelefon(telefon);
        setFax(fax);
        setGihdAdate(gihdAdate);
        setGihdChdate(gihdChdate);
        setGihdDdate(gihdDdate);
        setGihdIdUser(gihdIdUser);
        setGihdAIdPackage(gihdAIdPackage);
        setGihdChIdPackage(gihdChIdPackage);
        setGihdDIdPackage(gihdDIdPackage);
        setRowCheckSum(rowCheckSum);
        //parents
    }

    public Address getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(Address fulladdress) {
        this.fulladdress = fulladdress;
    }

    public Ulupr flat() {
        return new Ulupr(
                getIdulupr(),
                getIdul(),
                getDtstart(),
                getNamep(),
                getOgrn(),
                getDtreg(),
                getInn(),
                getKpp(),
                getKodgorod(),
                getTelefon(),
                getFax(),
                getGihdAdate(),
                getGihdChdate(),
                getGihdDdate(),
                getGihdIdUser(),
                getGihdAIdPackage(),
                getGihdChIdPackage(),
                getGihdDIdPackage(),
                getRowCheckSum()
                , false
        );
    }

    public Integer getIdulupr() {
        return idulupr;
    }

    public void setIdulupr(Integer idulupr) {
        this.idulupr = idulupr;
    }


    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
    }


    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
    }


    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }


    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }


    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
    }


    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }


    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }


    public String getKodgorod() {
        return kodgorod;
    }

    public void setKodgorod(String kodgorod) {
        this.kodgorod = kodgorod;
    }


    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    public Date getGihdAdate() {
        return gihdAdate;
    }

    public void setGihdAdate(Date gihdAdate) {
        this.gihdAdate = gihdAdate;
    }


    public Date getGihdChdate() {
        return gihdChdate;
    }

    public void setGihdChdate(Date gihdChdate) {
        this.gihdChdate = gihdChdate;
    }


    public Date getGihdDdate() {
        return gihdDdate;
    }

    public void setGihdDdate(Date gihdDdate) {
        this.gihdDdate = gihdDdate;
    }


    public Integer getGihdIdUser() {
        return gihdIdUser;
    }

    public void setGihdIdUser(Integer gihdIdUser) {
        this.gihdIdUser = gihdIdUser;
    }


    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }

    public void setGihdAIdPackage(Integer gihdAIdPackage) {
        this.gihdAIdPackage = gihdAIdPackage;
    }


    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }

    public void setGihdChIdPackage(Integer gihdChIdPackage) {
        this.gihdChIdPackage = gihdChIdPackage;
    }


    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }

    public void setGihdDIdPackage(Integer gihdDIdPackage) {
        this.gihdDIdPackage = gihdDIdPackage;
    }


    public String getRowCheckSum() {
        return rowCheckSum;
    }

    public void setRowCheckSum(String rowCheckSum) {
        this.rowCheckSum = rowCheckSum;
    }


}
