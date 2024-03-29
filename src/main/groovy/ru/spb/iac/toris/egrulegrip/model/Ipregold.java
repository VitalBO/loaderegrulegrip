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
 * <p>Title: Ipregold</p>
 * <p/>
 * <p>Description: Domain Object describing a Ipregold entity</p>
 */
@Entity(name = "Ipregold")
@Table(name = "IPREGOLD")
@NamedQueries({
        @NamedQuery(name = "Ipregold.findAll", query = "SELECT ipregold FROM Ipregold ipregold")
        , @NamedQuery(name = "Ipregold.findByIdip", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.idip = :idip")

        , @NamedQuery(name = "Ipregold.findByNumold", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.numold = :numold")
        , @NamedQuery(name = "Ipregold.findByNumoldContaining", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.numold like :numold")

        , @NamedQuery(name = "Ipregold.findByDtreg", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.dtreg = :dtreg")

        , @NamedQuery(name = "Ipregold.findByIdregorg", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.idregorg = :idregorg")

        , @NamedQuery(name = "Ipregold.findByGihdAdate", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ipregold.findByGihdChdate", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ipregold.findByGihdDdate", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ipregold.findByGihdIdUser", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ipregold.findByGihdAIdPackage", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ipregold.findByGihdChIdPackage", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ipregold.findByGihdDIdPackage", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ipregold.findByRowCheckSum", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ipregold.findByRowCheckSumContaining", query = "SELECT ipregold FROM Ipregold ipregold WHERE ipregold.rowCheckSum like :rowCheckSum")

})

public class Ipregold implements Serializable {
    public static final String FIND_ALL = "Ipregold.findAll";
    public static final String FIND_BY_IDIP = "Ipregold.findByIdip";
    public static final String FIND_BY_NUMOLD = "Ipregold.findByNumold";
    public static final String FIND_BY_NUMOLD_CONTAINING = "Ipregold.findByNumoldContaining";
    public static final String FIND_BY_DTREG = "Ipregold.findByDtreg";
    public static final String FIND_BY_IDREGORG = "Ipregold.findByIdregorg";
    public static final String FIND_BY_GIHDADATE = "Ipregold.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipregold.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipregold.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipregold.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipregold.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipregold.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipregold.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipregold.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ipregold.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPREGOLDSEQ", sequenceName = "SEQ_IPREGOLD", allocationSize = 1)
    @Id
    @Column(name = "IDIPREGOLD")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IPREGOLDSEQ")
    private Integer idipregold;


    @OneToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;


    @Column(name = "NUMOLD", length = 255, nullable = true, unique = false)
    private String numold;


    @Column(name = "DTREG", nullable = true, unique = false)
    private Date dtreg;


    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDREGORG")
    private Spregorg idregorg;


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


    /**
     * Default constructor
     */
    public Ipregold() {
    }

    /**
     * All field constructor
     */
    public Ipregold(
            Integer idipregold,
            Ip idip,
            String numold,
            Date dtreg,
            Spregorg idregorg,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idipregold,
                idip,
                numold,
                dtreg,
                idregorg,
                gihdAdate,
                gihdChdate,
                gihdDdate,
                gihdIdUser,
                gihdAIdPackage,
                gihdChIdPackage,
                gihdDIdPackage,
                rowCheckSum
                , true);
    }

    public Ipregold(
            Integer idipregold,
            Ip idip,
            String numold,
            Date dtreg,
            Spregorg idregorg,
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
        setIdipregold(idipregold);
        //attributes
        setIdip(idip);
        setNumold(numold);
        setDtreg(dtreg);
        setIdregorg(idregorg);
        setGihdAdate(gihdAdate);
        setGihdChdate(gihdChdate);
        setGihdDdate(gihdDdate);
        setGihdIdUser(gihdIdUser);
        setGihdAIdPackage(gihdAIdPackage);
        setGihdChIdPackage(gihdChIdPackage);
        setGihdDIdPackage(gihdDIdPackage);
        setRowCheckSum(rowCheckSum);
        //parents
    }

    public Ipregold flat() {
        return new Ipregold(
                getIdipregold(),
                getIdip(),
                getNumold(),
                getDtreg(),
                getIdregorg(),
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

    public Integer getIdipregold() {
        return idipregold;
    }

    public void setIdipregold(Integer idipregold) {
        this.idipregold = idipregold;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }


    public String getNumold() {
        return numold;
    }

    public void setNumold(String numold) {
        this.numold = numold;
    }


    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
    }


    public Spregorg getIdregorg() {
        return idregorg;
    }

    public void setIdregorg(Spregorg idregorg) {
        this.idregorg = idregorg;
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


}
