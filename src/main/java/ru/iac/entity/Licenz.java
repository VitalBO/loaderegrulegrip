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


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * <p>Title: Licenz</p>
 * <p/>
 * <p>Description: Domain Object describing a Licenz entity</p>
 */
@Entity(name = "Licenz")
@Table(name = "\"LICENZ\"")
@NamedQueries({
        @NamedQuery(name = "Licenz.findAll", query = "SELECT licenz FROM Licenz licenz")
        , @NamedQuery(name = "Licenz.findByIdul", query = "SELECT licenz FROM Licenz licenz WHERE licenz.idul = :idul")

        , @NamedQuery(name = "Licenz.findByIdip", query = "SELECT licenz FROM Licenz licenz WHERE licenz.idip = :idip")

        , @NamedQuery(name = "Licenz.findByNumlic", query = "SELECT licenz FROM Licenz licenz WHERE licenz.numlic = :numlic")
        , @NamedQuery(name = "Licenz.findByNumlicContaining", query = "SELECT licenz FROM Licenz licenz WHERE licenz.numlic like :numlic")

        , @NamedQuery(name = "Licenz.findByIdlicorg", query = "SELECT licenz FROM Licenz licenz WHERE licenz.idlicorg = :idlicorg")

        , @NamedQuery(name = "Licenz.findByIdvidlic", query = "SELECT licenz FROM Licenz licenz WHERE licenz.idvidlic = :idvidlic")

        , @NamedQuery(name = "Licenz.findByIdsostlic", query = "SELECT licenz FROM Licenz licenz WHERE licenz.idsostlic = :idsostlic")

        , @NamedQuery(name = "Licenz.findByDtstart", query = "SELECT licenz FROM Licenz licenz WHERE licenz.dtstart = :dtstart")

        , @NamedQuery(name = "Licenz.findByDtend", query = "SELECT licenz FROM Licenz licenz WHERE licenz.dtend = :dtend")

        , @NamedQuery(name = "Licenz.findByDtstop", query = "SELECT licenz FROM Licenz licenz WHERE licenz.dtstop = :dtstop")

        , @NamedQuery(name = "Licenz.findByDtrestart", query = "SELECT licenz FROM Licenz licenz WHERE licenz.dtrestart = :dtrestart")

        , @NamedQuery(name = "Licenz.findByGihdAdate", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Licenz.findByGihdChdate", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Licenz.findByGihdDdate", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Licenz.findByGihdIdUser", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Licenz.findByGihdAIdPackage", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Licenz.findByGihdChIdPackage", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Licenz.findByGihdDIdPackage", query = "SELECT licenz FROM Licenz licenz WHERE licenz.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Licenz.findByRowCheckSum", query = "SELECT licenz FROM Licenz licenz WHERE licenz.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Licenz.findByRowCheckSumContaining", query = "SELECT licenz FROM Licenz licenz WHERE licenz.rowCheckSum like :rowCheckSum")

})

public class Licenz implements Serializable {
    public static final String FIND_ALL = "Licenz.findAll";
    public static final String FIND_BY_IDUL = "Licenz.findByIdul";
    public static final String FIND_BY_IDIP = "Licenz.findByIdip";
    public static final String FIND_BY_NUMLIC = "Licenz.findByNumlic";
    public static final String FIND_BY_NUMLIC_CONTAINING = "Licenz.findByNumlicContaining";
    public static final String FIND_BY_IDLICORG = "Licenz.findByIdlicorg";
    public static final String FIND_BY_IDVIDLIC = "Licenz.findByIdvidlic";
    public static final String FIND_BY_IDSOSTLIC = "Licenz.findByIdsostlic";
    public static final String FIND_BY_DTSTART = "Licenz.findByDtstart";
    public static final String FIND_BY_DTEND = "Licenz.findByDtend";
    public static final String FIND_BY_DTSTOP = "Licenz.findByDtstop";
    public static final String FIND_BY_DTRESTART = "Licenz.findByDtrestart";
    public static final String FIND_BY_GIHDADATE = "Licenz.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Licenz.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Licenz.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Licenz.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Licenz.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Licenz.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Licenz.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Licenz.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Licenz.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "LICENZSEQ", sequenceName = "SEQ_LICENZ", allocationSize = 1)
    @Id
    @Column(name = "IDLIC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LICENZSEQ")
    private Integer idlic;


