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
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Spvidip</p>
 *
 * <p>Description: Domain Object describing a Spvidip entity</p>
 *
 */
@Entity (name="Spvidip")
@Table (name="SPVIDIP")
@NamedQueries ({
	 @NamedQuery(name="Spvidip.findAll", query="SELECT spvidip FROM Spvidip spvidip")
	,@NamedQuery(name="Spvidip.findByName", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.name = :name")
	,@NamedQuery(name="Spvidip.findByNameContaining", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.name like :name")

	,@NamedQuery(name="Spvidip.findByGihdAdate", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spvidip.findByGihdChdate", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spvidip.findByGihdDdate", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spvidip.findByGihdIdUser", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spvidip.findByGihdAIdPackage", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spvidip.findByGihdChIdPackage", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spvidip.findByGihdDIdPackage", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spvidip.findByRowCheckSum", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spvidip.findByRowCheckSumContaining", query="SELECT spvidip FROM Spvidip spvidip WHERE spvidip.rowCheckSum like :rowCheckSum")

})

public class Spvidip implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Spvidip.findAll";
    public static final String FIND_BY_NAME = "Spvidip.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spvidip.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Spvidip.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spvidip.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spvidip.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spvidip.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spvidip.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spvidip.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spvidip.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spvidip.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spvidip.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ID" ) 
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
    public Spvidip() {
    }

	/**
	* All field constructor 
	*/
    public Spvidip(
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
    
	public Spvidip(
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

	public Spvidip flat() {
	   return new Spvidip(
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
