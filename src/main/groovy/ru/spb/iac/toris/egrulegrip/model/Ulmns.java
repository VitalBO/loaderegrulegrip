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
	* - time      : 2015/02/12 �.�. at 10:23:32 MSK
*/
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Ulmns</p>
 *
 * <p>Description: Domain Object describing a Ulmns entity</p>
 *
 */
@Entity (name="Ulmns")
@Table (name="ULMNS")
@NamedQueries ({
	 @NamedQuery(name="Ulmns.findAll", query="SELECT ulmns FROM Ulmns ulmns")
	,@NamedQuery(name="Ulmns.findByIdul", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.idul = :idul")

	,@NamedQuery(name="Ulmns.findByIdmns", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.idmns = :idmns")

	,@NamedQuery(name="Ulmns.findByDtstart", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.dtstart = :dtstart")

	,@NamedQuery(name="Ulmns.findByDtend", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.dtend = :dtend")

	,@NamedQuery(name="Ulmns.findByGihdAdate", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulmns.findByGihdChdate", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulmns.findByGihdDdate", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulmns.findByGihdIdUser", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulmns.findByGihdAIdPackage", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulmns.findByGihdChIdPackage", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulmns.findByGihdDIdPackage", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulmns.findByRowCheckSum", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulmns.findByRowCheckSumContaining", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="Ulmns.findByRegnum", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.regnum = :regnum")

    ,@NamedQuery(name="Ulmns.findByDtzap", query="SELECT ulmns FROM Ulmns ulmns WHERE ulmns.dtzap = :dtzap")

})

public class Ulmns implements Serializable {
    public static final String FIND_ALL = "Ulmns.findAll";
    public static final String FIND_BY_IDUL = "Ulmns.findByIdul";
    public static final String FIND_BY_IDMNS = "Ulmns.findByIdmns";
    public static final String FIND_BY_DTSTART = "Ulmns.findByDtstart";
    public static final String FIND_BY_DTEND = "Ulmns.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ulmns.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulmns.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulmns.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulmns.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulmns.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulmns.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulmns.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulmns.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulmns.findByRowCheckSumContaining";
    public static final String FIND_BY_REGNUM = "Ulmns.findByRegnum";
    public static final String FIND_BY_DTZAP = "Ulmns.findByDtzap";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULMNSSEQ", sequenceName ="SEQ_ULMNS", allocationSize=1 )
    @Id @Column(name="IDULMNS" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULMNSSEQ") 
    private Integer idulmns;


    @OneToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=false)
    private Ul idul;


    @ManyToOne
    @JoinColumn(name="IDMNS"   , nullable=true , unique=false)
    private Spmns idmns;


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

    @Column(name="REGNUM"   , nullable=true , unique=false)
    private String regnum;

    @Column(name="DTZAP"   , nullable=true , unique=false)
    private Date dtzap;


    /**
    * Default constructor
    */
    public Ulmns() {
    }

	/**
	* All field constructor 
	*/
    public Ulmns(
       Integer idulmns,
       Ul idul,
       Spmns idmns,
       Date dtstart,
       Date dtend,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum,
       Date dtzap) {
	 this(
       idulmns,
       idul,
       idmns,
       dtstart,
       dtend,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum,
	   regnum,
	   dtzap
	 ,true);
	}
    
	public Ulmns(
       Integer idulmns,
       Ul idul,
       Spmns idmns,
       Date dtstart,
       Date dtend,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum,
       Date dtzap
    , boolean setRelationship) {
       //primary keys
       setIdulmns (idulmns);
       //attributes
       setIdul (idul);
       setIdmns (idmns);
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
       setRegnum(regnum);
       setDtzap(dtzap);
       //parents
    }

	public Ulmns flat() {
	   return new Ulmns(
          getIdulmns(),
          getIdul(),
          getIdmns(),
          getDtstart(),
          getDtend(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum(),
          getRegnum(),
          getDtzap()
       , false
	   );
	}

    public Integer getIdulmns() {
        return idulmns;
    }
	
    public void setIdulmns (Integer idulmns) {
        this.idulmns =  idulmns;
    }


    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }


    public Spmns getIdmns() {
        return idmns;
    }
	
    public void setIdmns (Spmns idmns) {
        this.idmns =  idmns;
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


    public String getRowCheckSum() { return rowCheckSum;  }

    public void setRowCheckSum (String rowCheckSum) { this.rowCheckSum =  rowCheckSum; }


    public String getRegnum() { return regnum;  }

    public void setRegnum (String regnum) { this.regnum =  regnum; }


    public Date getDtzap() { return dtzap;  }

    public void setDtzap (Date dtzap) { this.dtzap =  dtzap; }
}
