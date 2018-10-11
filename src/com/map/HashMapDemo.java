package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
	Map<Integer,String> myMap=new HashMap<Integer,String>();
	myMap.put(1,"a");
	myMap.put(2, "b");
	myMap.put(3, "c");
	myMap.put(4, "d");
	boolean b=myMap.containsKey(3);
	System.out.println(b);
	Set<Entry<Integer,String>> st=myMap.entrySet();
	for(Entry<Integer,String>x:st)
	{
	System.out.println(x.getKey()+" "+x.getValue());
	}
	Set<Integer> kst=myMap.keySet();
	System.out.println(kst);
	Set<Entry<Integer,String>> valst=myMap.entrySet();
	System.out.println(valst);
	
	//Tree map
	Map<Integer,String> myTMap=new TreeMap<Integer,String>();
	myTMap.putAll(myMap);
	
	System.out.println("In Tree map");
	Set<Entry<Integer,String>> st1=myTMap.entrySet();
	for(Entry<Integer,String>x1:st1)
	{
	System.out.println(x1.getKey()+" "+x1.getValue());
	}
	
	
	
	
}
}