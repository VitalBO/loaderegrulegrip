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
 * - time      : 2015/02/12 ?.?. at 10:23:31 MSK
 */
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Sppreddok</p>
 * <p/>
 * <p>Description: Domain Object describing a Sppreddok entity</p>
 */
@Entity(name = "Sppreddok")
@Table(name = "SPPREDDOK")
@NamedQueries({
        @NamedQuery(name = "Sppreddok.findAll", query = "SELECT sppreddok FROM Sppreddok sppreddok")

        , @NamedQuery(name = "Sppreddok.findByNumdok", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.numdok = :numdok")

        , @NamedQuery(name = "Sppreddok.findByName", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.name = :name")
        , @NamedQuery(name = "Sppreddok.findByNameContaining", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.name like :name")

        , @NamedQuery(name = "Sppreddok.findByDtdok", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.dtdok = :dtdok")

        , @NamedQuery(name = "Sppreddok.findByGihdAdate", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Sppreddok.findByGihdChdate", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Sppreddok.findByGihdDdate", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Sppreddok.findByGihdIdUser", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Sppreddok.findByGihdAIdPackage", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Sppreddok.findByGihdChIdPackage", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Sppreddok.findByGihdDIdPackage", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Sppreddok.findByRowCheckSum", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Sppreddok.findByRowCheckSumContaining", query = "SELECT sppreddok FROM Sppreddok sppreddok WHERE sppreddok.rowCheckSum like :rowCheckSum")

})

public class Sppreddok implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Sppreddok.findAll";
    public static final String FIND_BY_NUMDOK = "Sppreddok.findByNumdok";
    public static final String FIND_BY_NAME = "Sppreddok.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Sppreddok.findByNameContaining";
    public static final String FIND_BY_DTDOK = "Sppreddok.findByDtdok";
    public static final String FIND_BY_GIHDADATE = "Sppreddok.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Sppreddok.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Sppreddok.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Sppreddok.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Sppreddok.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Sppreddok.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Sppreddok.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Sppreddok.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Sppreddok.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "PREDDOKSEQ", sequenceName = "SEQ_SPPREDDOK", allocationSize = 1)
    @Id
    @Column(name = "IDDOK")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PREDDOKSEQ")
    private Integer iddok;


    @Column(name = "NUMDOK", length = 50, nullable = true, unique = false)
    private String numdok;


    @Column(name = "NAME", length = 1000, nullable = false, unique = false)
    private String name;


    @Column(name = "DTDOK", nullable = true, unique = false)
    private Date dtdok;


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
    public Sppreddok() {
    }


    /**
     * All field constructor
     */
    public Sppreddok(
            Integer iddok,
            String numdok,
            String name,
            Date dtdok,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                iddok,
                numdok,
                name,
                dtdok,
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


    public Sppreddok(
            Integer iddok,
            String numdok,
            String name,
            Date dtdok,
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
        setIddok(iddok);
        //attributes
        setNumdok(numdok);
        setName(name);
        setDtdok(dtdok);
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
        if (!(o instanceof Sppreddok)) return false;

        Sppreddok sppreddok = (Sppreddok) o;

        return iddok.equals(sppreddok.iddok);

    }

    @Override
    public int hashCode() {
        return iddok.hashCode();
    }

    public Sppreddok flat() {
        return new Sppreddok(
                getIddok(),
                getNumdok(),
                getName(),
                getDtdok(),
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

    public Integer getIddok() {
        return iddok;
    }

    public void setIddok(Integer iddok) {
        this.iddok = iddok;
    }


    public String getNumdok() {
        return numdok;
    }

    public void setNumdok(String numdok) {
        this.numdok = numdok;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDtdok() {
        return dtdok;
    }

    public void setDtdok(Date dtdok) {
        this.dtdok = dtdok;
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
        return iddok.toString();
    }
}