    @ManyToOne
    @JoinColumn(name = "IDUL")
    private Ul idul;


    @ManyToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;


    @Column(name = "NUMLIC", length = 50, nullable = true, unique = false)
    private String numlic;


    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDLICORG")
    private Splicorg idlicorg;


    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(name = "VIDLIC", joinColumns = {
            @JoinColumn(name = "IDLIC", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "IDVIDLIC",
                    nullable = false, updatable = false)})
    private Set<Spvidlic> idvidlic;


    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDSOSTLIC")
    private Spsostlic idsostlic;


    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;


    @Column(name = "DTEND", nullable = true, unique = false)
    private Date dtend;


    @Column(name = "DTSTOP", nullable = true, unique = false)
    private Date dtstop;


    @Column(name = "DTRESTART", nullable = true, unique = false)
    private Date dtrestart;


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
    public Licenz() {
    }

    /**
     * All field constructor
     */
    public Licenz(
            Integer idlic,
            Ul idul,
            Ip idip,
            String numlic,
            Splicorg idlicorg,
            Set<Spvidlic> idvidlic,
            Spsostlic idsostlic,
            Date dtstart,
            Date dtend,
            Date dtstop,
            Date dtrestart,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idlic,
                idul,
                idip,
                numlic,
                idlicorg,
                idvidlic,
                idsostlic,
                dtstart,
                dtend,
                dtstop,
                dtrestart,
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

    public Licenz(
            Integer idlic,
            Ul idul,
            Ip idip,
            String numlic,
            Splicorg idlicorg,
            Set<Spvidlic> idvidlic,
            Spsostlic idsostlic,
            Date dtstart,
            Date dtend,
            Date dtstop,
            Date dtrestart,
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
        setIdlic(idlic);
        //attributes
        setIdul(idul);
        setIdip(idip);
        setNumlic(numlic);
        setIdlicorg(idlicorg);
        setIdvidlic(idvidlic);
        setIdsostlic(idsostlic);
        setDtstart(dtstart);
        setDtend(dtend);
        setDtstop(dtstop);
        setDtrestart(dtrestart);
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

    public Licenz flat() {
        return new Licenz(
                getIdlic(),
                getIdul(),
                getIdip(),
                getNumlic(),
                getIdlicorg(),
                getIdvidlic(),
                getIdsostlic(),
                getDtstart(),
                getDtend(),
                getDtstop(),
                getDtrestart(),
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

    public Integer getIdlic() {
        return idlic;
    }

    public void setIdlic(Integer idlic) {
        this.idlic = idlic;
    }


    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }


    public String getNumlic() {
        return numlic;
    }

    public void setNumlic(String numlic) {
        this.numlic = numlic;
    }


    public Splicorg getIdlicorg() {
        return idlicorg;
    }

    public void setIdlicorg(Splicorg idlicorg) {
        this.idlicorg = idlicorg;
    }


    public Spsostlic getIdsostlic() {
        return idsostlic;
    }

    public void setIdsostlic(Spsostlic idsostlic) {
        this.idsostlic = idsostlic;
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


    public Date getDtstop() {
        return dtstop;
    }

    public void setDtstop(Date dtstop) {
        this.dtstop = dtstop;
    }


    public Set<Spvidlic> getIdvidlic() {
        return idvidlic;
    }

    public void setIdvidlic(Set<Spvidlic> idvidlic) {
        this.idvidlic = idvidlic;
    }


    public Date getDtrestart() {
        return dtrestart;
    }

    public void setDtrestart(Date dtrestart) {
        this.dtrestart = dtrestart;
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


}
