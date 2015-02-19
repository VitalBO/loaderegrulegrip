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
import java.math.BigInteger;
import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: Fluchr</p>
 *
 * <p>Description: Domain Object describing a Fluchr entity</p>
 *
 */
@Entity (name="Fluchr")
@Table (name="\"FLUCHR\"")
@NamedQueries ({
	 @NamedQuery(name="Fluchr.findAll", query="SELECT fluchr FROM Fluchr fluchr")
	,@NamedQuery(name="Fluchr.findByIdul", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.idul = :idul")

	,@NamedQuery(name="Fluchr.findByIdfl", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.idfl = :idfl")

	,@NamedQuery(name="Fluchr.findByDtstart", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.dtstart = :dtstart")

	,@NamedQuery(name="Fluchr.findBySumma", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.summa = :summa")

	,@NamedQuery(name="Fluchr.findByGihdAdate", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Fluchr.findByGihdChdate", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Fluchr.findByGihdDdate", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Fluchr.findByGihdIdUser", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Fluchr.findByGihdAIdPackage", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Fluchr.findByGihdChIdPackage", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Fluchr.findByGihdDIdPackage", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Fluchr.findByRowCheckSum", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Fluchr.findByRowCheckSumContaining", query="SELECT fluchr FROM Fluchr fluchr WHERE fluchr.rowCheckSum like :rowCheckSum")

})

public class Fluchr implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Fluchr.findAll";
    public static final String FIND_BY_IDUL = "Fluchr.findByIdul";
    public static final String FIND_BY_IDFL = "Fluchr.findByIdfl";
    public static final String FIND_BY_DTSTART = "Fluchr.findByDtstart";
    public static final String FIND_BY_SUMMA = "Fluchr.findBySumma";
    public static final String FIND_BY_GIHDADATE = "Fluchr.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Fluchr.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Fluchr.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Fluchr.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Fluchr.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Fluchr.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Fluchr.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Fluchr.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Fluchr.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "FLUCHRSEQ", sequenceName ="SEQ_FLUCHR", allocationSize=1 )
    @Id @Column(name="IDFLUCHR" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="FLUCHRSEQ") 
    private Integer idfluchr;

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
@JoinColumn(name = "IDFL")
    private Fl idfl;
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
    private BigInteger summa;
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
    public Fluchr() {
    }

	/**
	* All field constructor 
	*/
    public Fluchr(
       Integer idfluchr,
       Ul idul,
       Fl idfl,
       Date dtstart,
       BigInteger summa,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idfluchr,
       idul,
       idfl,
       dtstart,
       summa,
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
    
	public Fluchr(
       Integer idfluchr,
       Ul idul,
       Fl idfl,
       Date dtstart,
       BigInteger summa,
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
       setIdfluchr (idfluchr);
       //attributes
       setIdul (idul);
       setIdfl (idfl);
       setDtstart (dtstart);
       setSumma (summa);
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

	public Fluchr flat() {
	   return new Fluchr(
          getIdfluchr(),
          getIdul(),
          getIdfl(),
          getDtstart(),
          getSumma(),
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

    public Integer getIdfluchr() {
        return idfluchr;
    }
	
    public void setIdfluchr (Integer idfluchr) {
        this.idfluchr =  idfluchr;
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

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SUMMA@
    public BigInteger getSumma() {
        return summa;
    }
	
    public void setSumma (BigInteger summa) {
        this.summa =  summa;
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
