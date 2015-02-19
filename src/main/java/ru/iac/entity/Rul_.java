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
	* - name      : DomainEntityJPA2Metamodel
	* - file name : DomainEntityJPA2Metamodel.vm
	* - time      : 2015/02/12 �.�. at 10:23:32 MSK
*/
package ru.iac.entity;

import java.sql.*;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@StaticMetamodel(Rul.class)
public class Rul_ {

    public static volatile SingularAttribute<Rul, Integer> idrul;

    public static volatile SingularAttribute<Rul, Integer> idul;
    public static volatile SingularAttribute<Rul, Date> dtstart;
    public static volatile SingularAttribute<Rul, String> namep;
    public static volatile SingularAttribute<Rul, String> ogrn;
    public static volatile SingularAttribute<Rul, Date> dtogrn;
    public static volatile SingularAttribute<Rul, String> inn;
    public static volatile SingularAttribute<Rul, String> kpp;
    public static volatile SingularAttribute<Rul, String> regnumst;
    public static volatile SingularAttribute<Rul, Date> dtreg;
    public static volatile SingularAttribute<Rul, java.math.BigDecimal> summa;
    public static volatile SingularAttribute<Rul, Integer> idregorg;
    public static volatile SingularAttribute<Rul, String> okato;
    public static volatile SingularAttribute<Rul, Integer> indeks;
    public static volatile SingularAttribute<Rul, Integer> idregion;
    public static volatile SingularAttribute<Rul, Integer> idraion;
    public static volatile SingularAttribute<Rul, Integer> idgorod;
    public static volatile SingularAttribute<Rul, Integer> idnasp;
    public static volatile SingularAttribute<Rul, Integer> idstreet;
    public static volatile SingularAttribute<Rul, String> dom;
    public static volatile SingularAttribute<Rul, String> korp;
    public static volatile SingularAttribute<Rul, String> kvart;
    public static volatile SingularAttribute<Rul, Date> gihdAdate;
    public static volatile SingularAttribute<Rul, Date> gihdChdate;
    public static volatile SingularAttribute<Rul, Date> gihdDdate;
    public static volatile SingularAttribute<Rul, Integer> gihdIdUser;
    public static volatile SingularAttribute<Rul, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Rul, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Rul, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Rul, String> rowCheckSum;




}
