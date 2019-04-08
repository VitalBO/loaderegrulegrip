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


@StaticMetamodel(Ip.class)
public class Ip_ {

    public static volatile SingularAttribute<Ip, Integer> idip;
    public static volatile SingularAttribute<Ip, String> ogrn;
    public static volatile SingularAttribute<Ip, String> inn;
    public static volatile SingularAttribute<Ip, Integer> idvidip;
    public static volatile SingularAttribute<Ip, Integer> idstatus;
    public static volatile SingularAttribute<Ip, Integer> idregorg;
    public static volatile SingularAttribute<Ip, Date> ipstart;
    public static volatile SingularAttribute<Ip, Date> ipend;
    public static volatile SingularAttribute<Ip, Date> gihdAdate;
    public static volatile SingularAttribute<Ip, Date> gihdChdate;
    public static volatile SingularAttribute<Ip, Date> gihdDdate;
    public static volatile SingularAttribute<Ip, Integer> gihdIdUser;
    public static volatile SingularAttribute<Ip, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Ip, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Ip, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Ip, String> rowCheckSum;
	public static volatile SingularAttribute<Ip, Date> dtogrn;
	public static volatile SingularAttribute<Ip, String> regnum;
	public static volatile SingularAttribute<Ip, Date> dtreg;
	public static volatile SingularAttribute<Ip, String> regorgname;
	public static volatile SingularAttribute<Ip, String> kodstatusend;
	public static volatile SingularAttribute<Ip, String> namestatusend;
	public static volatile SingularAttribute<Ip, Date> dtend;
	public static volatile SingularAttribute<Ip, String> regnumend;
	public static volatile SingularAttribute<Ip, Date> dtregend;
	public static volatile SingularAttribute<Ip, String> ogrnul;
	public static volatile SingularAttribute<Ip, String> innul;
	public static volatile SingularAttribute<Ip, String> namepul;
	public static volatile SingularAttribute<Ip, String> grnzap;
	public static volatile SingularAttribute<Ip, Date> dtzap;
	public static volatile SingularAttribute<Ip, String> grncor;
	public static volatile SingularAttribute<Ip, Date> dtcor;

}
