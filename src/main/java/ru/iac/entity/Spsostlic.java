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
 * <p>Title: Spsostlic</p>
 *
 * <p>Description: Domain Object describing a Spsostlic entity</p>
 *
 */
@Entity (name="Spsostlic")
@Table (name="\"SPSOSTLIC\"")
@NamedQueries ({
	 @NamedQuery(name="Spsostlic.findAll", query="SELECT spsostlic FROM Spsostlic spsostlic")
	,@NamedQuery(name="Spsostlic.findByName", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.name = :name")
	,@NamedQuery(name="Spsostlic.findByNameContaining", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.name like :name")

	,@NamedQuery(name="Spsostlic.findByGihdAdate", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spsostlic.findByGihdChdate", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spsostlic.findByGihdDdate", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spsostlic.findByGihdIdUser", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spsostlic.findByGihdAIdPackage", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spsostlic.findByGihdChIdPackage", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spsostlic.findByGihdDIdPackage", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spsostlic.findByRowCheckSum", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spsostlic.findByRowCheckSumContaining", query="SELECT spsostlic FROM Spsostlic spsostlic WHERE spsostlic.rowCheckSum like :rowCheckSum")

})

public class Spsostlic implements Serializable, EgrulEntity {
    public static final String FIND_ALL = "Spsostlic.findAll";
    public static final String FIND_BY_NAME = "Spsostlic.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spsostlic.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Spsostlic.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spsostlic.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spsostlic.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spsostlic.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spsostlic.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spsostlic.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spsostlic.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spsostlic.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spsostlic.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id @Column(name="IDSOSTLIC" )
    private Integer idsostlic;


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
    public Spsostlic() {
    }

	/**
	* All field constructor 
	*/
    public Spsostlic(
       Integer idsostlic,
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
       idsostlic,
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
    
	public Spsostlic(
       Integer idsostlic,
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
       setIdsostlic (idsostlic);
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

	public Spsostlic flat() {
	   return new Spsostlic(
          getIdsostlic(),
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

    public Integer getIdsostlic() {
        return idsostlic;
    }
	
    public void setIdsostlic (Integer idsostlic) {
        this.idsostlic =  idsostlic;
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
        return idsostlic.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spsostlic)) return false;

        Spsostlic spsostlic = (Spsostlic) o;

        if (!idsostlic.equals(spsostlic.idsostlic)) return false;
        return name != null ? name.equals(spsostlic.name) : spsostlic.name == null;

    }

    @Override
    public int hashCode() {
        int result = idsostlic.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}
