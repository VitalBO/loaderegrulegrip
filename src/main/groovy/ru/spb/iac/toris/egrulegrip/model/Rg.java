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
 * <p>Title: Rg</p>
 *
 * <p>Description: Domain Object describing a Rg entity</p>
 *
 */
@Entity (name="Rg")
@Table (name="RG")
@NamedQueries ({
	 @NamedQuery(name="Rg.findAll", query="SELECT rg FROM Rg rg")
	,@NamedQuery(name="Rg.findByName", query="SELECT rg FROM Rg rg WHERE rg.name = :name")
	,@NamedQuery(name="Rg.findByNameContaining", query="SELECT rg FROM Rg rg WHERE rg.name like :name")

	,@NamedQuery(name="Rg.findByKodKl", query="SELECT rg FROM Rg rg WHERE rg.kodKl = :kodKl")
	,@NamedQuery(name="Rg.findByKodKlContaining", query="SELECT rg FROM Rg rg WHERE rg.kodKl like :kodKl")

	,@NamedQuery(name="Rg.findByGihdAdate", query="SELECT rg FROM Rg rg WHERE rg.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Rg.findByGihdChdate", query="SELECT rg FROM Rg rg WHERE rg.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Rg.findByGihdDdate", query="SELECT rg FROM Rg rg WHERE rg.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Rg.findByGihdIdUser", query="SELECT rg FROM Rg rg WHERE rg.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Rg.findByGihdAIdPackage", query="SELECT rg FROM Rg rg WHERE rg.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Rg.findByGihdChIdPackage", query="SELECT rg FROM Rg rg WHERE rg.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Rg.findByGihdDIdPackage", query="SELECT rg FROM Rg rg WHERE rg.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Rg.findByRowCheckSum", query="SELECT rg FROM Rg rg WHERE rg.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Rg.findByRowCheckSumContaining", query="SELECT rg FROM Rg rg WHERE rg.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="Rg.findByTypeRg", query="SELECT rg FROM Rg rg WHERE rg.typeRg = :typeRg")
    ,@NamedQuery(name="Rg.findByTypeRgContaining", query="SELECT rg FROM Rg rg WHERE rg.typeRg like :typeRg")

    ,@NamedQuery(name="Rg.findByNameRg", query="SELECT rg FROM Rg rg WHERE rg.nameRg = :nameRg")
    ,@NamedQuery(name="Rg.findByNameRgContaining", query="SELECT rg FROM Rg rg WHERE rg.nameRg like :nameRg")

})

public class Rg implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Rg.findAll";
    public static final String FIND_BY_NAME = "Rg.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Rg.findByNameContaining";
    public static final String FIND_BY_KODKL = "Rg.findByKodKl";
    public static final String FIND_BY_KODKL_CONTAINING ="Rg.findByKodKlContaining";
    public static final String FIND_BY_GIHDADATE = "Rg.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Rg.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Rg.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Rg.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Rg.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Rg.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Rg.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Rg.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Rg.findByRowCheckSumContaining";
    public static final String FIND_BY_TYPERG = "Rg.findByTypeRg";
    public static final String FIND_BY_TYPERG_CONTAINING ="Rg.findByTypeRgContaining";
    public static final String FIND_BY_NAMERG = "Rg.findByNameRg";
    public static final String FIND_BY_NAMERG_CONTAINING ="Rg.findByNameRgContaining";
    private static final long serialVersionUID = 1L;
    @Id @Column(name="IDR" )
    private BigInteger idr;


    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name;


    @Column(name="KOD_KL"  , length=11 , nullable=true , unique=false)
    private String kodKl;


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

    @Column(name="TYPERG"   , nullable=true , unique=false)
    private String typeRg;

    @Column(name="NAMERG"   , nullable=true , unique=false)
    private String nameRg;


    /**
    * Default constructor
    */
    public Rg() {
    }

	/**
	* All field constructor 
	*/
    public Rg(
       BigInteger idr,
       String name,
       String kodKl,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String typeRg,
       String nameRg) {
	 this(
       idr,
       name,
       kodKl,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum,
	   typeRg,
	   nameRg
	 ,true);
	}
    
	public Rg(
       BigInteger idr,
       String name,
       String kodKl,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String typeRg,
       String nameRg
    , boolean setRelationship) {
       //primary keys
       setIdr (idr);
       //attributes
       setName (name);
       setKodKl (kodKl);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       setTypeRg(typeRg);
       setNameRg(nameRg);
       //parents
    }

	public Rg flat() {
	   return new Rg(
          getIdr(),
          getName(),
          getKodKl(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum(),
          getTypeRg(),
          getNameRg()

       , false
	   );
	}

    public BigInteger getIdr() {
        return idr;
    }
	
    public void setIdr (BigInteger idr) {
        this.idr =  idr;
    }


    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }


    public String getKodKl() {
        return kodKl;
    }
	
    public void setKodKl (String kodKl) {
        this.kodKl =  kodKl;
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


    public String getTypeRg() {
        return typeRg;
    }

    public void setTypeRg (String rowCheckSum) {
        this.typeRg =  typeRg;
    }


    public String getNameRg() {
        return nameRg;
    }

    public void setNameRg (String nameRg) {
        this.nameRg =  nameRg;
    }

    @Override
    public String getIdenti() {
        return idr.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rg rg = (Rg) o;

        return idr.equals(rg.idr);

    }

    @Override
    public int hashCode() {
        return idr.hashCode();
    }
}
