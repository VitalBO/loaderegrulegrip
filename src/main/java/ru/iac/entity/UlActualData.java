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
import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: UlActualData</p>
 *
 * <p>Description: Domain Object describing a UlActualData entity</p>
 *
 */
@Entity (name="UlActualData")
@Table (name="\"UL_ACTUAL_DATA\"")
@NamedQueries ({
	 @NamedQuery(name="UlActualData.findAll", query="SELECT ulactualdata FROM UlActualData ulactualdata")
	,@NamedQuery(name="UlActualData.findByOgrn", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.ogrn = :ogrn")
	,@NamedQuery(name="UlActualData.findByOgrnContaining", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.ogrn like :ogrn")

	,@NamedQuery(name="UlActualData.findByInn", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.inn = :inn")
	,@NamedQuery(name="UlActualData.findByInnContaining", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.inn like :inn")

	,@NamedQuery(name="UlActualData.findByIdstatus", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.idstatus = :idstatus")

	,@NamedQuery(name="UlActualData.findByIdulname", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.idulname = :idulname")

	,@NamedQuery(name="UlActualData.findByNamep", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.namep = :namep")
	,@NamedQuery(name="UlActualData.findByNamepContaining", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.namep like :namep")

	,@NamedQuery(name="UlActualData.findByNames", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.names = :names")
	,@NamedQuery(name="UlActualData.findByNamesContaining", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.names like :names")

	,@NamedQuery(name="UlActualData.findByIduladr", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.iduladr = :iduladr")

	,@NamedQuery(name="UlActualData.findByAdr", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.adr = :adr")
	,@NamedQuery(name="UlActualData.findByAdrContaining", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.adr like :adr")

	,@NamedQuery(name="UlActualData.findByIdAsCurrent", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.idAsCurrent = :idAsCurrent")

	,@NamedQuery(name="UlActualData.findByGihdAdate", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdAdate = :gihdAdate")

	,@NamedQuery(name="UlActualData.findByGihdChdate", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdChdate = :gihdChdate")

	,@NamedQuery(name="UlActualData.findByGihdDdate", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdDdate = :gihdDdate")

	,@NamedQuery(name="UlActualData.findByGihdIdUser", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="UlActualData.findByGihdAIdPackage", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="UlActualData.findByGihdChIdPackage", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="UlActualData.findByGihdDIdPackage", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="UlActualData.findByRowCheckSum", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="UlActualData.findByRowCheckSumContaining", query="SELECT ulactualdata FROM UlActualData ulactualdata WHERE ulactualdata.rowCheckSum like :rowCheckSum")

})

public class UlActualData implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "UlActualData.findAll";
    public static final String FIND_BY_OGRN = "UlActualData.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING ="UlActualData.findByOgrnContaining";
    public static final String FIND_BY_INN = "UlActualData.findByInn";
    public static final String FIND_BY_INN_CONTAINING ="UlActualData.findByInnContaining";
    public static final String FIND_BY_IDSTATUS = "UlActualData.findByIdstatus";
    public static final String FIND_BY_IDULNAME = "UlActualData.findByIdulname";
    public static final String FIND_BY_NAMEP = "UlActualData.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING ="UlActualData.findByNamepContaining";
    public static final String FIND_BY_NAMES = "UlActualData.findByNames";
    public static final String FIND_BY_NAMES_CONTAINING ="UlActualData.findByNamesContaining";
    public static final String FIND_BY_IDULADR = "UlActualData.findByIduladr";
    public static final String FIND_BY_ADR = "UlActualData.findByAdr";
    public static final String FIND_BY_ADR_CONTAINING ="UlActualData.findByAdrContaining";
    public static final String FIND_BY_IDASCURRENT = "UlActualData.findByIdAsCurrent";
    public static final String FIND_BY_GIHDADATE = "UlActualData.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "UlActualData.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "UlActualData.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "UlActualData.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "UlActualData.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "UlActualData.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "UlActualData.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "UlActualData.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="UlActualData.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "UL_ACTUAL_DATASEQ", sequenceName ="", allocationSize=1 )
    @Id @Column(name="IDUL" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="UL_ACTUAL_DATASEQ") 
    private Integer idul;

//MP-MANAGED-ADDED-AREA-BEGINNING @OGRN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @OGRN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-OGRN@
    @Column(name="OGRN"  , length=20 , nullable=true , unique=false)
    private String ogrn; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @INN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @INN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-INN@
    @Column(name="INN"  , length=20 , nullable=true , unique=false)
    private String inn; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDSTATUS-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDSTATUS-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDSTATUS@
    @Column(name="IDSTATUS"   , nullable=true , unique=false)
    private Integer idstatus; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDULNAME-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDULNAME-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDULNAME@
    @Column(name="IDULNAME"   , nullable=true , unique=false)
    private Integer idulname; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NAMEP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEP@
    @Column(name="NAMEP"  , length=800 , nullable=true , unique=false)
    private String namep; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NAMES-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMES-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMES@
    @Column(name="NAMES"  , length=255 , nullable=true , unique=false)
    private String names; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDULADR-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDULADR-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDULADR@
    @Column(name="IDULADR"   , nullable=true , unique=false)
    private Integer iduladr; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @ADR-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ADR-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ADR@
    @Column(name="ADR"  , length=200 , nullable=true , unique=false)
    private String adr; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @ID_AS_CURRENT-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @ID_AS_CURRENT-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-ID_AS_CURRENT@
    @Column(name="ID_AS_CURRENT"   , nullable=true , unique=false)
    private Integer idAsCurrent; 
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
    public UlActualData() {
    }

	/**
	* All field constructor 
	*/
    public UlActualData(
       Integer idul,
       String ogrn,
       String inn,
       Integer idstatus,
       Integer idulname,
       String namep,
       String names,
       Integer iduladr,
       String adr,
       Integer idAsCurrent,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idul,
       ogrn,
       inn,
       idstatus,
       idulname,
       namep,
       names,
       iduladr,
       adr,
       idAsCurrent,
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
    
	public UlActualData(
       Integer idul,
       String ogrn,
       String inn,
       Integer idstatus,
       Integer idulname,
       String namep,
       String names,
       Integer iduladr,
       String adr,
       Integer idAsCurrent,
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
       setIdul (idul);
       //attributes
       setOgrn (ogrn);
       setInn (inn);
       setIdstatus (idstatus);
       setIdulname (idulname);
       setNamep (namep);
       setNames (names);
       setIduladr (iduladr);
       setAdr (adr);
       setIdAsCurrent (idAsCurrent);
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

	public UlActualData flat() {
	   return new UlActualData(
          getIdul(),
          getOgrn(),
          getInn(),
          getIdstatus(),
          getIdulname(),
          getNamep(),
          getNames(),
          getIduladr(),
          getAdr(),
          getIdAsCurrent(),
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

    public Integer getIdul() {
        return idul;
    }
	
    public void setIdul (Integer idul) {
        this.idul =  idul;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-OGRN@
    public String getOgrn() {
        return ogrn;
    }
	
    public void setOgrn (String ogrn) {
        this.ogrn =  ogrn;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-INN@
    public String getInn() {
        return inn;
    }
	
    public void setInn (String inn) {
        this.inn =  inn;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDSTATUS@
    public Integer getIdstatus() {
        return idstatus;
    }
	
    public void setIdstatus (Integer idstatus) {
        this.idstatus =  idstatus;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDULNAME@
    public Integer getIdulname() {
        return idulname;
    }
	
    public void setIdulname (Integer idulname) {
        this.idulname =  idulname;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMEP@
    public String getNamep() {
        return namep;
    }
	
    public void setNamep (String namep) {
        this.namep =  namep;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMES@
    public String getNames() {
        return names;
    }
	
    public void setNames (String names) {
        this.names =  names;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDULADR@
    public Integer getIduladr() {
        return iduladr;
    }
	
    public void setIduladr (Integer iduladr) {
        this.iduladr =  iduladr;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-ADR@
    public String getAdr() {
        return adr;
    }
	
    public void setAdr (String adr) {
        this.adr =  adr;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-ID_AS_CURRENT@
    public Integer getIdAsCurrent() {
        return idAsCurrent;
    }
	
    public void setIdAsCurrent (Integer idAsCurrent) {
        this.idAsCurrent =  idAsCurrent;
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
	
//MP-MANAGED-UPDATABLE-ENDING






//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
