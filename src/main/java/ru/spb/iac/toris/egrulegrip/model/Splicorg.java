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
 * <p>Title: Splicorg</p>
 *
 * <p>Description: Domain Object describing a Splicorg entity</p>
 *
 */
@Entity (name="Splicorg")
@Table (name="SPLICORG")
@NamedQueries ({
	 @NamedQuery(name="Splicorg.findAll", query="SELECT splicorg FROM Splicorg splicorg")
	,@NamedQuery(name="Splicorg.findByName", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.name = :name")
	,@NamedQuery(name="Splicorg.findByNameContaining", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.name like :name")

	,@NamedQuery(name="Splicorg.findByGihdAdate", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Splicorg.findByGihdChdate", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Splicorg.findByGihdDdate", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Splicorg.findByGihdIdUser", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Splicorg.findByGihdAIdPackage", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Splicorg.findByGihdChIdPackage", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Splicorg.findByGihdDIdPackage", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Splicorg.findByRowCheckSum", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Splicorg.findByRowCheckSumContaining", query="SELECT splicorg FROM Splicorg splicorg WHERE splicorg.rowCheckSum like :rowCheckSum")

})

public class Splicorg implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Splicorg.findAll";
    public static final String FIND_BY_NAME = "Splicorg.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Splicorg.findByNameContaining";
    public static final String FIND_BY_GIHDADATE = "Splicorg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Splicorg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Splicorg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Splicorg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Splicorg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Splicorg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Splicorg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Splicorg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Splicorg.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ID" ) 
    private String id;


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
    public Splicorg() {
    }

	/**
	* All field constructor 
	*/
    public Splicorg(
       String id,
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
    
	public Splicorg(
       String id,
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

	public Splicorg flat() {
	   return new Splicorg(
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

    public String getId() {
        return id;
    }
	
    public void setId (String id) {
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
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Splicorg)) return false;

        Splicorg splicorg = (Splicorg) o;

        return id.equals(splicorg.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


}
