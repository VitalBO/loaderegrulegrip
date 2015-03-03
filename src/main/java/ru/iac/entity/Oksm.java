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

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Oksm</p>
 *
 * <p>Description: Domain Object describing a Oksm entity</p>
 *
 */
@Entity (name="Oksm")
@Table (name="\"OKSM\"")
@NamedQueries ({
	 @NamedQuery(name="Oksm.findAll", query="SELECT oksm FROM Oksm oksm")
	,@NamedQuery(name="Oksm.findByName", query="SELECT oksm FROM Oksm oksm WHERE oksm.name = :name")
	,@NamedQuery(name="Oksm.findByNameContaining", query="SELECT oksm FROM Oksm oksm WHERE oksm.name like :name")

	,@NamedQuery(name="Oksm.findByKodOksm", query="SELECT oksm FROM Oksm oksm WHERE oksm.kodOksm = :kodOksm")
	,@NamedQuery(name="Oksm.findByKodOksmContaining", query="SELECT oksm FROM Oksm oksm WHERE oksm.kodOksm like :kodOksm")

	,@NamedQuery(name="Oksm.findByGihdAdate", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Oksm.findByGihdChdate", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Oksm.findByGihdDdate", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Oksm.findByGihdIdUser", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Oksm.findByGihdAIdPackage", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Oksm.findByGihdChIdPackage", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Oksm.findByGihdDIdPackage", query="SELECT oksm FROM Oksm oksm WHERE oksm.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Oksm.findByRowCheckSum", query="SELECT oksm FROM Oksm oksm WHERE oksm.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Oksm.findByRowCheckSumContaining", query="SELECT oksm FROM Oksm oksm WHERE oksm.rowCheckSum like :rowCheckSum")

})

public class Oksm implements Serializable, EgrulEntity {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Oksm.findAll";
    public static final String FIND_BY_NAME = "Oksm.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Oksm.findByNameContaining";
    public static final String FIND_BY_KODOKSM = "Oksm.findByKodOksm";
    public static final String FIND_BY_KODOKSM_CONTAINING ="Oksm.findByKodOksmContaining";
    public static final String FIND_BY_GIHDADATE = "Oksm.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Oksm.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Oksm.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Oksm.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Oksm.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Oksm.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Oksm.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Oksm.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Oksm.findByRowCheckSumContaining";
	
    @Id @Column(name="ID" )
    private Integer id;

//MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @KOD_OKSM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KOD_OKSM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KOD_OKSM@
    @NaturalId
    @Column(name="KOD_OKSM"  , length=10 , nullable=true , unique=false)
    private String kodOksm; 
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
    public Oksm() {
    }

	/**
	* All field constructor 
	*/
    public Oksm(
       Integer id,
       String name,
       String kodOksm,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       id,
       name,
       kodOksm,
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
    
	public Oksm(
       Integer id,
       String name,
       String kodOksm,
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
       setId (id);
       //attributes
       setName (name);
       setKodOksm (kodOksm);
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

	public Oksm flat() {
	   return new Oksm(
          getId(),
          getName(),
          getKodOksm(),
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

    public Integer getId() {
        return id;
    }
	
    public void setId (Integer id) {
        this.id =  id;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KOD_OKSM@
    public String getKodOksm() {
        return kodOksm;
    }
	
    public void setKodOksm (String kodOksm) {
        this.kodOksm =  kodOksm;
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
        return id.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oksm)) return false;

        Oksm oksm = (Oksm) o;

        if (!id.equals(oksm.id)) return false;
        if (kodOksm != null ? !kodOksm.equals(oksm.kodOksm) : oksm.kodOksm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (kodOksm != null ? kodOksm.hashCode() : 0);
        return result;
    }
//MP-MANAGED-UPDATABLE-ENDING






//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
