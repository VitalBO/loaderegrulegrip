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
 * <p>Title: Gosreg</p>
 *
 * <p>Description: Domain Object describing a Gosreg entity</p>
 *
 */
@Entity (name="Gosreg")
@Table (name="\"GOSREG\"")
@NamedQueries ({
	 @NamedQuery(name="Gosreg.findAll", query="SELECT gosreg FROM Gosreg gosreg")
	,@NamedQuery(name="Gosreg.findByIdul", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.idul = :idul")

	,@NamedQuery(name="Gosreg.findByRegnum", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.regnum = :regnum")
	,@NamedQuery(name="Gosreg.findByRegnumContaining", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.regnum like :regnum")

	,@NamedQuery(name="Gosreg.findByDtreg", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.dtreg = :dtreg")

	,@NamedQuery(name="Gosreg.findByIdregorg", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.idregorg = :idregorg")

	,@NamedQuery(name="Gosreg.findByIdvidreg", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.idvidreg = :idvidreg")

	,@NamedQuery(name="Gosreg.findBySersvid", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.sersvid = :sersvid")

	,@NamedQuery(name="Gosreg.findByNumsvid", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.numsvid = :numsvid")

	,@NamedQuery(name="Gosreg.findByDtzap", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.dtzap = :dtzap")

	,@NamedQuery(name="Gosreg.findByGihdAdate", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Gosreg.findByGihdChdate", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Gosreg.findByGihdDdate", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Gosreg.findByGihdIdUser", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Gosreg.findByGihdAIdPackage", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Gosreg.findByGihdChIdPackage", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Gosreg.findByGihdDIdPackage", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Gosreg.findByRowCheckSum", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Gosreg.findByRowCheckSumContaining", query="SELECT gosreg FROM Gosreg gosreg WHERE gosreg.rowCheckSum like :rowCheckSum")

})

public class Gosreg implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Gosreg.findAll";
    public static final String FIND_BY_IDUL = "Gosreg.findByIdul";
    public static final String FIND_BY_REGNUM = "Gosreg.findByRegnum";
    public static final String FIND_BY_REGNUM_CONTAINING ="Gosreg.findByRegnumContaining";
    public static final String FIND_BY_DTREG = "Gosreg.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Gosreg.findByIdregorg";
    public static final String FIND_BY_IDVIDREG = "Gosreg.findByIdvidreg";
    public static final String FIND_BY_SERSVID = "Gosreg.findBySersvid";
    public static final String FIND_BY_NUMSVID = "Gosreg.findByNumsvid";
    public static final String FIND_BY_DTZAP = "Gosreg.findByDtzap";
    public static final String FIND_BY_GIHDADATE = "Gosreg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Gosreg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Gosreg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Gosreg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Gosreg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Gosreg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Gosreg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Gosreg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Gosreg.findByRowCheckSumContaining";
	

    @Id @Column(name="IDREG" ) 

    private String idreg;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDUL-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDUL-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDUL@
    @ManyToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=true)
    private Ul idul; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @REGNUM-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @REGNUM-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-REGNUM@
    @Column(name="REGNUM"  , length=20 , nullable=true , unique=false)
    private String regnum; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTREG@
    @Column(name="DTREG"   , nullable=true , unique=true)
    private Date dtreg; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDREGORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDREGORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDREGORG@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="IDREGORG"   , nullable=true , unique=false)
    private Spregorg idregorg; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDVIDREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDVIDREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDVIDREG@
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDVIDREG")
    private Spvidreg idvidreg;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @SERSVID-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @SERSVID-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-SERSVID@
    @Column(name="SERSVID"   , nullable=true , unique=false)
    private Integer sersvid; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NUMSVID-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NUMSVID-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NUMSVID@
    @Column(name="NUMSVID"   , nullable=true , unique=false)
    private Integer numsvid; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTZAP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTZAP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTZAP@
    @Column(name="DTZAP"   , nullable=true , unique=false)
    private Date dtzap; 
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
    public Gosreg() {
    }

	/**
	* All field constructor 
	*/
    public Gosreg(
       String idreg,
       Ul idul,
       String regnum,
       Date dtreg,
       Spregorg idregorg,
       Spvidreg idvidreg,
       Integer sersvid,
       Integer numsvid,
       Date dtzap,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idreg,
       idul,
       regnum,
       dtreg,
       idregorg,
       idvidreg,
       sersvid,
       numsvid,
       dtzap,
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
    
	public Gosreg(
       String idreg,
       Ul idul,
       String regnum,
       Date dtreg,
       Spregorg idregorg,
       Spvidreg idvidreg,
       Integer sersvid,
       Integer numsvid,
       Date dtzap,
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
       setIdreg (idreg);
       //attributes
       setIdul (idul);
       setRegnum (regnum);
       setDtreg (dtreg);
       setIdregorg (idregorg);
       setIdvidreg (idvidreg);
       setSersvid (sersvid);
       setNumsvid (numsvid);
       setDtzap (dtzap);
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

	public Gosreg flat() {
	   return new Gosreg(
          getIdreg(),
          getIdul(),
          getRegnum(),
          getDtreg(),
          getIdregorg(),
          getIdvidreg(),
          getSersvid(),
          getNumsvid(),
          getDtzap(),
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

    public String getIdreg() {
        return idreg;
    }
	
    public void setIdreg (String idreg) {
        this.idreg =  idreg;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-REGNUM@
    public String getRegnum() {
        return regnum;
    }
	
    public void setRegnum (String regnum) {
        this.regnum =  regnum;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTREG@
    public Date getDtreg() {
        return dtreg;
    }
	
    public void setDtreg (Date dtreg) {
        this.dtreg =  dtreg;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDREGORG@
    public Spregorg getIdregorg() {
        return idregorg;
    }
	
    public void setIdregorg (Spregorg idregorg) {
        this.idregorg =  idregorg;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDVIDREG@
    public Spvidreg getIdvidreg() {
        return idvidreg;
    }
	
    public void setIdvidreg (Spvidreg idvidreg) {
        this.idvidreg =  idvidreg;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-SERSVID@
    public Integer getSersvid() {
        return sersvid;
    }
	
    public void setSersvid (Integer sersvid) {
        this.sersvid =  sersvid;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NUMSVID@
    public Integer getNumsvid() {
        return numsvid;
    }
	
    public void setNumsvid (Integer numsvid) {
        this.numsvid =  numsvid;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-DTZAP@
    public Date getDtzap() {
        return dtzap;
    }
	
    public void setDtzap (Date dtzap) {
        this.dtzap =  dtzap;
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