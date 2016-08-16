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
 * - time      : 2015/02/12 �.�. at 10:23:31 MSK
 */
package ru.iac.entity;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Title: Rul</p>
 * <p/>
 * <p>Description: Domain Object describing a Rul entity</p>
 */
@Entity(name = "Rul")
@Table(name = "\"RUL\"")
@NamedQueries({
        @NamedQuery(name = "Rul.findAll", query = "SELECT rul FROM Rul rul")
        , @NamedQuery(name = "Rul.findByIdul", query = "SELECT rul FROM Rul rul WHERE rul.idul = :idul")

        , @NamedQuery(name = "Rul.findByDtstart", query = "SELECT rul FROM Rul rul WHERE rul.dtstart = :dtstart")

        , @NamedQuery(name = "Rul.findByNamep", query = "SELECT rul FROM Rul rul WHERE rul.namep = :namep")
        , @NamedQuery(name = "Rul.findByNamepContaining", query = "SELECT rul FROM Rul rul WHERE rul.namep like :namep")

        , @NamedQuery(name = "Rul.findByOgrn", query = "SELECT rul FROM Rul rul WHERE rul.ogrn = :ogrn")
        , @NamedQuery(name = "Rul.findByOgrnContaining", query = "SELECT rul FROM Rul rul WHERE rul.ogrn like :ogrn")

        , @NamedQuery(name = "Rul.findByDtogrn", query = "SELECT rul FROM Rul rul WHERE rul.dtogrn = :dtogrn")

        , @NamedQuery(name = "Rul.findByInn", query = "SELECT rul FROM Rul rul WHERE rul.inn = :inn")
        , @NamedQuery(name = "Rul.findByInnContaining", query = "SELECT rul FROM Rul rul WHERE rul.inn like :inn")

        , @NamedQuery(name = "Rul.findByKpp", query = "SELECT rul FROM Rul rul WHERE rul.kpp = :kpp")
        , @NamedQuery(name = "Rul.findByKppContaining", query = "SELECT rul FROM Rul rul WHERE rul.kpp like :kpp")

        , @NamedQuery(name = "Rul.findByRegnumst", query = "SELECT rul FROM Rul rul WHERE rul.regnumst = :regnumst")
        , @NamedQuery(name = "Rul.findByRegnumstContaining", query = "SELECT rul FROM Rul rul WHERE rul.regnumst like :regnumst")

        , @NamedQuery(name = "Rul.findByDtreg", query = "SELECT rul FROM Rul rul WHERE rul.dtreg = :dtreg")

        , @NamedQuery(name = "Rul.findBySumma", query = "SELECT rul FROM Rul rul WHERE rul.summa = :summa")

        , @NamedQuery(name = "Rul.findByIdregorg", query = "SELECT rul FROM Rul rul WHERE rul.idregorg = :idregorg")

        , @NamedQuery(name = "Rul.findByGihdAdate", query = "SELECT rul FROM Rul rul WHERE rul.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Rul.findByGihdChdate", query = "SELECT rul FROM Rul rul WHERE rul.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Rul.findByGihdDdate", query = "SELECT rul FROM Rul rul WHERE rul.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Rul.findByGihdIdUser", query = "SELECT rul FROM Rul rul WHERE rul.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Rul.findByGihdAIdPackage", query = "SELECT rul FROM Rul rul WHERE rul.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Rul.findByGihdChIdPackage", query = "SELECT rul FROM Rul rul WHERE rul.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Rul.findByGihdDIdPackage", query = "SELECT rul FROM Rul rul WHERE rul.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Rul.findByRowCheckSum", query = "SELECT rul FROM Rul rul WHERE rul.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Rul.findByRowCheckSumContaining", query = "SELECT rul FROM Rul rul WHERE rul.rowCheckSum like :rowCheckSum")

})

