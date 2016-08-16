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
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * <p>Title: Raion</p>
 *
 * <p>Description: Domain Object describing a Raion entity</p>
 *
 */
@Entity (name="Raion")
@Table (name="\"RAION\"")
@NamedQueries ({
	 @NamedQuery(name="Raion.findAll", query="SELECT raion FROM Raion raion")
	,@NamedQuery(name="Raion.findByName", query="SELECT raion FROM Raion raion WHERE raion.name = :name")
	,@NamedQuery(name="Raion.findByNameContaining", query="SELECT raion FROM Raion raion WHERE raion.name like :name")

	,@NamedQuery(name="Raion.findByStatus", query="SELECT raion FROM Raion raion WHERE raion.status = :status")

	,@NamedQuery(name="Raion.findByGihdAdate", query="SELECT raion FROM Raion raion WHERE raion.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Raion.findByGihdChdate", query="SELECT raion FROM Raion raion WHERE raion.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Raion.findByGihdDdate", query="SELECT raion FROM Raion raion WHERE raion.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Raion.findByGihdIdUser", query="SELECT raion FROM Raion raion WHERE raion.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Raion.findByGihdAIdPackage", query="SELECT raion FROM Raion raion WHERE raion.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Raion.findByGihdChIdPackage", query="SELECT raion FROM Raion raion WHERE raion.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Raion.findByGihdDIdPackage", query="SELECT raion FROM Raion raion WHERE raion.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Raion.findByRowCheckSum", query="SELECT raion FROM Raion raion WHERE raion.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Raion.findByRowCheckSumContaining", query="SELECT raion FROM Raion raion WHERE raion.rowCheckSum like :rowCheckSum")

})

public class Raion implements Serializable {
    public static final String FIND_ALL = "Raion.findAll";
    public static final String FIND_BY_NAME = "Raion.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Raion.findByNameContaining";
    public static final String FIND_BY_STATUS = "Raion.findByStatus";
    public static final String FIND_BY_GIHDADATE = "Raion.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Raion.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Raion.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Raion.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Raion.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Raion.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Raion.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Raion.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Raion.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "RAIONSEQ", sequenceName ="", allocationSize=1 )
    @Id @Column(name="ID_RAION" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RAIONSEQ") 
    private BigInteger idRaion;


    @Column(name="NAME"  , length=100 , nullable=true , unique=false)
    private String name;


    @Column(name="STATUS"   , nullable=false , unique=false)
    private Integer status;


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
    public Raion() {
    }

	/**
	* All field constructor 
	*/
    public Raion(
       BigInteger idRaion,
       String name,
       Integer status,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idRaion,
       name,
       status,
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
    
	public Raion(
       BigInteger idRaion,
       String name,
       Integer status,
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
       setIdRaion (idRaion);
       //attributes
       setName (name);
       setStatus (status);
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

	public Raion flat() {
	   return new Raion(
          getIdRaion(),
          getName(),
          getStatus(),
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

    public BigInteger getIdRaion() {
        return idRaion;
    }
	
    public void setIdRaion (BigInteger idRaion) {
        this.idRaion =  idRaion;
    }


    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }


    public Integer getStatus() {
        return status;
    }
	
    public void setStatus (Integer status) {
        this.status =  status;
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


}
