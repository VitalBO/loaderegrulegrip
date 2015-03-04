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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * <p>Title: Iul</p>
 *
 * <p>Description: Domain Object describing a Iul entity</p>
 *
 */
@Entity (name="Iul")
@Table (name="\"IUL\"")
@NamedQueries ({
	 @NamedQuery(name="Iul.findAll", query="SELECT iul FROM Iul iul")
	,@NamedQuery(name="Iul.findByIdul", query="SELECT iul FROM Iul iul WHERE iul.idul = :idul")

	,@NamedQuery(name="Iul.findByDtstart", query="SELECT iul FROM Iul iul WHERE iul.dtstart = :dtstart")

	,@NamedQuery(name="Iul.findByNamep", query="SELECT iul FROM Iul iul WHERE iul.namep = :namep")
	,@NamedQuery(name="Iul.findByNamepContaining", query="SELECT iul FROM Iul iul WHERE iul.namep like :namep")

	,@NamedQuery(name="Iul.findByDtreg", query="SELECT iul FROM Iul iul WHERE iul.dtreg = :dtreg")

	,@NamedQuery(name="Iul.findBySumma", query="SELECT iul FROM Iul iul WHERE iul.summa = :summa")

	,@NamedQuery(name="Iul.findByInadr", query="SELECT iul FROM Iul iul WHERE iul.inadr = :inadr")
	,@NamedQuery(name="Iul.findByInadrContaining", query="SELECT iul FROM Iul iul WHERE iul.inadr like :inadr")

	,@NamedQuery(name="Iul.findByIdoksm", query="SELECT iul FROM Iul iul WHERE iul.idoksm = :idoksm")

	,@NamedQuery(name="Iul.findByGihdAdate", query="SELECT iul FROM Iul iul WHERE iul.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Iul.findByGihdChdate", query="SELECT iul FROM Iul iul WHERE iul.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Iul.findByGihdDdate", query="SELECT iul FROM Iul iul WHERE iul.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Iul.findByGihdIdUser", query="SELECT iul FROM Iul iul WHERE iul.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Iul.findByGihdAIdPackage", query="SELECT iul FROM Iul iul WHERE iul.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Iul.findByGihdChIdPackage", query="SELECT iul FROM Iul iul WHERE iul.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Iul.findByGihdDIdPackage", query="SELECT iul FROM Iul iul WHERE iul.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Iul.findByRowCheckSum", query="SELECT iul FROM Iul iul WHERE iul.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Iul.findByRowCheckSumContaining", query="SELECT iul FROM Iul iul WHERE iul.rowCheckSum like :rowCheckSum")

})

public class Iul implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Iul.findAll";
    public static final String FIND_BY_IDUL = "Iul.findByIdul";
    public static final String FIND_BY_DTSTART = "Iul.findByDtstart";
    public static final String FIND_BY_NAMEP = "Iul.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING ="Iul.findByNamepContaining";
    public static final String FIND_BY_DTREG = "Iul.findByDtreg";
    public static final String FIND_BY_SUMMA = "Iul.findBySumma";
    public static final String FIND_BY_INADR = "Iul.findByInadr";
    public static final String FIND_BY_INADR_CONTAINING ="Iul.findByInadrContaining";
    public static final String FIND_BY_IDOKSM = "Iul.findByIdoksm";
    public static final String FIND_BY_GIHDADATE = "Iul.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Iul.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Iul.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Iul.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Iul.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Iul.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Iul.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Iul.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Iul.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "IULSEQ", sequenceName ="SEQ_IUL", allocationSize=1 )
    @Id @Column(name="IDIUL" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IULSEQ") 
    private Integer idiul;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=true)
    private Ul idul;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NAMEP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEP@
    @Column(name="NAMEP"  , length=1000 , nullable=true , unique=false)
    private String namep; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTREG@
    @Column(name="DTREG"   , nullable=true , unique=false)
    private Date dtreg; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @SUMMA-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @SUMMA-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-SUMMA@
    @Column(name="SUMMA"   , nullable=true , unique=false)
    private BigDecimal summa;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @INADR-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @INADR-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-INADR@
    @Column(name="INADR"  , length=255 , nullable=true , unique=false)
    private String inadr; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDOKSM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDOKSM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDOKSM@
@ManyToOne
@Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name="IDOKSM"   , nullable=true , unique=false)
    private Oksm idoksm;
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
    public Iul() {
    }

	/**
	* All field constructor 
	*/
    public Iul(
       Integer idiul,
       Ul idul,
       Date dtstart,
       String namep,
       Date dtreg,
       BigDecimal summa,
       String inadr,
       Oksm idoksm,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idiul,
       idul,
       dtstart,
       namep,
       dtreg,
       summa,
       inadr,
       idoksm,
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
    
	public Iul(
       Integer idiul,
       Ul idul,
       Date dtstart,
       String namep,
       Date dtreg,
       BigDecimal summa,
       String inadr,
       Oksm idoksm,
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
       setIdiul (idiul);
       //attributes
       setIdul (idul);
       setDtstart (dtstart);
       setNamep (namep);
       setDtreg (dtreg);
       setSumma (summa);
       setInadr (inadr);
       setIdoksm (idoksm);
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

	public Iul flat() {
	   return new Iul(
          getIdiul(),
          getIdul(),
          getDtstart(),
          getNamep(),
          getDtreg(),
          getSumma(),
          getInadr(),
          getIdoksm(),
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

    public Integer getIdiul() {
        return idiul;
    }
	
    public void setIdiul (Integer idiul) {
        this.idiul =  idiul;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
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

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMEP@
    public String getNamep() {
        return namep;
    }
	
    public void setNamep (String namep) {
        this.namep =  namep;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREG@
    public Date getDtreg() {
        return dtreg;
    }
	
    public void setDtreg (Date dtreg) {
        this.dtreg =  dtreg;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SUMMA@
    public BigDecimal getSumma() {
        return summa;
    }
	
    public void setSumma (BigDecimal summa) {
        this.summa =  summa;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-INADR@
    public String getInadr() {
        return inadr;
    }
	
    public void setInadr (String inadr) {
        this.inadr =  inadr;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDOKSM@
    public Oksm getIdoksm() {
        return idoksm;
    }
	
    public void setIdoksm (Oksm idoksm) {
        this.idoksm =  idoksm;
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
