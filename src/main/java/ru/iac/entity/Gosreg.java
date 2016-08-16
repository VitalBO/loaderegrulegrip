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

/**
 * <p>Title: Gosreg</p>
 * <p/>
 * <p>Description: Domain Object describing a Gosreg entity</p>
 */
@Entity(name = "Gosreg")
@Table(name = "\"GOSREG\"")
@NamedQueries({
        @NamedQuery(name = "Gosreg.findAll", query = "SELECT gosreg FROM Gosreg gosreg")
        , @NamedQuery(name = "Gosreg.findByIdul", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.idul = :idul")

        , @NamedQuery(name = "Gosreg.findByRegnum", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.regnum = :regnum")
        , @NamedQuery(name = "Gosreg.findByRegnumContaining", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.regnum like :regnum")

        , @NamedQuery(name = "Gosreg.findByDtreg", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.dtreg = :dtreg")

        , @NamedQuery(name = "Gosreg.findByIdregorg", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.idregorg = :idregorg")

        , @NamedQuery(name = "Gosreg.findByIdvidreg", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.idvidreg = :idvidreg")

        , @NamedQuery(name = "Gosreg.findBySersvid", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.sersvid = :sersvid")

        , @NamedQuery(name = "Gosreg.findByNumsvid", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.numsvid = :numsvid")

        , @NamedQuery(name = "Gosreg.findByDtzap", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.dtzap = :dtzap")

        , @NamedQuery(name = "Gosreg.findByGihdAdate", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Gosreg.findByGihdChdate", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Gosreg.findByGihdDdate", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Gosreg.findByGihdIdUser", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Gosreg.findByGihdAIdPackage", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Gosreg.findByGihdChIdPackage", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Gosreg.findByGihdDIdPackage", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Gosreg.findByRowCheckSum", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Gosreg.findByRowCheckSumContaining", query = "SELECT gosreg FROM Gosreg gosreg WHERE gosreg.rowCheckSum like :rowCheckSum")

})

public class Gosreg implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Gosreg.findAll";
    public static final String FIND_BY_IDUL = "Gosreg.findByIdul";
    public static final String FIND_BY_REGNUM = "Gosreg.findByRegnum";
    public static final String FIND_BY_REGNUM_CONTAINING = "Gosreg.findByRegnumContaining";
    public static final String FIND_BY_DTREG = "Gosreg.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Gosreg.findByIdregorg";
    public static final String FIND_BY_IDVIDREG = "Gosreg.findByIdvidreg";
    public static final String FIND_BY_SERSVID = "Gosreg.findBySersvid";
    public static final String FIND_BY_NUMSVID = "Gosreg.findByNumsvid";
    public static final String FIND_BY_DTZAP = "Gosreg.findByDtzap";
    public static final String FIND_BY_GIHDADATE = "Gosreg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Gosreg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Gosreg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Gosreg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Gosreg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Gosreg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Gosreg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Gosreg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Gosreg.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDREG")

    private String idreg;


    @ManyToOne
    @JoinColumn(name = "IDUL", nullable = true, unique = true)
    private Ul idul;


    @Column(name = "REGNUM", length = 20, nullable = true, unique = false)
    private String regnum;


    @Column(name = "DTREG", nullable = true, unique = true)
    private Date dtreg;


    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDREGORG", nullable = true, unique = false)
    private Spregorg idregorg;


    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
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
    public Gosreg() {
    }

    /**
     * All field constructor
     */
    public Gosreg(
            String idreg,
            Ul idul,
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
                idul,
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

    public Gosreg(
            String idreg,
            Ul idul,
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
        setIdul(idul);
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

    public Gosreg flat() {
        return new Gosreg(
                getIdreg(),
                getIdul(),
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


    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
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
        if (!(o instanceof Gosreg)) return false;

        Gosreg gosreg = (Gosreg) o;

        if (!idreg.equals(gosreg.idreg)) return false;
        if (!idul.equals(gosreg.idul)) return false;
        return regnum != null ? regnum.equals(gosreg.regnum) : gosreg.regnum == null;

    }

    @Override
    public int hashCode() {
        int result = idreg.hashCode();
        result = 31 * result + idul.hashCode();
        result = 31 * result + (regnum != null ? regnum.hashCode() : 0);
        return result;
    }


}
