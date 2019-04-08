package ru.iac.entity;

import java.sql.*;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ipemail.class)
public class Ipemail_ {


    public static volatile SingularAttribute<Ipemail, Integer> idemail;

    public static volatile SingularAttribute<Ipemail, Integer> idip;
    public static volatile SingularAttribute<Ipemail, String> email;
    public static volatile SingularAttribute<Ipemail, String> regnum;
    public static volatile SingularAttribute<Ipemail, Date> dtzap;
    public static volatile SingularAttribute<Ipemail, String> regnumcor;
    public static volatile SingularAttribute<Ipemail, Date> dtcor;
    public static volatile SingularAttribute<Ipemail, Date> gihdAdate;
    public static volatile SingularAttribute<Ipemail, Date> gihdChdate;
    public static volatile SingularAttribute<Ipemail, Date> gihdDdate;
    public static volatile SingularAttribute<Ipemail, Integer> gihdIdUser;
    public static volatile SingularAttribute<Ipemail, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Ipemail, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Ipemail, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Ipemail, String> rowCheckSum;

}
