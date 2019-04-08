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


@StaticMetamodel(Ul.class)
public class Ul_ {

    public static volatile SingularAttribute<Ul, Integer> idul;

	public static volatile SingularAttribute<Ul, Date> dtform;
	public static volatile SingularAttribute<Ul, Date> dtogrn;
    public static volatile SingularAttribute<Ul, String> ogrn;
    public static volatile SingularAttribute<Ul, String> inn;
    public static volatile SingularAttribute<Ul, String> kpp;
    public static volatile SingularAttribute<Ul, Integer> idstatus;
    public static volatile SingularAttribute<Ul, Integer> idregorg;
    public static volatile SingularAttribute<Ul, Integer> idvidregstart;
    public static volatile SingularAttribute<Ul, String> regnumstart;
    public static volatile SingularAttribute<Ul, Date> dtregstart;
    public static volatile SingularAttribute<Ul, Integer> idregorgstart;
    public static volatile SingularAttribute<Ul, Integer> idvidregend;
    public static volatile SingularAttribute<Ul, String> regnumend;
    public static volatile SingularAttribute<Ul, Date> dtregend;
    public static volatile SingularAttribute<Ul, Integer> idregorgend;
    public static volatile SingularAttribute<Ul, Integer> idRaion;
    public static volatile SingularAttribute<Ul, Date> gihdAdate;
    public static volatile SingularAttribute<Ul, Date> gihdChdate;
    public static volatile SingularAttribute<Ul, Date> gihdDdate;
    public static volatile SingularAttribute<Ul, Integer> gihdIdUser;
    public static volatile SingularAttribute<Ul, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Ul, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Ul, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Ul, String> rowCheckSum;




}
