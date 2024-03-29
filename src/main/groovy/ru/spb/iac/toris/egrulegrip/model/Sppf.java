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
 * <p>Title: Sppf</p>
 * <p/>
 * <p>Description: Domain Object describing a Sppf entity</p>
 */
@Entity(name = "Sppf")
@Table(name = "SPPF")
@NamedQueries({
        @NamedQuery(name = "Sppf.findAll", query = "SELECT sppf FROM Sppf sppf")
        , @NamedQuery(name = "Sppf.findByName", query = "SELECT sppf FROM Sppf sppf WHERE sppf.name = :name")
        , @NamedQuery(name = "Sppf.findByNameContaining", query = "SELECT sppf FROM Sppf sppf WHERE sppf.name like :name")

        , @NamedQuery(name = "Sppf.findByKod", query = "SELECT sppf FROM Sppf sppf WHERE sppf.kod = :kod order by 1")
        , @NamedQuery(name = "Sppf.findByKodContaining", query = "SELECT sppf FROM Sppf sppf WHERE sppf.kod like :kod")

        , @NamedQuery(name = "Sppf.findByGihdAdate", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Sppf.findByGihdChdate", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Sppf.findByGihdDdate", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Sppf.findByGihdIdUser", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Sppf.findByGihdAIdPackage", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Sppf.findByGihdChIdPackage", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Sppf.findByGihdDIdPackage", query = "SELECT sppf FROM Sppf sppf WHERE sppf.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Sppf.findByRowCheckSum", query = "SELECT sppf FROM Sppf sppf WHERE sppf.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Sppf.findByRowCheckSumContaining", query = "SELECT sppf FROM Sppf sppf WHERE sppf.rowCheckSum like :rowCheckSum")

})

public class Sppf implements Serializable, EgrulEgripEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Sppf.findAll";
    public static final String FIND_BY_NATURALID = "Sppf.findByKod";
    public static final String FIND_BY_NAME = "Sppf.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Sppf.findByNameContaining";
    public static final String FIND_BY_KOD = "Sppf.findByKod";
    public static final String FIND_BY_KOD_CONTAINING = "Sppf.findByKodContaining";
    public static final String FIND_BY_GIHDADATE = "Sppf.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Sppf.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Sppf.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Sppf.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Sppf.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Sppf.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Sppf.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Sppf.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Sppf.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "SPPFSEQ", sequenceName = "SEQ_SPPF", allocationSize = 1)
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPPFSEQ")
    private Integer id;


    @Column(name = "NAME", length = 255, nullable = true, unique = true)
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
    public Sppf() {
    }

    /**
     * All field constructor
     */
    public Sppf(
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

    public Sppf(
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

    public Sppf flat() {
        return new Sppf(
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
