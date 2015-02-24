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
import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: Ulfoms</p>
 *
 * <p>Description: Domain Object describing a Ulfoms entity</p>
 *
 */
@Entity (name="Ulfoms")
@Table (name="\"ULFOMS\"")
@NamedQueries ({
	 @NamedQuery(name="Ulfoms.findAll", query="SELECT ulfoms FROM Ulfoms ulfoms")
	,@NamedQuery(name="Ulfoms.findByIdul", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.idul = :idul")

	,@NamedQuery(name="Ulfoms.findByIdfoms", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.idfoms = :idfoms")

	,@NamedQuery(name="Ulfoms.findByRegnomFoms", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.regnomFoms = :regnomFoms")
	,@NamedQuery(name="Ulfoms.findByRegnomFomsContaining", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.regnomFoms like :regnomFoms")

	,@NamedQuery(name="Ulfoms.findByDtstart", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.dtstart = :dtstart")

	,@NamedQuery(name="Ulfoms.findByDtend", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.dtend = :dtend")

	,@NamedQuery(name="Ulfoms.findByGihdAdate", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulfoms.findByGihdChdate", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulfoms.findByGihdDdate", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulfoms.findByGihdIdUser", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulfoms.findByGihdAIdPackage", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulfoms.findByGihdChIdPackage", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulfoms.findByGihdDIdPackage", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulfoms.findByRowCheckSum", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulfoms.findByRowCheckSumContaining", query="SELECT ulfoms FROM Ulfoms ulfoms WHERE ulfoms.rowCheckSum like :rowCheckSum")

})

public class Ulfoms implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ulfoms.findAll";
    public static final String FIND_BY_IDUL = "Ulfoms.findByIdul";
    public static final String FIND_BY_IDFOMS = "Ulfoms.findByIdfoms";
    public static final String FIND_BY_REGNOMFOMS = "Ulfoms.findByRegnomFoms";
    public static final String FIND_BY_REGNOMFOMS_CONTAINING ="Ulfoms.findByRegnomFomsContaining";
    public static final String FIND_BY_DTSTART = "Ulfoms.findByDtstart";
    public static final String FIND_BY_DTEND = "Ulfoms.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ulfoms.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulfoms.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulfoms.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulfoms.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulfoms.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulfoms.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulfoms.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulfoms.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulfoms.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "ULFOMSSEQ", sequenceName ="SEQ_ULFOMS", allocationSize=1 )
    @Id @Column(name="IDULFOMS" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULFOMSSEQ") 
    private Integer idulfoms;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @OneToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=false)
    private Ul idul; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDFOMS-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDFOMS-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDFOMS@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="IDFOMS"   , nullable=true , unique=false)
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
    public Ulfoms() {
    }

	/**
	* All field constructor 
	*/
    public Ulfoms(
       Integer idulfoms,
       Ul idul,
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
       idulfoms,
       idul,
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
    
	public Ulfoms(
       Integer idulfoms,
       Ul idul,
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
       setIdulfoms (idulfoms);
       //attributes
       setIdul (idul);
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

	public Ulfoms flat() {
	   return new Ulfoms(
          getIdulfoms(),
          getIdul(),
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

    public Integer getIdulfoms() {
        return idulfoms;
    }
	
    public void setIdulfoms (Integer idulfoms) {
        this.idulfoms =  idulfoms;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
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
