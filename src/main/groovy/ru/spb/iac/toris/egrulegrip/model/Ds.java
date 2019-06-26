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
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * <p>Title: Ds</p>
 * <p/>
 * <p>Description: Domain Object describing a Ds entity</p>
 */
@Entity(name = "Ds")
@Table(name = "DS")
@NamedQueries({
        @NamedQuery(name = "Ds.findAll", query = "SELECT ds FROM Ds ds")
        , @NamedQuery(name = "Ds.findByName", query = "SELECT ds FROM Ds ds WHERE ds.name = :name")
        , @NamedQuery(name = "Ds.findByNameContaining", query = "SELECT ds FROM Ds ds WHERE ds.name like :name")

        , @NamedQuery(name = "Ds.findByKodKl", query = "SELECT ds FROM Ds ds WHERE ds.kodKl = :kodKl")
        , @NamedQuery(name = "Ds.findByKodKlContaining", query = "SELECT ds FROM Ds ds WHERE ds.kodKl like :kodKl")

        , @NamedQuery(name = "Ds.findByGihdAdate", query = "SELECT ds FROM Ds ds WHERE ds.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ds.findByGihdChdate", query = "SELECT ds FROM Ds ds WHERE ds.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ds.findByGihdDdate", query = "SELECT ds FROM Ds ds WHERE ds.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ds.findByGihdIdUser", query = "SELECT ds FROM Ds ds WHERE ds.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ds.findByGihdAIdPackage", query = "SELECT ds FROM Ds ds WHERE ds.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ds.findByGihdChIdPackage", query = "SELECT ds FROM Ds ds WHERE ds.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ds.findByGihdDIdPackage", query = "SELECT ds FROM Ds ds WHERE ds.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ds.findByRowCheckSum", query = "SELECT ds FROM Ds ds WHERE ds.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ds.findByRowCheckSumContaining", query = "SELECT ds FROM Ds ds WHERE ds.rowCheckSum like :rowCheckSum")

        ,@NamedQuery(name="Ds.findByTypeDs", query="SELECT ds FROM Ds ds WHERE ds.typeDs = :typeDs")
        ,@NamedQuery(name="Ds.findByTypeDsContaining", query="SELECT ds FROM Ds ds WHERE ds.typeDs like :typeDs")

        ,@NamedQuery(name="Ds.findByNameDs", query="SELECT ds FROM Ds ds WHERE ds.nameDs = :nameDs")
        ,@NamedQuery(name="Ds.findByNameDsContaining", query="SELECT ds FROM Ds ds WHERE ds.nameDs like :nameDs")

})

public class Ds implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Ds.findAll";
    public static final String FIND_BY_NAME = "Ds.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Ds.findByNameContaining";
    public static final String FIND_BY_KODKL = "Ds.findByKodKl";
    public static final String FIND_BY_KODKL_CONTAINING = "Ds.findByKodKlContaining";
    public static final String FIND_BY_GIHDADATE = "Ds.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ds.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ds.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ds.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ds.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ds.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ds.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ds.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ds.findByRowCheckSumContaining";
    public static final String FIND_BY_TYPEDS = "Ds.findByTypeDs";
    public static final String FIND_BY_TYPEDS_CONTAINING ="Ds.findByTypeDsContaining";
    public static final String FIND_BY_NAMEDS = "Ds.findByNameDs";
    public static final String FIND_BY_NAMEDS_CONTAINING ="Ds.findByNameDsContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDD")
    private BigInteger idd;


    @Column(name = "NAME", length = 255, nullable = true, unique = false)
    private String name;


    @Column(name = "KOD_KL", length = 11, nullable = true, unique = false)
    private String kodKl;


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

    @Column(name="TYPEDS"   , nullable=true , unique=false)
    private String typeDs;

    @Column(name="NAMEDS"   , nullable=true , unique=false)
    private String nameDs;

    /**
     * Default constructor
     */
    public Ds() {
    }

    /**
     * All field constructor
     */
    public Ds(
            BigInteger idd,
            String name,
            String kodKl,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            String typeDs,
            String nameDs) {
        this(
                idd,
                name,
                kodKl,
                gihdAdate,
                gihdChdate,
                gihdDdate,
                gihdIdUser,
                gihdAIdPackage,
                gihdChIdPackage,
                gihdDIdPackage,
                rowCheckSum,
                typeDs,
                nameDs
                , true);
    }

    public Ds(
            BigInteger idd,
            String name,
            String kodKl,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            String typeDs,
            String nameDs
            , boolean setRelationship) {
        //primary keys
        setIdd(idd);
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
        setTypeDs(typeDs);
        setNameDs(nameDs);
        //parents
    }

    public Ds flat() {
        return new Ds(
                getIdd(),
                getName(),
                getKodKl(),
                getGihdAdate(),
                getGihdChdate(),
                getGihdDdate(),
                getGihdIdUser(),
                getGihdAIdPackage(),
                getGihdChIdPackage(),
                getGihdDIdPackage(),
                getRowCheckSum(),
                getTypeDs(),
                getNameDs()
                , false
        );
    }

    public BigInteger getIdd() {
        return idd;
    }

    public void setIdd(BigInteger idd) {
        this.idd = idd;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getKodKl() {
        return kodKl;
    }

    public void setKodKl(String kodKl) {
        this.kodKl = kodKl;
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


    public String getTypeDs() {
        return typeDs;
    }

    public void setTypeDs(String typeDs) {
        this.typeDs = typeDs;
    }


    public String getNameDs() {
        return nameDs;
    }

    public void setNameDs(String nameDs) {
        this.nameDs = nameDs;
    }

    @Override
    public String getIdenti() {
        return idd.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ds)) return false;

        Ds ds = (Ds) o;

        if (!idd.equals(ds.idd)) return false;
        if (kodKl != null ? !kodKl.equals(ds.kodKl) : ds.kodKl != null) return false;
        return name != null ? name.equals(ds.name) : ds.name == null;

    }

    @Override
    public int hashCode() {
        int result = idd.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kodKl != null ? kodKl.hashCode() : 0);
        return result;
    }


}
