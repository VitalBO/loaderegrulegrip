package ru.iac.entity;

import java.sql.*;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@StaticMetamodel(Sppreddok.class)
public class Sppreddok_ {

    public static volatile SingularAttribute<Sppreddok, Integer> iddok;
    public static volatile SingularAttribute<Sppreddok, String> numdok;
    public static volatile SingularAttribute<Sppreddok, String> name;
    //public static volatile SingularAttribute<Sppreddok, String> idreg;
    public static volatile SingularAttribute<Sppreddok, Date> dtdok;
    public static volatile SingularAttribute<Sppreddok, Date> gihdAdate;
    public static volatile SingularAttribute<Sppreddok, Date> gihdChdate;
    public static volatile SingularAttribute<Sppreddok, Date> gihdDdate;
    public static volatile SingularAttribute<Sppreddok, Integer> gihdIdUser;
    public static volatile SingularAttribute<Sppreddok, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Sppreddok, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Sppreddok, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Sppreddok, String> rowCheckSum;

}
