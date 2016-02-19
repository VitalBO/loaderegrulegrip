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
import org.hibernate.annotations.CascadeType;

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

public class Ipgosreg implements Serializable, EgrulEntity {
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

    @ManyToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;

    @Column(name = "REGNUM", length = 20, nullable = true, unique = false)
    private String regnum;

    @Column(name = "DTREG", nullable = true, unique = true)
    private Date dtreg;

    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDREGORG")
    private Spregorg idregorg;

    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDVIDREG")
    private Spvidreg idvidreg;

    @Column(name = "SERSVID", nullable = true, unique = false)
    private Integer sersvid;

    @Column(name = "NUMSVID", nullable = true, unique = false)
    private Integer numsvid;

    @Column(name = "DTZAP", nullable = true, unique = false)
    private Date dtzap;

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
        setIdreg(idreg);
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

    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
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


    public Spregorg getIdregorg() {
        return idregorg;
    }

    public void setIdregorg(Spregorg idregorg) {
        this.idregorg = idregorg;
    }


    public Spvidreg getIdvidreg() {
        return idvidreg;
    }

    public void setIdvidreg(Spvidreg idvidreg) {
        this.idvidreg = idvidreg;
    }


    public Integer getSersvid() {
        return sersvid;
    }

    public void setSersvid(Integer sersvid) {
        this.sersvid = sersvid;
    }


    public Integer getNumsvid() {
        return numsvid;
    }

    public void setNumsvid(Integer numsvid) {
        this.numsvid = numsvid;
    }


    public Date getDtzap() {
        return dtzap;
    }

    public void setDtzap(Date dtzap) {
        this.dtzap = dtzap;
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
        return idreg;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ipgosreg ipgosreg = (Ipgosreg) o;

        if (idreg != null ? !idreg.equals(ipgosreg.idreg) : ipgosreg.idreg != null) return false;
        return regnum != null ? regnum.equals(ipgosreg.regnum) : ipgosreg.regnum == null;

    }

    @Override
    public int hashCode() {
        int result = idreg != null ? idreg.hashCode() : 0;
        result = 31 * result + (regnum != null ? regnum.hashCode() : 0);
        return result;
    }
}
