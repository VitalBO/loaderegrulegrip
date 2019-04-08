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


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * <p>Title: Ulcapital</p>
 *
 * <p>Description: Domain Object describing a Ulcapital entity</p>
 *
 */
@Entity (name="Ulcapital")
@Table (name="\"ULCAPITAL\"")
@NamedQueries ({
	 @NamedQuery(name="Ulcapital.findAll", query="SELECT ulcapital FROM Ulcapital ulcapital")
	,@NamedQuery(name="Ulcapital.findByIdul", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.idul = :idul")

	,@NamedQuery(name="Ulcapital.findByDtstart", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.dtstart = :dtstart")

	,@NamedQuery(name="Ulcapital.findBySumma", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.summa = :summa")

	,@NamedQuery(name="Ulcapital.findByIdvidcap", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.idvidcap = :idvidcap")

	,@NamedQuery(name="Ulcapital.findByGihdAdate", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ulcapital.findByGihdChdate", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ulcapital.findByGihdDdate", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ulcapital.findByGihdIdUser", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ulcapital.findByGihdAIdPackage", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ulcapital.findByGihdChIdPackage", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ulcapital.findByGihdDIdPackage", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ulcapital.findByRowCheckSum", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ulcapital.findByRowCheckSumContaining", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.rowCheckSum like :rowCheckSum")

    ,@NamedQuery(name="Ulcapital.findByRegnum", query="SELECT ulcapital FROM Ulcapital ulcapital WHERE ulcapital.regnum = :regnum")

})

public class Ulcapital implements Serializable {
    public static final String FIND_ALL = "Ulcapital.findAll";
    public static final String FIND_BY_IDUL = "Ulcapital.findByIdul";
    public static final String FIND_BY_DTSTART = "Ulcapital.findByDtstart";
    public static final String FIND_BY_SUMMA = "Ulcapital.findBySumma";
    public static final String FIND_BY_IDVIDCAP = "Ulcapital.findByIdvidcap";
    public static final String FIND_BY_GIHDADATE = "Ulcapital.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulcapital.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulcapital.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulcapital.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulcapital.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulcapital.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulcapital.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulcapital.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ulcapital.findByRowCheckSumContaining";
    public static final String FIND_BY_REGNUM = "Ulcapital.findByRegnum";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULCAPITALSEQ", sequenceName ="SEQ_ULCAPITAL", allocationSize=1 )
    @Id @Column(name="IDULCAPITAL" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ULCAPITALSEQ") 
    private Integer idulcapital;


    @OneToOne
    @JoinColumn(name = "IDUL")
    private Ul idul;


    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;


    @Column(name="SUMMA"   , nullable=true , unique=false)
    private BigDecimal summa;


    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDVIDCAP")
    private Spvidcap idvidcap;


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


    @Column(name="REGNUM", nullable=true , unique=false)
    private String regnum;


    /**
    * Default constructor
    */
    public Ulcapital() {
    }

	/**
	* All field constructor 
	*/
    public Ulcapital(
       Integer idulcapital,
       Ul idul,
       Date dtstart,
       BigDecimal summa,
       Spvidcap idvidcap,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum) {
	 this(
       idulcapital,
       idul,
       dtstart,
       summa,
       idvidcap,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum,
	   regnum
	 ,true);
	}
    
	public Ulcapital(
       Integer idulcapital,
       Ul idul,
       Date dtstart,
       BigDecimal summa,
       Spvidcap idvidcap,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum,
       String regnum
    , boolean setRelationship) {
       //primary keys
       setIdulcapital (idulcapital);
       //attributes
       setIdul (idul);
       setDtstart (dtstart);
       setSumma (summa);
       setIdvidcap (idvidcap);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       setRegNum(regnum);
       //parents
    }

	public Ulcapital flat() {
	   return new Ulcapital(
          getIdulcapital(),
          getIdul(),
          getDtstart(),
          getSumma(),
          getIdvidcap(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum(),
          getRegnum()
       , false
	   );
	}

    public Integer getIdulcapital() {
        return idulcapital;
    }
	
    public void setIdulcapital (Integer idulcapital) {
        this.idulcapital =  idulcapital;
    }


    public Ul getIdul() {
        return idul;
    }
	
    public void setIdul (Ul idul) {
        this.idul =  idul;
    }


    public Date getDtstart() {
        return dtstart;
    }
	
    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }


    public BigDecimal getSumma() {
        return summa;
    }
	
    public void setSumma (BigDecimal summa) {
        this.summa =  summa;
    }


    public Spvidcap getIdvidcap() {
        return idvidcap;
    }
	
    public void setIdvidcap (Spvidcap idvidcap) {
        this.idvidcap =  idvidcap;
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


    public String getRegnum() {
        return regnum;
    }

    public void setRegNum (String regnum) {
        this.regnum =  regnum;
    }


}
