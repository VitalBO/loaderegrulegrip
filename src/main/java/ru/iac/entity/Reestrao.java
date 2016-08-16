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


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Reestrao</p>
 *
 * <p>Description: Domain Object describing a Reestrao entity</p>
 *
 */
@Entity (name="Reestrao")
@Table (name="\"REESTRAO\"")
@NamedQueries ({
	 @NamedQuery(name="Reestrao.findAll", query="SELECT reestrao FROM Reestrao reestrao")
	,@NamedQuery(name="Reestrao.findByIdul", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.idul = :idul")

	,@NamedQuery(name="Reestrao.findByNamep", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.namep = :namep")
	,@NamedQuery(name="Reestrao.findByNamepContaining", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.namep like :namep")

	,@NamedQuery(name="Reestrao.findByOgrn", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.ogrn = :ogrn")
	,@NamedQuery(name="Reestrao.findByOgrnContaining", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.ogrn like :ogrn")

	,@NamedQuery(name="Reestrao.findByGihdAdate", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Reestrao.findByGihdChdate", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Reestrao.findByGihdDdate", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Reestrao.findByGihdIdUser", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Reestrao.findByGihdAIdPackage", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Reestrao.findByGihdChIdPackage", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Reestrao.findByGihdDIdPackage", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Reestrao.findByRowCheckSum", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Reestrao.findByRowCheckSumContaining", query="SELECT reestrao FROM Reestrao reestrao WHERE reestrao.rowCheckSum like :rowCheckSum")

})

public class Reestrao implements Serializable {
    public static final String FIND_ALL = "Reestrao.findAll";
    public static final String FIND_BY_IDUL = "Reestrao.findByIdul";
    public static final String FIND_BY_NAMEP = "Reestrao.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING ="Reestrao.findByNamepContaining";
    public static final String FIND_BY_OGRN = "Reestrao.findByOgrn";
    public static final String FIND_BY_OGRN_CONTAINING ="Reestrao.findByOgrnContaining";
    public static final String FIND_BY_GIHDADATE = "Reestrao.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Reestrao.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Reestrao.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Reestrao.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Reestrao.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Reestrao.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Reestrao.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Reestrao.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Reestrao.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "REESTRAOSEQ", sequenceName ="SEQ_REESTRAO", allocationSize=1 )
    @Id @Column(name="IDREESTRAO" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="REESTRAOSEQ") 
    private Integer idreestrao;


    @OneToOne
    @JoinColumn(name="IDUL"   , nullable=true , unique=false)
    private Ul idul;


    @Column(name="NAMEP"  , length=1000 , nullable=true , unique=false)
    private String namep;


    @Column(name="OGRN"  , length=20 , nullable=true , unique=false)
    private String ogrn;


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
    public Reestrao() {
    }

	/**
	* All field constructor 
	*/
    public Reestrao(
       Integer idreestrao,
       Ul idul,
       String namep,
       String ogrn,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idreestrao,
       idul,
       namep,
       ogrn,
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
    
	public Reestrao(
       Integer idreestrao,
       Ul idul,
       String namep,
       String ogrn,
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
       setIdreestrao (idreestrao);
       //attributes
       setIdul (idul);
       setNamep (namep);
       setOgrn (ogrn);
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

	public Reestrao flat() {
	   return new Reestrao(
          getIdreestrao(),
          getIdul(),
          getNamep(),
          getOgrn(),
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

    public Integer getIdreestrao() {
        return idreestrao;
    }
	
    public void setIdreestrao (Integer idreestrao) {
        this.idreestrao =  idreestrao;
    }


    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }


    public String getNamep() {
        return namep;
    }
	
    public void setNamep (String namep) {
        this.namep =  namep;
    }


    public String getOgrn() {
        return ogrn;
    }
	
    public void setOgrn (String ogrn) {
        this.ogrn =  ogrn;
    }


    public Date getGihdAdate() {
        return gihdAdate;
    }
	
    public void setGihdAdate (Date gihdAdate) {
        this.gihdAdate =  gihdAdate;
    }


    public Date getGihdChdate() {
        return gihdChdate;
    }
	
    public void setGihdChdate (Date gihdChdate) {
        this.gihdChdate =  gihdChdate;
    }


    public Date getGihdDdate() {
        return gihdDdate;
    }
	
    public void setGihdDdate (Date gihdDdate) {
        this.gihdDdate =  gihdDdate;
    }


    public Integer getGihdIdUser() {
        return gihdIdUser;
    }
	
    public void setGihdIdUser (Integer gihdIdUser) {
        this.gihdIdUser =  gihdIdUser;
    }


    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }
	
    public void setGihdAIdPackage (Integer gihdAIdPackage) {
        this.gihdAIdPackage =  gihdAIdPackage;
    }


    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }
	
    public void setGihdChIdPackage (Integer gihdChIdPackage) {
        this.gihdChIdPackage =  gihdChIdPackage;
    }


    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }
	
    public void setGihdDIdPackage (Integer gihdDIdPackage) {
        this.gihdDIdPackage =  gihdDIdPackage;
    }


    public String getRowCheckSum() {
        return rowCheckSum;
    }
	
    public void setRowCheckSum (String rowCheckSum) {
        this.rowCheckSum =  rowCheckSum;
    }


}
