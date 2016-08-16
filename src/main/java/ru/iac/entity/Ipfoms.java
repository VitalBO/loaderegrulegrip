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
 * - time      : 2015/02/12 �.�. at 10:23:31 MSK
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
 *
 * <p>Title: Ipfoms</p>
 *
 * <p>Description: Domain Object describing a Ipfoms entity</p>
 *
 */
@Entity(name = "Ipfoms")
@Table(name = "\"IPFOMS\"")
@NamedQueries({
        @NamedQuery(name = "Ipfoms.findAll", query = "SELECT ipfoms FROM Ipfoms ipfoms")
        , @NamedQuery(name = "Ipfoms.findByIdip", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.idip = :idip")

        , @NamedQuery(name = "Ipfoms.findByIdfoms", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.idfoms = :idfoms")

        , @NamedQuery(name = "Ipfoms.findByRegnomFoms", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.regnomFoms = :regnomFoms")
        , @NamedQuery(name = "Ipfoms.findByRegnomFomsContaining", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.regnomFoms like :regnomFoms")

        , @NamedQuery(name = "Ipfoms.findByDtstart", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.dtstart = :dtstart")

        , @NamedQuery(name = "Ipfoms.findByDtend", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.dtend = :dtend")

        , @NamedQuery(name = "Ipfoms.findByGihdAdate", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ipfoms.findByGihdChdate", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ipfoms.findByGihdDdate", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ipfoms.findByGihdIdUser", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ipfoms.findByGihdAIdPackage", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ipfoms.findByGihdChIdPackage", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ipfoms.findByGihdDIdPackage", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ipfoms.findByRowCheckSum", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ipfoms.findByRowCheckSumContaining", query = "SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.rowCheckSum like :rowCheckSum")
})

public class Ipfoms implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Ipfoms.findAll";
    public static final String FIND_BY_IDIP = "Ipfoms.findByIdip";
    public static final String FIND_BY_IDFOMS = "Ipfoms.findByIdfoms";
    public static final String FIND_BY_REGNOMFOMS = "Ipfoms.findByRegnomFoms";
    public static final String FIND_BY_REGNOMFOMS_CONTAINING = "Ipfoms.findByRegnomFomsContaining";
    public static final String FIND_BY_DTSTART = "Ipfoms.findByDtstart";
    public static final String FIND_BY_DTEND = "Ipfoms.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ipfoms.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipfoms.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipfoms.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipfoms.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipfoms.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipfoms.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipfoms.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipfoms.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ipfoms.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPFOMSSEQ", sequenceName = "SEQ_IPFOMS", allocationSize = 1)
    @Id
    @Column(name = "IDIPFOMS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IPFOMSSEQ")
    private Integer idipfoms;


    @OneToOne
    @JoinColumn(name = "IDIP")
    @NaturalId
    private Ip idip;


    @ManyToOne
    @JoinColumn(name = "IDFOMS")
    private Spfoms idfoms;


    @Column(name = "REGNOM_FOMS", length = 40, nullable = true, unique = false)
    private String regnomFoms;


    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;


    @Column(name = "DTEND", nullable = true, unique = false)
    private Date dtend;


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
    public Ipfoms() {
    }

    /**
     * All field constructor
     */
    public Ipfoms(
            Integer idipfoms,
            Ip idip,
            Spfoms idfoms,
            String regnomFoms,
            Date dtstart,
            Date dtend,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idipfoms,
                idip,
                idfoms,
                regnomFoms,
                dtstart,
                dtend,
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

    public Ipfoms(
            Integer idipfoms,
            Ip idip,
            Spfoms idfoms,
            String regnomFoms,
            Date dtstart,
            Date dtend,
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
        setIdipfoms(idipfoms);
        //attributes
        setIdip(idip);
        setIdfoms(idfoms);
        setRegnomFoms(regnomFoms);
        setDtstart(dtstart);
        setDtend(dtend);
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

    public Ipfoms flat() {
        return new Ipfoms(
                getIdipfoms(),
                getIdip(),
                getIdfoms(),
                getRegnomFoms(),
                getDtstart(),
                getDtend(),
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

    public Integer getIdipfoms() {
        return idipfoms;
    }

    public void setIdipfoms(Integer idipfoms) {
        this.idipfoms = idipfoms;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }


    public Spfoms getIdfoms() {
        return idfoms;
    }

    public void setIdfoms(Spfoms idfoms) {
        this.idfoms = idfoms;
    }


    public String getRegnomFoms() {
        return regnomFoms;
    }

    public void setRegnomFoms(String regnomFoms) {
        this.regnomFoms = regnomFoms;
    }


    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
    }


    public Date getDtend() {
        return dtend;
    }

    public void setDtend(Date dtend) {
        this.dtend = dtend;
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
        return idipfoms.toString();
    }


}
