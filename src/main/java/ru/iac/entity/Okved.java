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


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Okved</p>
 * <p/>
 * <p>Description: Domain Object describing a Okved entity</p>
 */
@Entity(name = "Okved")
@Table(name = "\"OKVED\"")
@NamedQueries({
        @NamedQuery(name = "Okved.findAll", query = "SELECT okved FROM Okved okved")

        , @NamedQuery(name = "Okved.findByName", query = "SELECT okved FROM Okved okved WHERE okved.name = :name")
        , @NamedQuery(name = "Okved.findByNameContaining", query = "SELECT okved FROM Okved okved WHERE okved.name like :name")

        , @NamedQuery(name = "Okved.findByCodeOkvedNId", query = "SELECT okved FROM Okved okved WHERE okved.codeOkved = :kod")

        , @NamedQuery(name = "Okved.findByCodeOkved", query = "SELECT okved FROM Okved okved WHERE okved.codeOkved = :codeOkved")
        , @NamedQuery(name = "Okved.findByCodeOkvedContaining", query = "SELECT okved FROM Okved okved WHERE okved.codeOkved like :codeOkved")

        , @NamedQuery(name = "Okved.findByGihdAdate", query = "SELECT okved FROM Okved okved WHERE okved.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Okved.findByGihdChdate", query = "SELECT okved FROM Okved okved WHERE okved.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Okved.findByGihdDdate", query = "SELECT okved FROM Okved okved WHERE okved.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Okved.findByGihdIdUser", query = "SELECT okved FROM Okved okved WHERE okved.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Okved.findByGihdAIdPackage", query = "SELECT okved FROM Okved okved WHERE okved.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Okved.findByGihdChIdPackage", query = "SELECT okved FROM Okved okved WHERE okved.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Okved.findByGihdDIdPackage", query = "SELECT okved FROM Okved okved WHERE okved.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Okved.findByRowCheckSum", query = "SELECT okved FROM Okved okved WHERE okved.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Okved.findByRowCheckSumContaining", query = "SELECT okved FROM Okved okved WHERE okved.rowCheckSum like :rowCheckSum")

        , @NamedQuery(name = "Okved.findByVersOkved", query = "SELECT okved FROM Okved okved WHERE okved.versOkved = :versOkved")

        , @NamedQuery(name = "Okved.findByRegnum", query = "SELECT okved FROM Okved okved WHERE okved.regnum = :regnum")

        , @NamedQuery(name = "Okved.findByDtreg", query = "SELECT okved FROM Okved okved WHERE okved.dtreg = :dtreg")

})

public class Okved implements Serializable, EgrulEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Okved.findAll";
    public static final String FIND_BY_NATURALID = "Okved.findByCodeOkvedNId";
    public static final String FIND_BY_NAME = "Okved.findByName";
    public static final String FIND_BY_NAME_CONTAINING = "Okved.findByNameContaining";
    public static final String FIND_BY_CODEOKVED = "Okved.findByCodeOkved";
    public static final String FIND_BY_CODEOKVED_CONTAINING = "Okved.findByCodeOkvedContaining";
    public static final String FIND_BY_GIHDADATE = "Okved.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Okved.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Okved.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Okved.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Okved.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Okved.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Okved.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Okved.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Okved.findByRowCheckSumContaining";
    public static final String FIND_BY_VERSOKVED = "Okved.findByVersOkved";
    public static final String FIND_BY_REGNUM = "Okved.findByRegnum";
    public static final String FIND_BY_DTREG = "Okved.findByDtreg";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "OKVEDSEQ", sequenceName = "SEQ_OKVED", allocationSize = 1)
    @Id
    @Column(name = "IDOKVED")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OKVEDSEQ")
    private Integer idokved;


    @Column(name = "NAME", length = 150, nullable = true, unique = false)
    private String name;


    @NaturalId
    @Column(name = "CODE_OKVED", length = 10, nullable = true, unique = false)
    private String codeOkved;


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

    @Column(name = "VERS_OKVED", nullable = true, unique = false)
    private String versOkved;

    @Column(name = "REGNUM", nullable = true, unique = false)
    private String regnum;

    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;


    /**
     * Default constructor
     */
    public Okved() {
    }

    /**
     * All field constructor
     */
    public Okved(
            Integer idokved,
            String name,
            String codeOkved,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            String versOkved,
            String regnum,
            Date dtreg) {
        this(
                idokved,
                name,
                codeOkved,
                gihdAdate,
                gihdChdate,
                gihdDdate,
                gihdIdUser,
                gihdAIdPackage,
                gihdChIdPackage,
                gihdDIdPackage,
                rowCheckSum,
                versOkved,
                regnum,
                dtreg
                , true);
    }

    public Okved(
            Integer idokved,
            String name,
            String codeOkved,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            String versOkved,
            String regnum,
            Date dtreg
            , boolean setRelationship) {
        //primary keys
        setIdokved(idokved);
        //attributes
        setName(name);
        setCodeOkved(codeOkved);
        setGihdAdate(gihdAdate);
        setGihdChdate(gihdChdate);
        setGihdDdate(gihdDdate);
        setGihdIdUser(gihdIdUser);
        setGihdAIdPackage(gihdAIdPackage);
        setGihdChIdPackage(gihdChIdPackage);
        setGihdDIdPackage(gihdDIdPackage);
        setRowCheckSum(rowCheckSum);
        setVersOkved(versOkved);
        setRegnum(regnum);
        setDtreg(dtreg);
        //parents
    }

    public Okved flat() {
        return new Okved(
                getIdokved(),
                getName(),
                getCodeOkved(),
                getGihdAdate(),
                getGihdChdate(),
                getGihdDdate(),
                getGihdIdUser(),
                getGihdAIdPackage(),
                getGihdChIdPackage(),
                getGihdDIdPackage(),
                getRowCheckSum(),
                getVersOkved(),
                getRegnum(),
                getDtreg()
                , false
        );
    }

    public Integer getIdokved() {
        return idokved;
    }

    public void setIdokved(Integer idokved) {
        this.idokved = idokved;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCodeOkved() {
        return codeOkved;
    }

    public void setCodeOkved(String codeOkved) {
        this.codeOkved = codeOkved;
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


    public String getVersOkved() {
        return versOkved;
    }

    public void setVersOkved(String versOkved) {
        this.versOkved = versOkved;
    }


    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }


    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
    }

    @Override
    public String getIdenti() {
        return idokved == null ? null : idokved.toString();
    }

    @Override
    public String getnaturalId() {
        return codeOkved;
    }

    @Override
    public String returnNaturalIdQuery() {
        return FIND_BY_NATURALID;
    }


}
