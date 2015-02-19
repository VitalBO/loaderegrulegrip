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


@StaticMetamodel(Ipdokdsn.class)
public class Ipdokdsn_ {

    public static volatile SingularAttribute<Ipdokdsn, Integer> iddokdsn;

    public static volatile SingularAttribute<Ipdokdsn, Integer> idip;
    public static volatile SingularAttribute<Ipdokdsn, Date> dtstart;
    public static volatile SingularAttribute<Ipdokdsn, Integer> idosndn;
    public static volatile SingularAttribute<Ipdokdsn, Integer> iddokdn;
    public static volatile SingularAttribute<Ipdokdsn, String> num;
    public static volatile SingularAttribute<Ipdokdsn, Date> dt;
    public static volatile SingularAttribute<Ipdokdsn, String> nameorg;
    public static volatile SingularAttribute<Ipdokdsn, Date> gihdAdate;
    public static volatile SingularAttribute<Ipdokdsn, Date> gihdChdate;
    public static volatile SingularAttribute<Ipdokdsn, Date> gihdDdate;
    public static volatile SingularAttribute<Ipdokdsn, Integer> gihdIdUser;
    public static volatile SingularAttribute<Ipdokdsn, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Ipdokdsn, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Ipdokdsn, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Ipdokdsn, String> rowCheckSum;




}
