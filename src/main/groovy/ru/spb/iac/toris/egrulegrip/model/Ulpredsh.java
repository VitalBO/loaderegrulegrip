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
 * <p>Title: Ulpredsh</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulpredsh entity</p>
 */
@Entity(name = "Ulpredsh")
@Table(name = "ULPREDSH")
@NamedQueries({
        @NamedQuery(name = "Ulpredsh.findAll", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh")
        , @NamedQuery(name = "Ulpredsh.findByIdul", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idul = :idul")

        , @NamedQuery(name = "Ulpredsh.findByNamep", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.namep = :namep")
        , @NamedQuery(name = "Ulpredsh.findByNamepContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.namep like :namep")

        , @NamedQuery(name = "Ulpredsh.findByOgrn", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.ogrn = :ogrn")
        , @NamedQuery(name = "Ulpredsh.findByOgrnContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.ogrn like :ogrn")

        , @NamedQuery(name = "Ulpredsh.findByDtogrn", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.dtogrn = :dtogrn")

        , @NamedQuery(name = "Ulpredsh.findByInn", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.inn = :inn")
        , @NamedQuery(name = "Ulpredsh.findByInnContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.inn like :inn")

        , @NamedQuery(name = "Ulpredsh.findByKpp", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.kpp = :kpp")
        , @NamedQuery(name = "Ulpredsh.findByKppContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.kpp like :kpp")

        , @NamedQuery(name = "Ulpredsh.findByRegnumst", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.regnumst = :regnumst")
        , @NamedQuery(name = "Ulpredsh.findByRegnumstContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.regnumst like :regnumst")

        , @NamedQuery(name = "Ulpredsh.findByDtreg", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.dtreg = :dtreg")

        , @NamedQuery(name = "Ulpredsh.findByIdregorg", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idregorg = :idregorg")


        , @NamedQuery(name = "Ulpredsh.findByGihdAdate", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ulpredsh.findByGihdChdate", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ulpredsh.findByGihdDdate", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ulpredsh.findByGihdIdUser", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ulpredsh.findByGihdAIdPackage", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ulpredsh.findByGihdChIdPackage", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ulpredsh.findByGihdDIdPackage", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ulpredsh.findByRowCheckSum", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ulpredsh.findByRowCheckSumContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.rowCheckSum like :rowCheckSum")

})

public class Ulpredsh implements Serializable {
    public static final String FIND_ALL = "Ulpredsh.findAll";
    public static final String FIND_BY_IDUL = "Ulpredsh.findByIdul";
    public static final String FIND_BY_NAMEP = "Ulpredsh.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING = "Ulpredsh.findByNamepContaining";
    public static final String FIND_BY_OGRN = "Ulpredsh.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING = "Ulpredsh.findByOgrnContaining";
    public static final String FIND_BY_DTOGRN = "Ulpredsh.findByDtogrn";
    public static final String FIND_BY_INN = "Ulpredsh.findByInn";
    public static final String FIND_BY_INN_CONTAINING = "Ulpredsh.findByInnContaining";
    public static final String FIND_BY_KPP = "Ulpredsh.findByKpp";
    public static final String FIND_BY_KPP_CONTAINING = "Ulpredsh.findByKppContaining";
    public static final String FIND_BY_REGNUMST = "Ulpredsh.findByRegnumst";
    public static final String FIND_BY_REGNUMST_CONTAINING = "Ulpredsh.findByRegnumstContaining";
    public static final String FIND_BY_DTREG = "Ulpredsh.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Ulpredsh.findByIdregorg";

    public static final String FIND_BY_GIHDADATE = "Ulpredsh.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulpredsh.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulpredsh.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulpredsh.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulpredsh.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulpredsh.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulpredsh.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulpredsh.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ulpredsh.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Embedded
    Address fulladdress;
    @SequenceGenerator(name = "ULPREDSHSEQ", sequenceName = "SEQ_ULPREDSH", allocationSize = 1)
    @Id
    @Column(name = "IDULPREDSH")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULPREDSHSEQ")
    private Integer idulpredsh;
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
    public Ulpredsh() {
    }


    /**
     * All field constructor
     */
    public Ulpredsh(
            Integer idulpredsh,
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
                idulpredsh,
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


    public Ulpredsh(
            Integer idulpredsh,
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
        setIdulpredsh(idulpredsh);
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

    public Ulpredsh flat() {
        return new Ulpredsh(
                getIdulpredsh(),
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

    public Integer getIdulpredsh() {
        return idulpredsh;
    }

    public void setIdulpredsh(Integer idulpredsh) {
        this.idulpredsh = idulpredsh;
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
