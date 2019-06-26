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
 * <p>Title: Ipname</p>
 *
 * <p>Description: Domain Object describing a Ipname entity</p>
 *
 */
@Entity (name="Ipname")
@Table (name="IPNAME")
@NamedQueries ({
	 @NamedQuery(name="Ipname.findAll", query="SELECT ipname FROM Ipname ipname")
	,@NamedQuery(name="Ipname.findByIdip", query="SELECT ipname FROM Ipname ipname WHERE ipname.idip = :idip")

	,@NamedQuery(name="Ipname.findByDtstart", query="SELECT ipname FROM Ipname ipname WHERE ipname.dtstart = :dtstart")

	,@NamedQuery(name="Ipname.findByFamfl", query="SELECT ipname FROM Ipname ipname WHERE ipname.famfl = :famfl")
	,@NamedQuery(name="Ipname.findByFamflContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.famfl like :famfl")

	,@NamedQuery(name="Ipname.findByNamefl", query="SELECT ipname FROM Ipname ipname WHERE ipname.namefl = :namefl")
	,@NamedQuery(name="Ipname.findByNameflContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.namefl like :namefl")

	,@NamedQuery(name="Ipname.findByOtchfl", query="SELECT ipname FROM Ipname ipname WHERE ipname.otchfl = :otchfl")
	,@NamedQuery(name="Ipname.findByOtchflContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.otchfl like :otchfl")

	,@NamedQuery(name="Ipname.findByFamlat", query="SELECT ipname FROM Ipname ipname WHERE ipname.famlat = :famlat")
	,@NamedQuery(name="Ipname.findByFamlatContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.famlat like :famlat")

	,@NamedQuery(name="Ipname.findByNamelat", query="SELECT ipname FROM Ipname ipname WHERE ipname.namelat = :namelat")
	,@NamedQuery(name="Ipname.findByNamelatContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.namelat like :namelat")

	,@NamedQuery(name="Ipname.findByOtchlat", query="SELECT ipname FROM Ipname ipname WHERE ipname.otchlat = :otchlat")
	,@NamedQuery(name="Ipname.findByOtchlatContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.otchlat like :otchlat")

	,@NamedQuery(name="Ipname.findBySex", query="SELECT ipname FROM Ipname ipname WHERE ipname.sex = :sex")

	,@NamedQuery(name="Ipname.findByGihdAdate", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipname.findByGihdChdate", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipname.findByGihdDdate", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipname.findByGihdIdUser", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipname.findByGihdAIdPackage", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipname.findByGihdChIdPackage", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipname.findByGihdDIdPackage", query="SELECT ipname FROM Ipname ipname WHERE ipname.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipname.findByRowCheckSum", query="SELECT ipname FROM Ipname ipname WHERE ipname.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipname.findByRowCheckSumContaining", query="SELECT ipname FROM Ipname ipname WHERE ipname.rowCheckSum like :rowCheckSum")

})

