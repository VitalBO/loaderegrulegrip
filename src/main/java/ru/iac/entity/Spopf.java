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

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Spopf</p>
 *
 * <p>Description: Domain Object describing a Spopf entity</p>
 *
 */
@Entity (name="Spopf")
@Table (name="\"SPOPF\"")
@NamedQueries ({
	 @NamedQuery(name="Spopf.findAll", query="SELECT spopf FROM Spopf spopf")
	,@NamedQuery(name="Spopf.findByName", query="SELECT spopf FROM Spopf spopf WHERE spopf.name = :name")
	,@NamedQuery(name="Spopf.findByNameContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.name like :name")

	,@NamedQuery(name="Spopf.findByKodOpf", query="SELECT spopf FROM Spopf spopf WHERE spopf.kodOpf = :kodOpf")
	,@NamedQuery(name="Spopf.findByKodOpfContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.kodOpf like :kodOpf")

	,@NamedQuery(name="Spopf.findBySpr", query="SELECT spopf FROM Spopf spopf WHERE spopf.spr = :spr")
	,@NamedQuery(name="Spopf.findBySprContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.spr like :spr")

	,@NamedQuery(name="Spopf.findByGihdAdate", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spopf.findByGihdChdate", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spopf.findByGihdDdate", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spopf.findByGihdIdUser", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spopf.findByGihdAIdPackage", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spopf.findByGihdChIdPackage", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spopf.findByGihdDIdPackage", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spopf.findByRowCheckSum", query="SELECT spopf FROM Spopf spopf WHERE spopf.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spopf.findByRowCheckSumContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.rowCheckSum like :rowCheckSum")

})

public class Spopf implements Serializable, EgrulEntity {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Spopf.findAll";
    public static final String FIND_BY_NAME = "Spopf.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spopf.findByNameContaining";
    public static final String FIND_BY_KODOPF = "Spopf.findByKodOpf";
    public static final String FIND_BY_KODOPF_CONTAINING ="Spopf.findByKodOpfContaining";
    public static final String FIND_BY_SPR = "Spopf.findBySpr";
    public static final String FIND_BY_SPR_CONTAINING ="Spopf.findBySprContaining";
    public static final String FIND_BY_GIHDADATE = "Spopf.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spopf.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spopf.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spopf.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spopf.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spopf.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spopf.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spopf.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spopf.findByRowCheckSumContaining";
	
    @Id @Column(name="IDOPF" )
    private Integer idopf;

//MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name="NAME"  , length=255 , nullable=true , unique=true)
    private String name; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @KOD_OPF-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KOD_OPF-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KOD_OPF@
    @Column(name="KOD_OPF"  , length=2 , nullable=true , unique=false)
    private String kodOpf; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @SPR-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @SPR-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-SPR@
    @Column(name="SPR"  , length=7 , nullable=true , unique=false)
    private String spr; 
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
    public Spopf() {
    }

	/**
	* All field constructor 
	*/
    public Spopf(
       Integer idopf,
       String name,
       String kodOpf,
       String spr,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idopf,
       name,
       kodOpf,
       spr,
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
    
	public Spopf(
       Integer idopf,
       String name,
       String kodOpf,
       String spr,
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
       setIdopf (idopf);
       //attributes
       setName (name);
       setKodOpf (kodOpf);
       setSpr (spr);
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

	public Spopf flat() {
	   return new Spopf(
          getIdopf(),
          getName(),
          getKodOpf(),
          getSpr(),
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

    public Integer getIdopf() {
        return idopf;
    }
	
    public void setIdopf (Integer idopf) {
        this.idopf =  idopf;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KOD_OPF@
    public String getKodOpf() {
        return kodOpf;
    }
	
    public void setKodOpf (String kodOpf) {
        this.kodOpf =  kodOpf;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SPR@
    public String getSpr() {
        return spr;
    }
	
    public void setSpr (String spr) {
        this.spr =  spr;
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

    @Override
    public String getIdenti() {
        return idopf.toString();
    }

//MP-MANAGED-UPDATABLE-ENDING






//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
