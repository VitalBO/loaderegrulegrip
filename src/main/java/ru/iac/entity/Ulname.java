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
 * <p>Title: Ulname</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulname entity</p>
 */
@Entity(name = "Ulname")
@Table(name = "\"ULNAME\"")
@NamedQueries({
        @NamedQuery(name = "Ulname.findAll", query = "SELECT ulname FROM Ulname ulname")
        , @NamedQuery(name = "Ulname.findByIdul", query = "SELECT ulname FROM Ulname ulname WHERE ulname.idul = :idul")

        , @NamedQuery(name = "Ulname.findByDtstart", query = "SELECT ulname FROM Ulname ulname WHERE ulname.dtstart = :dtstart")

        , @NamedQuery(name = "Ulname.findByNamep", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namep = :namep")
        , @NamedQuery(name = "Ulname.findByNamepContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namep like :namep")

        , @NamedQuery(name = "Ulname.findByNames", query = "SELECT ulname FROM Ulname ulname WHERE ulname.names = :names")
        , @NamedQuery(name = "Ulname.findByNamesContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.names like :names")

        , @NamedQuery(name = "Ulname.findByIdlangi", query = "SELECT ulname FROM Ulname ulname WHERE ulname.idlangi = :idlangi")

        , @NamedQuery(name = "Ulname.findByNamei", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namei = :namei")
        , @NamedQuery(name = "Ulname.findByNameiContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namei like :namei")

        , @NamedQuery(name = "Ulname.findByIdopf", query = "SELECT ulname FROM Ulname ulname WHERE ulname.idopf = :idopf")

        , @NamedQuery(name = "Ulname.findByGihdAdate", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ulname.findByGihdChdate", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ulname.findByGihdDdate", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ulname.findByGihdIdUser", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ulname.findByGihdAIdPackage", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ulname.findByGihdChIdPackage", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ulname.findByGihdDIdPackage", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ulname.findByRowCheckSum", query = "SELECT ulname FROM Ulname ulname WHERE ulname.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ulname.findByRowCheckSumContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.rowCheckSum like :rowCheckSum")

})

public class Ulname implements Serializable {
    public static final String FIND_ALL = "Ulname.findAll";
    public static final String FIND_BY_IDUL = "Ulname.findByIdul";
    public static final String FIND_BY_DTSTART = "Ulname.findByDtstart";
    public static final String FIND_BY_NAMEP = "Ulname.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING = "Ulname.findByNamepContaining";
    public static final String FIND_BY_NAMES = "Ulname.findByNames";
    public static final String FIND_BY_NAMES_CONTAINING = "Ulname.findByNamesContaining";
    public static final String FIND_BY_IDLANGI = "Ulname.findByIdlangi";
    public static final String FIND_BY_NAMEI = "Ulname.findByNamei";
    public static final String FIND_BY_NAMEI_CONTAINING = "Ulname.findByNameiContaining";
    public static final String FIND_BY_IDOPF = "Ulname.findByIdopf";
    public static final String FIND_BY_GIHDADATE = "Ulname.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulname.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulname.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulname.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulname.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulname.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulname.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulname.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ulname.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULNAMESEQ", sequenceName = "SEQ_ULNAME", allocationSize = 1)
    @Id
    @Column(name = "IDULNAME")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULNAMESEQ")
    private Integer idulname;

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
    @Column(name = "DTSTART", nullable = true, unique = true)
    private Date dtstart;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAMEP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEP@
    @Column(name = "NAMEP", length = 800, nullable = true, unique = true)
    private String namep;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAMES-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMES-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMES@
    @Column(name = "NAMES", length = 255, nullable = true, unique = false)
    private String names;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDLANGI-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDLANGI-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDLANGI@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDLANGI", nullable = true, unique = false)
    private Splang idlangi;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAMEI-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEI-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEI@
    @Column(name = "NAMEI", length = 255, nullable = true, unique = false)
    private String namei;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDOPF-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDOPF-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDOPF@@
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDOPF", nullable = true, unique = true)
    private Spopf idopf;
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
    public Ulname() {
    }

    /**
     * All field constructor
     */
    public Ulname(
            Integer idulname,
            Ul idul,
            Date dtstart,
            String namep,
            String names,
            Splang idlangi,
            String namei,
            Spopf idopf,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idulname,
                idul,
                dtstart,
                namep,
                names,
                idlangi,
                namei,
                idopf,
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

    public Ulname(
            Integer idulname,
            Ul idul,
            Date dtstart,
            String namep,
            String names,
            Splang idlangi,
            String namei,
            Spopf idopf,
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
        setIdulname(idulname);
        //attributes
        setIdul(idul);
        setDtstart(dtstart);
        setNamep(namep);
        setNames(names);
        setIdlangi(idlangi);
        setNamei(namei);
        setIdopf(idopf);
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

    public Ulname flat() {
        return new Ulname(
                getIdulname(),
                getIdul(),
                getDtstart(),
                getNamep(),
                getNames(),
                getIdlangi(),
                getNamei(),
                getIdopf(),
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

    public Integer getIdulname() {
        return idulname;
    }

    public void setIdulname(Integer idulname) {
        this.idulname = idulname;
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMES@
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDLANGI@
    public Splang getIdlangi() {
        return idlangi;
    }

    public void setIdlangi(Splang idlangi) {
        this.idlangi = idlangi;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMEI@
    public String getNamei() {
        return namei;
    }

    public void setNamei(String namei) {
        this.namei = namei;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDOPF@
    public Spopf getIdopf() {
        return idopf;
    }

    public void setIdopf(Spopf idopf) {
        this.idopf = idopf;
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
