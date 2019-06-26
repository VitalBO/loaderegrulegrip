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
 * <p>Title: OkatoRaion</p>
 *
 * <p>Description: Domain Object describing a OkatoRaion entity</p>
 *
 */
@Entity (name="OkatoRaion")
@Table (name="OKATO_RAION")
@NamedQueries ({
	 @NamedQuery(name="OkatoRaion.findAll", query="SELECT okatoraion FROM OkatoRaion okatoraion")
	,@NamedQuery(name="OkatoRaion.findByIdRaion", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.idRaion = :idRaion")

	,@NamedQuery(name="OkatoRaion.findByGihdAdate", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdAdate = :gihdAdate")

	,@NamedQuery(name="OkatoRaion.findByGihdChdate", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdChdate = :gihdChdate")

	,@NamedQuery(name="OkatoRaion.findByGihdDdate", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdDdate = :gihdDdate")

	,@NamedQuery(name="OkatoRaion.findByGihdIdUser", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="OkatoRaion.findByGihdAIdPackage", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="OkatoRaion.findByGihdChIdPackage", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="OkatoRaion.findByGihdDIdPackage", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="OkatoRaion.findByRowCheckSum", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="OkatoRaion.findByRowCheckSumContaining", query="SELECT okatoraion FROM OkatoRaion okatoraion WHERE okatoraion.rowCheckSum like :rowCheckSum")

})

public class OkatoRaion implements Serializable {
    public static final String FIND_ALL = "OkatoRaion.findAll";
    public static final String FIND_BY_IDRAION = "OkatoRaion.findByIdRaion";
    public static final String FIND_BY_GIHDADATE = "OkatoRaion.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "OkatoRaion.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "OkatoRaion.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "OkatoRaion.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "OkatoRaion.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "OkatoRaion.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "OkatoRaion.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "OkatoRaion.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="OkatoRaion.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "OKATO", length = 5)
    private String okato;


    @Column(name="ID_RAION"   , nullable=true , unique=false)
    private Integer idRaion;


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
    public OkatoRaion() {
    }

	/**
	* All field constructor 
	*/
    public OkatoRaion(
       String okato,
       Integer idRaion,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       okato,
       idRaion,
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
    
	public OkatoRaion(
       String okato,
       Integer idRaion,
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
       setOkato (okato);
       //attributes
       setIdRaion (idRaion);
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

	public OkatoRaion flat() {
	   return new OkatoRaion(
          getOkato(),
          getIdRaion(),
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

    public String getOkato() {
        return okato;
    }
	
    public void setOkato (String okato) {
        this.okato =  okato;
    }


    public Integer getIdRaion() {
        return idRaion;
    }
	
    public void setIdRaion (Integer idRaion) {
        this.idRaion =  idRaion;
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
