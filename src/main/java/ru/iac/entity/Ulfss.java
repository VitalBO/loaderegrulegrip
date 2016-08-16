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


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Ulfss</p>
 *
 * <p>Description: Domain Object describing a Ulfss entity</p>
 *
 */
@Entity (name="Ulfss")
@Table (name="\"ULFSS\"")
@NamedQueries ({
	 @NamedQuery(name="Ulfss.findAll", query="SELECT ulfss FROM Ulfss ulfss")
	,@NamedQuery(name="Ulfss.findByIdul", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.idul = :idul")

	,@NamedQuery(name="Ulfss.findByIdfss", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.idfss = :idfss")

	,@NamedQuery(name="Ulfss.findByRegnomFss", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.regnomFss = :regnomFss")
	,@NamedQuery(name="Ulfss.findByRegnomFssContaining", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.regnomFss like :regnomFss")

	,@NamedQuery(name="Ulfss.findByDtstart", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.dtstart = :dtstart")

	,@NamedQuery(name="Ulfss.findByDtend", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.dtend = :dtend")

	,@NamedQuery(name="Ulfss.findByGihdAdate", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulfss.findByGihdChdate", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulfss.findByGihdDdate", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulfss.findByGihdIdUser", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulfss.findByGihdAIdPackage", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulfss.findByGihdChIdPackage", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulfss.findByGihdDIdPackage", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulfss.findByRowCheckSum", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulfss.findByRowCheckSumContaining", query="SELECT ulfss FROM Ulfss ulfss WHERE ulfss.rowCheckSum like :rowCheckSum")

})

public class Ulfss implements Serializable {
    public static final String FIND_ALL = "Ulfss.findAll";
    public static final String FIND_BY_IDUL = "Ulfss.findByIdul";
    public static final String FIND_BY_IDFSS = "Ulfss.findByIdfss";
    public static final String FIND_BY_REGNOMFSS = "Ulfss.findByRegnomFss";
    public static final String FIND_BY_REGNOMFSS_CONTAINING ="Ulfss.findByRegnomFssContaining";
    public static final String FIND_BY_DTSTART = "Ulfss.findByDtstart";
    public static final String FIND_BY_DTEND = "Ulfss.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ulfss.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulfss.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulfss.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulfss.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulfss.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulfss.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulfss.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulfss.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulfss.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULFSSSEQ", sequenceName ="SEQ_ULFSS", allocationSize=1 )
    @Id @Column(name="IDULFSS" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULFSSSEQ") 
    private Integer idulfss;


    @OneToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=false)
    private Ul idul;


    @ManyToOne
    @JoinColumn(name="IDFSS"   , nullable=true , unique=false)
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
    public Ulfss() {
    }

	/**
	* All field constructor 
	*/
    public Ulfss(
       Integer idulfss,
       Ul idul,
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
       idulfss,
       idul,
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
    
	public Ulfss(
       Integer idulfss,
       Ul idul,
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
       setIdulfss (idulfss);
       //attributes
       setIdul (idul);
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

	public Ulfss flat() {
	   return new Ulfss(
          getIdulfss(),
          getIdul(),
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

    public Integer getIdulfss() {
        return idulfss;
    }
	
    public void setIdulfss (Integer idulfss) {
        this.idulfss =  idulfss;
    }


    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
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


}
