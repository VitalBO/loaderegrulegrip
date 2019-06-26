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
 * <p>Title: XmlLoadLog</p>
 *
 * <p>Description: Domain Object describing a XmlLoadLog entity</p>
 *
 */
@Entity (name="XmlLoadLog")
@Table (name="XML_LOAD_LOG")
@NamedQueries ({
	 @NamedQuery(name="XmlLoadLog.findAll", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog")
	,@NamedQuery(name="XmlLoadLog.findByXmlName", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.xmlName = :xmlName")
	,@NamedQuery(name="XmlLoadLog.findByXmlNameContaining", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.xmlName like :xmlName")

	,@NamedQuery(name="XmlLoadLog.findByDateLoad", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.dateLoad = :dateLoad")

	,@NamedQuery(name="XmlLoadLog.findByGihdAdate", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdAdate = :gihdAdate")

	,@NamedQuery(name="XmlLoadLog.findByGihdChdate", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdChdate = :gihdChdate")

	,@NamedQuery(name="XmlLoadLog.findByGihdDdate", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdDdate = :gihdDdate")

	,@NamedQuery(name="XmlLoadLog.findByGihdIdUser", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="XmlLoadLog.findByGihdAIdPackage", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="XmlLoadLog.findByGihdChIdPackage", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="XmlLoadLog.findByGihdDIdPackage", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="XmlLoadLog.findByRowCheckSum", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="XmlLoadLog.findByRowCheckSumContaining", query="SELECT xmlloadlog FROM XmlLoadLog xmlloadlog WHERE xmlloadlog.rowCheckSum like :rowCheckSum")

})

public class XmlLoadLog implements Serializable {
    public static final String FIND_ALL = "XmlLoadLog.findAll";
    public static final String FIND_BY_XMLNAME = "XmlLoadLog.findByXmlName";
    public static final String FIND_BY_XMLNAME_CONTAINING ="XmlLoadLog.findByXmlNameContaining";
    public static final String FIND_BY_DATELOAD = "XmlLoadLog.findByDateLoad";
    public static final String FIND_BY_GIHDADATE = "XmlLoadLog.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "XmlLoadLog.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "XmlLoadLog.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "XmlLoadLog.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "XmlLoadLog.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "XmlLoadLog.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "XmlLoadLog.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "XmlLoadLog.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="XmlLoadLog.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "XML_LOAD_LOGSEQ", sequenceName ="", allocationSize=1 )
    @Id @Column(name="IDXML" ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="XML_LOAD_LOGSEQ") 
    private Integer idxml;


    @Column(name="XML_NAME"  , length=100 , nullable=true , unique=false)
    private String xmlName;


    @Column(name="DATE_LOAD"   , nullable=true , unique=false)
    private Date dateLoad;


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
    public XmlLoadLog() {
    }

	/**
	* All field constructor 
	*/
    public XmlLoadLog(
       Integer idxml,
       String xmlName,
       Date dateLoad,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       idxml,
       xmlName,
       dateLoad,
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
    
	public XmlLoadLog(
       Integer idxml,
       String xmlName,
       Date dateLoad,
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
       setIdxml (idxml);
       //attributes
       setXmlName (xmlName);
       setDateLoad (dateLoad);
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

	public XmlLoadLog flat() {
	   return new XmlLoadLog(
          getIdxml(),
          getXmlName(),
          getDateLoad(),
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

    public Integer getIdxml() {
        return idxml;
    }
	
    public void setIdxml (Integer idxml) {
        this.idxml =  idxml;
    }


    public String getXmlName() {
        return xmlName;
    }
	
    public void setXmlName (String xmlName) {
        this.xmlName =  xmlName;
    }


    public Date getDateLoad() {
        return dateLoad;
    }
	
    public void setDateLoad (Date dateLoad) {
        this.dateLoad =  dateLoad;
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
