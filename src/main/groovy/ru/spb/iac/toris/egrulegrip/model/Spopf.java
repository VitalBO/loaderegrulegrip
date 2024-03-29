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
 * <p>Title: Spopf</p>
 *
 * <p>Description: Domain Object describing a Spopf entity</p>
 *
 */
@Entity (name="Spopf")
@Table (name="SPOPF")
@NamedQueries ({
	 @NamedQuery(name="Spopf.findAll", query="SELECT spopf FROM Spopf spopf")
	,@NamedQuery(name="Spopf.findByName", query="SELECT spopf FROM Spopf spopf WHERE spopf.name = :name")
	,@NamedQuery(name="Spopf.findByNameContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.name like :name")

	,@NamedQuery(name="Spopf.findByKodOpf", query="SELECT spopf FROM Spopf spopf WHERE spopf.kodOpf = :kodOpf")
	,@NamedQuery(name="Spopf.findByKodOpfContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.kodOpf like :kodOpf")

	,@NamedQuery(name="Spopf.findBySpr", query="SELECT spopf FROM Spopf spopf WHERE spopf.spr = :spr")
	,@NamedQuery(name="Spopf.findBySprContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.spr like :spr")

	,@NamedQuery(name="Spopf.findByGihdAdate", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spopf.findByGihdChdate", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spopf.findByGihdDdate", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spopf.findByGihdIdUser", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spopf.findByGihdAIdPackage", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spopf.findByGihdChIdPackage", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spopf.findByGihdDIdPackage", query="SELECT spopf FROM Spopf spopf WHERE spopf.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spopf.findByRowCheckSum", query="SELECT spopf FROM Spopf spopf WHERE spopf.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spopf.findByRowCheckSumContaining", query="SELECT spopf FROM Spopf spopf WHERE spopf.rowCheckSum like :rowCheckSum")

})

public class Spopf implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Spopf.findAll";
    public static final String FIND_BY_NAME = "Spopf.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spopf.findByNameContaining";
    public static final String FIND_BY_KODOPF = "Spopf.findByKodOpf";
    public static final String FIND_BY_KODOPF_CONTAINING ="Spopf.findByKodOpfContaining";
    public static final String FIND_BY_SPR = "Spopf.findBySpr";
    public static final String FIND_BY_SPR_CONTAINING ="Spopf.findBySprContaining";
    public static final String FIND_BY_GIHDADATE = "Spopf.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spopf.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spopf.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spopf.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spopf.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spopf.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spopf.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spopf.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spopf.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @Id @Column(name="IDOPF" )
    private Integer idopf;


    @Column(name="NAME"  , length=255 , nullable=true , unique=true)
    private String name;


    @Column(name="KOD_OPF"  , length=2 , nullable=true , unique=false)
    private String kodOpf;


    @Column(name="SPR"  , length=7 , nullable=true , unique=false)
    private String spr;


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
    public Spopf() {
    }

	/**
	* All field constructor 
	*/
    public Spopf(
       Integer idopf,
       String name,
       String kodOpf,
       String spr,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idopf,
       name,
       kodOpf,
       spr,
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
    
	public Spopf(
       Integer idopf,
       String name,
       String kodOpf,
       String spr,
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
       setIdopf (idopf);
       //attributes
       setName (name);
       setKodOpf (kodOpf);
       setSpr (spr);
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

	public Spopf flat() {
	   return new Spopf(
          getIdopf(),
          getName(),
          getKodOpf(),
          getSpr(),
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

    public Integer getIdopf() {
        return idopf;
    }
	
    public void setIdopf (Integer idopf) {
        this.idopf =  idopf;
    }


    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }


    public String getKodOpf() {
        return kodOpf;
    }
	
    public void setKodOpf (String kodOpf) {
        this.kodOpf =  kodOpf;
    }


    public String getSpr() {
        return spr;
    }
	
    public void setSpr (String spr) {
        this.spr =  spr;
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
        return idopf.toString();
    }


}
