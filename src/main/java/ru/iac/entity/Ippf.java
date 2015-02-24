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
 * <p>Title: Ippf</p>
 *
 * <p>Description: Domain Object describing a Ippf entity</p>
 *
 */
@Entity (name="Ippf")
@Table (name="\"IPPF\"")
@NamedQueries ({
	 @NamedQuery(name="Ippf.findAll", query="SELECT ippf FROM Ippf ippf")
	,@NamedQuery(name="Ippf.findByIdip", query="SELECT ippf FROM Ippf ippf WHERE ippf.idip = :idip")

	,@NamedQuery(name="Ippf.findByIdpf", query="SELECT ippf FROM Ippf ippf WHERE ippf.idpf = :idpf")

	,@NamedQuery(name="Ippf.findByRegnomPf", query="SELECT ippf FROM Ippf ippf WHERE ippf.regnomPf = :regnomPf")
	,@NamedQuery(name="Ippf.findByRegnomPfContaining", query="SELECT ippf FROM Ippf ippf WHERE ippf.regnomPf like :regnomPf")

	,@NamedQuery(name="Ippf.findByDtstart", query="SELECT ippf FROM Ippf ippf WHERE ippf.dtstart = :dtstart")

	,@NamedQuery(name="Ippf.findByDtend", query="SELECT ippf FROM Ippf ippf WHERE ippf.dtend = :dtend")

	,@NamedQuery(name="Ippf.findByGihdAdate", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ippf.findByGihdChdate", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ippf.findByGihdDdate", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ippf.findByGihdIdUser", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ippf.findByGihdAIdPackage", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ippf.findByGihdChIdPackage", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ippf.findByGihdDIdPackage", query="SELECT ippf FROM Ippf ippf WHERE ippf.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ippf.findByRowCheckSum", query="SELECT ippf FROM Ippf ippf WHERE ippf.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ippf.findByRowCheckSumContaining", query="SELECT ippf FROM Ippf ippf WHERE ippf.rowCheckSum like :rowCheckSum")

})

public class Ippf implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ippf.findAll";
    public static final String FIND_BY_IDIP = "Ippf.findByIdip";
    public static final String FIND_BY_IDPF = "Ippf.findByIdpf";
    public static final String FIND_BY_REGNOMPF = "Ippf.findByRegnomPf";
    public static final String FIND_BY_REGNOMPF_CONTAINING ="Ippf.findByRegnomPfContaining";
    public static final String FIND_BY_DTSTART = "Ippf.findByDtstart";
    public static final String FIND_BY_DTEND = "Ippf.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ippf.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ippf.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ippf.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ippf.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ippf.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ippf.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ippf.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ippf.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ippf.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "IPPFSEQ", sequenceName ="SEQ_IPPF", allocationSize=1 )
    @Id @Column(name="IDIPPF" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPPFSEQ") 
    private Integer idippf;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
@OneToOne
@JoinColumn(name = "IDIP")
    private Ip idip;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDPF-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDPF-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDPF@
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "IDPF")
    private Sppf idpf;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @REGNOM_PF-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @REGNOM_PF-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-REGNOM_PF@
    @Column(name="REGNOM_PF"  , length=20 , nullable=true , unique=false)
    private String regnomPf; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTEND-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTEND-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTEND@
    @Column(name="DTEND"   , nullable=true , unique=false)
    private Date dtend; 
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
    public Ippf() {
    }

	/**
	* All field constructor 
	*/
    public Ippf(
       Integer idippf,
       Ip idip,
       Sppf idpf,
       String regnomPf,
       Date dtstart,
       Date dtend,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idippf,
       idip,
       idpf,
       regnomPf,
       dtstart,
       dtend,
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
    
	public Ippf(
       Integer idippf,
       Ip idip,
       Sppf idpf,
       String regnomPf,
       Date dtstart,
       Date dtend,
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
       setIdippf (idippf);
       //attributes
       setIdip (idip);
       setIdpf (idpf);
       setRegnomPf (regnomPf);
       setDtstart (dtstart);
       setDtend (dtend);
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

	public Ippf flat() {
	   return new Ippf(
          getIdippf(),
          getIdip(),
          getIdpf(),
          getRegnomPf(),
          getDtstart(),
          getDtend(),
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

    public Integer getIdippf() {
        return idippf;
    }
	
    public void setIdippf (Integer idippf) {
        this.idippf =  idippf;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDIP@
    public Ip getIdip() {
        return idip;
    }
	
    public void setIdip (Ip idip) {
        this.idip =  idip;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDPF@
    public Sppf getIdpf() {
        return idpf;
    }
	
    public void setIdpf (Sppf idpf) {
        this.idpf =  idpf;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNOM_PF@
    public String getRegnomPf() {
        return regnomPf;
    }
	
    public void setRegnomPf (String regnomPf) {
        this.regnomPf =  regnomPf;
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

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTEND@
    public Date getDtend() {
        return dtend;
    }
	
    public void setDtend (Date dtend) {
        this.dtend =  dtend;
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
