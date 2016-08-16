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
    private static final long serialVersionUID = 1L;
    @Id @Column(name="IDVIDREG" )
    private Integer idvidreg;


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
        return idvidreg.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spvidreg)) return false;

        Spvidreg spvidreg = (Spvidreg) o;

        return idvidreg.equals(spvidreg.idvidreg);

    }

    @Override
    public int hashCode() {
        return idvidreg.hashCode();
    }


}
