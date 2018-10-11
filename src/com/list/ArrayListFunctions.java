package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayListFunctions {

	public static void main(String[] args) {
		String[]str= {"a","c","e","b","d"};
		//Arrays to list
	ArrayList<String> al=new ArrayList<String>(Arrays.asList(str));
	al.add("b");
	al.add("d");
	al.add("f");
	for(String x:al) {
		System.out.println(x);
	}
	System.out.println("After sorting");
	Collections.sort(al);
	for(String x:al) {
		System.out.println(x);
	}
		
	//Array list to hash set
	Set<String> set=new HashSet<>(al);
	System.out.println("Removed duplicate elements");
	for(String x:set) {
		System.out.println(x);
	}
	//duplicate elements count
	int size=al.size()-set.size();
	System.out.println("number of duplicate elements:"+size);

	}

}
