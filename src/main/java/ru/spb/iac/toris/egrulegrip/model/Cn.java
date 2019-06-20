/**
 * Copyright (c) minuteproject, minuteproject@gmail.com
 * All rights reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * More information on minuteproject:
 * twitter @minuteproject
 * wiki http://minuteproject.wikispaces.com
 * blog http://minuteproject.blogspot.net
 * <p/>
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
 * <p>Title: Cn</p>
 * <p/>
 * <p>Description: Domain Object describing a Cn entity</p>
 */
@Entity(name = "Cn")
@Table(name = "CN")
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

        , @NamedQuery(name = "Cn.findByTypeCn", query = "SELECT cn FROM Cn cn WHERE cn.typeCn = :typeCn")
        , @NamedQuery(name = "Cn.findByTypeCnContaining", query = "SELECT cn FROM Cn cn WHERE cn.typeCn like :typeCn")

        , @NamedQuery(name = "Cn.findByNameCn", query = "SELECT cn FROM Cn cn WHERE cn.nameCn = :nameCn")
        , @NamedQuery(name = "Cn.findByNameCnContaining", query = "SELECT cn FROM Cn cn WHERE cn.nameCn like :nameCn")
})
public class Cn implements Serializable, EgrulEgripEntity {
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
    public static final String FIND_BY_TYPECN = "Cn.findByTypeCn";
    public static final String FIND_BY_TYPECN_CONTAINING = "Cn.findByTypeCnContaining";
    public static final String FIND_BY_NAMECN = "Cn.findNameCn";
    public static final String FIND_BY_NAMECN_CONTAINING = "Cn.findByNameCnContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDN")
    private BigInteger idn;
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

    @Column(name = "TYPECN", nullable = true, unique = false)
    private String typeCn;

    @Column(name = "NAMECN", nullable = true, unique = false)
    private String nameCn;

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
            String rowCheckSum,
            String typeCn,
            String nameCn) {
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
                rowCheckSum,
                typeCn,
                nameCn
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
            String rowCheckSum,
            String typeCn,
            String nameCn
            , boolean setRelationship) {
        setIdn(idn);
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
        setTypeCn(typeCn);
        setNameCn(nameCn);
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
                getRowCheckSum(),
                getTypeCn(),
                getNameCn()
                , false
        );
    }

    public BigInteger getIdn() {
        return idn;
    }

    public void setIdn(BigInteger idn) {
        this.idn = idn;
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

    public String getTypeCn() {
        return typeCn;
    }

    public void setTypeCn(String typeCn) {
        this.typeCn = typeCn;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    @Override
    public String getIdenti() {
        return idn.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cn cn = (Cn) o;

        if (!idn.equals(cn.idn)) return false;
        return name.equalsIgnoreCase(cn.name);

    }

    @Override
    public int hashCode() {
        int result = idn.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
