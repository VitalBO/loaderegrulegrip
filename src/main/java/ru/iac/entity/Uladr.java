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

/**
 * <p>Title: Uladr</p>
 * <p/>
 * <p>Description: Domain Object describing a Uladr entity</p>
 */
@Entity(name = "Uladr")
@Table(name = "\"ULADR\"")
@NamedQueries({
        @NamedQuery(name = "Uladr.findAll", query = "SELECT uladr FROM Uladr uladr")
        , @NamedQuery(name = "Uladr.findByIdul", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idul = :idul")

        , @NamedQuery(name = "Uladr.findByDtstart", query = "SELECT uladr FROM Uladr uladr WHERE uladr.dtstart = :dtstart")

        , @NamedQuery(name = "Uladr.findByIdvidadr", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idvidadr = :idvidadr")

        , @NamedQuery(name = "Uladr.findByOkato", query = "SELECT uladr FROM Uladr uladr WHERE uladr.okato = :okato")
        , @NamedQuery(name = "Uladr.findByOkatoContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.okato like :okato")

        , @NamedQuery(name = "Uladr.findByIndeks", query = "SELECT uladr FROM Uladr uladr WHERE uladr.indeks = :indeks")
        , @NamedQuery(name = "Uladr.findByIndeksContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.indeks like :indeks")

        , @NamedQuery(name = "Uladr.findByIdregion", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idregion = :idregion")

        , @NamedQuery(name = "Uladr.findByIdraion", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idraion = :idraion")

        , @NamedQuery(name = "Uladr.findByIdgorod", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idgorod = :idgorod")

        , @NamedQuery(name = "Uladr.findByIdnasp", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idnasp = :idnasp")

        , @NamedQuery(name = "Uladr.findByIdstreet", query = "SELECT uladr FROM Uladr uladr WHERE uladr.idstreet = :idstreet")

        , @NamedQuery(name = "Uladr.findByDom", query = "SELECT uladr FROM Uladr uladr WHERE uladr.dom = :dom")
        , @NamedQuery(name = "Uladr.findByDomContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.dom like :dom")

        , @NamedQuery(name = "Uladr.findByKorp", query = "SELECT uladr FROM Uladr uladr WHERE uladr.korp = :korp")
        , @NamedQuery(name = "Uladr.findByKorpContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.korp like :korp")

        , @NamedQuery(name = "Uladr.findByKvart", query = "SELECT uladr FROM Uladr uladr WHERE uladr.kvart = :kvart")
        , @NamedQuery(name = "Uladr.findByKvartContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.kvart like :kvart")

        , @NamedQuery(name = "Uladr.findByKodgorod", query = "SELECT uladr FROM Uladr uladr WHERE uladr.kodgorod = :kodgorod")
        , @NamedQuery(name = "Uladr.findByKodgorodContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.kodgorod like :kodgorod")

        , @NamedQuery(name = "Uladr.findByTelefon", query = "SELECT uladr FROM Uladr uladr WHERE uladr.telefon = :telefon")
        , @NamedQuery(name = "Uladr.findByTelefonContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.telefon like :telefon")

        , @NamedQuery(name = "Uladr.findByFax", query = "SELECT uladr FROM Uladr uladr WHERE uladr.fax = :fax")
        , @NamedQuery(name = "Uladr.findByFaxContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.fax like :fax")

        , @NamedQuery(name = "Uladr.findByNameisporg", query = "SELECT uladr FROM Uladr uladr WHERE uladr.nameisporg = :nameisporg")
        , @NamedQuery(name = "Uladr.findByNameisporgContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.nameisporg like :nameisporg")

        , @NamedQuery(name = "Uladr.findByGihdAdate", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Uladr.findByGihdChdate", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Uladr.findByGihdDdate", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Uladr.findByGihdIdUser", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Uladr.findByGihdAIdPackage", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Uladr.findByGihdChIdPackage", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Uladr.findByGihdDIdPackage", query = "SELECT uladr FROM Uladr uladr WHERE uladr.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Uladr.findByRowCheckSum", query = "SELECT uladr FROM Uladr uladr WHERE uladr.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Uladr.findByRowCheckSumContaining", query = "SELECT uladr FROM Uladr uladr WHERE uladr.rowCheckSum like :rowCheckSum")

})

public class Uladr implements Serializable {
    public static final String FIND_ALL = "Uladr.findAll";
    public static final String FIND_BY_IDUL = "Uladr.findByIdul";
    public static final String FIND_BY_DTSTART = "Uladr.findByDtstart";
    public static final String FIND_BY_IDVIDADR = "Uladr.findByIdvidadr";
    public static final String FIND_BY_OKATO = "Uladr.findByOkato";
    public static final String FIND_BY_OKATO_CONTAINING = "Uladr.findByOkatoContaining";
    public static final String FIND_BY_INDEKS = "Uladr.findByIndeks";
    public static final String FIND_BY_INDEKS_CONTAINING = "Uladr.findByIndeksContaining";
    public static final String FIND_BY_IDREGION = "Uladr.findByIdregion";
    public static final String FIND_BY_IDRAION = "Uladr.findByIdraion";
    public static final String FIND_BY_IDGOROD = "Uladr.findByIdgorod";
    public static final String FIND_BY_IDNASP = "Uladr.findByIdnasp";
    public static final String FIND_BY_IDSTREET = "Uladr.findByIdstreet";
    public static final String FIND_BY_DOM = "Uladr.findByDom";
    public static final String FIND_BY_DOM_CONTAINING = "Uladr.findByDomContaining";
    public static final String FIND_BY_KORP = "Uladr.findByKorp";
    public static final String FIND_BY_KORP_CONTAINING = "Uladr.findByKorpContaining";
    public static final String FIND_BY_KVART = "Uladr.findByKvart";
    public static final String FIND_BY_KVART_CONTAINING = "Uladr.findByKvartContaining";
    public static final String FIND_BY_KODGOROD = "Uladr.findByKodgorod";
    public static final String FIND_BY_KODGOROD_CONTAINING = "Uladr.findByKodgorodContaining";
    public static final String FIND_BY_TELEFON = "Uladr.findByTelefon";
    public static final String FIND_BY_TELEFON_CONTAINING = "Uladr.findByTelefonContaining";
    public static final String FIND_BY_FAX = "Uladr.findByFax";
    public static final String FIND_BY_FAX_CONTAINING = "Uladr.findByFaxContaining";
    public static final String FIND_BY_NAMEISPORG = "Uladr.findByNameisporg";
    public static final String FIND_BY_NAMEISPORG_CONTAINING = "Uladr.findByNameisporgContaining";
    public static final String FIND_BY_GIHDADATE = "Uladr.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Uladr.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Uladr.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Uladr.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Uladr.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Uladr.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Uladr.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Uladr.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Uladr.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULADRSEQ", sequenceName = "SEQ_ULADR", allocationSize = 1)
    @Id
    @Column(name = "IDULADR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULADRSEQ")
    private Integer iduladr;

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

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDVIDADR-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDVIDADR-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDVIDADR@
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDVIDADR")
    private Spvidadr idvidadr;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @OKATO-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @OKATO-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-OKATO@
    @Column(name = "OKATO", length = 12, nullable = true, unique = false)
    private String okato;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @INDEKS-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @INDEKS-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-INDEKS@
    @Column(name = "INDEKS", length = 6, nullable = true, unique = false)
    private String indeks;
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
    @Column(name = "IDSTREET", nullable = true, unique = true)
    private String idstreet;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DOM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DOM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DOM@
    @Column(name = "DOM", length = 50, nullable = true, unique = false)
    private String dom;
//MP-MANAGED-UPDATABLE-ENDING

    @Column(name = "ADDRESS", nullable = true, unique = false)
    private String address;
    //MP-MANAGED-ADDED-AREA-BEGINNING @KORP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KORP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KORP@
    @Column(name = "KORP", length = 50, nullable = true, unique = false)
    private String korp;
    //MP-MANAGED-ADDED-AREA-BEGINNING @KVART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KVART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KVART@
    @Column(name = "KVART", length = 50, nullable = true, unique = false)
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
    //MP-MANAGED-ADDED-AREA-BEGINNING @NAMEISPORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEISPORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEISPORG@
    @Column(name = "NAMEISPORG", length = 255, nullable = true, unique = false)
    private String nameisporg;
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
    public Uladr() {
    }
//MP-MANAGED-UPDATABLE-ENDING

    /**
     * All field constructor
     */
    public Uladr(
            Integer iduladr,
            Ul idul,
            Date dtstart,
            Spvidadr idvidadr,
            String okato,
            String indeks,
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
            String nameisporg,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                iduladr,
                idul,
                dtstart,
                idvidadr,
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
                nameisporg,
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

    public Uladr(
            Integer iduladr,
            Ul idul,
            Date dtstart,
            Spvidadr idvidadr,
            String okato,
            String indeks,
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
            String nameisporg,
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
        setIduladr(iduladr);
        //attributes
        setIdul(idul);
        setDtstart(dtstart);
        setIdvidadr(idvidadr);
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
        setNameisporg(nameisporg);
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

    public Uladr flat() {
        return new Uladr(
                getIduladr(),
                getIdul(),
                getDtstart(),
                getIdvidadr(),
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
                getNameisporg(),
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

    public Integer getIduladr() {
        return iduladr;
    }

    public void setIduladr(Integer iduladr) {
        this.iduladr = iduladr;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDADR@
    public Spvidadr getIdvidadr() {
        return idvidadr;
    }

    public void setIdvidadr(Spvidadr idvidadr) {
        this.idvidadr = idvidadr;
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
    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMEISPORG@
    public String getNameisporg() {
        return nameisporg;
    }

    public void setNameisporg(String nameisporg) {
        this.nameisporg = nameisporg;
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
