package ru.iac.entity;

import java.sql.*;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ipadr.class)
public class Ipadr_ {

    public static volatile SingularAttribute<Ipadr, Integer> idipadr;

    public static volatile SingularAttribute<Ipadr, Integer> idip;
    public static volatile SingularAttribute<Ipadr, String> regnum;
    public static volatile SingularAttribute<Ipadr, Date> dtstart;
    public static volatile SingularAttribute<Ipadr, String> regnumcor;
    public static volatile SingularAttribute<Ipadr, Date> dtcor;
    public static volatile SingularAttribute<Ipadr, String> kodrg;
    public static volatile SingularAttribute<Ipadr, String> kodKl;
    public static volatile SingularAttribute<Uladr, String> okato;
    public static volatile SingularAttribute<Uladr, String> indeks;
    public static volatile SingularAttribute<Uladr, Integer> idregion;
    public static volatile SingularAttribute<Uladr, Integer> idraion;
    public static volatile SingularAttribute<Uladr, Integer> idgorod;
    public static volatile SingularAttribute<Uladr, Integer> idnasp;
    public static volatile SingularAttribute<Uladr, Integer> idstreet;
    public static volatile SingularAttribute<Uladr, String> dom;
    public static volatile SingularAttribute<Uladr, String> korp;
    public static volatile SingularAttribute<Uladr, String> kvart;
    public static volatile SingularAttribute<Uladr, Date> gihdAdate;
    public static volatile SingularAttribute<Uladr, Date> gihdChdate;
    public static volatile SingularAttribute<Uladr, Date> gihdDdate;
    public static volatile SingularAttribute<Uladr, Integer> gihdIdUser;
    public static volatile SingularAttribute<Uladr, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Uladr, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Uladr, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Uladr, String> rowCheckSum;

}
