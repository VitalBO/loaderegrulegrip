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
package ru.iac.entity;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: Ulname</p>
 * <p/>
 * <p>Description: Domain Object describing a Ulname entity</p>
 */
@Entity(name = "Ulname")
@Table(name = "\"ULNAME\"")
@NamedQueries({
        @NamedQuery(name = "Ulname.findAll", query = "SELECT ulname FROM Ulname ulname")
        , @NamedQuery(name = "Ulname.findByIdul", query = "SELECT ulname FROM Ulname ulname WHERE ulname.idul = :idul")

        , @NamedQuery(name = "Ulname.findByDtstart", query = "SELECT ulname FROM Ulname ulname WHERE ulname.dtstart = :dtstart")

        , @NamedQuery(name = "Ulname.findByNamep", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namep = :namep")
        , @NamedQuery(name = "Ulname.findByNamepContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namep like :namep")

        , @NamedQuery(name = "Ulname.findByNames", query = "SELECT ulname FROM Ulname ulname WHERE ulname.names = :names")
        , @NamedQuery(name = "Ulname.findByNamesContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.names like :names")

        , @NamedQuery(name = "Ulname.findByIdlangi", query = "SELECT ulname FROM Ulname ulname WHERE ulname.idlangi = :idlangi")

        , @NamedQuery(name = "Ulname.findByNamei", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namei = :namei")
        , @NamedQuery(name = "Ulname.findByNameiContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.namei like :namei")

        , @NamedQuery(name = "Ulname.findByIdopf", query = "SELECT ulname FROM Ulname ulname WHERE ulname.idopf = :idopf")

        , @NamedQuery(name = "Ulname.findByGihdAdate", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ulname.findByGihdChdate", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ulname.findByGihdDdate", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ulname.findByGihdIdUser", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ulname.findByGihdAIdPackage", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ulname.findByGihdChIdPackage", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ulname.findByGihdDIdPackage", query = "SELECT ulname FROM Ulname ulname WHERE ulname.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ulname.findByRowCheckSum", query = "SELECT ulname FROM Ulname ulname WHERE ulname.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ulname.findByRowCheckSumContaining", query = "SELECT ulname FROM Ulname ulname WHERE ulname.rowCheckSum like :rowCheckSum")

        , @NamedQuery(name = "Ulname.findByRegnum", query = "SELECT ulname FROM Ulname ulname WHERE ulname.regnum = :regnum")

})

public class Ulname implements Serializable {
    public static final String FIND_ALL = "Ulname.findAll";
    public static final String FIND_BY_IDUL = "Ulname.findByIdul";
    public static final String FIND_BY_DTSTART = "Ulname.findByDtstart";
    public static final String FIND_BY_NAMEP = "Ulname.findByNamep";
    public static final String FIND_BY_NAMEP_CONTAINING = "Ulname.findByNamepContaining";
    public static final String FIND_BY_NAMES = "Ulname.findByNames";
    public static final String FIND_BY_NAMES_CONTAINING = "Ulname.findByNamesContaining";
    public static final String FIND_BY_IDLANGI = "Ulname.findByIdlangi";
    public static final String FIND_BY_NAMEI = "Ulname.findByNamei";
    public static final String FIND_BY_NAMEI_CONTAINING = "Ulname.findByNameiContaining";
    public static final String FIND_BY_IDOPF = "Ulname.findByIdopf";
    public static final String FIND_BY_GIHDADATE = "Ulname.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ulname.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ulname.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ulname.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ulname.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ulname.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ulname.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ulname.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ulname.findByRowCheckSumContaining";
    public static final String FIND_BY_REGNUM = "Ulname.findByRegnum";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "ULNAMESEQ", sequenceName = "SEQ_ULNAME", allocationSize = 1)
    @Id
    @Column(name = "IDULNAME")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ULNAMESEQ")
    private Integer idulname;


    @OneToOne
    @JoinColumn(name = "IDUL")
    private Ul idul;


    @Column(name = "DTSTART", nullable = true, unique = true)
    private Date dtstart;


    @Column(name = "NAMEP", length = 800, nullable = true, unique = true)
    private String namep;


    @Column(name = "NAMES", length = 255, nullable = true, unique = false)
    private String names;


    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDLANGI", nullable = true, unique = false)
    private Splang idlangi;


    @Column(name = "NAMEI", length = 255, nullable = true, unique = false)
    private String namei;


    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDOPF", nullable = true, unique = true)
    private Spopf idopf;


    @Column(name = "GIHD__ADATE", nullable = true, unique = false)
    private Date gihdAdate;


    @Column(name = "GIHD__CHDATE", nullable = true, unique = false)
    private Date gihdChdate;


    @Column(name = "GIHD__DDATE", nullable = true, unique = false)
    private Date gihdDdate;


    @Column(name = "GIHD__ID_USER", nullable = true, unique = false)
    private Integer gihdIdUser;


    @Column(name = "GIHD__A_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdAIdPackage;


    @Column(name = "GIHD__CH_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdChIdPackage;


    @Column(name = "GIHD__D_ID_PACKAGE", nullable = true, unique = false)
    private Integer gihdDIdPackage;


    @Column(name = "ROW_CHECK_SUM", nullable = true, unique = false)
    private String rowCheckSum;

    @Column(name = "REGNUM", nullable = true, unique = false)
    private String regnum;

    /**
     * Default constructor
     */
    public Ulname() {
    }

    /**
     * All field constructor
     */
    public Ulname(
            Integer idulname,
            Ul idul,
            Date dtstart,
            String namep,
            String names,
            Splang idlangi,
            String namei,
            Spopf idopf,
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
                idulname,
                idul,
                dtstart,
                namep,
                names,
                idlangi,
                namei,
                idopf,
                gihdAdate,
                gihdChdate,
                gihdDdate,
                gihdIdUser,
                gihdAIdPackage,
                gihdChIdPackage,
                gihdDIdPackage,
                rowCheckSum,
                regnum
                , true);
    }

    public Ulname(
            Integer idulname,
            Ul idul,
            Date dtstart,
            String namep,
            String names,
            Splang idlangi,
            String namei,
            Spopf idopf,
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
        setIdulname(idulname);
        //attributes
        setIdul(idul);
        setDtstart(dtstart);
        setNamep(namep);
        setNames(names);
        setIdlangi(idlangi);
        setNamei(namei);
        setIdopf(idopf);
        setGihdAdate(gihdAdate);
        setGihdChdate(gihdChdate);
        setGihdDdate(gihdDdate);
        setGihdIdUser(gihdIdUser);
        setGihdAIdPackage(gihdAIdPackage);
        setGihdChIdPackage(gihdChIdPackage);
        setGihdDIdPackage(gihdDIdPackage);
        setRowCheckSum(rowCheckSum);
        setRegnum(regnum);
        //parents
    }

    public Ulname flat() {
        return new Ulname(
                getIdulname(),
                getIdul(),
                getDtstart(),
                getNamep(),
                getNames(),
                getIdlangi(),
                getNamei(),
                getIdopf(),
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

    public Integer getIdulname() {
        return idulname;
    }

    public void setIdulname(Integer idulname) {
        this.idulname = idulname;
    }


    public Ul getIdul() {
        return idul;
    }

    public void setIdul(Ul idul) {
        this.idul = idul;
    }


    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
    }


    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }


    public Splang getIdlangi() {
        return idlangi;
    }

    public void setIdlangi(Splang idlangi) {
        this.idlangi = idlangi;
    }


    public String getNamei() {
        return namei;
    }

    public void setNamei(String namei) {
        this.namei = namei;
    }


    public Spopf getIdopf() {
        return idopf;
    }

    public void setIdopf(Spopf idopf) {
        this.idopf = idopf;
    }


    public Date getGihdAdate() {
        return gihdAdate;
    }

    public void setGihdAdate(Date gihdAdate) {
        this.gihdAdate = gihdAdate;
    }


    public Date getGihdChdate() {
        return gihdChdate;
    }

    public void setGihdChdate(Date gihdChdate) {
        this.gihdChdate = gihdChdate;
    }


    public Date getGihdDdate() {
        return gihdDdate;
    }

    public void setGihdDdate(Date gihdDdate) {
        this.gihdDdate = gihdDdate;
    }


    public Integer getGihdIdUser() {
        return gihdIdUser;
    }

    public void setGihdIdUser(Integer gihdIdUser) {
        this.gihdIdUser = gihdIdUser;
    }


    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }

    public void setGihdAIdPackage(Integer gihdAIdPackage) {
        this.gihdAIdPackage = gihdAIdPackage;
    }


    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }

    public void setGihdChIdPackage(Integer gihdChIdPackage) {
        this.gihdChIdPackage = gihdChIdPackage;
    }


    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }

    public void setGihdDIdPackage(Integer gihdDIdPackage) {
        this.gihdDIdPackage = gihdDIdPackage;
    }


    public String getRowCheckSum() {
        return rowCheckSum;
    }

    public void setRowCheckSum(String rowCheckSum) {
        this.rowCheckSum = rowCheckSum;
    }


    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

}
