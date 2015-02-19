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

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name = "IDUL")
    private Ul idul;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
    @ManyToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @NUMLIC-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NUMLIC-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NUMLIC@
    @Column(name = "NUMLIC", length = 50, nullable = true, unique = false)
    private String numlic;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDLICORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDLICORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDLICORG@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDLICORG")
    private Splicorg idlicorg;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDVIDLIC-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDVIDLIC-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDVIDLIC@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDVIDLIC")
    private Spvidlic idvidlic;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDSOSTLIC-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDSOSTLIC-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDSOSTLIC@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDSOSTLIC")
    private Spsostlic idsostlic;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTEND-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTEND-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTEND@
    @Column(name = "DTEND", nullable = true, unique = false)
    private Date dtend;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTSTOP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTOP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTOP@
    @Column(name = "DTSTOP", nullable = true, unique = false)
    private Date dtstop;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTRESTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTRESTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTRESTART@
    @Column(name = "DTRESTART", nullable = true, unique = false)
    private Date dtrestart;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__ADATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__ADATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__ADATE@
    @Column(name = "GIHD__ADATE", nullable = true, unique = false)
    private Date gihdAdate;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__CHDATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__CHDATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__CHDATE@
    @Column(name = "GIHD__CHDATE", nullable = true, unique = false)
    private Date gihdChdate;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__DDATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__DDATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__DDATE@
    @Column(name = "GIHD__DDATE", nullable = true, unique = false)
    private Date gihdDdate;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__ID_USER-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__ID_USER-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__ID_USER@
    @Column(name = "GIHD__ID_USER", nullable = true, unique = false)
    private Integer gihdIdUser;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__A_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__A_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__A_ID_PACKAGE@
    @Column(name = "GIHD__A_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdAIdPackage;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__CH_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__CH_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__CH_ID_PACKAGE@
    @Column(name = "GIHD__CH_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdChIdPackage;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__D_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__D_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__D_ID_PACKAGE@
    @Column(name = "GIHD__D_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdDIdPackage;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ROW_CHECK_SUM@
    @Column(name = "ROW_CHECK_SUM", nullable = true, unique = false)
    private String rowCheckSum;
//MP-MANAGED-UPDATABLE-ENDING

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
            Spvidlic idvidlic,
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
            Spvidlic idvidlic,
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

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDIP@
    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NUMLIC@
    public String getNumlic() {
        return numlic;
    }

    public void setNumlic(String numlic) {
        this.numlic = numlic;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDLICORG@
    public Splicorg getIdlicorg() {
        return idlicorg;
    }

    public void setIdlicorg(Splicorg idlicorg) {
        this.idlicorg = idlicorg;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDLIC@
    public Spvidlic getIdvidlic() {
        return idvidlic;
    }

    public void setIdvidlic(Spvidlic idvidlic) {
        this.idvidlic = idvidlic;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDSOSTLIC@
    public Spsostlic getIdsostlic() {
        return idsostlic;
    }

    public void setIdsostlic(Spsostlic idsostlic) {
        this.idsostlic = idsostlic;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTSTART@
    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTEND@
    public Date getDtend() {
        return dtend;
    }

    public void setDtend(Date dtend) {
        this.dtend = dtend;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTSTOP@
    public Date getDtstop() {
        return dtstop;
    }

    public void setDtstop(Date dtstop) {
        this.dtstop = dtstop;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTRESTART@
    public Date getDtrestart() {
        return dtrestart;
    }

    public void setDtrestart(Date dtrestart) {
        this.dtrestart = dtrestart;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__ADATE@
    public Date getGihdAdate() {
        return gihdAdate;
    }

    public void setGihdAdate(Date gihdAdate) {
        this.gihdAdate = gihdAdate;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__CHDATE@
    public Date getGihdChdate() {
        return gihdChdate;
    }

    public void setGihdChdate(Date gihdChdate) {
        this.gihdChdate = gihdChdate;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__DDATE@
    public Date getGihdDdate() {
        return gihdDdate;
    }

    public void setGihdDdate(Date gihdDdate) {
        this.gihdDdate = gihdDdate;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__ID_USER@
    public Integer getGihdIdUser() {
        return gihdIdUser;
    }

    public void setGihdIdUser(Integer gihdIdUser) {
        this.gihdIdUser = gihdIdUser;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__A_ID_PACKAGE@
    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }

    public void setGihdAIdPackage(Integer gihdAIdPackage) {
        this.gihdAIdPackage = gihdAIdPackage;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__CH_ID_PACKAGE@
    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }

    public void setGihdChIdPackage(Integer gihdChIdPackage) {
        this.gihdChIdPackage = gihdChIdPackage;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__D_ID_PACKAGE@
    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }

    public void setGihdDIdPackage(Integer gihdDIdPackage) {
        this.gihdDIdPackage = gihdDIdPackage;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-ROW_CHECK_SUM@
    public String getRowCheckSum() {
        return rowCheckSum;
    }

    public void setRowCheckSum(String rowCheckSum) {
        this.rowCheckSum = rowCheckSum;
    }

//MP-MANAGED-UPDATABLE-ENDING


//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
