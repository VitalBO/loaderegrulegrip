package ru.iac.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by konenkov on 26.02.2015.
 */
@Embeddable

public class Address implements Serializable {

    @Column(name = "OKATO", length = 12, nullable = true, unique = false)
    private String okato;
    @Column(name = "INDEKS", length = 6, nullable = true, unique = false)
    private String indeks;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDREGION", nullable = true, unique = false)
    private Rg idregion;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDRAION", nullable = true, unique = false)
    private Ds idraion;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDGOROD", nullable = true, unique = false)
    private Ct idgorod;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDNASP", nullable = true, unique = false)
    private Cn idnasp;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "IDSTREET", nullable = true, unique = true)
    private St idstreet;
    @Column(name = "DOM", length = 50, nullable = true, unique = false)
    private String dom;
    @Column(name = "KORP", length = 50, nullable = true, unique = false)
    private String korp;
    @Column(name = "KVART", length = 50, nullable = true, unique = false)
    private String kvart;

    public Address(String okato, String indeks, Rg idregion, Ds idraion, Ct idgorod, Cn idnasp, St idstreet, String dom, String korp, String kvart) {
        this.okato = okato;
        this.indeks = indeks;
        this.idregion = idregion;
        this.idraion = idraion;
        this.idgorod = idgorod;
        this.idnasp = idnasp;
        this.idstreet = idstreet;
        this.dom = dom;
        this.korp = korp;
        this.kvart = kvart;
    }

    public Address() {
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public Rg getIdregion() {
        return idregion;
    }

    public void setIdregion(Rg idregion) {
        this.idregion = idregion;
    }

    public Ds getIdraion() {
        return idraion;
    }

    public void setIdraion(Ds idraion) {
        this.idraion = idraion;
    }

    public Ct getIdgorod() {
        return idgorod;
    }

    public void setIdgorod(Ct idgorod) {
        this.idgorod = idgorod;
    }

    public Cn getIdnasp() {
        return idnasp;
    }

    public void setIdnasp(Cn idnasp) {
        this.idnasp = idnasp;
    }

    public St getIdstreet() {
        return idstreet;
    }

    public void setIdstreet(St idstreet) {
        this.idstreet = idstreet;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getKorp() {
        return korp;
    }

    public void setKorp(String korp) {
        this.korp = korp;
    }

    public String getKvart() {
        return kvart;
    }

    public void setKvart(String kvart) {
        this.kvart = kvart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (dom != null ? !dom.equals(address.dom) : address.dom != null) return false;
        if (idgorod != null ? !idgorod.equals(address.idgorod) : address.idgorod != null) return false;
        if (idnasp != null ? !idnasp.equals(address.idnasp) : address.idnasp != null) return false;
        if (idraion != null ? !idraion.equals(address.idraion) : address.idraion != null) return false;
        if (idregion != null ? !idregion.equals(address.idregion) : address.idregion != null) return false;
        if (idstreet != null ? !idstreet.equals(address.idstreet) : address.idstreet != null) return false;
        if (indeks != null ? !indeks.equals(address.indeks) : address.indeks != null) return false;
        if (korp != null ? !korp.equals(address.korp) : address.korp != null) return false;
        if (kvart != null ? !kvart.equals(address.kvart) : address.kvart != null) return false;
        if (okato != null ? !okato.equals(address.okato) : address.okato != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = okato != null ? okato.hashCode() : 0;
        result = 31 * result + (indeks != null ? indeks.hashCode() : 0);
        result = 31 * result + (idregion != null ? idregion.hashCode() : 0);
        result = 31 * result + (idraion != null ? idraion.hashCode() : 0);
        result = 31 * result + (idgorod != null ? idgorod.hashCode() : 0);
        result = 31 * result + (idnasp != null ? idnasp.hashCode() : 0);
        result = 31 * result + (idstreet != null ? idstreet.hashCode() : 0);
        result = 31 * result + (dom != null ? dom.hashCode() : 0);
        result = 31 * result + (korp != null ? korp.hashCode() : 0);
        result = 31 * result + (kvart != null ? kvart.hashCode() : 0);
        return result;
    }
}
