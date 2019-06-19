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

        , @NamedQuery(name = "Spregorg.findByAddress", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.address = :address")
        , @NamedQuery(name = "Spregorg.findByAddressContaining", query = "SELECT spregorg FROM Spregorg spregorg WHERE spregorg.address like :address")

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
    public static final String FIND_BY_ADDRESS = "Spregorg.findByAddress";
    public static final String FIND_BY_ADDRESS_CONTAINING = "Spregorg.findByAddressContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDSPRO")
    private String idspro;


    @Column(name = "NAME", length = 255, nullable = true, unique = false)
    private String name;


    @Column(name = "ID_RAION", nullable = true, unique = false)
    private Integer idRaion;


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

    @Column(name = "ADDRESS", nullable = true, unique = false)
    private String address;

    /**
     * Default constructor
     */
    public Spregorg() {
    }


    /**
     * All field constructor
     */
    public Spregorg(
            String idspro,
            String name,
            Integer idRaion,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            String address) {
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
                rowCheckSum,
                address
                , true);
    }


    public Spregorg(
            String idspro,
            String name,
            Integer idRaion,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            String address
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
        setAddress(address);
        //parents
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spregorg)) return false;

        Spregorg spregorg = (Spregorg) o;

        return idspro.equals(spregorg.idspro);

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
                getRowCheckSum(),
                getAddress()
                , false
        );
    }

    public String getIdspro() {
        return idspro;
    }

    public void setIdspro(String idspro) {
        this.idspro = idspro;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getIdRaion() {
        return idRaion;
    }

    public void setIdRaion(Integer idRaion) {
        this.idRaion = idRaion;
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


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getIdenti() {
        return idspro;
    }


}
