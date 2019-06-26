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
package ru.spb.iac.toris.egrulegrip.model;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Ulpreem</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulpreem entity</p>
 */
@Entity(name = "Ulpreem")
@Table(name = "ULPREEM")
@NamedQueries({
        @NamedQuery(name = "Ulpreem.findAll", query = "SELECT ulpreem FROM Ulpreem ulpreem")
        , @NamedQuery(name = "Ulpreem.findByIdul", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idul = :idul")

        , @NamedQuery(name = "Ulpreem.findByNamep", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.namep = :namep")
        , @NamedQuery(name = "Ulpreem.findByNamepContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.namep like :namep")

        , @NamedQuery(name = "Ulpreem.findByOgrn", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.ogrn = :ogrn")
        , @NamedQuery(name = "Ulpreem.findByOgrnContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.ogrn like :ogrn")

        , @NamedQuery(name = "Ulpreem.findByDtogrn", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.dtogrn = :dtogrn")

        , @NamedQuery(name = "Ulpreem.findByInn", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.inn = :inn")
        , @NamedQuery(name = "Ulpreem.findByInnContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.inn like :inn")

        , @NamedQuery(name = "Ulpreem.findByKpp", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.kpp = :kpp")
        , @NamedQuery(name = "Ulpreem.findByKppContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.kpp like :kpp")

        , @NamedQuery(name = "Ulpreem.findByRegnumst", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.regnumst = :regnumst")
        , @NamedQuery(name = "Ulpreem.findByRegnumstContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.regnumst like :regnumst")

        , @NamedQuery(name = "Ulpreem.findByDtreg", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.dtreg = :dtreg")

        , @NamedQuery(name = "Ulpreem.findByIdregorg", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idregorg = :idregorg")


        , @NamedQuery(name = "Ulpreem.findByGihdAdate", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ulpreem.findByGihdChdate", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ulpreem.findByGihdDdate", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ulpreem.findByGihdIdUser", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ulpreem.findByGihdAIdPackage", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ulpreem.findByGihdChIdPackage", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ulpreem.findByGihdDIdPackage", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ulpreem.findByRowCheckSum", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ulpreem.findByRowCheckSumContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.rowCheckSum like :rowCheckSum")

})

public class Ulpreem implements Serializable {
    public static final String FIND_ALL = "Ulpreem.findAll";
    public static final String FIND_BY_IDUL = "Ulpreem.findByIdul";
    public static final String FIND_BY_NAMEP = "Ulpreem.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING = "Ulpreem.findByNamepContaining";
    public static final String FIND_BY_OGRN = "Ulpreem.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING = "Ulpreem.findByOgrnContaining";
    public static final String FIND_BY_DTOGRN = "Ulpreem.findByDtogrn";
    public static final String FIND_BY_INN = "Ulpreem.findByInn";
    public static final String FIND_BY_INN_CONTAINING = "Ulpreem.findByInnContaining";
    public static final String FIND_BY_KPP = "Ulpreem.findByKpp";
    public static final String FIND_BY_KPP_CONTAINING = "Ulpreem.findByKppContaining";
    public static final String FIND_BY_REGNUMST = "Ulpreem.findByRegnumst";
    public static final String FIND_BY_REGNUMST_CONTAINING = "Ulpreem.findByRegnumstContaining";
    public static final String FIND_BY_DTREG = "Ulpreem.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Ulpreem.findByIdregorg";
    public static final String FIND_BY_GIHDADATE = "Ulpreem.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulpreem.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulpreem.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulpreem.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulpreem.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulpreem.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulpreem.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulpreem.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ulpreem.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Embedded
    Address fulladdress;
    @SequenceGenerator(name = "ULPREEMSEQ", sequenceName = "SEQ_ULPREEM", allocationSize = 1)
    @Id
    @Column(name = "IDULPREEM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULPREEMSEQ")
    private Integer idulpreem;
    @ManyToOne
    @JoinColumn(name = "IDUL", nullable = true, unique = false)
    private Ul idul;
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
    public Ulpreem() {
    }


    /**
     * All field constructor
     */
    public Ulpreem(
            Integer idulpreem,
            Ul idul,
            String namep,
            String ogrn,
            Date dtogrn,
            String inn,
            String kpp,
            String regnumst,
            Date dtreg,
            Spregorg idregorg,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idulpreem,
                idul,
                namep,
                ogrn,
                dtogrn,
                inn,
                kpp,
                regnumst,
                dtreg,
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


    public Ulpreem(
            Integer idulpreem,
            Ul idul,
            String namep,
            String ogrn,
            Date dtogrn,
            String inn,
            String kpp,
            String regnumst,
            Date dtreg,
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
        setIdulpreem(idulpreem);
        //attributes
        setIdul(idul);
        setNamep(namep);
        setOgrn(ogrn);
        setDtogrn(dtogrn);
        setInn(inn);
        setKpp(kpp);
        setRegnumst(regnumst);
        setDtreg(dtreg);
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

    public Ulpreem flat() {
        return new Ulpreem(
                getIdulpreem(),
                getIdul(),
                getNamep(),
                getOgrn(),
                getDtogrn(),
                getInn(),
                getKpp(),
                getRegnumst(),
                getDtreg(),
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

    public Integer getIdulpreem() {
        return idulpreem;
    }

    public void setIdulpreem(Integer idulpreem) {
        this.idulpreem = idulpreem;
    }


    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
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
