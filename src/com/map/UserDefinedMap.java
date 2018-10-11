package com.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.list.Employee;

public class UserDefinedMap {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setId(12);
	e1.setName("abc");
	Employee e2=new Employee();
	e2.setId(13);
	e2.setName("abcdef");
	Employee e3=new Employee();
	e3.setId(14);
	e3.setName("sdfg");
	Employee e4=new Employee();
	e4.setId(15);
	e4.setName("gjkmc");
	Map<Integer,Employee> myMap=new LinkedHashMap<Integer,Employee>();
	myMap.put(1,e1);
	myMap.put(10,e2);
	myMap.put(15,e3);
	myMap.put(20,e4);
	Set<Entry<Integer,Employee>> st=myMap.entrySet();
	for(Entry<Integer,Employee>x:st) {
		System.out.println(x.getKey());
		System.out.print(x.getValue().getId());
		System.out.println(x.getValue().getName());
		System.out.println();
	}

	}

}
