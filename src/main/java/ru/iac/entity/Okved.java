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

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Okved</p>
 * <p/>
 * <p>Description: Domain Object describing a Okved entity</p>
 */
@Entity(name = "Okved")
@Table(name = "\"OKVED\"")
@NamedQueries({
        @NamedQuery(name = "Okved.findAll", query = "SELECT okved FROM Okved okved")
        , @NamedQuery(name = "Okved.findByName", query = "SELECT okved FROM Okved okved WHERE okved.name = :name")
        , @NamedQuery(name = "Okved.findByNameContaining", query = "SELECT okved FROM Okved okved WHERE okved.name like :name")
        , @NamedQuery(name = "Okved.findByCodeOkvedNId", query = "SELECT okved FROM Okved okved WHERE okved.codeOkved = :kod")

        , @NamedQuery(name = "Okved.findByCodeOkved", query = "SELECT okved FROM Okved okved WHERE okved.codeOkved = :codeOkved")
        , @NamedQuery(name = "Okved.findByCodeOkvedContaining", query = "SELECT okved FROM Okved okved WHERE okved.codeOkved like :codeOkved")

        , @NamedQuery(name = "Okved.findByGihdAdate", query = "SELECT okved FROM Okved okved WHERE okved.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Okved.findByGihdChdate", query = "SELECT okved FROM Okved okved WHERE okved.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Okved.findByGihdDdate", query = "SELECT okved FROM Okved okved WHERE okved.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Okved.findByGihdIdUser", query = "SELECT okved FROM Okved okved WHERE okved.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Okved.findByGihdAIdPackage", query = "SELECT okved FROM Okved okved WHERE okved.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Okved.findByGihdChIdPackage", query = "SELECT okved FROM Okved okved WHERE okved.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Okved.findByGihdDIdPackage", query = "SELECT okved FROM Okved okved WHERE okved.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Okved.findByRowCheckSum", query = "SELECT okved FROM Okved okved WHERE okved.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Okved.findByRowCheckSumContaining", query = "SELECT okved FROM Okved okved WHERE okved.rowCheckSum like :rowCheckSum")

})

public class Okved implements Serializable, EgrulEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Okved.findAll";
    public static final String FIND_BY_NATURALID = "Okved.findByCodeOkvedNId";
    public static final String FIND_BY_NAME = "Okved.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Okved.findByNameContaining";
    public static final String FIND_BY_CODEOKVED = "Okved.findByCodeOkved";
    public static final String FIND_BY_CODEOKVED_CONTAINING = "Okved.findByCodeOkvedContaining";
    public static final String FIND_BY_GIHDADATE = "Okved.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Okved.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Okved.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Okved.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Okved.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Okved.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Okved.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Okved.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Okved.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "OKVEDSEQ", sequenceName = "SEQ_OKVED", allocationSize = 1)
    @Id
    @Column(name = "IDOKVED")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OKVEDSEQ")
    private Integer idokved;

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name = "NAME", length = 150, nullable = true, unique = false)
    private String name;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @CODE_OKVED-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @CODE_OKVED-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-CODE_OKVED@
    @NaturalId
    @Column(name = "CODE_OKVED", length = 10, nullable = true, unique = false)
    private String codeOkved;
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
    public Okved() {
    }

    /**
     * All field constructor
     */
    public Okved(
            Integer idokved,
            String name,
            String codeOkved,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idokved,
                name,
                codeOkved,
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

    public Okved(
            Integer idokved,
            String name,
            String codeOkved,
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
        setIdokved(idokved);
        //attributes
        setName(name);
        setCodeOkved(codeOkved);
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

    public Okved flat() {
        return new Okved(
                getIdokved(),
                getName(),
                getCodeOkved(),
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

    public Integer getIdokved() {
        return idokved;
    }

    public void setIdokved(Integer idokved) {
        this.idokved = idokved;
    }

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-CODE_OKVED@
    public String getCodeOkved() {
        return codeOkved;
    }

    public void setCodeOkved(String codeOkved) {
        this.codeOkved = codeOkved;
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

    @Override
    public String getIdenti() {
        return idokved == null ? null : idokved.toString();
    }

    @Override
    public String getnaturalId() {
        return codeOkved;
    }

    @Override
    public String returnNaturalIdQuery() {
        return FIND_BY_NATURALID;
    }


//MP-MANAGED-UPDATABLE-ENDING


//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
