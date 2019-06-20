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
 * <p>Title: Ipokved</p>
 * <p/>
 * <p>Description: Domain Object describing a Ipokved entity</p>
 */
@Entity(name = "Ipokved")
@Table(name = "IPOKVED")
@NamedQueries({
        @NamedQuery(name = "Ipokved.findAll", query = "SELECT ipokved FROM Ipokved ipokved")
        , @NamedQuery(name = "Ipokved.findByIdip", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.idip = :idip")

        , @NamedQuery(name = "Ipokved.findByIdokved", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.idokved = :idokved")

        , @NamedQuery(name = "Ipokved.findByMain", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.main = :main")

        , @NamedQuery(name = "Ipokved.findByGihdAdate", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ipokved.findByGihdChdate", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ipokved.findByGihdDdate", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ipokved.findByGihdIdUser", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ipokved.findByGihdAIdPackage", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ipokved.findByGihdChIdPackage", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ipokved.findByGihdDIdPackage", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ipokved.findByRowCheckSum", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ipokved.findByRowCheckSumContaining", query = "SELECT ipokved FROM Ipokved ipokved WHERE ipokved.rowCheckSum like :rowCheckSum")

})

public class Ipokved implements Serializable {
    public static final String FIND_ALL = "Ipokved.findAll";
    public static final String FIND_BY_IDIP = "Ipokved.findByIdip";
    public static final String FIND_BY_IDOKVED = "Ipokved.findByIdokved";
    public static final String FIND_BY_MAIN = "Ipokved.findByMain";
    public static final String FIND_BY_GIHDADATE = "Ipokved.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipokved.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipokved.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipokved.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipokved.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipokved.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipokved.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipokved.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ipokved.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "IPOKVEDSEQ", sequenceName = "SEQ_IPOKVED", allocationSize = 1)
    @Id
    @Column(name = "IDIPOKVED")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IPOKVEDSEQ")
    private Integer idipokved;


    @ManyToOne
    @JoinColumn(name = "idip", nullable = false)
    private Ip idip;


    @ManyToOne
    @JoinColumn(name = "IDOKVED")
    private Okved idokved;


    @Column(name = "MAIN", nullable = true, unique = false)
    private Integer main;


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
    public Ipokved() {
    }

    /**
     * All field constructor
     */
    public Ipokved(
            Integer idipokved,
            Ip idip,
            Okved idokved,
            Integer main,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idipokved,
                idip,
                idokved,
                main,
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

    public Ipokved(
            Integer idipokved,
            Ip idip,
            Okved idokved,
            Integer main,
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
        setIdipokved(idipokved);
        //attributes
        setIdip(idip);
        setIdokved(idokved);
        setMain(main);
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

    public Ipokved flat() {
        return new Ipokved(
                getIdipokved(),
                getIdip(),
                getIdokved(),
                getMain(),
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

    public Integer getIdipokved() {
        return idipokved;
    }

    public void setIdipokved(Integer idipokved) {
        this.idipokved = idipokved;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }


    public Okved getIdokved() {
        return idokved;
    }

    public void setIdokved(Okved idokved) {
        this.idokved = idokved;
    }


    public Integer getMain() {
        return main;
    }

    public void setMain(Integer main) {
        this.main = main;
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
