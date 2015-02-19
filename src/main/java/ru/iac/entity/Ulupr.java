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

        , @NamedQuery(name = "Ulupr.findByOkato", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.okato = :okato")
        , @NamedQuery(name = "Ulupr.findByOkatoContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.okato like :okato")

        , @NamedQuery(name = "Ulupr.findByIndeks", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.indeks = :indeks")

        , @NamedQuery(name = "Ulupr.findByIdregion", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.idregion = :idregion")

        , @NamedQuery(name = "Ulupr.findByIdraion", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.idraion = :idraion")

        , @NamedQuery(name = "Ulupr.findByIdgorod", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.idgorod = :idgorod")

        , @NamedQuery(name = "Ulupr.findByIdnasp", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.idnasp = :idnasp")

        , @NamedQuery(name = "Ulupr.findByIdstreet", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.idstreet = :idstreet")

        , @NamedQuery(name = "Ulupr.findByDom", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.dom = :dom")
        , @NamedQuery(name = "Ulupr.findByDomContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.dom like :dom")

        , @NamedQuery(name = "Ulupr.findByKorp", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.korp = :korp")
        , @NamedQuery(name = "Ulupr.findByKorpContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.korp like :korp")

        , @NamedQuery(name = "Ulupr.findByKvart", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.kvart = :kvart")
        , @NamedQuery(name = "Ulupr.findByKvartContaining", query = "SELECT ulupr FROM Ulupr ulupr WHERE ulupr.kvart like :kvart")

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
    public static final String FIND_BY_OKATO = "Ulupr.findByOkato";
    public static final String FIND_BY_OKATO_CONTAINING = "Ulupr.findByOkatoContaining";
    public static final String FIND_BY_INDEKS = "Ulupr.findByIndeks";
    public static final String FIND_BY_IDREGION = "Ulupr.findByIdregion";
    public static final String FIND_BY_IDRAION = "Ulupr.findByIdraion";
    public static final String FIND_BY_IDGOROD = "Ulupr.findByIdgorod";
    public static final String FIND_BY_IDNASP = "Ulupr.findByIdnasp";
    public static final String FIND_BY_IDSTREET = "Ulupr.findByIdstreet";
    public static final String FIND_BY_DOM = "Ulupr.findByDom";
    public static final String FIND_BY_DOM_CONTAINING = "Ulupr.findByDomContaining";
    public static final String FIND_BY_KORP = "Ulupr.findByKorp";
    public static final String FIND_BY_KORP_CONTAINING = "Ulupr.findByKorpContaining";
    public static final String FIND_BY_KVART = "Ulupr.findByKvart";
    public static final String FIND_BY_KVART_CONTAINING = "Ulupr.findByKvartContaining";
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
    @SequenceGenerator(name = "ULUPRSEQ", sequenceName = "SEQ_ULUPR", allocationSize = 1)
    @Id
    @Column(name = "IDULUPR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULUPRSEQ")
    private Integer idulupr;

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @OneToOne
    @JoinColumn(name = "IDUL")
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

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTREG@
    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;
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
    //MP-MANAGED-ADDED-AREA-BEGINNING @KODGOROD-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KODGOROD-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KODGOROD@
    @Column(name = "KODGOROD", length = 5, nullable = true, unique = false)
    private String kodgorod;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @TELEFON-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @TELEFON-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-TELEFON@
    @Column(name = "TELEFON", length = 20, nullable = true, unique = false)
    private String telefon;
//MP-MANAGED-UPDATABLE-ENDING
    //MP-MANAGED-ADDED-AREA-BEGINNING @FAX-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @FAX-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-FAX@
    @Column(name = "FAX", length = 20, nullable = true, unique = false)
    private String fax;
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

    /**
     * Default constructor
     */
    public Ulupr() {
    }
//MP-MANAGED-UPDATABLE-ENDING

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
//MP-MANAGED-UPDATABLE-ENDING

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREG@
    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KODGOROD@
    public String getKodgorod() {
        return kodgorod;
    }

    public void setKodgorod(String kodgorod) {
        this.kodgorod = kodgorod;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-TELEFON@
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-FAX@
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
