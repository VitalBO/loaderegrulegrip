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
 * <p>Title: Ipgosreg</p>
 * <p/>
 * <p>Description: Domain Object describing a Ipgosreg entity</p>
 */
@Entity(name = "Ipgosreg")
@Table(name = "\"IPGOSREG\"")
@NamedQueries({
        @NamedQuery(name = "Ipgosreg.findAll", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg")
        , @NamedQuery(name = "Ipgosreg.findByIdip", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.idip = :idip")

        , @NamedQuery(name = "Ipgosreg.findByRegnum", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.regnum = :regnum")
        , @NamedQuery(name = "Ipgosreg.findByRegnumContaining", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.regnum like :regnum")

        , @NamedQuery(name = "Ipgosreg.findByDtreg", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.dtreg = :dtreg")

        , @NamedQuery(name = "Ipgosreg.findByIdregorg", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.idregorg = :idregorg")

        , @NamedQuery(name = "Ipgosreg.findByIdvidreg", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.idvidreg = :idvidreg")

        , @NamedQuery(name = "Ipgosreg.findBySersvid", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.sersvid = :sersvid")

        , @NamedQuery(name = "Ipgosreg.findByNumsvid", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.numsvid = :numsvid")

        , @NamedQuery(name = "Ipgosreg.findByDtzap", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.dtzap = :dtzap")

        , @NamedQuery(name = "Ipgosreg.findByGihdAdate", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ipgosreg.findByGihdChdate", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ipgosreg.findByGihdDdate", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ipgosreg.findByGihdIdUser", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ipgosreg.findByGihdAIdPackage", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ipgosreg.findByGihdChIdPackage", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ipgosreg.findByGihdDIdPackage", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ipgosreg.findByRowCheckSum", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ipgosreg.findByRowCheckSumContaining", query = "SELECT ipgosreg FROM Ipgosreg ipgosreg WHERE ipgosreg.rowCheckSum like :rowCheckSum")

})

public class Ipgosreg implements Serializable {
    public static final String FIND_ALL = "Ipgosreg.findAll";
    public static final String FIND_BY_IDIP = "Ipgosreg.findByIdip";
    public static final String FIND_BY_REGNUM = "Ipgosreg.findByRegnum";
    public static final String FIND_BY_REGNUM_CONTAINING = "Ipgosreg.findByRegnumContaining";
    public static final String FIND_BY_DTREG = "Ipgosreg.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Ipgosreg.findByIdregorg";
    public static final String FIND_BY_IDVIDREG = "Ipgosreg.findByIdvidreg";
    public static final String FIND_BY_SERSVID = "Ipgosreg.findBySersvid";
    public static final String FIND_BY_NUMSVID = "Ipgosreg.findByNumsvid";
    public static final String FIND_BY_DTZAP = "Ipgosreg.findByDtzap";
    public static final String FIND_BY_GIHDADATE = "Ipgosreg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipgosreg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipgosreg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipgosreg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipgosreg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipgosreg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipgosreg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipgosreg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ipgosreg.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDREG")
    private String idreg;

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
    @ManyToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @REGNUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @REGNUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-REGNUM@
    @Column(name = "REGNUM", length = 20, nullable = true, unique = false)
    private String regnum;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTREG@
    @Column(name = "DTREG", nullable = true, unique = true)
    private Date dtreg;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDREGORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDREGORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDREGORG@
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDREGORG")
    private Spregorg idregorg;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @IDVIDREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDVIDREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDVIDREG@
    @ManyToOne
    @JoinColumn(name = "IDVIDREG")
    private Spvidreg idvidreg;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @SERSVID-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @SERSVID-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-SERSVID@
    @Column(name = "SERSVID", nullable = true, unique = false)
    private Integer sersvid;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @NUMSVID-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NUMSVID-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NUMSVID@
    @Column(name = "NUMSVID", nullable = true, unique = false)
    private Integer numsvid;
//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-ADDED-AREA-BEGINNING @DTZAP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTZAP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTZAP@
    @Column(name = "DTZAP", nullable = true, unique = false)
    private Date dtzap;
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
    public Ipgosreg() {
    }

    /**
     * All field constructor
     */
    public Ipgosreg(
            String idreg,
            Ip idip,
            String regnum,
            Date dtreg,
            Spregorg idregorg,
            Spvidreg idvidreg,
            Integer sersvid,
            Integer numsvid,
            Date dtzap,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idreg,
                idip,
                regnum,
                dtreg,
                idregorg,
                idvidreg,
                sersvid,
                numsvid,
                dtzap,
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

    public Ipgosreg(
            String idreg,
            Ip idip,
            String regnum,
            Date dtreg,
            Spregorg idregorg,
            Spvidreg idvidreg,
            Integer sersvid,
            Integer numsvid,
            Date dtzap,
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
        setIdreg(idreg);
        //attributes
        setIdip(idip);
        setRegnum(regnum);
        setDtreg(dtreg);
        setIdregorg(idregorg);
        setIdvidreg(idvidreg);
        setSersvid(sersvid);
        setNumsvid(numsvid);
        setDtzap(dtzap);
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

    public Ipgosreg flat() {
        return new Ipgosreg(
                getIdreg(),
                getIdip(),
                getRegnum(),
                getDtreg(),
                getIdregorg(),
                getIdvidreg(),
                getSersvid(),
                getNumsvid(),
                getDtzap(),
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

    public String getIdreg() {
        return idreg;
    }

    public void setIdreg(String idreg) {
        this.idreg = idreg;
    }

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDIP@
    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNUM@
    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREG@
    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDREGORG@
    public Spregorg getIdregorg() {
        return idregorg;
    }

    public void setIdregorg(Spregorg idregorg) {
        this.idregorg = idregorg;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDREG@
    public Spvidreg getIdvidreg() {
        return idvidreg;
    }

    public void setIdvidreg(Spvidreg idvidreg) {
        this.idvidreg = idvidreg;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SERSVID@
    public Integer getSersvid() {
        return sersvid;
    }

    public void setSersvid(Integer sersvid) {
        this.sersvid = sersvid;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NUMSVID@
    public Integer getNumsvid() {
        return numsvid;
    }

    public void setNumsvid(Integer numsvid) {
        this.numsvid = numsvid;
    }

//MP-MANAGED-UPDATABLE-ENDING

    //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTZAP@
    public Date getDtzap() {
        return dtzap;
    }

    public void setDtzap(Date dtzap) {
        this.dtzap = dtzap;
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
