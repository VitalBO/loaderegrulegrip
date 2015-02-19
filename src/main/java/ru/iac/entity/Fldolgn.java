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

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@
import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: Fldolgn</p>
 *
 * <p>Description: Domain Object describing a Fldolgn entity</p>
 *
 */
@Entity (name="Fldolgn")
@Table (name="\"FLDOLGN\"")
@NamedQueries ({
	 @NamedQuery(name="Fldolgn.findAll", query="SELECT fldolgn FROM Fldolgn fldolgn")
	,@NamedQuery(name="Fldolgn.findByIdul", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.idul = :idul")

	,@NamedQuery(name="Fldolgn.findByIdfl", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.idfl = :idfl")

	,@NamedQuery(name="Fldolgn.findByDtstart", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dtstart = :dtstart")

	,@NamedQuery(name="Fldolgn.findByDolgn", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgn = :dolgn")
	,@NamedQuery(name="Fldolgn.findByDolgnContaining", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.dolgn like :dolgn")

	,@NamedQuery(name="Fldolgn.findByGihdAdate", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Fldolgn.findByGihdChdate", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Fldolgn.findByGihdDdate", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Fldolgn.findByGihdIdUser", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Fldolgn.findByGihdAIdPackage", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Fldolgn.findByGihdChIdPackage", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Fldolgn.findByGihdDIdPackage", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Fldolgn.findByRowCheckSum", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Fldolgn.findByRowCheckSumContaining", query="SELECT fldolgn FROM Fldolgn fldolgn WHERE fldolgn.rowCheckSum like :rowCheckSum")

})

public class Fldolgn implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Fldolgn.findAll";
    public static final String FIND_BY_IDUL = "Fldolgn.findByIdul";
    public static final String FIND_BY_IDFL = "Fldolgn.findByIdfl";
    public static final String FIND_BY_DTSTART = "Fldolgn.findByDtstart";
    public static final String FIND_BY_DOLGN = "Fldolgn.findByDolgn";
    public static final String FIND_BY_DOLGN_CONTAINING ="Fldolgn.findByDolgnContaining";
    public static final String FIND_BY_GIHDADATE = "Fldolgn.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Fldolgn.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Fldolgn.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Fldolgn.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Fldolgn.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Fldolgn.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Fldolgn.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Fldolgn.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Fldolgn.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "FLDOLGNSEQ", sequenceName ="SEQ_FLDOLGN", allocationSize=1 )
    @Id @Column(name="IDFLDOLGN" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="FLDOLGNSEQ") 
    private Integer idfldolgn;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=true)
    private Ul idul; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDFL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDFL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDFL@
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="IDFL"   , nullable=true , unique=true)
    private Fl idfl;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTSTART-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTSTART-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTSTART@
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DOLGN-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DOLGN-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DOLGN@
    @Column(name="DOLGN"  , length=255 , nullable=true , unique=false)
    private String dolgn; 
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
    public Fldolgn() {
    }

	/**
	* All field constructor 
	*/
    public Fldolgn(
       Integer idfldolgn,
       Ul idul,
       Fl idfl,
       Date dtstart,
       String dolgn,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idfldolgn,
       idul,
       idfl,
       dtstart,
       dolgn,
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
    
	public Fldolgn(
       Integer idfldolgn,
       Ul idul,
       Fl idfl,
       Date dtstart,
       String dolgn,
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
       setIdfldolgn (idfldolgn);
       //attributes
       setIdul (idul);
       setIdfl (idfl);
       setDtstart (dtstart);
       setDolgn (dolgn);
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

	public Fldolgn flat() {
	   return new Fldolgn(
          getIdfldolgn(),
          getIdul(),
          getIdfl(),
          getDtstart(),
          getDolgn(),
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

    public Integer getIdfldolgn() {
        return idfldolgn;
    }
	
    public void setIdfldolgn (Integer idfldolgn) {
        this.idfldolgn =  idfldolgn;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDFL@
    public Fl getIdfl() {
        return idfl;
    }
	
    public void setIdfl (Fl idfl) {
        this.idfl =  idfl;
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

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DOLGN@
    public String getDolgn() {
        return dolgn;
    }
	
    public void setDolgn (String dolgn) {
        this.dolgn =  dolgn;
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
