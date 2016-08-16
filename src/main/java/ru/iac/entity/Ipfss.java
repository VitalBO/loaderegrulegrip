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
 *
 * <p>Title: Ipfss</p>
 *
 * <p>Description: Domain Object describing a Ipfss entity</p>
 *
 */
@Entity (name="Ipfss")
@Table (name="\"IPFSS\"")
@NamedQueries ({
	 @NamedQuery(name="Ipfss.findAll", query="SELECT ipfss FROM Ipfss ipfss")
	,@NamedQuery(name="Ipfss.findByIdip", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.idip = :idip")

	,@NamedQuery(name="Ipfss.findByIdfss", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.idfss = :idfss")

	,@NamedQuery(name="Ipfss.findByRegnomFss", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.regnomFss = :regnomFss")
	,@NamedQuery(name="Ipfss.findByRegnomFssContaining", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.regnomFss like :regnomFss")

	,@NamedQuery(name="Ipfss.findByDtstart", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.dtstart = :dtstart")

	,@NamedQuery(name="Ipfss.findByDtend", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.dtend = :dtend")

	,@NamedQuery(name="Ipfss.findByGihdAdate", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipfss.findByGihdChdate", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipfss.findByGihdDdate", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipfss.findByGihdIdUser", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipfss.findByGihdAIdPackage", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipfss.findByGihdChIdPackage", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipfss.findByGihdDIdPackage", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipfss.findByRowCheckSum", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipfss.findByRowCheckSumContaining", query="SELECT ipfss FROM Ipfss ipfss WHERE ipfss.rowCheckSum like :rowCheckSum")

})

public class Ipfss implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Ipfss.findAll";
    public static final String FIND_BY_IDIP = "Ipfss.findByIdip";
    public static final String FIND_BY_IDFSS = "Ipfss.findByIdfss";
    public static final String FIND_BY_REGNOMFSS = "Ipfss.findByRegnomFss";
    public static final String FIND_BY_REGNOMFSS_CONTAINING ="Ipfss.findByRegnomFssContaining";
    public static final String FIND_BY_DTSTART = "Ipfss.findByDtstart";
    public static final String FIND_BY_DTEND = "Ipfss.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ipfss.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipfss.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipfss.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipfss.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipfss.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipfss.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipfss.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipfss.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipfss.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPFSSSEQ", sequenceName ="SEQ_IPFSS", allocationSize=1 )
    @Id @Column(name="IDIPFSS" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPFSSSEQ") 
    private Integer idipfss;


    @OneToOne
@JoinColumn(name = "IDIP")
@NaturalId
    private Ip idip;


    @ManyToOne
@JoinColumn(name = "IDFSS")
    private Spfss idfss;


    @Column(name="REGNOM_FSS"  , length=20 , nullable=true , unique=false)
    private String regnomFss;


    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;


    @Column(name="DTEND"   , nullable=true , unique=false)
    private Date dtend;


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


    /**
    * Default constructor
    */
    public Ipfss() {
    }

	/**
	* All field constructor 
	*/
    public Ipfss(
       Integer idipfss,
       Ip idip,
       Spfss idfss,
       String regnomFss,
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
       idipfss,
       idip,
       idfss,
       regnomFss,
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
	 ,true);
	}
    
	public Ipfss(
       Integer idipfss,
       Ip idip,
       Spfss idfss,
       String regnomFss,
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
       setIdipfss (idipfss);
       //attributes
       setIdip (idip);
       setIdfss (idfss);
       setRegnomFss (regnomFss);
       setDtstart (dtstart);
       setDtend (dtend);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       //parents
    }

	public Ipfss flat() {
	   return new Ipfss(
          getIdipfss(),
          getIdip(),
          getIdfss(),
          getRegnomFss(),
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

    public Integer getIdipfss() {
        return idipfss;
    }
	
    public void setIdipfss (Integer idipfss) {
        this.idipfss =  idipfss;
    }


    public Ip getIdip() {
        return idip;
    }
	
    public void setIdip (Ip idip) {
        this.idip =  idip;
    }


    public Spfss getIdfss() {
        return idfss;
    }
	
    public void setIdfss (Spfss idfss) {
        this.idfss =  idfss;
    }


    public String getRegnomFss() {
        return regnomFss;
    }
	
    public void setRegnomFss (String regnomFss) {
        this.regnomFss =  regnomFss;
    }


    public Date getDtstart() {
        return dtstart;
    }
	
    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }


    public Date getDtend() {
        return dtend;
    }
	
    public void setDtend (Date dtend) {
        this.dtend =  dtend;
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

    @Override
    public String getIdenti() {
        return idipfss.toString();
    }


}
