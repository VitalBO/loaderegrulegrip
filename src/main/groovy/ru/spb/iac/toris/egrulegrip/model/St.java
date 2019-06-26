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
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * <p>Title: St</p>
 *
 * <p>Description: Domain Object describing a St entity</p>
 *
 */
@Entity (name="St")
@Table (name="ST")
@NamedQueries ({
	 @NamedQuery(name="St.findAll", query="SELECT st FROM St st")
	,@NamedQuery(name="St.findByName", query="SELECT st FROM St st WHERE st.name = :name")
	,@NamedQuery(name="St.findByNameContaining", query="SELECT st FROM St st WHERE st.name like :name")

	,@NamedQuery(name="St.findByKodSt", query="SELECT st FROM St st WHERE st.kodSt = :kodSt")
	,@NamedQuery(name="St.findByKodStContaining", query="SELECT st FROM St st WHERE st.kodSt like :kodSt")

	,@NamedQuery(name="St.findByIdPrefiks", query="SELECT st FROM St st WHERE st.idPrefiks = :idPrefiks")

	,@NamedQuery(name="St.findByGihdAdate", query="SELECT st FROM St st WHERE st.gihdAdate = :gihdAdate")

	,@NamedQuery(name="St.findByGihdChdate", query="SELECT st FROM St st WHERE st.gihdChdate = :gihdChdate")

	,@NamedQuery(name="St.findByGihdDdate", query="SELECT st FROM St st WHERE st.gihdDdate = :gihdDdate")

	,@NamedQuery(name="St.findByGihdIdUser", query="SELECT st FROM St st WHERE st.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="St.findByGihdAIdPackage", query="SELECT st FROM St st WHERE st.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="St.findByGihdChIdPackage", query="SELECT st FROM St st WHERE st.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="St.findByGihdDIdPackage", query="SELECT st FROM St st WHERE st.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="St.findByRowCheckSum", query="SELECT st FROM St st WHERE st.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="St.findByRowCheckSumContaining", query="SELECT st FROM St st WHERE st.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="St.findByTypeSt", query="SELECT st FROM St st WHERE st.typeSt = :typeSt")
    ,@NamedQuery(name="St.findByTypeStContaining", query="SELECT st FROM St st WHERE st.typeSt like :typeSt")

    ,@NamedQuery(name="St.findByNameSt", query="SELECT st FROM St st WHERE st.nameSt = :nameSt")
    ,@NamedQuery(name="St.findByNameStContaining", query="SELECT st FROM St st WHERE st.nameSt like :nameSt")
})

public class St implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "St.findAll";
    public static final String FIND_BY_NAME = "St.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="St.findByNameContaining";
    public static final String FIND_BY_KODST = "St.findByKodSt";
    public static final String FIND_BY_KODST_CONTAINING ="St.findByKodStContaining";
    public static final String FIND_BY_IDPREFIKS = "St.findByIdPrefiks";
    public static final String FIND_BY_GIHDADATE = "St.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "St.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "St.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "St.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "St.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "St.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "St.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "St.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="St.findByRowCheckSumContaining";
    public static final String FIND_BY_TYPEST = "St.findByTypeSt";
    public static final String FIND_BY_TYPEST_CONTAINING ="St.findByTypeStContaining";
    public static final String FIND_BY_NAMEST = "St.findByNameSt";
    public static final String FIND_BY_NAMEST_CONTAINING ="St.findByNameStContaining";
    private static final long serialVersionUID = 1L;
    @Id @Column(name="IDS" )
    private BigInteger ids;


    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name;


    @Column(name="KOD_ST"  , length=15 , nullable=true , unique=false)
    private String kodSt;


    @Column(name="ID_PREFIKS"   , nullable=true , unique=false)
    private Integer idPrefiks;


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


    @Column(name="TYPEST"   , nullable=true , unique=false)
    private String typeSt;


    @Column(name="NAMEST"   , nullable=true , unique=false)
    private String nameSt;

    /**
    * Default constructor
    */
    public St() {
    }

	/**
	* All field constructor 
	*/
    public St(
       BigInteger ids,
       String name,
       String kodSt,
       Integer idPrefiks,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String typeSt,
       String nameSt) {
	 this(
       ids,
       name,
       kodSt,
       idPrefiks,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum,
	   typeSt,
	   nameSt
	 ,true);
	}
    
	public St(
       BigInteger ids,
       String name,
       String kodSt,
       Integer idPrefiks,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String typeSt,
       String nameSt
    , boolean setRelationship) {
       //primary keys
       setIds (ids);
       //attributes
       setName (name);
       setKodSt (kodSt);
       setIdPrefiks (idPrefiks);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       setTypeSt(typeSt);
       setNameSt(nameSt);
       //parents
    }

	public St flat() {
	   return new St(
          getIds(),
          getName(),
          getKodSt(),
          getIdPrefiks(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum(),
          getTypeSt(),
          getNameSt()
       , false
	   );
	}

    public BigInteger getIds() {
        return ids;
    }
	
    public void setIds (BigInteger ids) {
        this.ids =  ids;
    }


    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }


    public String getKodSt() {
        return kodSt;
    }
	
    public void setKodSt (String kodSt) {
        this.kodSt =  kodSt;
    }


    public Integer getIdPrefiks() {
        return idPrefiks;
    }
	
    public void setIdPrefiks (Integer idPrefiks) {
        this.idPrefiks =  idPrefiks;
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


    public String getTypeSt() {
        return typeSt;
    }

    public void setTypeSt (String typeSt) {
        this.typeSt =  typeSt;
    }


    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt (String nameSt) {
        this.nameSt =  nameSt;
    }

    @Override
    public String getIdenti() {
        return ids.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        St st = (St) o;

        return ids.equals(st.ids);

    }

    @Override
    public int hashCode() {
        return ids.hashCode();
    }


}
