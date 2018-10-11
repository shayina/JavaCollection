package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetConversion {

	public static void main(String[] args) {
	Set <String> set=new HashSet<>();
	set.add("almas");
	set.add("shayu");
	set.add("asfara");
	set.add("alfarisha");
	List<String>al=new ArrayList<String>(set);
	Collections.swap(al,1,3);
	for(String x:al) {
		System.out.println(x);
	}
	
	}

}