public class Rul implements Serializable {
    public static final String FIND_ALL = "Rul.findAll";
    public static final String FIND_BY_IDUL = "Rul.findByIdul";
    public static final String FIND_BY_DTSTART = "Rul.findByDtstart";
    public static final String FIND_BY_NAMEP = "Rul.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING = "Rul.findByNamepContaining";
    public static final String FIND_BY_OGRN = "Rul.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING = "Rul.findByOgrnContaining";
    public static final String FIND_BY_DTOGRN = "Rul.findByDtogrn";
    public static final String FIND_BY_INN = "Rul.findByInn";
    public static final String FIND_BY_INN_CONTAINING = "Rul.findByInnContaining";
    public static final String FIND_BY_KPP = "Rul.findByKpp";
    public static final String FIND_BY_KPP_CONTAINING = "Rul.findByKppContaining";
    public static final String FIND_BY_REGNUMST = "Rul.findByRegnumst";
    public static final String FIND_BY_REGNUMST_CONTAINING = "Rul.findByRegnumstContaining";
    public static final String FIND_BY_DTREG = "Rul.findByDtreg";
    public static final String FIND_BY_SUMMA = "Rul.findBySumma";
    public static final String FIND_BY_IDREGORG = "Rul.findByIdregorg";
    public static final String FIND_BY_GIHDADATE = "Rul.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Rul.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Rul.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Rul.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Rul.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Rul.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Rul.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Rul.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Rul.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Embedded
    Address fulladdress;


    @SequenceGenerator(name = "RULSEQ", sequenceName = "SEQ_RUL", allocationSize = 1)
    @Id
    @Column(name = "IDRUL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RULSEQ")
    private Integer idrul;
    @ManyToOne
    @JoinColumn(name = "IDUL", nullable = true, unique = true)
    private Ul idul;


    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;


    @Column(name = "NAMEP", length = 1000, nullable = true, unique = false)
    private String namep;


    @Column(name = "OGRN", length = 20, nullable = true, unique = false)
    private String ogrn;


    @Column(name = "DTOGRN", nullable = true, unique = false)
    private Date dtogrn;


    @Column(name = "INN", length = 20, nullable = true, unique = false)
    private String inn;


    @Column(name = "KPP", length = 10, nullable = true, unique = false)
    private String kpp;


    @Column(name = "REGNUMST", length = 255, nullable = true, unique = false)
    private String regnumst;


    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;


    @Column(name = "SUMMA", nullable = true, unique = false)
    private BigDecimal summa;


    @ManyToOne
@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDREGORG", nullable = true, unique = false)
    private Spregorg idregorg;


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
    public Rul() {
    }
    /**
     * All field constructor
     */
    public Rul(
            Integer idrul,
            Ul idul,
            Date dtstart,
            String namep,
            String ogrn,
            Date dtogrn,
            String inn,
            String kpp,
            String regnumst,
            Date dtreg,
            BigDecimal summa,
            Spregorg idregorg,
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
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idrul,
                idul,
                dtstart,
                namep,
                ogrn,
                dtogrn,
                inn,
                kpp,
                regnumst,
                dtreg,
                summa,
                idregorg,
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

    public Rul(
            Integer idrul,
            Ul idul,
            Date dtstart,
            String namep,
            String ogrn,
            Date dtogrn,
            String inn,
            String kpp,
            String regnumst,
            Date dtreg,
            BigDecimal summa,
            Spregorg idregorg,
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
        setIdrul(idrul);
        //attributes
        setIdul(idul);
        setDtstart(dtstart);
        setNamep(namep);
        setOgrn(ogrn);
        setDtogrn(dtogrn);
        setInn(inn);
        setKpp(kpp);
        setRegnumst(regnumst);
        setDtreg(dtreg);
        setSumma(summa);
        setIdregorg(idregorg);
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

    public Rul flat() {
        return new Rul(
                getIdrul(),
                getIdul(),
                getDtstart(),
                getNamep(),
                getOgrn(),
                getDtogrn(),
                getInn(),
                getKpp(),
                getRegnumst(),
                getDtreg(),
                getSumma(),
                getIdregorg(),
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

    public Integer getIdrul() {
        return idrul;
    }

    public void setIdrul(Integer idrul) {
        this.idrul = idrul;
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


    public Date getDtogrn() {
        return dtogrn;
    }

    public void setDtogrn(Date dtogrn) {
        this.dtogrn = dtogrn;
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


    public String getRegnumst() {
        return regnumst;
    }

    public void setRegnumst(String regnumst) {
        this.regnumst = regnumst;
    }


    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
    }


    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
    }


    public Spregorg getIdregorg() {
        return idregorg;
    }

    public void setIdregorg(Spregorg idregorg) {
        this.idregorg = idregorg;
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
