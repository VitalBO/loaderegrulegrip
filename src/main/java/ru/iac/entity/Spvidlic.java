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


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * <p>Title: Spvidlic</p>
 * <p/>
 * <p>Description: Domain Object describing a Spvidlic entity</p>
 */
@Entity(name = "Spvidlic")
@Table(name = "\"SPVIDLIC\"")
@NamedQueries({
        @NamedQuery(name = "Spvidlic.findAll", query = "SELECT spvidlic FROM Spvidlic spvidlic")
        , @NamedQuery(name = "Spvidlic.findByName", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.name = :name")
        , @NamedQuery(name = "Spvidlic.findByNameContaining", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.name like :name")

        , @NamedQuery(name = "Spvidlic.findByGihdAdate", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Spvidlic.findByGihdChdate", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Spvidlic.findByGihdDdate", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Spvidlic.findByGihdIdUser", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Spvidlic.findByGihdAIdPackage", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Spvidlic.findByGihdChIdPackage", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Spvidlic.findByGihdDIdPackage", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Spvidlic.findByRowCheckSum", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Spvidlic.findByRowCheckSumContaining", query = "SELECT spvidlic FROM Spvidlic spvidlic WHERE spvidlic.rowCheckSum like :rowCheckSum")

})

public class Spvidlic implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Spvidlic.findAll";
    public static final String FIND_BY_NAME = "Spvidlic.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Spvidlic.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Spvidlic.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spvidlic.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spvidlic.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spvidlic.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spvidlic.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spvidlic.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spvidlic.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spvidlic.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Spvidlic.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDVIDLIC")
    private BigInteger idvidlic;


    @Column(name = "NAME", length = 1000, nullable = true, unique = false)
    private String name;


    @Column(name = "GIHD__ADATE", nullable = true, unique = false)
    private Date gihdAdate;


    @Column(name = "GIHD__CHDATE", nullable = true, unique = false)
    private Date gihdChdate;


    @Column(name = "GIHD__DDATE", nullable = true, unique = false)
private Date gihdDdate;


    @Column(name = "GIHD__ID_USER", nullable = true, unique = false)
private Integer gihdIdUser;


    @Column(name = "GIHD__A_ID_PACKAGE", nullable = true, unique = false)
private Integer gihdAIdPackage;


    @Column(name = "GIHD__CH_ID_PACKAGE", nullable = true, unique = false)
private Integer gihdChIdPackage;


    @Column(name = "GIHD__D_ID_PACKAGE", nullable = true, unique = false)
private Integer gihdDIdPackage;


    @Column(name = "ROW_CHECK_SUM", nullable = true, unique = false)
private String rowCheckSum;


    /**
     * Default constructor
     */
    public Spvidlic() {
    }


    /**
     * All field constructor
     */
    public Spvidlic(
            BigInteger idvidlic,
            String name,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idvidlic,
                name,
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


    public Spvidlic(
            BigInteger idvidlic,
            String name,
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
        setIdvidlic(idvidlic);
        //attributes
        setName(name);
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
        if (!(o instanceof Spvidlic)) return false;

        Spvidlic spvidlic = (Spvidlic) o;

        return idvidlic.equals(spvidlic.idvidlic);

    }

    @Override
    public int hashCode() {
        return idvidlic.hashCode();
    }

    public Spvidlic flat() {
        return new Spvidlic(
                getIdvidlic(),
                getName(),
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

    public BigInteger getIdvidlic() {
        return idvidlic;
    }

    public void setIdvidlic(BigInteger idvidlic) {
        this.idvidlic = idvidlic;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getGihdAdate() {
        return gihdAdate;
    }

    public void setGihdAdate(Date gihdAdate) {
        this.gihdAdate = gihdAdate;
    }


    public Date getGihdChdate() {
        return gihdChdate;
    }

    public void setGihdChdate(Date gihdChdate) {
        this.gihdChdate = gihdChdate;
    }


    public Date getGihdDdate() {
        return gihdDdate;
    }

    public void setGihdDdate(Date gihdDdate) {
        this.gihdDdate = gihdDdate;
    }


    public Integer getGihdIdUser() {
        return gihdIdUser;
    }

    public void setGihdIdUser(Integer gihdIdUser) {
        this.gihdIdUser = gihdIdUser;
    }


    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }

    public void setGihdAIdPackage(Integer gihdAIdPackage) {
        this.gihdAIdPackage = gihdAIdPackage;
    }


    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }

    public void setGihdChIdPackage(Integer gihdChIdPackage) {
        this.gihdChIdPackage = gihdChIdPackage;
    }


    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }

    public void setGihdDIdPackage(Integer gihdDIdPackage) {
        this.gihdDIdPackage = gihdDIdPackage;
    }


    public String getRowCheckSum() {
        return rowCheckSum;
    }

    public void setRowCheckSum(String rowCheckSum) {
        this.rowCheckSum = rowCheckSum;
    }

    @Override
    public String getIdenti() {
        return idvidlic.toString();
    }


}
