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
	* - time      : 2015/02/12 �.�. at 10:23:30 MSK
*/
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Fldolgn</p>
 *
 * <p>Description: Domain Object describing a Fldolgn entity</p>
 *
 */
@Entity (name="Fldolgn")
@Table (name="FLDOLGN")
@NamedQueries ({
	 @NamedQuery(name="Fldolgn.findAll", query="SELECT fldolgn FROM Fldolgn fldolgn")
	,@NamedQuery(name="Fldolgn.findByIdul", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.idul = :idul")

	,@NamedQuery(name="Fldolgn.findByIdfl", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.idfl = :idfl")

	,@NamedQuery(name="Fldolgn.findByDtstart", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dtstart = :dtstart")

	,@NamedQuery(name="Fldolgn.findByDolgn", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgn = :dolgn")
	,@NamedQuery(name="Fldolgn.findByDolgnContaining", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgn like :dolgn")

	,@NamedQuery(name="Fldolgn.findByGihdAdate", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Fldolgn.findByGihdChdate", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Fldolgn.findByGihdDdate", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Fldolgn.findByGihdIdUser", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Fldolgn.findByGihdAIdPackage", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Fldolgn.findByGihdChIdPackage", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Fldolgn.findByGihdDIdPackage", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Fldolgn.findByRowCheckSum", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Fldolgn.findByRowCheckSumContaining", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="Fldolgn.findByRegnum", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.regnum = :regnum")

    ,@NamedQuery(name="Fldolgn.findByDolgnvid", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgnvid = :dolgnvid")
    ,@NamedQuery(name="Fldolgn.findByDolgnvidContaining", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgnvid like :dolgnvid")

    ,@NamedQuery(name="Fldolgn.findByDolgnvidname", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgnvidname = :dolgnvidname")
    ,@NamedQuery(name="Fldolgn.findByDolgnvidnameContaining", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgnvidname like :dolgnvidname")

    ,@NamedQuery(name="Fldolgn.findByRegnumd", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.regnumd = :regnumd")

    ,@NamedQuery(name="Fldolgn.findByDtstartd", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dtstartd = :dtstartd")

})

public class Fldolgn implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Fldolgn.findAll";
    public static final String FIND_BY_IDUL = "Fldolgn.findByIdul";
    public static final String FIND_BY_IDFL = "Fldolgn.findByIdfl";
    public static final String FIND_BY_DTSTART = "Fldolgn.findByDtstart";
    public static final String FIND_BY_DOLGN = "Fldolgn.findByDolgn";
    public static final String FIND_BY_DOLGN_CONTAINING ="Fldolgn.findByDolgnContaining";
    public static final String FIND_BY_GIHDADATE = "Fldolgn.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Fldolgn.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Fldolgn.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Fldolgn.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Fldolgn.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Fldolgn.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Fldolgn.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Fldolgn.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Fldolgn.findByRowCheckSumContaining";
    public static final String FIND_BY_REGNUM = "Fldolgn.findByRegnum";
    public static final String FIND_BY_DOLGNVID = "Fldolgn.findByDolgnvid";
    public static final String FIND_BY_DOLGNVID_CONTAINING ="Fldolgn.findByDolgnvidContaining";
    public static final String FIND_BY_DOLGNVIDNAME = "Fldolgn.findByDolgnvidname";
    public static final String FIND_BY_DOLGNVIDNAME_CONTAINING ="Fldolgn.findByDolgnvidnameContaining";
    public static final String FIND_BY_REGNUMD = "Fldolgn.findByRegnumd";
    public static final String FIND_BY_DTSTARTD = "Fldolgn.findByDtstartd";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "FLDOLGNSEQ", sequenceName ="SEQ_FLDOLGN", allocationSize=1 )
    @Id @Column(name="IDFLDOLGN" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="FLDOLGNSEQ") 
    private Integer idfldolgn;


    @ManyToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=true)
    private Ul idul;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="IDFL"   , nullable=true , unique=true)
    private Fl idfl;


    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;


    @Column(name="DOLGN"  , length=255 , nullable=true , unique=false)
    private String dolgn;


    @Column(name="GIHD__ADATE"   , nullable=true , unique=false)
    private Date gihdAdate;


    @Column(name="GIHD__CHDATE"   , nullable=true , unique=false)
    private Date gihdChdate;


    @Column(name="GIHD__DDATE"   , nullable=true , unique=false)
    private Date gihdDdate;


    @Column(name="GIHD__ID_USER"   , nullable=true , unique=false)
    private Integer gihdIdUser;


    @Column(name="GIHD__A_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdAIdPackage;


    @Column(name="GIHD__CH_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdChIdPackage;


    @Column(name="GIHD__D_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdDIdPackage;


    @Column(name="ROW_CHECK_SUM"   , nullable=true , unique=false)
    private String rowCheckSum;


    @Column(name="REGNUM"   , nullable=true , unique=false)
    private String regnum;


    @Column(name="DOLGNVID"   , nullable=true , unique=false)
    private String dolgnvid;


    @Column(name="DOLGNVIDNAME"   , nullable=true , unique=false)
    private String dolgnvidname;


    @Column(name="REGNUMD"   , nullable=true , unique=false)
    private String regnumd;


    @Column(name="DTSTARTD"   , nullable=true , unique=false)
    private Date dtstartd;


    /**
    * Default constructor
    */
    public Fldolgn() {
    }

	/**
	* All field constructor 
	*/
    public Fldolgn(
       Integer idfldolgn,
       Ul idul,
       Fl idfl,
       Date dtstart,
       String dolgn,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum,
       String dolgnvid,
       String dolgnvidname,
       String regnumd,
       Date dtstartd) {
	 this(
       idfldolgn,
       idul,
       idfl,
       dtstart,
       dolgn,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum,
	   regnum,
	   dolgnvid,
	   dolgnvidname,
	   regnumd,
	   dtstartd
	 ,true);
	}
    
	public Fldolgn(
       Integer idfldolgn,
       Ul idul,
       Fl idfl,
       Date dtstart,
       String dolgn,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum,
       String dolgnvid,
       String dolgnvidname,
       String regnumd,
       Date dtstartd
    , boolean setRelationship) {
       //primary keys
       setIdfldolgn (idfldolgn);
       //attributes
       setIdul (idul);
       setIdfl (idfl);
       setDtstart (dtstart);
       setDolgn (dolgn);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       setRegnum(regnum);
       setDolgnvid(dolgnvid);
       setDolgnvidname(dolgnvidname);
       setRegnumd(regnumd);
       setDtstartd(dtstartd);
       //parents
    }

	public Fldolgn flat() {
	   return new Fldolgn(
          getIdfldolgn(),
          getIdul(),
          getIdfl(),
          getDtstart(),
          getDolgn(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum(),
          getRegnum(),
          getDolgnvid(),
          getDolgnvidname(),
          getRegnumd(),
          getDtstartd()
       , false
	   );
	}

    public Integer getIdfldolgn() {
        return idfldolgn;
    }
	
    public void setIdfldolgn (Integer idfldolgn) {
        this.idfldolgn =  idfldolgn;
    }


    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }


    public Fl getIdfl() {
        return idfl;
    }
	
    public void setIdfl (Fl idfl) {
        this.idfl =  idfl;
    }


    public Date getDtstart() {
        return dtstart;
    }
	
    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }


    public String getDolgn() {
        return dolgn;
    }
	
    public void setDolgn (String dolgn) {
        this.dolgn =  dolgn;
    }


    public Date getGihdAdate() {
        return gihdAdate;
    }
	
    public void setGihdAdate (Date gihdAdate) {
        this.gihdAdate =  gihdAdate;
    }


    public Date getGihdChdate() {
        return gihdChdate;
    }
	
    public void setGihdChdate (Date gihdChdate) {
        this.gihdChdate =  gihdChdate;
    }


    public Date getGihdDdate() {
        return gihdDdate;
    }
	
    public void setGihdDdate (Date gihdDdate) {
        this.gihdDdate =  gihdDdate;
    }


    public Integer getGihdIdUser() {
        return gihdIdUser;
    }
	
    public void setGihdIdUser (Integer gihdIdUser) {
        this.gihdIdUser =  gihdIdUser;
    }


    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }
	
    public void setGihdAIdPackage (Integer gihdAIdPackage) {
        this.gihdAIdPackage =  gihdAIdPackage;
    }


    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }
	
    public void setGihdChIdPackage (Integer gihdChIdPackage) {
        this.gihdChIdPackage =  gihdChIdPackage;
    }


    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }
	
    public void setGihdDIdPackage (Integer gihdDIdPackage) {
        this.gihdDIdPackage =  gihdDIdPackage;
    }


    public String getRowCheckSum() {
        return rowCheckSum;
    }
	
    public void setRowCheckSum (String rowCheckSum) {
        this.rowCheckSum =  rowCheckSum;
    }


    public String getRegnum() {
        return regnum;
    }

    public void setRegnum (String regnum) {
        this.regnum =  regnum;
    }


    public String getDolgnvid() {
        return dolgnvid;
    }

    public void setDolgnvid (String dolgnvid) {
        this.dolgnvid =  dolgnvid;
    }


    public String getDolgnvidname() {
        return dolgnvidname;
    }

    public void setDolgnvidname (String dolgnvidname) {
        this.dolgnvidname =  dolgnvidname;
    }


    public String getRegnumd() { return regnumd;  }

    public void setRegnumd (String regnumd) {
        this.regnumd =  regnumd;
    }


    public Date getDtstartd() {
        return dtstartd;
    }

    public void setDtstartd (Date dtstartd) {
        this.dtstartd =  dtstartd;
    }

    @Override
    public String getIdenti() {
        return idfldolgn.toString();
    }


}
