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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>Title: Ip</p>
 * <p/>
 * <p>Description: Domain Object describing a Ip entity</p>
 */
@Entity(name = "Ip")
@Table(name = "IP")
@NamedQueries({
        @NamedQuery(name = "Ip.findAll", query = "SELECT ip FROM Ip ip")
        , @NamedQuery(name = "Ip.findByOgrn", query = "SELECT ip FROM Ip ip WHERE ip.ogrn = :ogrn")
        , @NamedQuery(name = "Ip.findByOgrnContaining", query = "SELECT ip FROM Ip ip WHERE ip.ogrn like :ogrn")

        , @NamedQuery(name = "Ip.findByInn", query = "SELECT ip FROM Ip ip WHERE ip.inn = :inn")
        , @NamedQuery(name = "Ip.findByInnContaining", query = "SELECT ip FROM Ip ip WHERE ip.inn like :inn")

        , @NamedQuery(name = "Ip.findByIdvidip", query = "SELECT ip FROM Ip ip WHERE ip.idvidip = :idvidip")

        , @NamedQuery(name = "Ip.findByIdstatus", query = "SELECT ip FROM Ip ip WHERE ip.idstatus = :idstatus")

        , @NamedQuery(name = "Ip.findByIdregorg", query = "SELECT ip FROM Ip ip WHERE ip.idregorg = :idregorg")

        , @NamedQuery(name = "Ip.findByIpstart", query = "SELECT ip FROM Ip ip WHERE ip.ipstart = :ipstart")

        , @NamedQuery(name = "Ip.findByIpend", query = "SELECT ip FROM Ip ip WHERE ip.ipend = :ipend")

        , @NamedQuery(name = "Ip.findByGihdAdate", query = "SELECT ip FROM Ip ip WHERE ip.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ip.findByGihdChdate", query = "SELECT ip FROM Ip ip WHERE ip.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ip.findByGihdDdate", query = "SELECT ip FROM Ip ip WHERE ip.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ip.findByGihdIdUser", query = "SELECT ip FROM Ip ip WHERE ip.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ip.findByGihdAIdPackage", query = "SELECT ip FROM Ip ip WHERE ip.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ip.findByGihdChIdPackage", query = "SELECT ip FROM Ip ip WHERE ip.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ip.findByGihdDIdPackage", query = "SELECT ip FROM Ip ip WHERE ip.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ip.findByRowCheckSum", query = "SELECT ip FROM Ip ip WHERE ip.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ip.findByRowCheckSumContaining", query = "SELECT ip FROM Ip ip WHERE ip.rowCheckSum like :rowCheckSum")

        , @NamedQuery(name = "Ip.findByDtogrn", query = "SELECT ip FROM Ip ip WHERE ip.dtogrn = :dtogrn")

        , @NamedQuery(name = "Ip.findByRegnum", query = "SELECT ip FROM Ip ip WHERE ip.regnum = :regnum")

        , @NamedQuery(name = "Ip.findByDtreg", query = "SELECT ip FROM Ip ip WHERE ip.dtreg = :dtreg")

        , @NamedQuery(name = "Ip.findByRegorgname", query = "SELECT ip FROM Ip ip WHERE ip.regorgname = :regorgname")
        , @NamedQuery(name = "Ip.findByRegorgnameContaining", query = "SELECT ip FROM Ip ip WHERE ip.regorgname like :regorgname")

        , @NamedQuery(name = "Ip.findByKodstatusend", query = "SELECT ip FROM Ip ip WHERE ip.kodstatusend = :kodstatusend")

        , @NamedQuery(name = "Ip.findByNamestatusend", query = "SELECT ip FROM Ip ip WHERE ip.namestatusend = :namestatusend")
        , @NamedQuery(name = "Ip.findByNamestatusendContaining", query = "SELECT ip FROM Ip ip WHERE ip.namestatusend like :namestatusend")

        , @NamedQuery(name = "Ip.findByDtend", query = "SELECT ip FROM Ip ip WHERE ip.dtend = :dtend")

        , @NamedQuery(name = "Ip.findByRegnumend", query = "SELECT ip FROM Ip ip WHERE ip.regnumend = :regnumend")

        , @NamedQuery(name = "Ip.findByDtregend", query = "SELECT ip FROM Ip ip WHERE ip.dtregend = :dtregend")

        , @NamedQuery(name = "Ip.findByOgrnul", query = "SELECT ip FROM Ip ip WHERE ip.ogrnul = :ogrnul")

        , @NamedQuery(name = "Ip.findByInnul", query = "SELECT ip FROM Ip ip WHERE ip.innul = :innul")

        , @NamedQuery(name = "Ip.findByNamepul", query = "SELECT ip FROM Ip ip WHERE ip.namepul = :namepul")
        , @NamedQuery(name = "Ip.findByNamepulContaining", query = "SELECT ip FROM Ip ip WHERE ip.namepul like :namepul")

        , @NamedQuery(name = "Ip.findByGrnzap", query = "SELECT ip FROM Ip ip WHERE ip.grnzap = :grnzap")

        , @NamedQuery(name = "Ip.findByDtzap", query = "SELECT ip FROM Ip ip WHERE ip.dtzap = :dtzap")

        , @NamedQuery(name = "Ip.findByGrncor", query = "SELECT ip FROM Ip ip WHERE ip.grncor = :grncor")

        , @NamedQuery(name = "Ip.findByDtcor", query = "SELECT ip FROM Ip ip WHERE ip.dtcor = :dtcor")

})

