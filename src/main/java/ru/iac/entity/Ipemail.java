package ru.iac.entity;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity(name = "Ipemail")
@Table(name = "\"IPEMAIL\"")
@NamedQueries({
        @NamedQuery(name = "Ipemail.findAll", query = "SELECT ipemail FROM Ipemail ipemail")

        , @NamedQuery(name = "Ipemail.findByIdip", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.idip = :idip")
        , @NamedQuery(name = "Ipemail.findbyNaturalId", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.idip = :kod")

        , @NamedQuery(name = "Ipemail.findByEmail", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.email = :email")
        , @NamedQuery(name = "Ipemail.findByEmailContaining", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.email like :email")

        , @NamedQuery(name = "Ipemail.findByRegnum", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.regnum = :regnum")

        , @NamedQuery(name = "Ipemail.findByDtzap", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.dtzap = :dtzap")

        , @NamedQuery(name = "Ipemail.findByRegnumcor", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.regnumcor = :regnumcor")

        , @NamedQuery(name = "Ipemail.findByDtcor", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.dtcor = :dtcor")

        , @NamedQuery(name = "Ipemail.findByGihdAdate", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ipemail.findByGihdChdate", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ipemail.findByGihdDdate", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ipemail.findByGihdIdUser", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ipemail.findByGihdAIdPackage", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ipemail.findByGihdChIdPackage", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ipemail.findByGihdDIdPackage", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ipemail.findByRowCheckSum", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ipemail.findByRowCheckSumContaining", query = "SELECT ipemail FROM Ipemail ipemail WHERE ipemail.rowCheckSum like :rowCheckSum")

})

public class Ipemail implements Serializable, EgrulEntity, EgrulWithNaturalId{

    public static final String FIND_ALL = "Ipemail.findAll";
    public static final String FIND_BY_IDIP = "Ipemail.findByIdip";
    public static final String FIND_BY_NATURALID = "Ipemail.findbyNaturalId";
    public static final String FIND_BY_EMAIL = "Ipemail.findbyEmail";
    public static final String FIND_BY_EMAIL_CONTAINING = "Ipemail.findByEmailContaining";
    public static final String FIND_BY_REGNUM = "Ipemail.findByRegnum";
    public static final String FIND_BY_DTZAP = "Ipemail.findByDtzap";
    public static final String FIND_BY_REGNUMCOR = "Ipemail.findByRegnumcor";
    public static final String FIND_BY_DTCOR = "Ipemail.findByDtcor";
    public static final String FIND_BY_GIHDADATE = "Ipemail.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipemail.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipemail.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipemail.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipemail.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipemail.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipemail.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipemail.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ipemail.findByRowCheckSumContaining";

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "IPEMAILSEQ", sequenceName = "SEQ_IPEMAIL", allocationSize = 1)
    @Id
    @Column(name = "IDEMAIL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IPEMAILSEQ")
    private Integer idemail;


    @OneToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;


    @Column(name = "EMAIL", nullable = true, unique = false)
    private String email;


    @Column(name = "REGNUM", nullable = true, unique = false)
    private String regnum;


    @Column(name = "DTZAP", nullable = true, unique = false)
    private Date dtzap;


    @Column(name = "REGNUMCOR", nullable = true, unique = false)
    private String regnumcor;


    @Column(name = "DTCOR", nullable = true, unique = false)
    private Date dtcor;


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
    public Ipemail() {
    }
    /**
     * All field constructor
     */
    public Ipemail(
            Integer idemail,
            Ip idip,
            String email,
            String regnum,
            Date dtzap,
            String regnumcor,
            Date dtcor,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idemail,
                idip,
                email,
                regnum,
                dtzap,
                regnumcor,
                dtcor,
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


    public Ipemail(
            Integer idemail,
            Ip idip,
            String email,
            String regnum,
            Date dtzap,
            String regnumcor,
            Date dtcor,
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
        setIdemail(idemail);
        //attributes
        setIdip(idip);
        setEmail(email);
        setRegnum(regnum);
        setDtzap(dtzap);
        setRegnumcor(regnumcor);
        setDtcor(dtcor);
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


    public Ipemail flat() {
        return new Ipemail(
                getIdemail(),
                getIdip(),
                getEmail(),
                getRegnum(),
                getDtzap(),
                getRegnumcor(),
                getDtcor(),
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

    public Integer getIdemail() {
        return idemail;
    }

    public void setIdemail(Integer idemail) {
        this.idemail = idemail;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }


    public Date getDtzap() {
        return dtzap;
    }

    public void setDtzap(Date dtzap) {
        this.dtzap = dtzap;
    }


    public String getRegnumcor() {
        return regnumcor;
    }

    public void setRegnumcor(String regnumcor) {
        this.regnumcor = regnumcor;
    }


    public Date getDtcor() {
        return dtcor;
    }

    public void setDtcor(Date dtcor) {
        this.dtcor = dtcor;
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


    @Override
    public String getIdenti() {
        return idemail == null ? null : idemail.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ipemail)) return false;

        Ipemail ipemail = (Ipemail) o;

        if (email != null ? !email.equals(ipemail.email) : ipemail.email != null) return false;
        if (idip != null ? !idip.equals(ipemail.idip) : ipemail.idip != null) return false;
        return idemail.equals(ipemail.idemail);

    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + idemail.hashCode();
        result = 31 * result + (idip != null ? idip.hashCode() : 0);
        return result;
    }

    @Override
    public String getnaturalId() {
        return idip.getIdip();
    }

    @Override
    public String returnNaturalIdQuery() {
        return FIND_BY_NATURALID;
    }




}
