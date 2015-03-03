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
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * <p>Title: Rg</p>
 *
 * <p>Description: Domain Object describing a Rg entity</p>
 *
 */
@Entity (name="Rg")
@Table (name="\"RG\"")
@NamedQueries ({
	 @NamedQuery(name="Rg.findAll", query="SELECT rg FROM Rg rg")
	,@NamedQuery(name="Rg.findByName", query="SELECT rg FROM Rg rg WHERE rg.name = :name")
	,@NamedQuery(name="Rg.findByNameContaining", query="SELECT rg FROM Rg rg WHERE rg.name like :name")

	,@NamedQuery(name="Rg.findByKodKl", query="SELECT rg FROM Rg rg WHERE rg.kodKl = :kodKl")
	,@NamedQuery(name="Rg.findByKodKlContaining", query="SELECT rg FROM Rg rg WHERE rg.kodKl like :kodKl")

	,@NamedQuery(name="Rg.findByGihdAdate", query="SELECT rg FROM Rg rg WHERE rg.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Rg.findByGihdChdate", query="SELECT rg FROM Rg rg WHERE rg.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Rg.findByGihdDdate", query="SELECT rg FROM Rg rg WHERE rg.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Rg.findByGihdIdUser", query="SELECT rg FROM Rg rg WHERE rg.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Rg.findByGihdAIdPackage", query="SELECT rg FROM Rg rg WHERE rg.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Rg.findByGihdChIdPackage", query="SELECT rg FROM Rg rg WHERE rg.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Rg.findByGihdDIdPackage", query="SELECT rg FROM Rg rg WHERE rg.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Rg.findByRowCheckSum", query="SELECT rg FROM Rg rg WHERE rg.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Rg.findByRowCheckSumContaining", query="SELECT rg FROM Rg rg WHERE rg.rowCheckSum like :rowCheckSum")

})

public class Rg implements Serializable, EgrulEntity {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Rg.findAll";
    public static final String FIND_BY_NAME = "Rg.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Rg.findByNameContaining";
    public static final String FIND_BY_KODKL = "Rg.findByKodKl";
    public static final String FIND_BY_KODKL_CONTAINING ="Rg.findByKodKlContaining";
    public static final String FIND_BY_GIHDADATE = "Rg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Rg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Rg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Rg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Rg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Rg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Rg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Rg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Rg.findByRowCheckSumContaining";
	
    @Id @Column(name="IDR" )
    private BigInteger idr;

//MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @KOD_KL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @KOD_KL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-KOD_KL@
    @Column(name="KOD_KL"  , length=11 , nullable=true , unique=false)
    private String kodKl; 
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
    public Rg() {
    }

	/**
	* All field constructor 
	*/
    public Rg(
       BigInteger idr,
       String name,
       String kodKl,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idr,
       name,
       kodKl,
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
    
	public Rg(
       BigInteger idr,
       String name,
       String kodKl,
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
       setIdr (idr);
       //attributes
       setName (name);
       setKodKl (kodKl);
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

	public Rg flat() {
	   return new Rg(
          getIdr(),
          getName(),
          getKodKl(),
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

    public BigInteger getIdr() {
        return idr;
    }
	
    public void setIdr (BigInteger idr) {
        this.idr =  idr;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-KOD_KL@
    public String getKodKl() {
        return kodKl;
    }
	
    public void setKodKl (String kodKl) {
        this.kodKl =  kodKl;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rg)) return false;

        Rg rg = (Rg) o;

        if (!idr.equals(rg.idr)) return false;
        if (kodKl != null ? !kodKl.equals(rg.kodKl) : rg.kodKl != null) return false;
        if (name != null ? !name.equals(rg.name) : rg.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idr.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kodKl != null ? kodKl.hashCode() : 0);
        return result;
    }

    @Override
    public String getIdenti() {
        return idr.toString();
    }

//MP-MANAGED-UPDATABLE-ENDING






//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