public class Ip implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Ip.findAll";
    public static final String FIND_BY_OGRN = "Ip.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING = "Ip.findByOgrnContaining";
    public static final String FIND_BY_INN = "Ip.findByInn";
    public static final String FIND_BY_INN_CONTAINING = "Ip.findByInnContaining";
    public static final String FIND_BY_IDVIDIP = "Ip.findByIdvidip";
    public static final String FIND_BY_IDSTATUS = "Ip.findByIdstatus";
    public static final String FIND_BY_IDREGORG = "Ip.findByIdregorg";
    public static final String FIND_BY_IPSTART = "Ip.findByIpstart";
    public static final String FIND_BY_IPEND = "Ip.findByIpend";
    public static final String FIND_BY_GIHDADATE = "Ip.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ip.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ip.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ip.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ip.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ip.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ip.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ip.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ip.findByRowCheckSumContaining";
    public static final String FIND_BY_DTOGRN = "Ip.findByDtogrn";
    public static final String FIND_BY_REGNUM = "Ip.findByRegnum";
    public static final String FIND_BY_DTREG = "Ip.findByDtreg";
    public static final String FIND_BY_REGORGNAME = "Ip.findByRegorgname";
    public static final String FIND_BY_REGORGNAME_CONTAINING = "Ip.findByRegorgnameContaining";
    public static final String FIND_BY_KODSTATUSEND = "Ip.findByKodstatusend";
    public static final String FIND_BY_NAMESTATUSEND = "Ip.findByNamestatusend";
    public static final String FIND_BY_NAMESTATUSEND_CONTAINING = "Ip.findByNamestatusendContaining";
    public static final String FIND_BY_DTEND = "Ip.findByDtend";
    public static final String FIND_BY_REGNUMEND = "Ip.findByRegnumend";
    public static final String FIND_BY_DTREGEND = "Ip.findByDtregend";
    public static final String FIND_BY_OGRNUL = "Ip.findByOgrnul";
    public static final String FIND_BY_INNUL = "Ip.findByInnul";
    public static final String FIND_BY_NAMEPUL = "Ip.findByNamepul";
    public static final String FIND_BY_NAMEPUL_CONTAINING = "Ip.findByNamepulContaining";
    public static final String FIND_BY_GRNZAP = "Ip.findByGrnzap";
    public static final String FIND_BY_DTZAP = "Ip.findByDtzap";
    public static final String FIND_BY_GRNCOR = "Ip.findByGrncor";
    public static final String FIND_BY_DTCOR = "Ip.findByDtcor";


    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDIP")
    private String idip;

    @Column(name = "OGRN", length = 20, nullable = true, unique = true)
    private String ogrn;

    @Column(name = "INN", length = 20, nullable = true, unique = true)
    private String inn;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDVIDIP")
    private Spvidip idvidip;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDSTATUS")
    private Spipstat idstatus;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDREGORG")
    private Spregorg idregorg;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipcitizen ipcitizen;

    @Column(name = "IPSTART", nullable = true, unique = true)
    private Date ipstart;

    @Column(name = "IPEND", nullable = true, unique = false)
    private Date ipend;

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

    @Column(name = "DTOGRN", nullable = true, unique = false)
    private Date dtogrn;

    @Column(name = "REGNUM", nullable = true, unique = false)
    private String regnum;

    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;

    @Column(name = "REGORGNAME", nullable = true, unique = false)
    private String regorgname;

    @Column(name = "KODSTATUSEND", nullable = true, unique = false)
    private String kodstatusend;

    @Column(name = "NAMESTATUSEND", nullable = true, unique = false)
    private String namestatusend;

    @Column(name = "DTEND", nullable = true, unique = false)
    private Date dtend;

    @Column(name = "REGNUMEND", nullable = true, unique = false)
    private String regnumend;

    @Column(name = "DTREGEND", nullable = true, unique = false)
    private Date dtregend;

    @Column(name = "OGRN_UL", nullable = true, unique = false)
    private String ogrnul;

    @Column(name = "INN_UL", nullable = true, unique = false)
    private String innul;

    @Column(name = "NAMEP_UL", nullable = true, unique = false)
    private String namepul;

    @Column(name = "GRNZAP", nullable = true, unique = false)
    private String grnzap;

    @Column(name = "DTZAP", nullable = true, unique = false)
    private Date dtzap;

    @Column(name = "GRNCOR", nullable = true, unique = false)
    private String grncor;

    @Column(name = "DTCOR", nullable = true, unique = false)
    private Date dtcor;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipname ipname;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipadr ipadr;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipemail ipemail;

    @OneToMany(mappedBy = "idip")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Ipokved> ipokved;

    @OneToMany(mappedBy = "idip", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Licenz> licenzs;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipregold ipregold;

    @OneToMany(mappedBy = "idip", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Ipgosreg> ipgosregs;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipmns ipmns;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipfss ipfss;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ippf ippf;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipfoms ipfoms;

    @OneToOne(mappedBy = "idip", cascade = CascadeType.ALL)
    private Ipdokdsn ipdokdsn;

    /**
     * Default constructor
     */
    public Ip() {
    }

    /**
     * All field constructor
     */
    public Ip(
            String idip,
            String ogrn,
            String inn,
            Spvidip idvidip,
            Spipstat idstatus,
            Spregorg idregorg,
            Date ipstart,
            Date ipend,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            Date dtogrn,
            String regnum,
            Date dtreg,
            String regorgname,
            String kodstatusend,
            String namestatusend,
            Date dtend,
            String regnumend,
            Date dtregend,
            String ogrnul,
            String innul,
            String namepul,
            String grnzap,
            Date dtzap,
            String grncor,
            Date dtcor) {
        this(
                idip,
                ogrn,
                inn,
                idvidip,
                idstatus,
                idregorg,
                ipstart,
                ipend,
                gihdAdate,
                gihdChdate,
                gihdDdate,
                gihdIdUser,
                gihdAIdPackage,
                gihdChIdPackage,
                gihdDIdPackage,
                rowCheckSum,
                dtogrn,
                regnum,
                dtreg,
                regorgname,
                kodstatusend,
                namestatusend,
                dtend,
                regnumend,
                dtregend,
                ogrnul,
                innul,
                namepul,
                grnzap,
                dtzap,
                grncor,
                dtcor
                , true);
    }

    public Ip(String idip,
              String ogrn,
              String inn,
              Spvidip idvidip,
              Spipstat idstatus,
              Spregorg idregorg,
              Ipcitizen ipcitizen,
              Date ipstart,
              Date ipend,
              Ipname ipname,
              Ipregold ipregold,
              Ipmns ipmns,
              Ipfss ipfss,
              Ippf ippf,
              Ipfoms ipfoms) {
        this.idip = idip;
        this.ogrn = ogrn;
        this.inn = inn;
        this.idvidip = idvidip;
        this.idstatus = idstatus;
        this.idregorg = idregorg;
        this.ipcitizen = ipcitizen;
        this.ipstart = ipstart;
        this.ipend = ipend;
        this.ipname = ipname;
        this.ipregold = ipregold;
        this.ipmns = ipmns;
        this.ipfss = ipfss;
        this.ippf = ippf;
        this.ipfoms = ipfoms;
    }

    public Ip(
            String idip,
            String ogrn,
            String inn,
            Spvidip idvidip,
            Spipstat idstatus,
            Spregorg idregorg,
            Date ipstart,
            Date ipend,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum,
            Date dtogrn,
            String regnum,
            Date dtreg,
            String regorgname,
            String kodstatusend,
            String namestatusend,
            Date dtend,
            String regnumend,
            Date dtregend,
            String ogrnul,
            String innul,
            String namepul,
            String grnzap,
            Date dtzap,
            String grncor,
            Date dtcor
            , boolean setRelationship) {
        //primary keys
        setIdip(idip);
        //attributes
        setOgrn(ogrn);
        setInn(inn);
        setIdvidip(idvidip);
        setIdstatus(idstatus);
        setIdregorg(idregorg);
        setIpstart(ipstart);
        setIpend(ipend);
        setGihdAdate(gihdAdate);

        setGihdChdate(gihdChdate);
        setGihdDdate(gihdDdate);
        setGihdIdUser(gihdIdUser);
        setGihdAIdPackage(gihdAIdPackage);
        setGihdChIdPackage(gihdChIdPackage);
        setGihdDIdPackage(gihdDIdPackage);
        setRowCheckSum(rowCheckSum);
        setDtogrn(dtogrn);
        setRegnum(regnum);
        setDtreg(dtreg);
        setRegorgname(regorgname);
        setKodstatusend(kodstatusend);
        setNamestatusend(namestatusend);
        setDtend(dtend);
        setRegnumend(regnumend);
        setDtregend(dtregend);
        setOgrnul(ogrnul);
        setInnul(innul);
        setNamep(namepul);
        setGrnzap(grnzap);
        setDtzap(dtzap);
        setGrncor(grncor);
        setDtcor(dtcor);
        //parents
    }

    public Ipdokdsn getIpdokdsn() {
        return ipdokdsn;
    }

    public void setIpdokdsn(Ipdokdsn ipdokdsn) {
        this.ipdokdsn = ipdokdsn;
    }

    public Ipfoms getIpfoms() {
        return ipfoms;
    }

    public void setIpfoms(Ipfoms ipfoms) {
        this.ipfoms = ipfoms;
    }

    public Ipfss getIpfss() {
        return ipfss;
    }

    public void setIpfss(Ipfss ipfss) {
        this.ipfss = ipfss;
    }

    public Ippf getIppf() {
        return ippf;
    }

    public void setIppf(Ippf ippf) {
        this.ippf = ippf;
    }

    public Ipmns getIpmns() {
        return ipmns;
    }

    public void setIpmns(Ipmns ipmns) {
        this.ipmns = ipmns;
    }

    public List<Ipgosreg> getIpgosregs() {
        if (ipgosregs == null) {
            ipgosregs = new ArrayList<Ipgosreg>();
        }
        return ipgosregs;
    }

    public void setIpgosregs(List<Ipgosreg> ipgosregs) {
        this.ipgosregs = ipgosregs;
    }

    public Ipregold getIpregold() {
        return ipregold;
    }

    public void setIpregold(Ipregold ipregold) {
        this.ipregold = ipregold;
    }


    public List<Licenz> getLicenzs() {
        if (licenzs == null) {
            licenzs = new ArrayList<Licenz>();
        }
        return licenzs;
    }


    public void setLicenzs(List<Licenz> licenzs) {
        this.licenzs = licenzs;
    }


    @Override
    public String toString() {
        return "Ip{" +
                "idip='" + idip + '\'' +
                ", ogrn='" + ogrn + '\'' +
                ", inn='" + inn + '\'' +
                ", idvidip=" + idvidip +
                ", idstatus=" + idstatus +
                ", idregorg=" + idregorg +
                ", ipstart=" + ipstart +
                ", ipend=" + ipend +
                ", ipname=" + ipname.toString() +
                ", ipokved=" + ipokved.toString() +
                '}';
    }

    public Ipname getIpname() {
        return ipname;
    }

    public void setIpname(Ipname ipname) {
        this.ipname = ipname;
    }

    public Ipadr getIpadr() {
        return ipadr;
    }

    public void setIpadr(Ipadr ipadr) {
        this.ipadr = ipadr;
    }

    public Ipemail getIpemail() {
        return ipemail;
    }

    public void setIpemail(Ipemail ipemail) {
        this.ipemail = ipemail;
    }

    public Ipcitizen getIpcitizen() {
        return ipcitizen;
    }

    public void setIpcitizen(Ipcitizen ipcitizen) {
        this.ipcitizen = ipcitizen;
    }

    public List<Ipokved> getIpokved() {
        if (ipokved == null) {
            ipokved = new ArrayList<Ipokved>();
        }
        return ipokved;
    }

    public void setIpokved(List<Ipokved> ipokved) {
        this.ipokved = ipokved;
    }

    public Ip flat() {
        return new Ip(
                getIdip(),
                getOgrn(),
                getInn(),
                getIdvidip(),
                getIdstatus(),
                getIdregorg(),
                getIpstart(),
                getIpend(),
                getGihdAdate(),
                getGihdChdate(),
                getGihdDdate(),
                getGihdIdUser(),
                getGihdAIdPackage(),
                getGihdChIdPackage(),
                getGihdDIdPackage(),
                getRowCheckSum(),
                getDtogrn(),
                getRegnum(),
                getDtreg(),
                getRegorgname(),
                getKodstatusend(),
                getNamestatusend(),
                getDtend(),
                getRegnumend(),
                getDtregend(),
                getOgrnul(),
                getInnul(),
                getNamep(),
                getGrnzap(),
                getDtzap(),
                getGrncor(),
                getDtcor()
                , false
        );
    }

    public String getIdip() {
        return idip;
    }

    public void setIdip(String idip) {
        this.idip = idip;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Spvidip getIdvidip() {
        return idvidip;
    }

    public void setIdvidip(Spvidip idvidip) {
        this.idvidip = idvidip;
    }

    public Spipstat getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Spipstat idstatus) {
        this.idstatus = idstatus;
    }

    public Spregorg getIdregorg() {
        return idregorg;
    }

    public void setIdregorg(Spregorg idregorg) {
        this.idregorg = idregorg;
    }

    public Date getIpstart() {
        return ipstart;
    }

    public void setIpstart(Date ipstart) {
        this.ipstart = ipstart;
    }

    public Date getIpend() {
        return ipend;
    }

    public void setIpend(Date ipend) {
        this.ipend = ipend;
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

    public Date getDtogrn() {
        return dtogrn;
    }

    public void setDtogrn(Date dtogrn) {
        this.dtogrn = dtogrn;
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

    public String getRegorgname() {
        return regorgname;
    }

    public void setRegorgname(String regorgname) {
        this.regorgname = regorgname;
    }

    public String getKodstatusend() {
        return kodstatusend;
    }

    public void setKodstatusend(String kodstatusend) {
        this.kodstatusend = kodstatusend;
    }

    public String getNamestatusend() {
        return namestatusend;
    }

    public void setNamestatusend(String namestatusend) {
        this.namestatusend = namestatusend;
    }

    public Date getDtend() {
        return dtend;
    }

    public void setDtend(Date dtend) { this.dtend = dtend; }

    public String getRegnumend() { return regnumend; }

    public void setRegnumend(String regnumend) { this.regnumend = regnumend; }

    public Date getDtregend() { return dtregend; }

    public void setDtregend(Date dtregend) { this.dtregend = dtregend; }

    public String getOgrnul() { return ogrnul; }

    public void setOgrnul(String ogrnul) { this.ogrnul = ogrnul; }

    public String getInnul() { return innul; }

    public void setInnul(String innul) { this.innul = innul; }

    public String getNamep() { return namepul; }

    public void setNamep(String namepul) { this.namepul = namepul; }

    public String getGrnzap() { return grnzap; }

    public void setGrnzap(String grnzap) { this.grnzap = grnzap; }

    public Date getDtzap() { return dtzap; }

    public void setDtzap(Date dtzap) { this.dtzap = dtzap; }

    public String getGrncor() { return grncor; }

    public void setGrncor(String grncor) { this.grncor = grncor; }

    public Date getDtcor() { return dtcor; }

    public void setDtcor(Date dtcor) { this.dtcor = dtcor; }

    @Override
    public String getIdenti() {
        return idip;
    }
}
