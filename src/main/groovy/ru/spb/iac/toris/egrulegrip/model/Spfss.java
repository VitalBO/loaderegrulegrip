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
package ru.spb.iac.toris.egrulegrip.model;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Spfss</p>
 * <p/>
 * <p>Description: Domain Object describing a Spfss entity</p>
 */
@Entity(name = "Spfss")
@Table(name = "SPFSS")
@NamedQueries({
        @NamedQuery(name = "Spfss.findAll", query = "SELECT spfss FROM Spfss spfss")

        , @NamedQuery(name = "Spfss.findByName", query = "SELECT spfss FROM Spfss spfss WHERE spfss.name = :name")
        , @NamedQuery(name = "Spfss.findByNameContaining", query = "SELECT spfss FROM Spfss spfss WHERE spfss.name like :name")

        , @NamedQuery(name = "Spfss.findByKod", query = "SELECT spfss FROM Spfss spfss WHERE spfss.kod = :kod order by 1")
        , @NamedQuery(name = "Spfss.findByKodContaining", query = "SELECT spfss FROM Spfss spfss WHERE spfss.kod like :kod")

        , @NamedQuery(name = "Spfss.findByGihdAdate", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Spfss.findByGihdChdate", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Spfss.findByGihdDdate", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Spfss.findByGihdIdUser", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Spfss.findByGihdAIdPackage", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Spfss.findByGihdChIdPackage", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Spfss.findByGihdDIdPackage", query = "SELECT spfss FROM Spfss spfss WHERE spfss.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Spfss.findByRowCheckSum", query = "SELECT spfss FROM Spfss spfss WHERE spfss.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Spfss.findByRowCheckSumContaining", query = "SELECT spfss FROM Spfss spfss WHERE spfss.rowCheckSum like :rowCheckSum")

})

public class Spfss implements Serializable, EgrulEgripEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Spfss.findAll";
    public static final String FIND_BY_NATURALID = "Spfss.findByKod";

    public static final String FIND_BY_NAME = "Spfss.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Spfss.findByNameContaining";
    public static final String FIND_BY_KOD = "Spfss.findByKod";
    public static final String FIND_BY_KOD_CONTAINING = "Spfss.findByKodContaining";
    public static final String FIND_BY_GIHDADATE = "Spfss.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spfss.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spfss.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spfss.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spfss.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spfss.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spfss.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spfss.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Spfss.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "SPFSSSEQ", sequenceName = "SEQ_SPFSS", allocationSize = 1)
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPFSSSEQ")
    private Integer id;


    @Column(name = "NAME", length = 255, nullable = true, unique = false)
    private String name;


    @NaturalId
    @Column(name = "KOD", length = 10, nullable = true, unique = false)
    private String kod;


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
    public Spfss() {
    }

    /**
     * All field constructor
     */
    public Spfss(
            Integer id,
            String name,
            String kod,
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
                name,
                kod,
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

    public Spfss(
            Integer id,
            String name,
            String kod,
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
        setName(name);
        setKod(kod);
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

    public Spfss flat() {
        return new Spfss(
                getId(),
                getName(),
                getKod(),
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
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
        return id == null ? null : id.toString();
    }


    @Override
    public String getnaturalId() {
        return kod;
    }


    @Override
    public String returnNaturalIdQuery() {
        return FIND_BY_NATURALID;
    }


}
