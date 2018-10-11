package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<Integer>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	for(Integer x:set) {
		System.out.println(x);
	}
	
	Set<Integer> set1=new LinkedHashSet<Integer>();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(40);
	for(Integer x:set1) {
		System.out.println(x);
	}
	Set<String>set2=new TreeSet<>();
	set2.add("abc");
	set2.add("cde");
	set2.add("efg");
	set2.add("hij");
	for(String x:set2) {
	System.out.println(x);
	
}}
}
