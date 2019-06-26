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
package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: PrefiksRaion</p>
 *
 * <p>Description: Domain Object describing a PrefiksRaion entity</p>
 *
 */
@Entity (name="PrefiksRaion")
@Table (name="PREFIKS_RAION")
@NamedQueries ({
	 @NamedQuery(name="PrefiksRaion.findAll", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion")
	,@NamedQuery(name="PrefiksRaion.findByIdRaion", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.idRaion = :idRaion")

	,@NamedQuery(name="PrefiksRaion.findByGihdAdate", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdAdate = :gihdAdate")

	,@NamedQuery(name="PrefiksRaion.findByGihdChdate", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdChdate = :gihdChdate")

	,@NamedQuery(name="PrefiksRaion.findByGihdDdate", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdDdate = :gihdDdate")

	,@NamedQuery(name="PrefiksRaion.findByGihdIdUser", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="PrefiksRaion.findByGihdAIdPackage", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="PrefiksRaion.findByGihdChIdPackage", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="PrefiksRaion.findByGihdDIdPackage", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="PrefiksRaion.findByRowCheckSum", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="PrefiksRaion.findByRowCheckSumContaining", query="SELECT prefiksraion FROM PrefiksRaion prefiksraion WHERE prefiksraion.rowCheckSum like :rowCheckSum")

})

public class PrefiksRaion implements Serializable {
    public static final String FIND_ALL = "PrefiksRaion.findAll";
    public static final String FIND_BY_IDRAION = "PrefiksRaion.findByIdRaion";
    public static final String FIND_BY_GIHDADATE = "PrefiksRaion.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "PrefiksRaion.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "PrefiksRaion.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "PrefiksRaion.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "PrefiksRaion.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "PrefiksRaion.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "PrefiksRaion.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "PrefiksRaion.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="PrefiksRaion.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "PREFIKS_RAIONSEQ", sequenceName ="", allocationSize=1 )
    @Id @Column(name="ID_PREFIKS" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PREFIKS_RAIONSEQ") 
    private Integer idPrefiks;


    @Column(name="ID_RAION"   , nullable=true , unique=false)
    private Integer idRaion;


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
    public PrefiksRaion() {
    }

	/**
	* All field constructor 
	*/
    public PrefiksRaion(
       Integer idPrefiks,
       Integer idRaion,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idPrefiks,
       idRaion,
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
    
	public PrefiksRaion(
       Integer idPrefiks,
       Integer idRaion,
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
       setIdPrefiks (idPrefiks);
       //attributes
       setIdRaion (idRaion);
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

	public PrefiksRaion flat() {
	   return new PrefiksRaion(
          getIdPrefiks(),
          getIdRaion(),
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

    public Integer getIdPrefiks() {
        return idPrefiks;
    }
	
    public void setIdPrefiks (Integer idPrefiks) {
        this.idPrefiks =  idPrefiks;
    }


    public Integer getIdRaion() {
        return idRaion;
    }
	
    public void setIdRaion (Integer idRaion) {
        this.idRaion =  idRaion;
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
