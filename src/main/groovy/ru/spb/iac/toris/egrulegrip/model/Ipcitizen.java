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


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Ipcitizen</p>
 *
 * <p>Description: Domain Object describing a Ipcitizen entity</p>
 *
 */
@Entity (name="Ipcitizen")
@Table (name="IPCITIZEN")
@NamedQueries ({
	 @NamedQuery(name="Ipcitizen.findAll", query="SELECT ipcitizen FROM Ipcitizen ipcitizen")
	,@NamedQuery(name="Ipcitizen.findByIdip", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.idip = :idip")

	,@NamedQuery(name="Ipcitizen.findByDtstart", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.dtstart = :dtstart")

	,@NamedQuery(name="Ipcitizen.findByIdvidcitizen", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.idvidcitizen = :idvidcitizen")

	,@NamedQuery(name="Ipcitizen.findByOksm", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.oksm = :oksm")

	,@NamedQuery(name="Ipcitizen.findByGihdAdate", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Ipcitizen.findByGihdChdate", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Ipcitizen.findByGihdDdate", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Ipcitizen.findByGihdIdUser", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Ipcitizen.findByGihdAIdPackage", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Ipcitizen.findByGihdChIdPackage", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Ipcitizen.findByGihdDIdPackage", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Ipcitizen.findByRowCheckSum", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Ipcitizen.findByRowCheckSumContaining", query="SELECT ipcitizen FROM Ipcitizen ipcitizen WHERE ipcitizen.rowCheckSum like :rowCheckSum")

})

public class Ipcitizen implements Serializable, EgrulEgripEntity {
    public static final String FIND_ALL = "Ipcitizen.findAll";
    public static final String FIND_BY_IDIP = "Ipcitizen.findByIdip";
    public static final String FIND_BY_DTSTART = "Ipcitizen.findByDtstart";
    public static final String FIND_BY_IDVIDCITIZEN = "Ipcitizen.findByIdvidcitizen";
    public static final String FIND_BY_OKSM = "Ipcitizen.findByOksm";
    public static final String FIND_BY_GIHDADATE = "Ipcitizen.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipcitizen.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipcitizen.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipcitizen.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipcitizen.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipcitizen.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipcitizen.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipcitizen.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Ipcitizen.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPCITIZENSEQ", sequenceName ="SEQ_IPCITIZEN", allocationSize=1 )
    @Id @Column(name="IDIPCITIZEN" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IPCITIZENSEQ") 
    private Integer idipcitizen;


    @OneToOne
@JoinColumn(name = "IDIP")
    private Ip idip;


    @Column(name="DTSTART"   , nullable=true , unique=false)
    private Date dtstart;


    @ManyToOne
@Cascade(CascadeType.SAVE_UPDATE)
@JoinColumn(name = "IDVIDCITIZEN")
    private Spvidcitizen idvidcitizen;


    @OneToOne
@Cascade(CascadeType.SAVE_UPDATE)
@JoinColumn(name = "OKSM")
    private Oksm oksm;


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
    public Ipcitizen() {
    }

	/**
	* All field constructor 
	*/
    public Ipcitizen(
       Integer idipcitizen,
       Ip idip,
       Date dtstart,
       Spvidcitizen idvidcitizen,
       Oksm oksm,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idipcitizen,
       idip,
       dtstart,
       idvidcitizen,
       oksm,
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
    
	public Ipcitizen(
       Integer idipcitizen,
       Ip idip,
       Date dtstart,
       Spvidcitizen idvidcitizen,
       Oksm oksm,
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
       setIdipcitizen (idipcitizen);
       //attributes
       setIdip (idip);
       setDtstart (dtstart);
       setIdvidcitizen (idvidcitizen);
       setOksm (oksm);
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

	public Ipcitizen flat() {
	   return new Ipcitizen(
          getIdipcitizen(),
          getIdip(),
          getDtstart(),
          getIdvidcitizen(),
          getOksm(),
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

    public Integer getIdipcitizen() {
        return idipcitizen;
    }
	
    public void setIdipcitizen (Integer idipcitizen) {
        this.idipcitizen =  idipcitizen;
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


    public Spvidcitizen getIdvidcitizen() {
        return idvidcitizen;
    }
	
    public void setIdvidcitizen (Spvidcitizen idvidcitizen) {
        this.idvidcitizen =  idvidcitizen;
    }


    public Oksm getOksm() {
        return oksm;
    }
	
    public void setOksm (Oksm oksm) {
        this.oksm =  oksm;
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

    @Override
    public String getIdenti() {
        return idipcitizen.toString();
    }


}
