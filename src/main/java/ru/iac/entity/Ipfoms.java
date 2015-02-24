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
import org.hibernate.annotations.NaturalId;

import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: Ipfoms</p>
 *
 * <p>Description: Domain Object describing a Ipfoms entity</p>
 *
 */
@Entity (name="Ipfoms")
@Table (name="\"IPFOMS\"")
@NamedQueries ({
	 @NamedQuery(name="Ipfoms.findAll", query="SELECT ipfoms FROM Ipfoms ipfoms")
	,@NamedQuery(name="Ipfoms.findByIdip", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.idip = :idip")

	,@NamedQuery(name="Ipfoms.findByIdfoms", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.idfoms = :idfoms")

	,@NamedQuery(name="Ipfoms.findByRegnomFoms", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.regnomFoms = :regnomFoms")
	,@NamedQuery(name="Ipfoms.findByRegnomFomsContaining", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.regnomFoms like :regnomFoms")

	,@NamedQuery(name="Ipfoms.findByDtstart", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.dtstart = :dtstart")

	,@NamedQuery(name="Ipfoms.findByDtend", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.dtend = :dtend")

	,@NamedQuery(name="Ipfoms.findByGihdAdate", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipfoms.findByGihdChdate", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipfoms.findByGihdDdate", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipfoms.findByGihdIdUser", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipfoms.findByGihdAIdPackage", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipfoms.findByGihdChIdPackage", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipfoms.findByGihdDIdPackage", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipfoms.findByRowCheckSum", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipfoms.findByRowCheckSumContaining", query="SELECT ipfoms FROM Ipfoms ipfoms WHERE ipfoms.rowCheckSum like :rowCheckSum")

})

public class Ipfoms implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ipfoms.findAll";
    public static final String FIND_BY_IDIP = "Ipfoms.findByIdip";
    public static final String FIND_BY_IDFOMS = "Ipfoms.findByIdfoms";
    public static final String FIND_BY_REGNOMFOMS = "Ipfoms.findByRegnomFoms";
    public static final String FIND_BY_REGNOMFOMS_CONTAINING ="Ipfoms.findByRegnomFomsContaining";
    public static final String FIND_BY_DTSTART = "Ipfoms.findByDtstart";
    public static final String FIND_BY_DTEND = "Ipfoms.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ipfoms.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipfoms.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipfoms.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipfoms.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipfoms.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipfoms.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipfoms.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipfoms.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipfoms.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "IPFOMSSEQ", sequenceName ="SEQ_IPFOMS", allocationSize=1 )
    @Id @Column(name="IDIPFOMS" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPFOMSSEQ") 
    private Integer idipfoms;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
@OneToOne
@JoinColumn(name = "IDIP")
@NaturalId
    private Ip idip;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDFOMS-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDFOMS-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDFOMS@
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "IDFOMS")
    private Spfoms idfoms;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @REGNOM_FOMS-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @REGNOM_FOMS-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-REGNOM_FOMS@
    @Column(name="REGNOM_FOMS"  , length=40 , nullable=true , unique=false)
    private String regnomFoms; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTEND-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTEND-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTEND@
    @Column(name="DTEND"   , nullable=true , unique=false)
    private Date dtend; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__ADATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__ADATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__ADATE@
    @Column(name="GIHD__ADATE"   , nullable=true , unique=false)
    private Date gihdAdate; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__CHDATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__CHDATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__CHDATE@
    @Column(name="GIHD__CHDATE"   , nullable=true , unique=false)
    private Date gihdChdate; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__DDATE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__DDATE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__DDATE@
    @Column(name="GIHD__DDATE"   , nullable=true , unique=false)
    private Date gihdDdate; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__ID_USER-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__ID_USER-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__ID_USER@
    @Column(name="GIHD__ID_USER"   , nullable=true , unique=false)
    private Integer gihdIdUser; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__A_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__A_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__A_ID_PACKAGE@
    @Column(name="GIHD__A_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdAIdPackage; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__CH_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__CH_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__CH_ID_PACKAGE@
    @Column(name="GIHD__CH_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdChIdPackage; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @GIHD__D_ID_PACKAGE-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @GIHD__D_ID_PACKAGE-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-GIHD__D_ID_PACKAGE@
    @Column(name="GIHD__D_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdDIdPackage; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ROW_CHECK_SUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ROW_CHECK_SUM@
    @Column(name="ROW_CHECK_SUM"   , nullable=true , unique=false)
    private String rowCheckSum; 
//MP-MANAGED-UPDATABLE-ENDING

    /**
    * Default constructor
    */
    public Ipfoms() {
    }

	/**
	* All field constructor 
	*/
    public Ipfoms(
       Integer idipfoms,
       Ip idip,
       Spfoms idfoms,
       String regnomFoms,
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
       idipfoms,
       idip,
       idfoms,
       regnomFoms,
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
    
	public Ipfoms(
       Integer idipfoms,
       Ip idip,
       Spfoms idfoms,
       String regnomFoms,
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
       setIdipfoms (idipfoms);
       //attributes
       setIdip (idip);
       setIdfoms (idfoms);
       setRegnomFoms (regnomFoms);
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

	public Ipfoms flat() {
	   return new Ipfoms(
          getIdipfoms(),
          getIdip(),
          getIdfoms(),
          getRegnomFoms(),
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

    public Integer getIdipfoms() {
        return idipfoms;
    }
	
    public void setIdipfoms (Integer idipfoms) {
        this.idipfoms =  idipfoms;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDIP@
    public Ip getIdip() {
        return idip;
    }
	
    public void setIdip (Ip idip) {
        this.idip =  idip;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDFOMS@
    public Spfoms getIdfoms() {
        return idfoms;
    }
	
    public void setIdfoms (Spfoms idfoms) {
        this.idfoms =  idfoms;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNOM_FOMS@
    public String getRegnomFoms() {
        return regnomFoms;
    }
	
    public void setRegnomFoms (String regnomFoms) {
        this.regnomFoms =  regnomFoms;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTSTART@
    public Date getDtstart() {
        return dtstart;
    }
	
    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTEND@
    public Date getDtend() {
        return dtend;
    }
	
    public void setDtend (Date dtend) {
        this.dtend =  dtend;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__ADATE@
    public Date getGihdAdate() {
        return gihdAdate;
    }
	
    public void setGihdAdate (Date gihdAdate) {
        this.gihdAdate =  gihdAdate;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__CHDATE@
    public Date getGihdChdate() {
        return gihdChdate;
    }
	
    public void setGihdChdate (Date gihdChdate) {
        this.gihdChdate =  gihdChdate;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__DDATE@
    public Date getGihdDdate() {
        return gihdDdate;
    }
	
    public void setGihdDdate (Date gihdDdate) {
        this.gihdDdate =  gihdDdate;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__ID_USER@
    public Integer getGihdIdUser() {
        return gihdIdUser;
    }
	
    public void setGihdIdUser (Integer gihdIdUser) {
        this.gihdIdUser =  gihdIdUser;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__A_ID_PACKAGE@
    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }
	
    public void setGihdAIdPackage (Integer gihdAIdPackage) {
        this.gihdAIdPackage =  gihdAIdPackage;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__CH_ID_PACKAGE@
    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }
	
    public void setGihdChIdPackage (Integer gihdChIdPackage) {
        this.gihdChIdPackage =  gihdChIdPackage;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-GIHD__D_ID_PACKAGE@
    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }
	
    public void setGihdDIdPackage (Integer gihdDIdPackage) {
        this.gihdDIdPackage =  gihdDIdPackage;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-ROW_CHECK_SUM@
    public String getRowCheckSum() {
        return rowCheckSum;
    }
	
    public void setRowCheckSum (String rowCheckSum) {
        this.rowCheckSum =  rowCheckSum;
    }
	
//MP-MANAGED-UPDATABLE-ENDING






//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
