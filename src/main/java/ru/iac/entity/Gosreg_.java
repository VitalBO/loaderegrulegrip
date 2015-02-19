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


@StaticMetamodel(Gosreg.class)
public class Gosreg_ {

    public static volatile SingularAttribute<Gosreg, Integer> idreg;

    public static volatile SingularAttribute<Gosreg, Integer> idul;
    public static volatile SingularAttribute<Gosreg, String> regnum;
    public static volatile SingularAttribute<Gosreg, Date> dtreg;
    public static volatile SingularAttribute<Gosreg, Integer> idregorg;
    public static volatile SingularAttribute<Gosreg, Integer> idvidreg;
    public static volatile SingularAttribute<Gosreg, Integer> sersvid;
    public static volatile SingularAttribute<Gosreg, Integer> numsvid;
    public static volatile SingularAttribute<Gosreg, Date> dtzap;
    public static volatile SingularAttribute<Gosreg, Date> gihdAdate;
    public static volatile SingularAttribute<Gosreg, Date> gihdChdate;
    public static volatile SingularAttribute<Gosreg, Date> gihdDdate;
    public static volatile SingularAttribute<Gosreg, Integer> gihdIdUser;
    public static volatile SingularAttribute<Gosreg, Integer> gihdAIdPackage;
    public static volatile SingularAttribute<Gosreg, Integer> gihdChIdPackage;
    public static volatile SingularAttribute<Gosreg, Integer> gihdDIdPackage;
    public static volatile SingularAttribute<Gosreg, String> rowCheckSum;




}
