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
package ru.iac.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Ulpf</p>
 *
 * <p>Description: Domain Object describing a Ulpf entity</p>
 *
 */
@Entity (name="Ulpf")
@Table (name="\"ULPF\"")
@NamedQueries ({
	 @NamedQuery(name="Ulpf.findAll", query="SELECT ulpf FROM Ulpf ulpf")
	,@NamedQuery(name="Ulpf.findByIdul", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.idul = :idul")

	,@NamedQuery(name="Ulpf.findByIdpf", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.idpf = :idpf")

	,@NamedQuery(name="Ulpf.findByRegnomPf", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.regnomPf = :regnomPf")
	,@NamedQuery(name="Ulpf.findByRegnomPfContaining", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.regnomPf like :regnomPf")

	,@NamedQuery(name="Ulpf.findByDtstart", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.dtstart = :dtstart")

	,@NamedQuery(name="Ulpf.findByDtend", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.dtend = :dtend")

	,@NamedQuery(name="Ulpf.findByGihdAdate", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulpf.findByGihdChdate", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulpf.findByGihdDdate", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulpf.findByGihdIdUser", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulpf.findByGihdAIdPackage", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulpf.findByGihdChIdPackage", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulpf.findByGihdDIdPackage", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulpf.findByRowCheckSum", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulpf.findByRowCheckSumContaining", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="Ulpf.findByRegnum", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.regnum = :regnum")

    ,@NamedQuery(name="Ulpf.findByDtzap", query="SELECT ulpf FROM Ulpf ulpf WHERE ulpf.dtzap = :dtzap")

})

public class Ulpf implements Serializable {
    public static final String FIND_ALL = "Ulpf.findAll";
    public static final String FIND_BY_IDUL = "Ulpf.findByIdul";
    public static final String FIND_BY_IDPF = "Ulpf.findByIdpf";
    public static final String FIND_BY_REGNOMPF = "Ulpf.findByRegnomPf";
    public static final String FIND_BY_REGNOMPF_CONTAINING ="Ulpf.findByRegnomPfContaining";
    public static final String FIND_BY_DTSTART = "Ulpf.findByDtstart";
    public static final String FIND_BY_DTEND = "Ulpf.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ulpf.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulpf.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulpf.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulpf.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulpf.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulpf.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulpf.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulpf.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulpf.findByRowCheckSumContaining";
    public static final String FIND_BY_REGNUM = "Ulpf.findByRegnum";
    public static final String FIND_BY_DTZAP = "Ulpf.findByDtzap";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULPFSEQ", sequenceName ="SEQ_ULPF", allocationSize=1 )
    @Id @Column(name="IDULPF" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULPFSEQ") 
    private Integer idulpf;


    @OneToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=false)
    private Ul idul;


    @ManyToOne
    @JoinColumn(name="IDPF"   , nullable=true , unique=false)
    private Sppf idpf;


    @Column(name="REGNOM_PF"  , length=20 , nullable=true , unique=false)
    private String regnomPf;


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
    public Ulpf() {
    }

	/**
	* All field constructor 
	*/
    public Ulpf(
       Integer idulpf,
       Ul idul,
       Sppf idpf,
       String regnomPf,
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
       idulpf,
       idul,
       idpf,
       regnomPf,
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
    
	public Ulpf(
       Integer idulpf,
       Ul idul,
       Sppf idpf,
       String regnomPf,
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
       setIdulpf (idulpf);
       //attributes
       setIdul (idul);
       setIdpf (idpf);
       setRegnomPf (regnomPf);
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

	public Ulpf flat() {
	   return new Ulpf(
          getIdulpf(),
          getIdul(),
          getIdpf(),
          getRegnomPf(),
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

    public Integer getIdulpf() {
        return idulpf;
    }
	
    public void setIdulpf (Integer idulpf) {
        this.idulpf =  idulpf;
    }


    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }


    public Sppf getIdpf() {
        return idpf;
    }
	
    public void setIdpf (Sppf idpf) {
        this.idpf =  idpf;
    }


    public String getRegnomPf() {
        return regnomPf;
    }
	
    public void setRegnomPf (String regnomPf) {
        this.regnomPf =  regnomPf;
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


    public String getRegnum() {
        return regnum;
    }

    public void setRegnum (String regnum) {
        this.regnum =  regnum;
    }


    public Date getDtzap() {
        return dtzap;
    }

    public void setDtzap (Date dtzap) {
        this.dtzap =  dtzap;
    }
}
