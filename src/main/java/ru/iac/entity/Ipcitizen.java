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
 * <p>Title: Ipcitizen</p>
 *
 * <p>Description: Domain Object describing a Ipcitizen entity</p>
 *
 */
@Entity (name="Ipcitizen")
@Table (name="\"IPCITIZEN\"")
@NamedQueries ({
	 @NamedQuery(name="Ipcitizen.findAll", query="SELECT ipcitizen FROM Ipcitizen ipcitizen")
	,@NamedQuery(name="Ipcitizen.findByIdip", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.idip = :idip")

	,@NamedQuery(name="Ipcitizen.findByDtstart", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.dtstart = :dtstart")

	,@NamedQuery(name="Ipcitizen.findByIdvidcitizen", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.idvidcitizen = :idvidcitizen")

	,@NamedQuery(name="Ipcitizen.findByOksm", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.oksm = :oksm")

	,@NamedQuery(name="Ipcitizen.findByGihdAdate", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipcitizen.findByGihdChdate", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipcitizen.findByGihdDdate", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipcitizen.findByGihdIdUser", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipcitizen.findByGihdAIdPackage", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipcitizen.findByGihdChIdPackage", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipcitizen.findByGihdDIdPackage", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipcitizen.findByRowCheckSum", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipcitizen.findByRowCheckSumContaining", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.rowCheckSum like :rowCheckSum")

})

public class Ipcitizen implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ipcitizen.findAll";
    public static final String FIND_BY_IDIP = "Ipcitizen.findByIdip";
    public static final String FIND_BY_DTSTART = "Ipcitizen.findByDtstart";
    public static final String FIND_BY_IDVIDCITIZEN = "Ipcitizen.findByIdvidcitizen";
    public static final String FIND_BY_OKSM = "Ipcitizen.findByOksm";
    public static final String FIND_BY_GIHDADATE = "Ipcitizen.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipcitizen.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipcitizen.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipcitizen.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipcitizen.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipcitizen.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipcitizen.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipcitizen.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipcitizen.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "IPCITIZENSEQ", sequenceName ="SEQ_IPCITIZEN", allocationSize=1 )
    @Id @Column(name="IDIPCITIZEN" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPCITIZENSEQ") 
    private Integer idipcitizen;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
@OneToOne
@JoinColumn(name = "IDIP")
    private Ip idip;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDVIDCITIZEN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDVIDCITIZEN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDVIDCITIZEN@
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "IDVIDCITIZEN")
    private Spvidcitizen idvidcitizen;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @OKSM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @OKSM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-OKSM@
@OneToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "OKSM")
    private Oksm oksm;
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
    public Ipcitizen() {
    }

	/**
	* All field constructor 
	*/
    public Ipcitizen(
       Integer idipcitizen,
       Ip idip,
       Date dtstart,
       Spvidcitizen idvidcitizen,
       Oksm oksm,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idipcitizen,
       idip,
       dtstart,
       idvidcitizen,
       oksm,
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
    
	public Ipcitizen(
       Integer idipcitizen,
       Ip idip,
       Date dtstart,
       Spvidcitizen idvidcitizen,
       Oksm oksm,
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
       setIdipcitizen (idipcitizen);
       //attributes
       setIdip (idip);
       setDtstart (dtstart);
       setIdvidcitizen (idvidcitizen);
       setOksm (oksm);
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

	public Ipcitizen flat() {
	   return new Ipcitizen(
          getIdipcitizen(),
          getIdip(),
          getDtstart(),
          getIdvidcitizen(),
          getOksm(),
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

    public Integer getIdipcitizen() {
        return idipcitizen;
    }
	
    public void setIdipcitizen (Integer idipcitizen) {
        this.idipcitizen =  idipcitizen;
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

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDCITIZEN@
    public Spvidcitizen getIdvidcitizen() {
        return idvidcitizen;
    }
	
    public void setIdvidcitizen (Spvidcitizen idvidcitizen) {
        this.idvidcitizen =  idvidcitizen;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-OKSM@
    public Oksm getOksm() {
        return oksm;
    }
	
    public void setOksm (Oksm oksm) {
        this.oksm =  oksm;
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
