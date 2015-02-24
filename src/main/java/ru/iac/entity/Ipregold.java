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
 * <p>Title: Ipregold</p>
 *
 * <p>Description: Domain Object describing a Ipregold entity</p>
 *
 */
@Entity (name="Ipregold")
@Table (name="\"IPREGOLD\"")
@NamedQueries ({
	 @NamedQuery(name="Ipregold.findAll", query="SELECT ipregold FROM Ipregold ipregold")
	,@NamedQuery(name="Ipregold.findByIdip", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.idip = :idip")

	,@NamedQuery(name="Ipregold.findByNumold", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.numold = :numold")
	,@NamedQuery(name="Ipregold.findByNumoldContaining", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.numold like :numold")

	,@NamedQuery(name="Ipregold.findByDtreg", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.dtreg = :dtreg")

	,@NamedQuery(name="Ipregold.findByIdregorg", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.idregorg = :idregorg")

	,@NamedQuery(name="Ipregold.findByGihdAdate", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipregold.findByGihdChdate", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipregold.findByGihdDdate", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipregold.findByGihdIdUser", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipregold.findByGihdAIdPackage", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipregold.findByGihdChIdPackage", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipregold.findByGihdDIdPackage", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipregold.findByRowCheckSum", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipregold.findByRowCheckSumContaining", query="SELECT ipregold FROM Ipregold ipregold WHERE ipregold.rowCheckSum like :rowCheckSum")

})

public class Ipregold implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ipregold.findAll";
    public static final String FIND_BY_IDIP = "Ipregold.findByIdip";
    public static final String FIND_BY_NUMOLD = "Ipregold.findByNumold";
    public static final String FIND_BY_NUMOLD_CONTAINING ="Ipregold.findByNumoldContaining";
    public static final String FIND_BY_DTREG = "Ipregold.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Ipregold.findByIdregorg";
    public static final String FIND_BY_GIHDADATE = "Ipregold.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipregold.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipregold.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipregold.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipregold.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipregold.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipregold.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipregold.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipregold.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "IPREGOLDSEQ", sequenceName ="SEQ_IPREGOLD", allocationSize=1 )
    @Id @Column(name="IDIPREGOLD" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPREGOLDSEQ") 
    private Integer idipregold;

//MP-MANAGED-ADDED-AREA-BEGINNING @IDIP-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDIP-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDIP@
@OneToOne
@JoinColumn(name = "IDIP")
    private Ip idip;
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @NUMOLD-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @NUMOLD-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-NUMOLD@
    @Column(name="NUMOLD"  , length=255 , nullable=true , unique=false)
    private String numold; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @DTREG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @DTREG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-DTREG@
    @Column(name="DTREG"   , nullable=true , unique=false)
    private Date dtreg; 
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-ADDED-AREA-BEGINNING @IDREGORG-field-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @IDREGORG-field-annotation@
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @ATTRIBUTE-IDREGORG@
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "IDREGORG")
    private Spregorg idregorg;
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
    public Ipregold() {
    }

	/**
	* All field constructor 
	*/
    public Ipregold(
       Integer idipregold,
       Ip idip,
       String numold,
       Date dtreg,
       Spregorg idregorg,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idipregold,
       idip,
       numold,
       dtreg,
       idregorg,
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
    
	public Ipregold(
       Integer idipregold,
       Ip idip,
       String numold,
       Date dtreg,
       Spregorg idregorg,
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
       setIdipregold (idipregold);
       //attributes
       setIdip (idip);
       setNumold (numold);
       setDtreg (dtreg);
       setIdregorg (idregorg);
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

	public Ipregold flat() {
	   return new Ipregold(
          getIdipregold(),
          getIdip(),
          getNumold(),
          getDtreg(),
          getIdregorg(),
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

    public Integer getIdipregold() {
        return idipregold;
    }
	
    public void setIdipregold (Integer idipregold) {
        this.idipregold =  idipregold;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDIP@
    public Ip getIdip() {
        return idip;
    }
	
    public void setIdip (Ip idip) {
        this.idip =  idip;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-NUMOLD@
    public String getNumold() {
        return numold;
    }
	
    public void setNumold (String numold) {
        this.numold =  numold;
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
