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
package ru.iac.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * <p>Title: Fluchr</p>
 *
 * <p>Description: Domain Object describing a Fluchr entity</p>
 *
 */
@Entity (name="Fluchr")
@Table (name="\"FLUCHR\"")
@NamedQueries ({
	 @NamedQuery(name="Fluchr.findAll", query="SELECT fluchr FROM Fluchr fluchr")
	,@NamedQuery(name="Fluchr.findByIdul", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.idul = :idul")

	,@NamedQuery(name="Fluchr.findByIdfl", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.idfl = :idfl")

	,@NamedQuery(name="Fluchr.findByDtstart", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.dtstart = :dtstart")

	,@NamedQuery(name="Fluchr.findBySumma", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.summa = :summa")

	,@NamedQuery(name="Fluchr.findByGihdAdate", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Fluchr.findByGihdChdate", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Fluchr.findByGihdDdate", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Fluchr.findByGihdIdUser", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Fluchr.findByGihdAIdPackage", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Fluchr.findByGihdChIdPackage", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Fluchr.findByGihdDIdPackage", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Fluchr.findByRowCheckSum", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Fluchr.findByRowCheckSumContaining", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="Fluchr.findByRegnum", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.regnum = :regnum")

    ,@NamedQuery(name="Fluchr.findByRegnumd", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.regnumd = :regnumd")

    ,@NamedQuery(name="Fluchr.findByDtstartd", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.dtstartd = :dtstartd")

    ,@NamedQuery(name="Fluchr.findByPercent", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.percent = :percent")

})

public class Fluchr implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Fluchr.findAll";
    public static final String FIND_BY_IDUL = "Fluchr.findByIdul";
    public static final String FIND_BY_IDFL = "Fluchr.findByIdfl";
    public static final String FIND_BY_DTSTART = "Fluchr.findByDtstart";
    public static final String FIND_BY_SUMMA = "Fluchr.findBySumma";
    public static final String FIND_BY_GIHDADATE = "Fluchr.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Fluchr.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Fluchr.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Fluchr.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Fluchr.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Fluchr.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Fluchr.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Fluchr.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Fluchr.findByRowCheckSumContaining";
    public static final String FIND_BY_REGNUM = "Fluchr.findByRegnum";
    public static final String FIND_BY_REGNUMD = "Fluchr.findByRegnumd";
    public static final String FIND_BY_DTSTARTD = "Fluchr.findByDtstartd";
    public static final String FIND_BY_PERCENT = "Fluchr.findByPercent";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "FLUCHRSEQ", sequenceName ="SEQ_FLUCHR", allocationSize=1 )
    @Id @Column(name="IDFLUCHR" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="FLUCHRSEQ") 
    private Integer idfluchr;


    @ManyToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=true)
    private Ul idul;


    @ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "IDFL")
    private Fl idfl;


    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;


    @Column(name="SUMMA"   , nullable=true , unique=false)
    private BigInteger summa;


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


    @Column(name="REGNUMD"   , nullable=true , unique=false)
    private String regnumd;


    @Column(name="DTSTARTD"   , nullable=true , unique=false)
    private Date dtstartd;


    @Column(name="PERCENT"   , nullable=true , unique=false)
    private BigDecimal percent;


    /**
    * Default constructor
    */
    public Fluchr() {
    }

	/**
	* All field constructor 
	*/
    public Fluchr(
       Integer idfluchr,
       Ul idul,
       Fl idfl,
       Date dtstart,
       BigInteger summa,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum,
       String regnumd,
       Date dtstartd,
       BigDecimal percent) {
	 this(
       idfluchr,
       idul,
       idfl,
       dtstart,
       summa,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum,
	   regnum,
	   regnumd,
	   dtstartd,
	   percent
	 ,true);
	}
    
	public Fluchr(
       Integer idfluchr,
       Ul idul,
       Fl idfl,
       Date dtstart,
       BigInteger summa,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum,
       String regnumd,
       Date dtstartd,
       BigDecimal percent
    , boolean setRelationship) {
       //primary keys
       setIdfluchr (idfluchr);
       //attributes
       setIdul (idul);
       setIdfl (idfl);
       setDtstart (dtstart);
       setSumma (summa);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       setRegnum(regnum);
       setRegnumd(regnumd);
       setDtstartd(dtstartd);
       setPercent(percent);
       //parents
    }

	public Fluchr flat() {
	   return new Fluchr(
          getIdfluchr(),
          getIdul(),
          getIdfl(),
          getDtstart(),
          getSumma(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum(),
          getRegnum(),
          getRegnumd(),
          getDtstartd(),
          getPercent()
       , false
	   );
	}

    public Integer getIdfluchr() {
        return idfluchr;
    }
	
    public void setIdfluchr (Integer idfluchr) {
        this.idfluchr =  idfluchr;
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


    public BigInteger getSumma() {
        return summa;
    }
	
    public void setSumma (BigInteger summa) {
        this.summa =  summa;
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


    public String getRegnumd() {
        return regnumd;
    }

    public void setRegnumd (String regnumd) {
        this.regnumd =  regnumd;
    }


    public Date getDtstartd() {
        return dtstartd;
    }

    public void setDtstartd (Date dtstartd) {
        this.dtstartd =  dtstartd;
    }


    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent (BigDecimal percent) {
        this.percent =  percent;
    }

    @Override
    public String getIdenti() {
        return idfluchr.toString();
    }


}
