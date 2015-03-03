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
 * <p>Title: Spvidreg</p>
 *
 * <p>Description: Domain Object describing a Spvidreg entity</p>
 *
 */
@Entity (name="Spvidreg")
@Table (name="\"SPVIDREG\"")
@NamedQueries ({
	 @NamedQuery(name="Spvidreg.findAll", query="SELECT spvidreg FROM Spvidreg spvidreg")
	,@NamedQuery(name="Spvidreg.findByName", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.name = :name")
	,@NamedQuery(name="Spvidreg.findByNameContaining", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.name like :name")

	,@NamedQuery(name="Spvidreg.findByGihdAdate", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spvidreg.findByGihdChdate", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spvidreg.findByGihdDdate", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spvidreg.findByGihdIdUser", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spvidreg.findByGihdAIdPackage", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spvidreg.findByGihdChIdPackage", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spvidreg.findByGihdDIdPackage", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spvidreg.findByRowCheckSum", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spvidreg.findByRowCheckSumContaining", query="SELECT spvidreg FROM Spvidreg spvidreg WHERE spvidreg.rowCheckSum like :rowCheckSum")

})

public class Spvidreg implements Serializable, EgrulEntity {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Spvidreg.findAll";
    public static final String FIND_BY_NAME = "Spvidreg.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spvidreg.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Spvidreg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spvidreg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spvidreg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spvidreg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spvidreg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spvidreg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spvidreg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spvidreg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spvidreg.findByRowCheckSumContaining";
	
    @Id @Column(name="IDVIDREG" )
    private Integer idvidreg;

//MP-MANAGED-ADDED-AREA-BEGINNING @NAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAME@
    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name; 
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
    public Spvidreg() {
    }

	/**
	* All field constructor 
	*/
    public Spvidreg(
       Integer idvidreg,
       String name,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idvidreg,
       name,
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
    
	public Spvidreg(
       Integer idvidreg,
       String name,
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
       setIdvidreg (idvidreg);
       //attributes
       setName (name);
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

	public Spvidreg flat() {
	   return new Spvidreg(
          getIdvidreg(),
          getName(),
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

    public Integer getIdvidreg() {
        return idvidreg;
    }
	
    public void setIdvidreg (Integer idvidreg) {
        this.idvidreg =  idvidreg;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAME@
    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
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
        return idvidreg.toString();
    }

//MP-MANAGED-UPDATABLE-ENDING

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spvidreg)) return false;

        Spvidreg spvidreg = (Spvidreg) o;

        if (!idvidreg.equals(spvidreg.idvidreg)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idvidreg.hashCode();
    }


//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
