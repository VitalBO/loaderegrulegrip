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


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Ipmns</p>
 *
 * <p>Description: Domain Object describing a Ipmns entity</p>
 *
 */
@Entity (name="Ipmns")
@Table (name="IPMNS")
@NamedQueries ({
	 @NamedQuery(name="Ipmns.findAll", query="SELECT ipmns FROM Ipmns ipmns")
	,@NamedQuery(name="Ipmns.findByIdip", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.idip = :idip")

	,@NamedQuery(name="Ipmns.findByIdmns", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.idmns = :idmns")

	,@NamedQuery(name="Ipmns.findByDtstart", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.dtstart = :dtstart")

	,@NamedQuery(name="Ipmns.findByDtend", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.dtend = :dtend")

	,@NamedQuery(name="Ipmns.findByGihdAdate", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipmns.findByGihdChdate", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipmns.findByGihdDdate", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipmns.findByGihdIdUser", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipmns.findByGihdAIdPackage", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipmns.findByGihdChIdPackage", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipmns.findByGihdDIdPackage", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipmns.findByRowCheckSum", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipmns.findByRowCheckSumContaining", query="SELECT ipmns FROM Ipmns ipmns WHERE ipmns.rowCheckSum like :rowCheckSum")

})

public class Ipmns implements Serializable {
    public static final String FIND_ALL = "Ipmns.findAll";
    public static final String FIND_BY_IDIP = "Ipmns.findByIdip";
    public static final String FIND_BY_IDMNS = "Ipmns.findByIdmns";
    public static final String FIND_BY_DTSTART = "Ipmns.findByDtstart";
    public static final String FIND_BY_DTEND = "Ipmns.findByDtend";
    public static final String FIND_BY_GIHDADATE = "Ipmns.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipmns.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipmns.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipmns.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipmns.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipmns.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipmns.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipmns.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipmns.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPMNSSEQ", sequenceName ="SEQ_IPMNS", allocationSize=1 )
    @Id
    @Column(name = "IDIPMNS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPMNSSEQ") 
    private Integer idipmns;


    @OneToOne
@JoinColumn(name = "IDIP")
@NaturalId
    private Ip idip;


    @ManyToOne
@JoinColumn(name = "IDMNS")
    private Spmns idmns;


    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;


    @Column(name="DTEND"   , nullable=true , unique=false)
    private Date dtend;


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
    public Ipmns() {
    }

	/**
	* All field constructor 
	*/
    public Ipmns(
       Integer idipmns,
       Ip idip,
       Spmns idmns,
       Date dtstart,
       Date dtend,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idipmns,
       idip,
       idmns,
       dtstart,
       dtend,
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
    
	public Ipmns(
       Integer idipmns,
       Ip idip,
       Spmns idmns,
       Date dtstart,
       Date dtend,
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
       setIdipmns (idipmns);
       //attributes
       setIdip (idip);
       setIdmns (idmns);
       setDtstart (dtstart);
       setDtend (dtend);
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

	public Ipmns flat() {
	   return new Ipmns(
          getIdipmns(),
          getIdip(),
          getIdmns(),
          getDtstart(),
          getDtend(),
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

    public Integer getIdipmns() {
        return idipmns;
    }
	
    public void setIdipmns (Integer idipmns) {
        this.idipmns =  idipmns;
    }


    public Ip getIdip() {
        return idip;
    }
	
    public void setIdip (Ip idip) {
        this.idip =  idip;
    }


    public Spmns getIdmns() {
        return idmns;
    }
	
    public void setIdmns (Spmns idmns) {
        this.idmns =  idmns;
    }


    public Date getDtstart() {
        return dtstart;
    }
	
    public void setDtstart (Date dtstart) {
        this.dtstart =  dtstart;
    }


    public Date getDtend() {
        return dtend;
    }
	
    public void setDtend (Date dtend) {
        this.dtend =  dtend;
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
