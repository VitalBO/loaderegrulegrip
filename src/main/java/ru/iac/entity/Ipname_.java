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


@StaticMetamodel(Ipname.class)
public class Ipname_ {

    public static volatile SingularAttribute<Ipname, Integer> idipname;

    public static volatile SingularAttribute<Ipname, Integer> idip;
    public static volatile SingularAttribute<Ipname, Date> dtstart;
    public static volatile SingularAttribute<Ipname, String> famfl;
    public static volatile SingularAttribute<Ipname, String> namefl;
    public static volatile SingularAttribute<Ipname, String> otchfl;
    public static volatile SingularAttribute<Ipname, String> famlat;
    public static volatile SingularAttribute<Ipname, String> namelat;
    public static volatile SingularAttribute<Ipname, String> otchlat;
    public static volatile SingularAttribute<Ipname, Integer> sex;
    public static volatile SingularAttribute<Ipname, Date> gihdAdate;
    public static volatile SingularAttribute<Ipname, Date> gihdChdate;
    public static volatile SingularAttribute<Ipname, Date> gihdDdate;
    public static volatile SingularAttribute<Ipname, Integer> gihdIdUser;
    public static volatile SingularAttribute<Ipname, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Ipname, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Ipname, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Ipname, String> rowCheckSum;




}
