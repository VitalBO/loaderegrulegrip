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
	* - time      : 2015/02/12 �.�. at 10:23:30 MSK
*/
package ru.iac.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Fl</p>
 *
 * <p>Description: Domain Object describing a Fl entity</p>
 *
 */
@Entity (name="Fl")
@Table (name="\"FL\"")
@NamedQueries ({
	 @NamedQuery(name="Fl.findAll", query="SELECT fl FROM Fl fl")
	,@NamedQuery(name="Fl.findByFamfl", query="SELECT fl FROM Fl fl WHERE fl.famfl = :famfl")
	,@NamedQuery(name="Fl.findByFamflContaining", query="SELECT fl FROM Fl fl WHERE fl.famfl like :famfl")

	,@NamedQuery(name="Fl.findByNamefl", query="SELECT fl FROM Fl fl WHERE fl.namefl = :namefl")
	,@NamedQuery(name="Fl.findByNameflContaining", query="SELECT fl FROM Fl fl WHERE fl.namefl like :namefl")

	,@NamedQuery(name="Fl.findByOtchfl", query="SELECT fl FROM Fl fl WHERE fl.otchfl = :otchfl")
	,@NamedQuery(name="Fl.findByOtchflContaining", query="SELECT fl FROM Fl fl WHERE fl.otchfl like :otchfl")
        , @NamedQuery(name = "Fl.findByInn", query = "SELECT fl FROM Fl fl WHERE fl.inn = :inn")

        , @NamedQuery(name = "Fl.findByInnNId", query = "SELECT fl FROM Fl fl WHERE fl.inn = :kod")
        ,@NamedQuery(name="Fl.findByInnContaining", query="SELECT fl FROM Fl fl WHERE fl.inn like :inn")

	,@NamedQuery(name="Fl.findByGihdAdate", query="SELECT fl FROM Fl fl WHERE fl.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Fl.findByGihdChdate", query="SELECT fl FROM Fl fl WHERE fl.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Fl.findByGihdDdate", query="SELECT fl FROM Fl fl WHERE fl.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Fl.findByGihdIdUser", query="SELECT fl FROM Fl fl WHERE fl.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Fl.findByGihdAIdPackage", query="SELECT fl FROM Fl fl WHERE fl.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Fl.findByGihdChIdPackage", query="SELECT fl FROM Fl fl WHERE fl.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Fl.findByGihdDIdPackage", query="SELECT fl FROM Fl fl WHERE fl.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Fl.findByRowCheckSum", query="SELECT fl FROM Fl fl WHERE fl.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Fl.findByRowCheckSumContaining", query="SELECT fl FROM Fl fl WHERE fl.rowCheckSum like :rowCheckSum")

})

public class Fl implements Serializable, EgrulEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Fl.findAll";
    public static final String FIND_BY_NATURALID = "Fl.findByInnNId";
    public static final String FIND_BY_FAMFL = "Fl.findByFamfl";
    public static final String FIND_BY_FAMFL_CONTAINING ="Fl.findByFamflContaining";
    public static final String FIND_BY_NAMEFL = "Fl.findByNamefl";
    public static final String FIND_BY_NAMEFL_CONTAINING ="Fl.findByNameflContaining";
    public static final String FIND_BY_OTCHFL = "Fl.findByOtchfl";
    public static final String FIND_BY_OTCHFL_CONTAINING ="Fl.findByOtchflContaining";
    public static final String FIND_BY_INN = "Fl.findByInn";
    public static final String FIND_BY_INN_CONTAINING ="Fl.findByInnContaining";
    public static final String FIND_BY_GIHDADATE = "Fl.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Fl.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Fl.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Fl.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Fl.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Fl.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Fl.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Fl.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Fl.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "FLSEQ", sequenceName ="SEQ_FL", allocationSize=1 )
    @Id @Column(name="IDFL" )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="FLSEQ") 
    private Integer idfl;


    @Column(name="FAMFL"  , length=60 , nullable=true , unique=false)
    private String famfl;


    @Column(name="NAMEFL"  , length=60 , nullable=true , unique=false)
    private String namefl;


    @Column(name="OTCHFL"  , length=60 , nullable=true , unique=false)
    private String otchfl;


    @Column(name="INN"  , length=20 , nullable=true , unique=false)
    private String inn;


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
    public Fl() {
    }

	/**
	* All field constructor 
	*/
    public Fl(
       String famfl,
       String namefl,
       String otchfl,
       String inn,
       Integer idfl,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       famfl,
       namefl,
       otchfl,
       inn,
       idfl,
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
    
	public Fl(
       String famfl,
       String namefl,
       String otchfl,
       String inn,
       Integer idfl,
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
       setIdfl (idfl);
       //attributes
       setFamfl (famfl);
       setNamefl (namefl);
       setOtchfl (otchfl);
       setInn (inn);
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

	public Fl flat() {
	   return new Fl(
          getFamfl(),
          getNamefl(),
          getOtchfl(),
          getInn(),
          getIdfl(),
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

    public Integer getIdfl() {
        return idfl;
    }
	
    public void setIdfl (Integer idfl) {
        this.idfl =  idfl;
    }


    public String getFamfl() {
        return famfl;
    }
	
    public void setFamfl (String famfl) {
        this.famfl =  famfl;
    }


    public String getNamefl() {
        return namefl;
    }
	
    public void setNamefl (String namefl) {
        this.namefl =  namefl;
    }


    public String getOtchfl() {
        return otchfl;
    }
	
    public void setOtchfl (String otchfl) {
        this.otchfl =  otchfl;
    }


    public String getInn() {
        return inn;
    }
	
    public void setInn (String inn) {
        this.inn =  inn;
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
        return idfl == null ? null : idfl.toString();
    }

    @Override
    public String getnaturalId() {
        return inn;
    }


    @Override
    public String returnNaturalIdQuery() {
        return FIND_BY_NATURALID;
    }


}