public class Ipname implements Serializable {
    public static final String FIND_ALL = "Ipname.findAll";
    public static final String FIND_BY_IDIP = "Ipname.findByIdip";
    public static final String FIND_BY_DTSTART = "Ipname.findByDtstart";
    public static final String FIND_BY_FAMFL = "Ipname.findByFamfl";
    public static final String FIND_BY_FAMFL_CONTAINING ="Ipname.findByFamflContaining";
    public static final String FIND_BY_NAMEFL = "Ipname.findByNamefl";
    public static final String FIND_BY_NAMEFL_CONTAINING ="Ipname.findByNameflContaining";
    public static final String FIND_BY_OTCHFL = "Ipname.findByOtchfl";
    public static final String FIND_BY_OTCHFL_CONTAINING ="Ipname.findByOtchflContaining";
    public static final String FIND_BY_FAMLAT = "Ipname.findByFamlat";
    public static final String FIND_BY_FAMLAT_CONTAINING ="Ipname.findByFamlatContaining";
    public static final String FIND_BY_NAMELAT = "Ipname.findByNamelat";
    public static final String FIND_BY_NAMELAT_CONTAINING ="Ipname.findByNamelatContaining";
    public static final String FIND_BY_OTCHLAT = "Ipname.findByOtchlat";
    public static final String FIND_BY_OTCHLAT_CONTAINING ="Ipname.findByOtchlatContaining";
    public static final String FIND_BY_SEX = "Ipname.findBySex";
    public static final String FIND_BY_GIHDADATE = "Ipname.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipname.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipname.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipname.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipname.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipname.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipname.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipname.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipname.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPNAMESEQ", sequenceName ="SEQ_IPNAME", allocationSize=1 )
    @Id @Column(name="IDIPNAME" )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPNAMESEQ")
    private Integer idipname;


    @OneToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;
    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;
    @Column(name="FAMFL"  , length=60 , nullable=true , unique=false)
    private String famfl;
    @Column(name="NAMEFL"  , length=60 , nullable=true , unique=false)
    private String namefl;
    @Column(name="OTCHFL"  , length=60 , nullable=true , unique=false)
    private String otchfl;
    @Column(name="FAMLAT"  , length=60 , nullable=true , unique=false)
    private String famlat;
    @Column(name="NAMELAT"  , length=60 , nullable=true , unique=false)
    private String namelat;
    @Column(name="OTCHLAT"  , length=60 , nullable=true , unique=false)
    private String otchlat;
    @Column(name="SEX"   , nullable=true , unique=false)
    private Integer sex;
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
    public Ipname() {
    }


    /**
	* All field constructor
	*/
    public Ipname(
       Integer idipname,
       Ip idip,
       Date dtstart,
       String famfl,
       String namefl,
       String otchfl,
       String famlat,
       String namelat,
       String otchlat,
       Integer sex,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idipname,
       idip,
       dtstart,
       famfl,
       namefl,
       otchfl,
       famlat,
       namelat,
       otchlat,
       sex,
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

	public Ipname(
       Integer idipname,
       Ip idip,
       Date dtstart,
       String famfl,
       String namefl,
       String otchfl,
       String famlat,
       String namelat,
       String otchlat,
       Integer sex,
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
       setIdipname (idipname);
       //attributes
       setIdip (idip);
       setDtstart (dtstart);
       setFamfl (famfl);
       setNamefl (namefl);
       setOtchfl (otchfl);
       setFamlat (famlat);
       setNamelat (namelat);
       setOtchlat (otchlat);
       setSex (sex);
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

    @Override
    public String toString() {
        return "Ipname{" +
                "idipname=" + idipname +
                ", dtstart=" + dtstart +
                ", famfl='" + famfl + '\'' +
                ", namefl='" + namefl + '\'' +
                ", otchfl='" + otchfl + '\'' +
                ", famlat='" + famlat + '\'' +
                ", namelat='" + namelat + '\'' +
                ", otchlat='" + otchlat + '\'' +
                ", sex=" + sex +
                '}';
    }

	public Ipname flat() {
	   return new Ipname(
          getIdipname(),
          getIdip(),
          getDtstart(),
          getFamfl(),
          getNamefl(),
          getOtchfl(),
          getFamlat(),
          getNamelat(),
          getOtchlat(),
          getSex(),
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

    public Integer getIdipname() {
        return idipname;
    }

    public void setIdipname (Integer idipname) {
        this.idipname =  idipname;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip (Ip idip) {
        this.idip =  idip;
    }


    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }


    public String getFamfl() {
        return famfl;
    }

    public void setFamfl (String famfl) {
        this.famfl =  famfl;
    }


    public String getNamefl() {
        return namefl;
    }

    public void setNamefl (String namefl) {
        this.namefl =  namefl;
    }


    public String getOtchfl() {
        return otchfl;
    }

    public void setOtchfl (String otchfl) {
        this.otchfl =  otchfl;
    }


    public String getFamlat() {
        return famlat;
    }

    public void setFamlat (String famlat) {
        this.famlat =  famlat;
    }


    public String getNamelat() {
        return namelat;
    }

    public void setNamelat (String namelat) {
        this.namelat =  namelat;
    }


    public String getOtchlat() {
        return otchlat;
    }

    public void setOtchlat (String otchlat) {
        this.otchlat =  otchlat;
    }


    public Integer getSex() {
        return sex;
    }

    public void setSex (Integer sex) {
        this.sex =  sex;
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
