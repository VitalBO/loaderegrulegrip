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
 * <p>Title: Ipdokdsn</p>
 *
 * <p>Description: Domain Object describing a Ipdokdsn entity</p>
 *
 */
@Entity (name="Ipdokdsn")
@Table (name="\"IPDOKDSN\"")
@NamedQueries ({
	 @NamedQuery(name="Ipdokdsn.findAll", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn")
	,@NamedQuery(name="Ipdokdsn.findByIdip", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.idip = :idip")

	,@NamedQuery(name="Ipdokdsn.findByDtstart", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.dtstart = :dtstart")

	,@NamedQuery(name="Ipdokdsn.findByIdosndn", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.idosndn = :idosndn")

	,@NamedQuery(name="Ipdokdsn.findByIddokdn", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.iddokdn = :iddokdn")

	,@NamedQuery(name="Ipdokdsn.findByNum", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.num = :num")
	,@NamedQuery(name="Ipdokdsn.findByNumContaining", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.num like :num")

	,@NamedQuery(name="Ipdokdsn.findByDt", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.dt = :dt")

	,@NamedQuery(name="Ipdokdsn.findByNameorg", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.nameorg = :nameorg")
	,@NamedQuery(name="Ipdokdsn.findByNameorgContaining", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.nameorg like :nameorg")

	,@NamedQuery(name="Ipdokdsn.findByGihdAdate", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipdokdsn.findByGihdChdate", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipdokdsn.findByGihdDdate", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipdokdsn.findByGihdIdUser", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipdokdsn.findByGihdAIdPackage", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipdokdsn.findByGihdChIdPackage", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipdokdsn.findByGihdDIdPackage", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipdokdsn.findByRowCheckSum", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipdokdsn.findByRowCheckSumContaining", query="SELECT ipdokdsn FROM Ipdokdsn ipdokdsn WHERE ipdokdsn.rowCheckSum like :rowCheckSum")

})

public class Ipdokdsn implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ipdokdsn.findAll";
    public static final String FIND_BY_IDIP = "Ipdokdsn.findByIdip";
    public static final String FIND_BY_DTSTART = "Ipdokdsn.findByDtstart";
    public static final String FIND_BY_IDOSNDN = "Ipdokdsn.findByIdosndn";
    public static final String FIND_BY_IDDOKDN = "Ipdokdsn.findByIddokdn";
    public static final String FIND_BY_NUM = "Ipdokdsn.findByNum";
    public static final String FIND_BY_NUM_CONTAINING ="Ipdokdsn.findByNumContaining";
    public static final String FIND_BY_DT = "Ipdokdsn.findByDt";
    public static final String FIND_BY_NAMEORG = "Ipdokdsn.findByNameorg";
    public static final String FIND_BY_NAMEORG_CONTAINING ="Ipdokdsn.findByNameorgContaining";
    public static final String FIND_BY_GIHDADATE = "Ipdokdsn.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipdokdsn.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipdokdsn.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipdokdsn.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipdokdsn.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipdokdsn.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipdokdsn.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipdokdsn.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipdokdsn.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "IPDOKDSNSEQ", sequenceName ="SEQ_IPDOKDSN", allocationSize=1 )
    @Id @Column(name="IDDOKDSN" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPDOKDSNSEQ") 
    private Integer iddokdsn;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
    @OneToOne
    @JoinColumn(name="IDIP"   , nullable=false , unique=true)
    private Ip idip; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDOSNDN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDOSNDN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDOSNDN@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="IDOSNDN"   , nullable=true , unique=false)
    private Sposndn idosndn;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDDOKDN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDDOKDN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDDOKDN@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="IDDOKDN"   , nullable=true , unique=false)
    private Spdokdn iddokdn; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NUM@
    @Column(name="NUM"  , length=30 , nullable=true , unique=false)
    private String num; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DT-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DT-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DT@
    @Column(name="DT"   , nullable=true , unique=false)
    private Date dt; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NAMEORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NAMEORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NAMEORG@
    @Column(name="NAMEORG"  , length=255 , nullable=true , unique=false)
    private String nameorg; 
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
    public Ipdokdsn() {
    }

	/**
	* All field constructor 
	*/
    public Ipdokdsn(
       Integer iddokdsn,
       Ip idip,
       Date dtstart,
       Sposndn idosndn,
       Spdokdn iddokdn,
       String num,
       Date dt,
       String nameorg,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       iddokdsn,
       idip,
       dtstart,
       idosndn,
       iddokdn,
       num,
       dt,
       nameorg,
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
    
	public Ipdokdsn(
       Integer iddokdsn,
       Ip idip,
       Date dtstart,
       Sposndn idosndn,
       Spdokdn iddokdn,
       String num,
       Date dt,
       String nameorg,
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
       setIddokdsn (iddokdsn);
       //attributes
       setIdip (idip);
       setDtstart (dtstart);
       setIdosndn (idosndn);
       setIddokdn (iddokdn);
       setNum (num);
       setDt (dt);
       setNameorg (nameorg);
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

	public Ipdokdsn flat() {
	   return new Ipdokdsn(
          getIddokdsn(),
          getIdip(),
          getDtstart(),
          getIdosndn(),
          getIddokdn(),
          getNum(),
          getDt(),
          getNameorg(),
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

    public Integer getIddokdsn() {
        return iddokdsn;
    }
	
    public void setIddokdsn (Integer iddokdsn) {
        this.iddokdsn =  iddokdsn;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDIP@
    public Ip getIdip() {
        return idip;
    }
	
    public void setIdip (Ip idip) {
        this.idip =  idip;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTSTART@
    public Date getDtstart() {
        return dtstart;
    }
	
    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDOSNDN@
    public Sposndn getIdosndn() {
        return idosndn;
    }
	
    public void setIdosndn (Sposndn idosndn) {
        this.idosndn =  idosndn;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDDOKDN@
    public Spdokdn getIddokdn() {
        return iddokdn;
    }
	
    public void setIddokdn (Spdokdn iddokdn) {
        this.iddokdn =  iddokdn;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NUM@
    public String getNum() {
        return num;
    }
	
    public void setNum (String num) {
        this.num =  num;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DT@
    public Date getDt() {
        return dt;
    }
	
    public void setDt (Date dt) {
        this.dt =  dt;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NAMEORG@
    public String getNameorg() {
        return nameorg;
    }
	
    public void setNameorg (String nameorg) {
        this.nameorg =  nameorg;
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
