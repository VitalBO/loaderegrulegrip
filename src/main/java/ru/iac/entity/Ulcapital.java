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
import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: Ulcapital</p>
 *
 * <p>Description: Domain Object describing a Ulcapital entity</p>
 *
 */
@Entity (name="Ulcapital")
@Table (name="\"ULCAPITAL\"")
@NamedQueries ({
	 @NamedQuery(name="Ulcapital.findAll", query="SELECT ulcapital FROM Ulcapital ulcapital")
	,@NamedQuery(name="Ulcapital.findByIdul", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.idul = :idul")

	,@NamedQuery(name="Ulcapital.findByDtstart", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.dtstart = :dtstart")

	,@NamedQuery(name="Ulcapital.findBySumma", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.summa = :summa")

	,@NamedQuery(name="Ulcapital.findByIdvidcap", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.idvidcap = :idvidcap")

	,@NamedQuery(name="Ulcapital.findByGihdAdate", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulcapital.findByGihdChdate", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulcapital.findByGihdDdate", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulcapital.findByGihdIdUser", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulcapital.findByGihdAIdPackage", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulcapital.findByGihdChIdPackage", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulcapital.findByGihdDIdPackage", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulcapital.findByRowCheckSum", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulcapital.findByRowCheckSumContaining", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.rowCheckSum like :rowCheckSum")

})

public class Ulcapital implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ulcapital.findAll";
    public static final String FIND_BY_IDUL = "Ulcapital.findByIdul";
    public static final String FIND_BY_DTSTART = "Ulcapital.findByDtstart";
    public static final String FIND_BY_SUMMA = "Ulcapital.findBySumma";
    public static final String FIND_BY_IDVIDCAP = "Ulcapital.findByIdvidcap";
    public static final String FIND_BY_GIHDADATE = "Ulcapital.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulcapital.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulcapital.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulcapital.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulcapital.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulcapital.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulcapital.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulcapital.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulcapital.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "ULCAPITALSEQ", sequenceName ="SEQ_ULCAPITAL", allocationSize=1 )
    @Id @Column(name="IDULCAPITAL" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULCAPITALSEQ") 
    private Integer idulcapital;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
@OneToOne
@JoinColumn(name = "IDUL")
    private Ul idul;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @SUMMA-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @SUMMA-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-SUMMA@
    @Column(name="SUMMA"   , nullable=true , unique=false)
    private BigDecimal summa;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDVIDCAP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDVIDCAP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDVIDCAP@
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "IDVIDCAP")
    private Spvidcap idvidcap;
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
    public Ulcapital() {
    }

	/**
	* All field constructor 
	*/
    public Ulcapital(
       Integer idulcapital,
       Ul idul,
       Date dtstart,
       BigDecimal summa,
       Spvidcap idvidcap,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idulcapital,
       idul,
       dtstart,
       summa,
       idvidcap,
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
    
	public Ulcapital(
       Integer idulcapital,
       Ul idul,
       Date dtstart,
       BigDecimal summa,
       Spvidcap idvidcap,
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
       setIdulcapital (idulcapital);
       //attributes
       setIdul (idul);
       setDtstart (dtstart);
       setSumma (summa);
       setIdvidcap (idvidcap);
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

	public Ulcapital flat() {
	   return new Ulcapital(
          getIdulcapital(),
          getIdul(),
          getDtstart(),
          getSumma(),
          getIdvidcap(),
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

    public Integer getIdulcapital() {
        return idulcapital;
    }
	
    public void setIdulcapital (Integer idulcapital) {
        this.idulcapital =  idulcapital;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
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

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SUMMA@
    public BigDecimal getSumma() {
        return summa;
    }
	
    public void setSumma (BigDecimal summa) {
        this.summa =  summa;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDCAP@
    public Spvidcap getIdvidcap() {
        return idvidcap;
    }
	
    public void setIdvidcap (Spvidcap idvidcap) {
        this.idvidcap =  idvidcap;
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
