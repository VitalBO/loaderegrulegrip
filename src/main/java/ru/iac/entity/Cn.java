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
 * - time      : 2015/02/12 �.�. at 10:23:30 MSK
 */
package ru.iac.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * <p>Title: Cn</p>
 * <p/>
 * <p>Description: Domain Object describing a Cn entity</p>
 */
@Entity(name = "Cn")
@Table(name = "\"CN\"")
@NamedQueries({
        @NamedQuery(name = "Cn.findAll", query = "SELECT cn FROM Cn cn")
        , @NamedQuery(name = "Cn.findByName", query = "SELECT cn FROM Cn cn WHERE cn.name = :name")
        , @NamedQuery(name = "Cn.findByNameContaining", query = "SELECT cn FROM Cn cn WHERE cn.name like :name")

        , @NamedQuery(name = "Cn.findByKodKl", query = "SELECT cn FROM Cn cn WHERE cn.kodKl = :kodKl")
        , @NamedQuery(name = "Cn.findByKodKlContaining", query = "SELECT cn FROM Cn cn WHERE cn.kodKl like :kodKl")

        , @NamedQuery(name = "Cn.findByGihdAdate", query = "SELECT cn FROM Cn cn WHERE cn.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Cn.findByGihdChdate", query = "SELECT cn FROM Cn cn WHERE cn.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Cn.findByGihdDdate", query = "SELECT cn FROM Cn cn WHERE cn.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Cn.findByGihdIdUser", query = "SELECT cn FROM Cn cn WHERE cn.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Cn.findByGihdAIdPackage", query = "SELECT cn FROM Cn cn WHERE cn.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Cn.findByGihdChIdPackage", query = "SELECT cn FROM Cn cn WHERE cn.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Cn.findByGihdDIdPackage", query = "SELECT cn FROM Cn cn WHERE cn.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Cn.findByRowCheckSum", query = "SELECT cn FROM Cn cn WHERE cn.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Cn.findByRowCheckSumContaining", query = "SELECT cn FROM Cn cn WHERE cn.rowCheckSum like :rowCheckSum")

})

public class Cn implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Cn.findAll";
    public static final String FIND_BY_NAME = "Cn.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Cn.findByNameContaining";
    public static final String FIND_BY_KODKL = "Cn.findByKodKl";
    public static final String FIND_BY_KODKL_CONTAINING = "Cn.findByKodKlContaining";
    public static final String FIND_BY_GIHDADATE = "Cn.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Cn.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Cn.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Cn.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Cn.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Cn.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Cn.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Cn.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Cn.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDN")
    private BigInteger idn;

    //MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name = "NAME", length = 255, nullable = true, unique = false)
    private String name;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @KOD_KL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KOD_KL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KOD_KL@
    @Column(name = "KOD_KL", length = 11, nullable = true, unique = false)
    private String kodKl;
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
    public Cn() {
    }

    /**
     * All field constructor
     */
    public Cn(
            BigInteger idn,
            String name,
            String kodKl,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idn,
                name,
                kodKl,
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

    public Cn(
            BigInteger idn,
            String name,
            String kodKl,
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
        setIdn(idn);
        //attributes
        setName(name);
        setKodKl(kodKl);
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

    public Cn flat() {
        return new Cn(
                getIdn(),
                getName(),
                getKodKl(),
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

    public BigInteger getIdn() {
        return idn;
    }

    public void setIdn(BigInteger idn) {
        this.idn = idn;
    }

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KOD_KL@
    public String getKodKl() {
        return kodKl;
    }

    public void setKodKl(String kodKl) {
        this.kodKl = kodKl;
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
        return idn.toString();
    }


//MP-MANAGED-UPDATABLE-ENDING


//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cn)) return false;

        Cn cn = (Cn) o;

        if (!idn.equals(cn.idn)) return false;
        if (kodKl != null ? !kodKl.equals(cn.kodKl) : cn.kodKl != null) return false;
        if (name != null ? !name.equals(cn.name) : cn.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idn.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kodKl != null ? kodKl.hashCode() : 0);
        return result;
    }
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
