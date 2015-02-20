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

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>Title: Ul</p>
 * <p/>
 * <p>Description: Domain Object describing a Ul entity</p>
 */
@Entity(name = "Ul")
@Table(name = "\"UL\"")
@NamedQueries({
        @NamedQuery(name = "Ul.findAll", query = "SELECT ul FROM Ul ul")
        , @NamedQuery(name = "Ul.findByOgrn", query = "SELECT ul FROM Ul ul WHERE ul.ogrn = :ogrn")
        , @NamedQuery(name = "Ul.findByOgrnContaining", query = "SELECT ul FROM Ul ul WHERE ul.ogrn like :ogrn")

        , @NamedQuery(name = "Ul.findByInn", query = "SELECT ul FROM Ul ul WHERE ul.inn = :inn")
        , @NamedQuery(name = "Ul.findByInnContaining", query = "SELECT ul FROM Ul ul WHERE ul.inn like :inn")

        , @NamedQuery(name = "Ul.findByKpp", query = "SELECT ul FROM Ul ul WHERE ul.kpp = :kpp")
        , @NamedQuery(name = "Ul.findByKppContaining", query = "SELECT ul FROM Ul ul WHERE ul.kpp like :kpp")

        , @NamedQuery(name = "Ul.findByIdstatus", query = "SELECT ul FROM Ul ul WHERE ul.idstatus = :idstatus")

        , @NamedQuery(name = "Ul.findByIdregorg", query = "SELECT ul FROM Ul ul WHERE ul.idregorg = :idregorg")

        , @NamedQuery(name = "Ul.findByIdvidregstart", query = "SELECT ul FROM Ul ul WHERE ul.idvidregstart = :idvidregstart")

        , @NamedQuery(name = "Ul.findByRegnumstart", query = "SELECT ul FROM Ul ul WHERE ul.regnumstart = :regnumstart")
        , @NamedQuery(name = "Ul.findByRegnumstartContaining", query = "SELECT ul FROM Ul ul WHERE ul.regnumstart like :regnumstart")

        , @NamedQuery(name = "Ul.findByDtregstart", query = "SELECT ul FROM Ul ul WHERE ul.dtregstart = :dtregstart")

        , @NamedQuery(name = "Ul.findByIdregorgstart", query = "SELECT ul FROM Ul ul WHERE ul.idregorgstart = :idregorgstart")

        , @NamedQuery(name = "Ul.findByIdvidregend", query = "SELECT ul FROM Ul ul WHERE ul.idvidregend = :idvidregend")

        , @NamedQuery(name = "Ul.findByRegnumend", query = "SELECT ul FROM Ul ul WHERE ul.regnumend = :regnumend")
        , @NamedQuery(name = "Ul.findByRegnumendContaining", query = "SELECT ul FROM Ul ul WHERE ul.regnumend like :regnumend")

        , @NamedQuery(name = "Ul.findByDtregend", query = "SELECT ul FROM Ul ul WHERE ul.dtregend = :dtregend")

        , @NamedQuery(name = "Ul.findByIdregorgend", query = "SELECT ul FROM Ul ul WHERE ul.idregorgend = :idregorgend")

        , @NamedQuery(name = "Ul.findByIdRaion", query = "SELECT ul FROM Ul ul WHERE ul.idRaion = :idRaion")

        , @NamedQuery(name = "Ul.findByGihdAdate", query = "SELECT ul FROM Ul ul WHERE ul.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ul.findByGihdChdate", query = "SELECT ul FROM Ul ul WHERE ul.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ul.findByGihdDdate", query = "SELECT ul FROM Ul ul WHERE ul.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ul.findByGihdIdUser", query = "SELECT ul FROM Ul ul WHERE ul.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ul.findByGihdAIdPackage", query = "SELECT ul FROM Ul ul WHERE ul.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ul.findByGihdChIdPackage", query = "SELECT ul FROM Ul ul WHERE ul.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ul.findByGihdDIdPackage", query = "SELECT ul FROM Ul ul WHERE ul.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ul.findByRowCheckSum", query = "SELECT ul FROM Ul ul WHERE ul.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ul.findByRowCheckSumContaining", query = "SELECT ul FROM Ul ul WHERE ul.rowCheckSum like :rowCheckSum")

})

