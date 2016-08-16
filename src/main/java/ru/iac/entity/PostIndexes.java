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
 * <p>Title: PostIndexes</p>
 *
 * <p>Description: Domain Object describing a PostIndexes entity</p>
 *
 */
@Entity (name="PostIndexes")
@Table (name="\"POST_INDEXES\"")
@NamedQueries ({
	 @NamedQuery(name="PostIndexes.findAll", query="SELECT postindexes FROM PostIndexes postindexes")
	,@NamedQuery(name="PostIndexes.findByIdRaion", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.idRaion = :idRaion")

	,@NamedQuery(name="PostIndexes.findByPostIndex", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.postIndex = :postIndex")
	,@NamedQuery(name="PostIndexes.findByPostIndexContaining", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.postIndex like :postIndex")

	,@NamedQuery(name="PostIndexes.findByGihdAdate", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdAdate = :gihdAdate")

	,@NamedQuery(name="PostIndexes.findByGihdChdate", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdChdate = :gihdChdate")

	,@NamedQuery(name="PostIndexes.findByGihdDdate", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdDdate = :gihdDdate")

	,@NamedQuery(name="PostIndexes.findByGihdIdUser", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="PostIndexes.findByGihdAIdPackage", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="PostIndexes.findByGihdChIdPackage", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="PostIndexes.findByGihdDIdPackage", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="PostIndexes.findByRowCheckSum", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="PostIndexes.findByRowCheckSumContaining", query="SELECT postindexes FROM PostIndexes postindexes WHERE postindexes.rowCheckSum like :rowCheckSum")

})

public class PostIndexes implements Serializable {
    public static final String FIND_ALL = "PostIndexes.findAll";
    public static final String FIND_BY_IDRAION = "PostIndexes.findByIdRaion";
    public static final String FIND_BY_POSTINDEX = "PostIndexes.findByPostIndex";
    public static final String FIND_BY_POSTINDEX_CONTAINING ="PostIndexes.findByPostIndexContaining";
    public static final String FIND_BY_GIHDADATE = "PostIndexes.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "PostIndexes.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "PostIndexes.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "PostIndexes.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "PostIndexes.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "PostIndexes.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "PostIndexes.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "PostIndexes.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="PostIndexes.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "POST_INDEXESSEQ", sequenceName ="", allocationSize=1 )
    @Id @Column(name="ID_POST_RAION" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="POST_INDEXESSEQ") 
    private Integer idPostRaion;


    @Column(name="ID_RAION"   , nullable=true , unique=false)
    private Integer idRaion;


    @Column(name="POST_INDEX"  , length=6 , nullable=true , unique=false)
    private String postIndex;


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
    public PostIndexes() {
    }

	/**
	* All field constructor 
	*/
    public PostIndexes(
       Integer idPostRaion,
       Integer idRaion,
       String postIndex,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idPostRaion,
       idRaion,
       postIndex,
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
    
	public PostIndexes(
       Integer idPostRaion,
       Integer idRaion,
       String postIndex,
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
       setIdPostRaion (idPostRaion);
       //attributes
       setIdRaion (idRaion);
       setPostIndex (postIndex);
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

	public PostIndexes flat() {
	   return new PostIndexes(
          getIdPostRaion(),
          getIdRaion(),
          getPostIndex(),
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

    public Integer getIdPostRaion() {
        return idPostRaion;
    }
	
    public void setIdPostRaion (Integer idPostRaion) {
        this.idPostRaion =  idPostRaion;
    }


    public Integer getIdRaion() {
        return idRaion;
    }
	
    public void setIdRaion (Integer idRaion) {
        this.idRaion =  idRaion;
    }


    public String getPostIndex() {
        return postIndex;
    }
	
    public void setPostIndex (String postIndex) {
        this.postIndex =  postIndex;
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
