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
	* - time      : 2015/02/12 �.�. at 10:23:32 MSK
*/
package ru.iac.entity;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@
import java.util.Date;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * <p>Title: Ulokved</p>
 *
 * <p>Description: Domain Object describing a Ulokved entity</p>
 *
 */
@Entity (name="Ulokved")
@Table (name="\"ULOKVED\"")
@NamedQueries ({
	 @NamedQuery(name="Ulokved.findAll", query="SELECT ulokved FROM Ulokved ulokved")
	,@NamedQuery(name="Ulokved.findByIdul", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.idul = :idul")

	,@NamedQuery(name="Ulokved.findByIdokved", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.idokved = :idokved")

	,@NamedQuery(name="Ulokved.findByMain", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.main = :main")

	,@NamedQuery(name="Ulokved.findByGihdAdate", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulokved.findByGihdChdate", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulokved.findByGihdDdate", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulokved.findByGihdIdUser", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulokved.findByGihdAIdPackage", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulokved.findByGihdChIdPackage", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulokved.findByGihdDIdPackage", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulokved.findByRowCheckSum", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulokved.findByRowCheckSumContaining", query="SELECT ulokved FROM Ulokved ulokved WHERE ulokved.rowCheckSum like :rowCheckSum")

})

public class Ulokved implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Ulokved.findAll";
    public static final String FIND_BY_IDUL = "Ulokved.findByIdul";
    public static final String FIND_BY_IDOKVED = "Ulokved.findByIdokved";
    public static final String FIND_BY_MAIN = "Ulokved.findByMain";
    public static final String FIND_BY_GIHDADATE = "Ulokved.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulokved.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulokved.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulokved.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulokved.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulokved.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulokved.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulokved.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulokved.findByRowCheckSumContaining";
	
    @SequenceGenerator(name = "ULOKVEDSEQ", sequenceName ="SEQ_ULOKVED", allocationSize=1 )
    @Id @Column(name="IDULOKVED" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULOKVEDSEQ") 
    private Integer idulokved;

    @ManyToOne
    @JoinColumn(name = "IDUL")
    private Ul idul;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IDOKVED")
    private Okved idokved;
    
    @Column(name="MAIN"   , nullable=true , unique=false)
    private Integer main; 

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
    public Ulokved() {
    }

	/**
	* All field constructor 
	*/
    public Ulokved(
       Integer idulokved,
       Ul idul,
       Okved idokved,
       Integer main,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idulokved,
       idul,
       idokved,
       main,
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
    
	public Ulokved(
       Integer idulokved,
       Ul idul,
       Okved idokved,
       Integer main,
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
       setIdulokved (idulokved);
       //attributes
       setIdul (idul);
       setIdokved (idokved);
       setMain (main);
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

	public Ulokved flat() {
	   return new Ulokved(
          getIdulokved(),
          getIdul(),
          getIdokved(),
          getMain(),
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

    public Integer getIdulokved() {
        return idulokved;
    }
	
    public void setIdulokved (Integer idulokved) {
        this.idulokved =  idulokved;
    }
    
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDUL@
    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-IDOKVED@
    public Okved getIdokved() {
        return idokved;
    }
	
    public void setIdokved (Okved idokved) {
        this.idokved =  idokved;
    }
	
//MP-MANAGED-UPDATABLE-ENDING

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @GETTER-SETTER-MAIN@
    public Integer getMain() {
        return main;
    }
	
    public void setMain (Integer main) {
        this.main =  main;
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