public class Ul implements Serializable {
    public static final String FIND_ALL = "Ul.findAll";
    public static final String FIND_BY_OGRN = "Ul.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING = "Ul.findByOgrnContaining";
    public static final String FIND_BY_INN = "Ul.findByInn";
    public static final String FIND_BY_INN_CONTAINING = "Ul.findByInnContaining";
    public static final String FIND_BY_KPP = "Ul.findByKpp";
    public static final String FIND_BY_KPP_CONTAINING = "Ul.findByKppContaining";
    public static final String FIND_BY_IDSTATUS = "Ul.findByIdstatus";
    public static final String FIND_BY_IDREGORG = "Ul.findByIdregorg";
    public static final String FIND_BY_IDVIDREGSTART = "Ul.findByIdvidregstart";
    public static final String FIND_BY_REGNUMSTART = "Ul.findByRegnumstart";
    public static final String FIND_BY_REGNUMSTART_CONTAINING = "Ul.findByRegnumstartContaining";
    public static final String FIND_BY_DTREGSTART = "Ul.findByDtregstart";
    public static final String FIND_BY_IDREGORGSTART = "Ul.findByIdregorgstart";
    public static final String FIND_BY_IDVIDREGEND = "Ul.findByIdvidregend";
    public static final String FIND_BY_REGNUMEND = "Ul.findByRegnumend";
    public static final String FIND_BY_REGNUMEND_CONTAINING = "Ul.findByRegnumendContaining";
    public static final String FIND_BY_DTREGEND = "Ul.findByDtregend";
    public static final String FIND_BY_IDREGORGEND = "Ul.findByIdregorgend";
    public static final String FIND_BY_IDRAION = "Ul.findByIdRaion";
    public static final String FIND_BY_GIHDADATE = "Ul.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ul.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ul.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ul.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ul.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ul.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ul.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ul.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ul.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDUL")
    private String idul;

    @Column(name = "OGRN", length = 20, nullable = true, unique = true)
    private String ogrn;

    @Column(name = "INN", length = 20, nullable = true, unique = true)
    private String inn;

    @Column(name = "KPP", length = 10, nullable = true, unique = false)
    private String kpp;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDSTATUS")
    private Spulstat idstatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDREGORG")
    private Spregorg idregorg;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDVIDREGSTART")
    private Spvidreg idvidregstart;

    @Column(name = "REGNUMSTART", length = 255, nullable = true, unique = false)
    private String regnumstart;

    @Column(name = "DTREGSTART", nullable = true, unique = true)
    private Date dtregstart;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDREGORGSTART")
    private Spregorg idregorgstart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDVIDREGEND", nullable = true, unique = false)
    private Spvidreg idvidregend;

    @Column(name = "REGNUMEND", length = 40, nullable = true, unique = false)
    private String regnumend;

    @Column(name = "DTREGEND", nullable = true, unique = false)
    private Date dtregend;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDREGORGEND", nullable = true, unique = false)
    private Spregorg idregorgend;

    @Column(name = "ID_RAION", nullable = true, unique = true)
    private Integer idRaion;

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
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Ulokved> ulokved;

    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulname ulname;

    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Uladr uladr;
    
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulcapital ulcapital;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Rul> ruls;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Iul> iuls;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Fluchr> fluchrs;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Fldolgn> fldolgns;
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulupr ulupr;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Ulpredsh> ulpredshs;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL)
    private List<Ulpreem> ulpreems;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Licenz> licenzs;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ulob> ulobs;
    @OneToMany(mappedBy = "idul", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gosreg> gosregs;
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulmns ulmns;
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulfss ulfss;
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulpf ulpf;
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Ulfoms ulfoms;
    @OneToOne(mappedBy = "idul", cascade = CascadeType.ALL)
    private Reestrao reestrao;

    /**
     * Default constructor
     */
    public Ul() {
    }

    /**
     * All field constructor
     */
    public Ul(
            String idul,
            String ogrn,
            String inn,
            String kpp,
            Spulstat idstatus,
            Spregorg idregorg,
            Spvidreg idvidregstart,
            String regnumstart,
            Date dtregstart,
            Spregorg idregorgstart,
            Spvidreg idvidregend,
            String regnumend,
            Date dtregend,
            Spregorg idregorgend,
            Integer idRaion,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idul,
                ogrn,
                inn,
                kpp,
                idstatus,
                idregorg,
                idvidregstart,
                regnumstart,
                dtregstart,
                idregorgstart,
                idvidregend,
                regnumend,
                dtregend,
                idregorgend,
                idRaion,
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

    public Ul(
            String idul,
            String ogrn,
            String inn,
            String kpp,
            Spulstat idstatus,
            Spregorg idregorg,
            Spvidreg idvidregstart,
            String regnumstart,
            Date dtregstart,
            Spregorg idregorgstart,
            Spvidreg idvidregend,
            String regnumend,
            Date dtregend,
            Spregorg idregorgend,
            Integer idRaion,
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
        setIdul(idul);
        //attributes
        setOgrn(ogrn);
        setInn(inn);
        setKpp(kpp);
        setIdstatus(idstatus);
        setIdregorg(idregorg);
        setIdvidregstart(idvidregstart);
        setRegnumstart(regnumstart);
        setDtregstart(dtregstart);
        setIdregorgstart(idregorgstart);
        setIdvidregend(idvidregend);
        setRegnumend(regnumend);
        setDtregend(dtregend);
        setIdregorgend(idregorgend);
        setIdRaion(idRaion);
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

    public Reestrao getReestrao() {
        return reestrao;
    }

    public void setReestrao(Reestrao reestrao) {
        this.reestrao = reestrao;
    }

    public Ulfoms getUlfoms() {
        return ulfoms;
    }

    public void setUlfoms(Ulfoms ulfoms) {
        this.ulfoms = ulfoms;
    }

    public Ulpf getUlpf() {
        return ulpf;
    }

    public void setUlpf(Ulpf ulpf) {
        this.ulpf = ulpf;
    }

    public Ulfss getUlfss() {
        return ulfss;
    }

    public void setUlfss(Ulfss ulfss) {
        this.ulfss = ulfss;
    }

    public Ulmns getUlmns() {
        return ulmns;
    }

    public void setUlmns(Ulmns ulmns) {
        this.ulmns = ulmns;
    }

    public List<Gosreg> getGosregs() {
        return gosregs;
    }

    public void setGosregs(List<Gosreg> gosregs) {
        this.gosregs = gosregs;
    }

    public List<Ulob> getUlobs() {
        return ulobs;
    }

    public void setUlobs(List<Ulob> ulobs) {
        this.ulobs = ulobs;
    }

    public List<Licenz> getLicenzs() {
        return licenzs;
    }

    public void setLicenzs(List<Licenz> licenzs) {
        this.licenzs = licenzs;
    }

    public List<Ulpreem> getUlpreems() {
        return ulpreems;
    }

    public void setUlpreems(List<Ulpreem> ulpreems) {
        this.ulpreems = ulpreems;
    }

    public List<Ulpredsh> getUlpredshs() {
        return ulpredshs;
    }

    public void setUlpredshs(List<Ulpredsh> ulpredshs) {
        this.ulpredshs = ulpredshs;
    }

    public Ulupr getUlupr() {
        return ulupr;
    }

    public void setUlupr(Ulupr ulupr) {
        this.ulupr = ulupr;
    }

    public List<Fldolgn> getFldolgns() {
        return fldolgns;
    }

    public void setFldolgns(List<Fldolgn> fldolgns) {
        this.fldolgns = fldolgns;
    }

    public List<Fluchr> getFluchrs() {
        return fluchrs;
    }

    public void setFluchrs(List<Fluchr> fluchrs) {
        this.fluchrs = fluchrs;
    }

    public List<Iul> getIuls() {
        return iuls;
    }

    public void setIuls(List<Iul> iuls) {
        this.iuls = iuls;
    }

    public List<Rul> getRuls() {
        return ruls;
    }

    public void setRuls(List<Rul> ruls) {
        this.ruls = ruls;
    }

    public Ulcapital getUlcapital() {
        return ulcapital;
    }

    public void setUlcapital(Ulcapital ulcapital) {
        this.ulcapital = ulcapital;
    }

    public Uladr getUladr() {
        return uladr;
    }

    public void setUladr(Uladr uladr) {
        this.uladr = uladr;
    }

    public Ulname getUlname() {
        return ulname;
    }

    public void setUlname(Ulname ulname) {
        this.ulname = ulname;
    }

    public List<Ulokved> getUlokved() {
        return ulokved;
    }

    public void setUlokved(List<Ulokved> ulokved) {
        this.ulokved = ulokved;
    }

    public Ul flat() {
        return new Ul(
                getIdul(),
                getOgrn(),
                getInn(),
                getKpp(),
                getIdstatus(),
                getIdregorg(),
                getIdvidregstart(),
                getRegnumstart(),
                getDtregstart(),
                getIdregorgstart(),
                getIdvidregend(),
                getRegnumend(),
                getDtregend(),
                getIdregorgend(),
                getIdRaion(),
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

    public String getIdul() {
        return idul;
    }

    public void setIdul(String idul) {
        this.idul = idul;
    }

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-OGRN@
    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-INN@
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KPP@
    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDSTATUS@
    public Spulstat getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Spulstat idstatus) {
        this.idstatus = idstatus;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDREGORG@
    public Spregorg getIdregorg() {
        return idregorg;
    }

    public void setIdregorg(Spregorg idregorg) {
        this.idregorg = idregorg;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDREGSTART@
    public Spvidreg getIdvidregstart() {
        return idvidregstart;
    }

    public void setIdvidregstart(Spvidreg idvidregstart) {
        this.idvidregstart = idvidregstart;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNUMSTART@
    public String getRegnumstart() {
        return regnumstart;
    }

    public void setRegnumstart(String regnumstart) {
        this.regnumstart = regnumstart;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREGSTART@
    public Date getDtregstart() {
        return dtregstart;
    }

    public void setDtregstart(Date dtregstart) {
        this.dtregstart = dtregstart;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDREGORGSTART@
    public Spregorg getIdregorgstart() {
        return idregorgstart;
    }

    public void setIdregorgstart(Spregorg idregorgstart) {
        this.idregorgstart = idregorgstart;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDREGEND@
    public Spvidreg getIdvidregend() {
        return idvidregend;
    }

    public void setIdvidregend(Spvidreg idvidregend) {
        this.idvidregend = idvidregend;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNUMEND@
    public String getRegnumend() {
        return regnumend;
    }

    public void setRegnumend(String regnumend) {
        this.regnumend = regnumend;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREGEND@
    public Date getDtregend() {
        return dtregend;
    }

    public void setDtregend(Date dtregend) {
        this.dtregend = dtregend;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDREGORGEND@
    public Spregorg getIdregorgend() {
        return idregorgend;
    }

    public void setIdregorgend(Spregorg idregorgend) {
        this.idregorgend = idregorgend;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-ID_RAION@
    public Integer getIdRaion() {
        return idRaion;
    }

    public void setIdRaion(Integer idRaion) {
        this.idRaion = idRaion;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__ADATE@
    public Date getGihdAdate() {
        return gihdAdate;
    }

    public void setGihdAdate(Date gihdAdate) {
        this.gihdAdate = gihdAdate;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__CHDATE@
    public Date getGihdChdate() {
        return gihdChdate;
    }

    public void setGihdChdate(Date gihdChdate) {
        this.gihdChdate = gihdChdate;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__DDATE@
    public Date getGihdDdate() {
        return gihdDdate;
    }

    public void setGihdDdate(Date gihdDdate) {
        this.gihdDdate = gihdDdate;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__ID_USER@
    public Integer getGihdIdUser() {
        return gihdIdUser;
    }

    public void setGihdIdUser(Integer gihdIdUser) {
        this.gihdIdUser = gihdIdUser;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__A_ID_PACKAGE@
    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }

    public void setGihdAIdPackage(Integer gihdAIdPackage) {
        this.gihdAIdPackage = gihdAIdPackage;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__CH_ID_PACKAGE@
    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }

    public void setGihdChIdPackage(Integer gihdChIdPackage) {
        this.gihdChIdPackage = gihdChIdPackage;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__D_ID_PACKAGE@
    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }

    public void setGihdDIdPackage(Integer gihdDIdPackage) {
        this.gihdDIdPackage = gihdDIdPackage;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-ROW_CHECK_SUM@
    public String getRowCheckSum() {
        return rowCheckSum;
    }

    public void setRowCheckSum(String rowCheckSum) {
        this.rowCheckSum = rowCheckSum;
    }

//MP-MANAGED-UPDATABLE-ENDING


//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}