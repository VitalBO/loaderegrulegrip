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
 * <p>Title: Ulob</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulob entity</p>
 */
@Entity(name = "Ulob")
@Table(name = "\"ULOB\"")
@NamedQueries({
        @NamedQuery(name = "Ulob.findAll", query = "SELECT ulob FROM Ulob ulob")
        , @NamedQuery(name = "Ulob.findByIdul", query = "SELECT ulob FROM Ulob ulob WHERE ulob.idul = :idul")

        , @NamedQuery(name = "Ulob.findByDtstart", query = "SELECT ulob FROM Ulob ulob WHERE ulob.dtstart = :dtstart")

        , @NamedQuery(name = "Ulob.findByVidob", query = "SELECT ulob FROM Ulob ulob WHERE ulob.vidob = :vidob")

        , @NamedQuery(name = "Ulob.findByKodgorod", query = "SELECT ulob FROM Ulob ulob WHERE ulob.kodgorod = :kodgorod")
        , @NamedQuery(name = "Ulob.findByKodgorodContaining", query = "SELECT ulob FROM Ulob ulob WHERE ulob.kodgorod like :kodgorod")

        , @NamedQuery(name = "Ulob.findByTelefon", query = "SELECT ulob FROM Ulob ulob WHERE ulob.telefon = :telefon")
        , @NamedQuery(name = "Ulob.findByTelefonContaining", query = "SELECT ulob FROM Ulob ulob WHERE ulob.telefon like :telefon")

        , @NamedQuery(name = "Ulob.findByFax", query = "SELECT ulob FROM Ulob ulob WHERE ulob.fax = :fax")
        , @NamedQuery(name = "Ulob.findByFaxContaining", query = "SELECT ulob FROM Ulob ulob WHERE ulob.fax like :fax")

        , @NamedQuery(name = "Ulob.findByGihdAdate", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ulob.findByGihdChdate", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ulob.findByGihdDdate", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ulob.findByGihdIdUser", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ulob.findByGihdAIdPackage", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ulob.findByGihdChIdPackage", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ulob.findByGihdDIdPackage", query = "SELECT ulob FROM Ulob ulob WHERE ulob.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ulob.findByRowCheckSum", query = "SELECT ulob FROM Ulob ulob WHERE ulob.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ulob.findByRowCheckSumContaining", query = "SELECT ulob FROM Ulob ulob WHERE ulob.rowCheckSum like :rowCheckSum")

})

public class Ulob implements Serializable {
    public static final String FIND_ALL = "Ulob.findAll";
    public static final String FIND_BY_IDUL = "Ulob.findByIdul";
    public static final String FIND_BY_DTSTART = "Ulob.findByDtstart";
    public static final String FIND_BY_VIDOB = "Ulob.findByVidob";
    public static final String FIND_BY_KODGOROD = "Ulob.findByKodgorod";
    public static final String FIND_BY_KODGOROD_CONTAINING = "Ulob.findByKodgorodContaining";
    public static final String FIND_BY_TELEFON = "Ulob.findByTelefon";
    public static final String FIND_BY_TELEFON_CONTAINING = "Ulob.findByTelefonContaining";
    public static final String FIND_BY_FAX = "Ulob.findByFax";
    public static final String FIND_BY_FAX_CONTAINING = "Ulob.findByFaxContaining";
    public static final String FIND_BY_GIHDADATE = "Ulob.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulob.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulob.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulob.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulob.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulob.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulob.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulob.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ulob.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULOBSEQ", sequenceName = "SEQ_ULOB", allocationSize = 1)
    @Id
    @Column(name = "IDULOB")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULOBSEQ")
    private Integer idulob;

    @Embedded
    Address fulladdress;

    public Address getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(Address fulladdress) {
        this.fulladdress = fulladdress;
    }

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name = "IDUL", nullable = true, unique = false)
    private Ul idul;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @VIDOB-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @VIDOB-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-VIDOB@
    @Column(name = "VIDOB", nullable = true, unique = false)
    private Integer vidob;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @OKATO-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @OKATO-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-OKATO@
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
    public Ulob() {
    }
//MP-MANAGED-UPDATABLE-ENDING

    /**
     * All field constructor
     */
    public Ulob(
            Integer idulob,
            Ul idul,
            Date dtstart,
            Integer vidob,
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
                idulob,
                idul,
                dtstart,
                vidob,
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

    public Ulob(
            Integer idulob,
            Ul idul,
            Date dtstart,
            Integer vidob,
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
        setIdulob(idulob);
        //attributes
        setIdul(idul);
        setDtstart(dtstart);
        setVidob(vidob);
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


    public Ulob flat() {
        return new Ulob(
                getIdulob(),
                getIdul(),
                getDtstart(),
                getVidob(),
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

    public Integer getIdulob() {
        return idulob;
    }

    public void setIdulob(Integer idulob) {
        this.idulob = idulob;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-VIDOB@
    public Integer getVidob() {
        return vidob;
    }

    public void setVidob(Integer vidob) {
        this.vidob = vidob;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-OKATO@
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
