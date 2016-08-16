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
 * <p>Title: Spvidcap</p>
 *
 * <p>Description: Domain Object describing a Spvidcap entity</p>
 *
 */
@Entity (name="Spvidcap")
@Table (name="\"SPVIDCAP\"")
@NamedQueries ({
	 @NamedQuery(name="Spvidcap.findAll", query="SELECT spvidcap FROM Spvidcap spvidcap")
	,@NamedQuery(name="Spvidcap.findByName", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.name = :name")
	,@NamedQuery(name="Spvidcap.findByNameContaining", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.name like :name")

	,@NamedQuery(name="Spvidcap.findByGihdAdate", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spvidcap.findByGihdChdate", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spvidcap.findByGihdDdate", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spvidcap.findByGihdIdUser", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spvidcap.findByGihdAIdPackage", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spvidcap.findByGihdChIdPackage", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spvidcap.findByGihdDIdPackage", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spvidcap.findByRowCheckSum", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spvidcap.findByRowCheckSumContaining", query="SELECT spvidcap FROM Spvidcap spvidcap WHERE spvidcap.rowCheckSum like :rowCheckSum")

})

public class Spvidcap implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Spvidcap.findAll";
    public static final String FIND_BY_NAME = "Spvidcap.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spvidcap.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Spvidcap.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spvidcap.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spvidcap.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spvidcap.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spvidcap.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spvidcap.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spvidcap.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spvidcap.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spvidcap.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id @Column(name="ID" )
    private Integer id;


    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name;


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
    public Spvidcap() {
    }

	/**
	* All field constructor 
	*/
    public Spvidcap(
       Integer id,
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
       id,
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
    
	public Spvidcap(
       Integer id,
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
       setId (id);
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

	public Spvidcap flat() {
	   return new Spvidcap(
          getId(),
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

    public Integer getId() {
        return id;
    }
	
    public void setId (Integer id) {
        this.id =  id;
    }


    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
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

    @Override
    public String getIdenti() {
        return id.toString();
    }


}
