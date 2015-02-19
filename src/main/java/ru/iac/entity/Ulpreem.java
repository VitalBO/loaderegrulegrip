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

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Ulpreem</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulpreem entity</p>
 */
@Entity(name = "Ulpreem")
@Table(name = "\"ULPREEM\"")
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

        , @NamedQuery(name = "Ulpreem.findByOkato", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.okato = :okato")
        , @NamedQuery(name = "Ulpreem.findByOkatoContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.okato like :okato")

        , @NamedQuery(name = "Ulpreem.findByIndeks", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.indeks = :indeks")

        , @NamedQuery(name = "Ulpreem.findByIdregion", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idregion = :idregion")

        , @NamedQuery(name = "Ulpreem.findByIdraion", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idraion = :idraion")

        , @NamedQuery(name = "Ulpreem.findByIdgorod", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idgorod = :idgorod")

        , @NamedQuery(name = "Ulpreem.findByIdnasp", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idnasp = :idnasp")

        , @NamedQuery(name = "Ulpreem.findByIdstreet", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.idstreet = :idstreet")

        , @NamedQuery(name = "Ulpreem.findByDom", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.dom = :dom")
        , @NamedQuery(name = "Ulpreem.findByDomContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.dom like :dom")

        , @NamedQuery(name = "Ulpreem.findByKorp", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.korp = :korp")
        , @NamedQuery(name = "Ulpreem.findByKorpContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.korp like :korp")

        , @NamedQuery(name = "Ulpreem.findByKvart", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.kvart = :kvart")
        , @NamedQuery(name = "Ulpreem.findByKvartContaining", query = "SELECT ulpreem FROM Ulpreem ulpreem WHERE ulpreem.kvart like :kvart")

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
    public static final String FIND_BY_OKATO = "Ulpreem.findByOkato";
    public static final String FIND_BY_OKATO_CONTAINING = "Ulpreem.findByOkatoContaining";
    public static final String FIND_BY_INDEKS = "Ulpreem.findByIndeks";
    public static final String FIND_BY_IDREGION = "Ulpreem.findByIdregion";
    public static final String FIND_BY_IDRAION = "Ulpreem.findByIdraion";
    public static final String FIND_BY_IDGOROD = "Ulpreem.findByIdgorod";
    public static final String FIND_BY_IDNASP = "Ulpreem.findByIdnasp";
    public static final String FIND_BY_IDSTREET = "Ulpreem.findByIdstreet";
    public static final String FIND_BY_DOM = "Ulpreem.findByDom";
    public static final String FIND_BY_DOM_CONTAINING = "Ulpreem.findByDomContaining";
    public static final String FIND_BY_KORP = "Ulpreem.findByKorp";
    public static final String FIND_BY_KORP_CONTAINING = "Ulpreem.findByKorpContaining";
    public static final String FIND_BY_KVART = "Ulpreem.findByKvart";
    public static final String FIND_BY_KVART_CONTAINING = "Ulpreem.findByKvartContaining";
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
    @SequenceGenerator(name = "ULPREEMSEQ", sequenceName = "SEQ_ULPREEM", allocationSize = 1)
    @Id
    @Column(name = "IDULPREEM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULPREEMSEQ")
    private Integer idulpreem;

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name = "IDUL", nullable = true, unique = false)
    private Ul idul;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAMEP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEP@
    @Column(name = "NAMEP", length = 1000, nullable = true, unique = false)
    private String namep;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @OGRN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @OGRN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-OGRN@
    @Column(name = "OGRN", length = 20, nullable = true, unique = false)
    private String ogrn;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTOGRN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTOGRN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTOGRN@
    @Column(name = "DTOGRN", nullable = true, unique = false)
    private Date dtogrn;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @INN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @INN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-INN@
    @Column(name = "INN", length = 20, nullable = true, unique = false)
    private String inn;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @KPP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KPP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KPP@
    @Column(name = "KPP", length = 10, nullable = true, unique = false)
    private String kpp;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @REGNUMST-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @REGNUMST-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-REGNUMST@
    @Column(name = "REGNUMST", length = 255, nullable = true, unique = false)
    private String regnumst;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTREG@
    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDREGORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDREGORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDREGORG@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDREGORG", nullable = true, unique = false)
    private Spregorg idregorg;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @OKATO-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @OKATO-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-OKATO@
    @Column(name = "OKATO", length = 20, nullable = true, unique = false)
    private String okato;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @INDEKS-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @INDEKS-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-INDEKS@
    @Column(name = "INDEKS", nullable = true, unique = false)
    private Integer indeks;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDREGION-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDREGION-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDREGION@
    @Column(name = "IDREGION", nullable = true, unique = false)
    private String idregion;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDRAION-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDRAION-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDRAION@
    @Column(name = "IDRAION", nullable = true, unique = false)
    private String idraion;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDGOROD-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDGOROD-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDGOROD@
    @Column(name = "IDGOROD", nullable = true, unique = false)
    private String idgorod;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDNASP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDNASP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDNASP@
    @Column(name = "IDNASP", nullable = true, unique = false)
    private String idnasp;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDSTREET-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDSTREET-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDSTREET@
    @Column(name = "IDSTREET", nullable = true, unique = false)
    private String idstreet;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DOM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DOM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DOM@
    @Column(name = "DOM", length = 100, nullable = true, unique = false)
    private String dom;
//MP-MANAGED-UPDATABLE-ENDING

    @Column(name = "ADDRESS", nullable = true, unique = false)
    private String address;
    //MP-MANAGED-ADDED-AREA-BEGINNING @KORP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KORP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KORP@
    @Column(name = "KORP", length = 100, nullable = true, unique = false)
    private String korp;
    //MP-MANAGED-ADDED-AREA-BEGINNING @KVART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KVART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KVART@
    @Column(name = "KVART", length = 100, nullable = true, unique = false)
    private String kvart;
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__ADATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__ADATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__ADATE@
    @Column(name = "GIHD__ADATE", nullable = true, unique = false)
    private Date gihdAdate;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__CHDATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__CHDATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__CHDATE@
    @Column(name = "GIHD__CHDATE", nullable = true, unique = false)
    private Date gihdChdate;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__DDATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__DDATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__DDATE@
    @Column(name = "GIHD__DDATE", nullable = true, unique = false)
    private Date gihdDdate;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__ID_USER-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__ID_USER-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__ID_USER@
    @Column(name = "GIHD__ID_USER", nullable = true, unique = false)
    private Integer gihdIdUser;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__A_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__A_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__A_ID_PACKAGE@
    @Column(name = "GIHD__A_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdAIdPackage;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__CH_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__CH_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__CH_ID_PACKAGE@
    @Column(name = "GIHD__CH_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdChIdPackage;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__D_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__D_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__D_ID_PACKAGE@
    @Column(name = "GIHD__D_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdDIdPackage;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ROW_CHECK_SUM@
    @Column(name = "ROW_CHECK_SUM", nullable = true, unique = false)
    private String rowCheckSum;
//MP-MANAGED-UPDATABLE-ENDING

    /**
     * Default constructor
     */
    public Ulpreem() {
    }
//MP-MANAGED-UPDATABLE-ENDING

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
                okato,
                indeks,
                idregion,
                idraion,
                idgorod,
                idnasp,
                idstreet,
                dom,
                korp,
                kvart,
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
//MP-MANAGED-UPDATABLE-ENDING

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
        setOkato(okato);
        setIndeks(indeks);
        setIdregion(idregion);
        setIdraion(idraion);
        setIdgorod(idgorod);
        setIdnasp(idnasp);
        setIdstreet(idstreet);
        setDom(dom);
        setKorp(korp);
        setKvart(kvart);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                getOkato(),
                getIndeks(),
                getIdregion(),
                getIdraion(),
                getIdgorod(),
                getIdnasp(),
                getIdstreet(),
                getDom(),
                getKorp(),
                getKvart(),
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMEP@
    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-OGRN@
    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTOGRN@
    public Date getDtogrn() {
        return dtogrn;
    }

    public void setDtogrn(Date dtogrn) {
        this.dtogrn = dtogrn;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNUMST@
    public String getRegnumst() {
        return regnumst;
    }

    public void setRegnumst(String regnumst) {
        this.regnumst = regnumst;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREG@
    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-OKATO@
    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-INDEKS@
    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDREGION@
    public String getIdregion() {
        return idregion;
    }

    public void setIdregion(String idregion) {
        this.idregion = idregion;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDRAION@
    public String getIdraion() {
        return idraion;
    }

    public void setIdraion(String idraion) {
        this.idraion = idraion;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDGOROD@
    public String getIdgorod() {
        return idgorod;
    }

    public void setIdgorod(String idgorod) {
        this.idgorod = idgorod;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDNASP@
    public String getIdnasp() {
        return idnasp;
    }

    public void setIdnasp(String idnasp) {
        this.idnasp = idnasp;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDSTREET@
    public String getIdstreet() {
        return idstreet;
    }

    public void setIdstreet(String idstreet) {
        this.idstreet = idstreet;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DOM@
    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KORP@
    public String getKorp() {
        return korp;
    }

    public void setKorp(String korp) {
        this.korp = korp;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KVART@
    public String getKvart() {
        return kvart;
    }

    public void setKvart(String kvart) {
        this.kvart = kvart;
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
