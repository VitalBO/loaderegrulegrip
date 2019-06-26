package ru.spb.iac.toris.egrulegrip.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity(name = "Ipadr")
@Table(name = "IPADR")
@NamedQueries({
        @NamedQuery(name = "Ipadr.findAll", query = "SELECT ipadr FROM Ipadr ipadr")

        , @NamedQuery(name = "Ipadr.findByIdip", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.idip = :idip")
        , @NamedQuery(name = "Ipadr.findbyNaturalId", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.idip = :kod")

        , @NamedQuery(name = "Ipadr.findByRegnum", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.regnum = :regnum")

        , @NamedQuery(name = "Ipadr.findByDtstart", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.dtstart = :dtstart")

        , @NamedQuery(name = "Ipadr.findByRegnumcor", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.regnumcor = :regnumcor")

        , @NamedQuery(name = "Ipadr.findByDtcor", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.dtcor = :dtcor")

        , @NamedQuery(name = "Ipadr.findByKodrg", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.kodrg = :kodrg")

        , @NamedQuery(name = "Ipadr.findByKodKl", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.kodKl = :kodKl")

        , @NamedQuery(name = "Ipadr.findByGihdAdate", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdAdate = :gihdAdate")

        , @NamedQuery(name = "Ipadr.findByGihdChdate", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdChdate = :gihdChdate")

        , @NamedQuery(name = "Ipadr.findByGihdDdate", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdDdate = :gihdDdate")

        , @NamedQuery(name = "Ipadr.findByGihdIdUser", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdIdUser = :gihdIdUser")

        , @NamedQuery(name = "Ipadr.findByGihdAIdPackage", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdAIdPackage = :gihdAIdPackage")

        , @NamedQuery(name = "Ipadr.findByGihdChIdPackage", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdChIdPackage = :gihdChIdPackage")

        , @NamedQuery(name = "Ipadr.findByGihdDIdPackage", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.gihdDIdPackage = :gihdDIdPackage")

        , @NamedQuery(name = "Ipadr.findByRowCheckSum", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.rowCheckSum = :rowCheckSum")
        , @NamedQuery(name = "Ipadr.findByRowCheckSumContaining", query = "SELECT ipadr FROM Ipadr ipadr WHERE ipadr.rowCheckSum like :rowCheckSum")


})

public class Ipadr implements Serializable, EgrulEgripEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Ipadr.findAll";
    public static final String FIND_BY_IDIP = "Ipadr.findByIdip";
    public static final String FIND_BY_NATURALID = "Ipadr.findbyNaturalId";
    public static final String FIND_BY_REGNUM = "Ipadr.findByRegnum";
    public static final String FIND_BY_DTSTART = "Ipadr.findByDtstart";
    public static final String FIND_BY_REGNUMCOR = "Ipadr.findByRegnumcor";
    public static final String FIND_BY_DTCOR = "Ipadr.findByDtcor";
    public static final String FIND_BY_KODRG = "Ipadr.findByKodrg";
    public static final String FIND_BY_KODKL = "Ipadr.findByKodKl";
    public static final String FIND_BY_GIHDADATE = "Ipadr.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Ipadr.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Ipadr.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Ipadr.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Ipadr.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Ipadr.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Ipadr.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Ipadr.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING = "Ipadr.findByRowCheckSumContaining";

    private static final long serialVersionUID = 1L;

    @Embedded
    Address fulladdress;
    @SequenceGenerator(name = "IPADRSEQ", sequenceName = "SEQ_IPADR", allocationSize = 1)
    @Id
    @Column(name = "IDIPADR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IPADRSEQ")
    private Integer idipadr;


    @OneToOne
    @JoinColumn(name = "IDIP")
    private Ip idip;


    @Column(name = "REGNUM", nullable = true, unique = false)
    private String regnum;


    @Column(name = "DTSTART", nullable = true, unique = false)
    private Date dtstart;


    @Column(name = "REGNUMCOR", nullable = true, unique = false)
    private String regnumcor;


    @Column(name = "DTCOR", nullable = true, unique = false)
    private Date dtcor;


    @Column(name = "KODRG", nullable = true, unique = false)
    private String kodrg;


    @Column(name = "KOD_KL", nullable = true, unique = false)
    private String kodKl;


    @Column(name = "ADDRESS", nullable = true, unique = false)
    private String address;


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
    public Ipadr() {
    }
    /**
     * All field constructor
     */
    public Ipadr(
            Integer idipadr,
            Ip idip,
            String regnum,
            Date dtstart,
            String regnumcor,
            Date dtcor,
            String kodrg,
            String kodKl,
            Date gihdAdate,
            Date gihdChdate,
            Date gihdDdate,
            Integer gihdIdUser,
            Integer gihdAIdPackage,
            Integer gihdChIdPackage,
            Integer gihdDIdPackage,
            String rowCheckSum) {
        this(
                idipadr,
                idip,
                regnum,
                dtstart,
                regnumcor,
                dtcor,
                kodrg,
                kodKl,
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


    public Ipadr(
            Integer idipadr,
            Ip idip,
            String regnum,
            Date dtstart,
            String regnumcor,
            Date dtcor,
            String kodrg,
            String kodKl,
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
        setIdipadr(idipadr);
        //attributes
        setIdip(idip);
        setRegnum(regnum);
        setDtstart(dtstart);
        setRegnumcor(regnumcor);
        setDtcor(dtcor);
        setKodrg(kodrg);
        setKodKl(kodKl);
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


    public Address getFulladdress() {
        return fulladdress;
    }


    public void setFulladdress(Address fulladdress) {
        this.fulladdress = fulladdress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Ipadr flat() {
        return new Ipadr(
                getIdipadr(),
                getIdip(),
                getRegnum(),
                getDtstart(),
                getRegnumcor(),
                getDtcor(),
                getKodrg(),
                getKodKl(),
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

    public Integer getIdipadr() {
        return idipadr;
    }

    public void setIdipadr(Integer idipadr) {
        this.idipadr = idipadr;
    }


    public Ip getIdip() {
        return idip;
    }

    public void setIdip(Ip idip) {
        this.idip = idip;
    }


    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }


    public Date getDtstart() {
        return dtstart;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
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


    public String getKodrg() {
        return kodrg;
    }

    public void setKodrg(String kodrg) {
        this.kodrg = kodrg;
    }


    public String getKodKl() {
        return kodKl;
    }

    public void setKodKl(String kodKl) {
        this.kodKl = kodKl;
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
        return idipadr == null ? null : idipadr.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ipadr)) return false;

        Ipadr ipadr = (Ipadr) o;

        if (fulladdress != null ? !fulladdress.equals(ipadr.fulladdress) : ipadr.fulladdress != null) return false;
        if (idip != null ? !idip.equals(ipadr.idip) : ipadr.idip != null) return false;
        return idipadr.equals(ipadr.idipadr);

    }

    @Override
    public int hashCode() {
        int result = fulladdress != null ? fulladdress.hashCode() : 0;
        result = 31 * result + idipadr.hashCode();
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
