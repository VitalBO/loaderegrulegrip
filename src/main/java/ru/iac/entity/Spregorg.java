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
import java.math.BigInteger;
import java.util.Date;

/**
 * <p>Title: Spregorg</p>
 * <p/>
 * <p>Description: Domain Object describing a Spregorg entity</p>
 */
@Entity(name = "Spregorg")
@Table(name = "\"SPREGORG\"")
@NamedQueries({
        @NamedQuery(name = "Spregorg.findAll", query = "SELECT spregorg FROM Spregorg spregorg")
        , @NamedQuery(name = "Spregorg.findByName", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.name = :name")
        , @NamedQuery(name = "Spregorg.findByNameContaining", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.name like :name")

        , @NamedQuery(name = "Spregorg.findByIdRaion", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.idRaion = :idRaion")

        , @NamedQuery(name = "Spregorg.findByGihdAdate", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Spregorg.findByGihdChdate", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Spregorg.findByGihdDdate", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Spregorg.findByGihdIdUser", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Spregorg.findByGihdAIdPackage", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Spregorg.findByGihdChIdPackage", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Spregorg.findByGihdDIdPackage", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Spregorg.findByRowCheckSum", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Spregorg.findByRowCheckSumContaining", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.rowCheckSum like :rowCheckSum")

})

public class Spregorg implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Spregorg.findAll";
    public static final String FIND_BY_NAME = "Spregorg.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Spregorg.findByNameContaining";
    public static final String FIND_BY_IDRAION = "Spregorg.findByIdRaion";
    public static final String FIND_BY_GIHDADATE = "Spregorg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spregorg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spregorg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spregorg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spregorg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spregorg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spregorg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spregorg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Spregorg.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDSPRO")
    private BigInteger idspro;

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name = "NAME", length = 255, nullable = true, unique = false)
    private String name;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @ID_RAION-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ID_RAION-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ID_RAION@
    @Column(name = "ID_RAION", nullable = true, unique = false)
    private Integer idRaion;
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
    //MP-MANAGED-ADDED-AREA-BEGINNING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ROW_CHECK_SUM@
    @Column(name = "ROW_CHECK_SUM", nullable = true, unique = false)
    private String rowCheckSum;

    /**
     * Default constructor
     */
    public Spregorg() {
    }
//MP-MANAGED-UPDATABLE-ENDING

    /**
     * All field constructor
     */
    public Spregorg(
            BigInteger idspro,
            String name,
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
                idspro,
                name,
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
//MP-MANAGED-UPDATABLE-ENDING

    public Spregorg(
            BigInteger idspro,
            String name,
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
        setIdspro(idspro);
        //attributes
        setName(name);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spregorg)) return false;

        Spregorg spregorg = (Spregorg) o;

        if (!idspro.equals(spregorg.idspro)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idspro.hashCode();
    }

    public Spregorg flat() {
        return new Spregorg(
                getIdspro(),
                getName(),
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

    public BigInteger getIdspro() {
        return idspro;
    }

    public void setIdspro(BigInteger idspro) {
        this.idspro = idspro;
    }

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String getIdenti() {
        return idspro.toString();
    }

//MP-MANAGED-UPDATABLE-ENDING


//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
