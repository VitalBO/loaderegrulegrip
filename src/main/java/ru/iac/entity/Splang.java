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
import java.util.Date;

/**
 * <p>Title: Splang</p>
 * <p/>
 * <p>Description: Domain Object describing a Splang entity</p>
 */
@Entity(name = "Splang")
@Table(name = "\"SPLANG\"")
@NamedQueries({
        @NamedQuery(name = "Splang.findAll", query = "SELECT splang FROM Splang splang")
        , @NamedQuery(name = "Splang.findByKodLang", query = "SELECT splang FROM Splang splang WHERE splang.kodLang = :kodLang")
        , @NamedQuery(name = "Splang.findByKodLangContaining", query = "SELECT splang FROM Splang splang WHERE splang.kodLang like :kodLang")

        , @NamedQuery(name = "Splang.findByName", query = "SELECT splang FROM Splang splang WHERE splang.name = :name")
        , @NamedQuery(name = "Splang.findByNameContaining", query = "SELECT splang FROM Splang splang WHERE splang.name like :name")

        , @NamedQuery(name = "Splang.findByGihdAdate", query = "SELECT splang FROM Splang splang WHERE splang.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Splang.findByGihdChdate", query = "SELECT splang FROM Splang splang WHERE splang.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Splang.findByGihdDdate", query = "SELECT splang FROM Splang splang WHERE splang.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Splang.findByGihdIdUser", query = "SELECT splang FROM Splang splang WHERE splang.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Splang.findByGihdAIdPackage", query = "SELECT splang FROM Splang splang WHERE splang.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Splang.findByGihdChIdPackage", query = "SELECT splang FROM Splang splang WHERE splang.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Splang.findByGihdDIdPackage", query = "SELECT splang FROM Splang splang WHERE splang.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Splang.findByRowCheckSum", query = "SELECT splang FROM Splang splang WHERE splang.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Splang.findByRowCheckSumContaining", query = "SELECT splang FROM Splang splang WHERE splang.rowCheckSum like :rowCheckSum")

})

public class Splang implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Splang.findAll";
    public static final String FIND_BY_KODLANG = "Splang.findByKodLang";
    public static final String FIND_BY_KODLANG_CONTAINING = "Splang.findByKodLangContaining";
    public static final String FIND_BY_NAME = "Splang.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Splang.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Splang.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Splang.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Splang.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Splang.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Splang.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Splang.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Splang.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Splang.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Splang.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer id;


    @Column(name = "KOD_LANG", length = 3, nullable = true, unique = false)
    private String kodLang;


    @Column(name = "NAME", length = 255, nullable = true, unique = false)
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
    public Splang() {
    }

    /**
     * All field constructor
     */
    public Splang(
            Integer id,
            String kodLang,
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
                id,
                kodLang,
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

    public Splang(
            Integer id,
            String kodLang,
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
        setId(id);
        //attributes
        setKodLang(kodLang);
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

    public Splang flat() {
        return new Splang(
                getId(),
                getKodLang(),
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getKodLang() {
        return kodLang;
    }

    public void setKodLang(String kodLang) {
        this.kodLang = kodLang;
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
        return id.toString();
    }


}
