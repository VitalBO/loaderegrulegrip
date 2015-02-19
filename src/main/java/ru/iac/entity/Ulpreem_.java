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


@StaticMetamodel(Ulpreem.class)
public class Ulpreem_ {

    public static volatile SingularAttribute<Ulpreem, Integer> idulpreem;

    public static volatile SingularAttribute<Ulpreem, Integer> idul;
    public static volatile SingularAttribute<Ulpreem, String> namep;
    public static volatile SingularAttribute<Ulpreem, String> ogrn;
    public static volatile SingularAttribute<Ulpreem, Date> dtogrn;
    public static volatile SingularAttribute<Ulpreem, String> inn;
    public static volatile SingularAttribute<Ulpreem, String> kpp;
    public static volatile SingularAttribute<Ulpreem, String> regnumst;
    public static volatile SingularAttribute<Ulpreem, Date> dtreg;
    public static volatile SingularAttribute<Ulpreem, Integer> idregorg;
    public static volatile SingularAttribute<Ulpreem, String> okato;
    public static volatile SingularAttribute<Ulpreem, Integer> indeks;
    public static volatile SingularAttribute<Ulpreem, Integer> idregion;
    public static volatile SingularAttribute<Ulpreem, Integer> idraion;
    public static volatile SingularAttribute<Ulpreem, Integer> idgorod;
    public static volatile SingularAttribute<Ulpreem, Integer> idnasp;
    public static volatile SingularAttribute<Ulpreem, Integer> idstreet;
    public static volatile SingularAttribute<Ulpreem, String> dom;
    public static volatile SingularAttribute<Ulpreem, String> korp;
    public static volatile SingularAttribute<Ulpreem, String> kvart;
    public static volatile SingularAttribute<Ulpreem, Date> gihdAdate;
    public static volatile SingularAttribute<Ulpreem, Date> gihdChdate;
    public static volatile SingularAttribute<Ulpreem, Date> gihdDdate;
    public static volatile SingularAttribute<Ulpreem, Integer> gihdIdUser;
    public static volatile SingularAttribute<Ulpreem, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Ulpreem, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Ulpreem, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Ulpreem, String> rowCheckSum;




}
