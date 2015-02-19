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
 * <p>Title: Ulpredsh</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulpredsh entity</p>
 */
@Entity(name = "Ulpredsh")
@Table(name = "\"ULPREDSH\"")
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

        , @NamedQuery(name = "Ulpredsh.findByOkato", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.okato = :okato")
        , @NamedQuery(name = "Ulpredsh.findByOkatoContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.okato like :okato")

        , @NamedQuery(name = "Ulpredsh.findByIndeks", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.indeks = :indeks")

        , @NamedQuery(name = "Ulpredsh.findByIdregion", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idregion = :idregion")

        , @NamedQuery(name = "Ulpredsh.findByIdraion", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idraion = :idraion")

        , @NamedQuery(name = "Ulpredsh.findByIdgorod", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idgorod = :idgorod")

        , @NamedQuery(name = "Ulpredsh.findByIdnasp", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idnasp = :idnasp")

        , @NamedQuery(name = "Ulpredsh.findByIdstreet", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.idstreet = :idstreet")

        , @NamedQuery(name = "Ulpredsh.findByDom", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.dom = :dom")
        , @NamedQuery(name = "Ulpredsh.findByDomContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.dom like :dom")

        , @NamedQuery(name = "Ulpredsh.findByKorp", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.korp = :korp")
        , @NamedQuery(name = "Ulpredsh.findByKorpContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.korp like :korp")

        , @NamedQuery(name = "Ulpredsh.findByKvart", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.kvart = :kvart")
        , @NamedQuery(name = "Ulpredsh.findByKvartContaining", query = "SELECT ulpredsh FROM Ulpredsh ulpredsh WHERE ulpredsh.kvart like :kvart")

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
    public static final String FIND_BY_OKATO = "Ulpredsh.findByOkato";
    public static final String FIND_BY_OKATO_CONTAINING = "Ulpredsh.findByOkatoContaining";
    public static final String FIND_BY_INDEKS = "Ulpredsh.findByIndeks";
    public static final String FIND_BY_IDREGION = "Ulpredsh.findByIdregion";
    public static final String FIND_BY_IDRAION = "Ulpredsh.findByIdraion";
    public static final String FIND_BY_IDGOROD = "Ulpredsh.findByIdgorod";
    public static final String FIND_BY_IDNASP = "Ulpredsh.findByIdnasp";
    public static final String FIND_BY_IDSTREET = "Ulpredsh.findByIdstreet";
    public static final String FIND_BY_DOM = "Ulpredsh.findByDom";
    public static final String FIND_BY_DOM_CONTAINING = "Ulpredsh.findByDomContaining";
    public static final String FIND_BY_KORP = "Ulpredsh.findByKorp";
    public static final String FIND_BY_KORP_CONTAINING = "Ulpredsh.findByKorpContaining";
    public static final String FIND_BY_KVART = "Ulpredsh.findByKvart";
    public static final String FIND_BY_KVART_CONTAINING = "Ulpredsh.findByKvartContaining";
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
    @SequenceGenerator(name = "ULPREDSHSEQ", sequenceName = "SEQ_ULPREDSH", allocationSize = 1)
    @Id
    @Column(name = "IDULPREDSH")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULPREDSHSEQ")
    private Integer idulpredsh;

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
    public Ulpredsh() {
    }
//MP-MANAGED-UPDATABLE-ENDING

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

    public Integer getIdulpredsh() {
        return idulpredsh;
    }

    public void setIdulpredsh(Integer idulpredsh) {
        this.idulpredsh = idulpredsh;
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
