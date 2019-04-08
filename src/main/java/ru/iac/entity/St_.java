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


@StaticMetamodel(St.class)
public class St_ {

    public static volatile SingularAttribute<St, Integer> ids;

    public static volatile SingularAttribute<St, String> name;
    public static volatile SingularAttribute<St, String> kodSt;
    public static volatile SingularAttribute<St, Integer> idPrefiks;
    public static volatile SingularAttribute<St, Date> gihdAdate;
    public static volatile SingularAttribute<St, Date> gihdChdate;
    public static volatile SingularAttribute<St, Date> gihdDdate;
    public static volatile SingularAttribute<St, Integer> gihdIdUser;
    public static volatile SingularAttribute<St, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<St, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<St, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<St, String> rowCheckSum;
	public static volatile SingularAttribute<St, String> typeSt;
	public static volatile SingularAttribute<St, String> nameSt;




}
