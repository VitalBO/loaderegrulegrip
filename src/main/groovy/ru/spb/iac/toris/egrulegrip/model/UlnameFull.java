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
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: UlnameFull</p>
 *
 * <p>Description: Domain Object describing a UlnameFull entity</p>
 *
 */
@Entity (name="UlnameFull")
@Table (name="ULNAME_FULL")
@NamedQueries ({
	 @NamedQuery(name="UlnameFull.findAll", query="SELECT ulnamefull FROM UlnameFull ulnamefull")
	,@NamedQuery(name="UlnameFull.findByIdul", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.idul = :idul")

	,@NamedQuery(name="UlnameFull.findByFullName", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.fullName = :fullName")
	,@NamedQuery(name="UlnameFull.findByFullNameContaining", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.fullName like :fullName")

	,@NamedQuery(name="UlnameFull.findByGihdAdate", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdAdate = :gihdAdate")

	,@NamedQuery(name="UlnameFull.findByGihdChdate", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdChdate = :gihdChdate")

	,@NamedQuery(name="UlnameFull.findByGihdDdate", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdDdate = :gihdDdate")

	,@NamedQuery(name="UlnameFull.findByGihdIdUser", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="UlnameFull.findByGihdAIdPackage", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="UlnameFull.findByGihdChIdPackage", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="UlnameFull.findByGihdDIdPackage", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="UlnameFull.findByRowCheckSum", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="UlnameFull.findByRowCheckSumContaining", query="SELECT ulnamefull FROM UlnameFull ulnamefull WHERE ulnamefull.rowCheckSum like :rowCheckSum")

})

public class UlnameFull implements Serializable {
    public static final String FIND_ALL = "UlnameFull.findAll";
    public static final String FIND_BY_IDUL = "UlnameFull.findByIdul";
    public static final String FIND_BY_FULLNAME = "UlnameFull.findByFullName";
    public static final String FIND_BY_FULLNAME_CONTAINING ="UlnameFull.findByFullNameContaining";
    public static final String FIND_BY_GIHDADATE = "UlnameFull.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "UlnameFull.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "UlnameFull.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "UlnameFull.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "UlnameFull.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "UlnameFull.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "UlnameFull.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "UlnameFull.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="UlnameFull.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULNAME_FULLSEQ", sequenceName ="", allocationSize=1 )
    @Id @Column(name="IDULNAME" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULNAME_FULLSEQ") 
    private Integer idulname;


    @Column(name="IDUL"   , nullable=false , unique=false)
    private Integer idul;


    @Column(name="FULL_NAME"  , length=1316 , nullable=false , unique=true)
    private String fullName;


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
    public UlnameFull() {
    }

	/**
	* All field constructor 
	*/
    public UlnameFull(
       Integer idulname,
       Integer idul,
       String fullName,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idulname,
       idul,
       fullName,
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
    
	public UlnameFull(
       Integer idulname,
       Integer idul,
       String fullName,
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
       setIdulname (idulname);
       //attributes
       setIdul (idul);
       setFullName (fullName);
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

	public UlnameFull flat() {
	   return new UlnameFull(
          getIdulname(),
          getIdul(),
          getFullName(),
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

    public Integer getIdulname() {
        return idulname;
    }
	
    public void setIdulname (Integer idulname) {
        this.idulname =  idulname;
    }


    public Integer getIdul() {
        return idul;
    }
	
    public void setIdul (Integer idul) {
        this.idul =  idul;
    }


    public String getFullName() {
        return fullName;
    }
	
    public void setFullName (String fullName) {
        this.fullName =  fullName;
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
