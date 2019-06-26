/**
 * Copyright (c) minuteproject, minuteproject@gmail.com
 * All rights reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http:	*
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * More information on minuteproject:
 * twitter @minuteproject
 * wiki http:	* blog http:	*
 * <p/>
 * template reference :
 * - Minuteproject version : 0.8.8
 * - name      : DomainEntityJPA2Annotation
 * - file name : DomainEntityJPA2Annotation.vm
 * - time      : 2015/02/12 �.�. at 10:23:30 MSK
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
 *
 * <p>Title: Ct</p>
 *
 * <p>Description: Domain Object describing a Ct entity</p>
 *
 */
@Entity(name = "Ct")
@Table(name = "CT")
@NamedQueries({
        @NamedQuery(name = "Ct.findAll", query = "SELECT ct FROM Ct ct")
        , @NamedQuery(name = "Ct.findByName", query = "SELECT ct FROM Ct ct WHERE ct.name = :name")
        , @NamedQuery(name = "Ct.findByNameContaining", query = "SELECT ct FROM Ct ct WHERE ct.name like :name")

        , @NamedQuery(name = "Ct.findByKodKl", query = "SELECT ct FROM Ct ct WHERE ct.kodKl = :kodKl")
        , @NamedQuery(name = "Ct.findByKodKlContaining", query = "SELECT ct FROM Ct ct WHERE ct.kodKl like :kodKl")

        , @NamedQuery(name = "Ct.findByGihdAdate", query = "SELECT ct FROM Ct ct WHERE ct.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ct.findByGihdChdate", query = "SELECT ct FROM Ct ct WHERE ct.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ct.findByGihdDdate", query = "SELECT ct FROM Ct ct WHERE ct.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ct.findByGihdIdUser", query = "SELECT ct FROM Ct ct WHERE ct.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ct.findByGihdAIdPackage", query = "SELECT ct FROM Ct ct WHERE ct.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ct.findByGihdChIdPackage", query = "SELECT ct FROM Ct ct WHERE ct.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ct.findByGihdDIdPackage", query = "SELECT ct FROM Ct ct WHERE ct.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ct.findByRowCheckSum", query = "SELECT ct FROM Ct ct WHERE ct.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ct.findByRowCheckSumContaining", query = "SELECT ct FROM Ct ct WHERE ct.rowCheckSum like :rowCheckSum")

        , @NamedQuery(name = "Ct.findByTypeCt", query = "SELECT ct FROM Ct ct WHERE ct.typeCt = :typeCt")
        , @NamedQuery(name = "Ct.findByTypeCtContaining", query = "SELECT ct FROM Ct ct WHERE ct.typeCt like :typeCt")

        , @NamedQuery(name = "Ct.findByNameCt", query = "SELECT ct FROM Ct ct WHERE ct.nameCt = :nameCt")
        , @NamedQuery(name = "Ct.findByNameCtContaining", query = "SELECT ct FROM Ct ct WHERE ct.nameCt like :nameCt")
})

public class Ct implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Ct.findAll";
    public static final String FIND_BY_NAME = "Ct.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Ct.findByNameContaining";
    public static final String FIND_BY_KODKL = "Ct.findByKodKl";
    public static final String FIND_BY_KODKL_CONTAINING = "Ct.findByKodKlContaining";
    public static final String FIND_BY_GIHDADATE = "Ct.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ct.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ct.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ct.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ct.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ct.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ct.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ct.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ct.findByRowCheckSumContaining";
    public static final String FIND_BY_TYPECT = "Ct.findByTypeCt";
    public static final String FIND_BY_TYPECT_CONTAINING = "Ct.findByTypeCtContaining";
    public static final String FIND_BY_NAMECT = "Ct.findByNameCt";
    public static final String FIND_BY_NAMECT_CONTAINING = "Ct.findByNameCtContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDC")
    private BigInteger idc;

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

    @Column(name = "TYPECT", nullable = true, unique = false)
    private String typeCt;

    @Column(name = "NAMECT", nullable = true, unique = false)
    private String nameCt;

    /**
     * Default constructor
     */
    public Ct() {
    }

    /**
     * All field constructor
     */
    public Ct(
            BigInteger idc,
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
            String typeCt,
            String nameCt) {
        this(
                idc,
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
                typeCt,
                nameCt
                , true);
    }

    public Ct(
            BigInteger idc,
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
            String typeCt,
            String nameCt
            , boolean setRelationship) {
        setIdc(idc);
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
        setTypeCt(typeCt);
        setNameCt(nameCt);
    }

    public Ct flat() {
        return new Ct(
                getIdc(),
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
                getTypeCt(),
                getNameCt()
                , false
        );
    }

    public BigInteger getIdc() {
        return idc;
    }

    public void setIdc(BigInteger idc) {
        this.idc = idc;
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


    public String getTypeCt() {
        return typeCt;
    }

    public void setTypeCt(String typeCt) {
        this.typeCt = typeCt;
    }


    public String getNameCt() {
        return nameCt;
    }

    public void setNameCt(String nameCt) {
        this.nameCt = nameCt;
    }

    @Override
    public String getIdenti() {
        return idc.toString();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ct ct = (Ct) o;

        if (!idc.equals(ct.idc)) return false;
        return name.equalsIgnoreCase(ct.name);

    }

    @Override
    public int hashCode() {
        int result = idc.hashCode();
        result = 33 * result + name.hashCode();
        return result;
    }
}
