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

        , @NamedQuery(name = "Rul.findByOkato", query = "SELECT rul FROM Rul rul WHERE rul.okato = :okato")
        , @NamedQuery(name = "Rul.findByOkatoContaining", query = "SELECT rul FROM Rul rul WHERE rul.okato like :okato")

        , @NamedQuery(name = "Rul.findByIndeks", query = "SELECT rul FROM Rul rul WHERE rul.indeks = :indeks")

        , @NamedQuery(name = "Rul.findByIdregion", query = "SELECT rul FROM Rul rul WHERE rul.idregion = :idregion")

        , @NamedQuery(name = "Rul.findByIdraion", query = "SELECT rul FROM Rul rul WHERE rul.idraion = :idraion")

        , @NamedQuery(name = "Rul.findByIdgorod", query = "SELECT rul FROM Rul rul WHERE rul.idgorod = :idgorod")

        , @NamedQuery(name = "Rul.findByIdnasp", query = "SELECT rul FROM Rul rul WHERE rul.idnasp = :idnasp")

        , @NamedQuery(name = "Rul.findByIdstreet", query = "SELECT rul FROM Rul rul WHERE rul.idstreet = :idstreet")

        , @NamedQuery(name = "Rul.findByDom", query = "SELECT rul FROM Rul rul WHERE rul.dom = :dom")
        , @NamedQuery(name = "Rul.findByDomContaining", query = "SELECT rul FROM Rul rul WHERE rul.dom like :dom")

        , @NamedQuery(name = "Rul.findByKorp", query = "SELECT rul FROM Rul rul WHERE rul.korp = :korp")
        , @NamedQuery(name = "Rul.findByKorpContaining", query = "SELECT rul FROM Rul rul WHERE rul.korp like :korp")

        , @NamedQuery(name = "Rul.findByKvart", query = "SELECT rul FROM Rul rul WHERE rul.kvart = :kvart")
        , @NamedQuery(name = "Rul.findByKvartContaining", query = "SELECT rul FROM Rul rul WHERE rul.kvart like :kvart")

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
    public static final String FIND_BY_OKATO = "Rul.findByOkato";
    public static final String FIND_BY_OKATO_CONTAINING = "Rul.findByOkatoContaining";
    public static final String FIND_BY_INDEKS = "Rul.findByIndeks";
    public static final String FIND_BY_IDREGION = "Rul.findByIdregion";
    public static final String FIND_BY_IDRAION = "Rul.findByIdraion";
    public static final String FIND_BY_IDGOROD = "Rul.findByIdgorod";
    public static final String FIND_BY_IDNASP = "Rul.findByIdnasp";
    public static final String FIND_BY_IDSTREET = "Rul.findByIdstreet";
    public static final String FIND_BY_DOM = "Rul.findByDom";
    public static final String FIND_BY_DOM_CONTAINING = "Rul.findByDomContaining";
    public static final String FIND_BY_KORP = "Rul.findByKorp";
    public static final String FIND_BY_KORP_CONTAINING = "Rul.findByKorpContaining";
    public static final String FIND_BY_KVART = "Rul.findByKvart";
    public static final String FIND_BY_KVART_CONTAINING = "Rul.findByKvartContaining";
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
    @SequenceGenerator(name = "RULSEQ", sequenceName = "SEQ_RUL", allocationSize = 1)
    @Id
    @Column(name = "IDRUL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RULSEQ")
    private Integer idrul;

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name = "IDUL", nullable = true, unique = true)
    private Ul idul;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;
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

    //MP-MANAGED-ADDED-AREA-BEGINNING @SUMMA-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @SUMMA-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-SUMMA@
    @Column(name = "SUMMA", nullable = true, unique = false)
    private BigDecimal summa;
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

    //MP-MANAGED-ADDED-AREA-BEGINNING @KORP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KORP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KORP@
    @Column(name = "KORP", length = 100, nullable = true, unique = false)
    private String korp;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @KVART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KVART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KVART@
    @Column(name = "KVART", length = 100, nullable = true, unique = false)
    private String kvart;
//MP-MANAGED-UPDATABLE-ENDING

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
    @Column(name = "ADDRESS", nullable = true, unique = false)
    private String address;

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

    public Integer getIdrul() {
        return idrul;
    }

    public void setIdrul(Integer idrul) {
        this.idrul = idrul;
    }

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTSTART@
    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SUMMA@
    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
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
