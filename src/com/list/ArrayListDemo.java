package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
List <Integer> al=new ArrayList<>();
al.add(10);
al.add(20);
al.add(30);
System.out.println("Before manipulation in Array list");
for(Integer x:al) {
	System.out.println(x);
}
//To add last element in list
al.add(90);
//To add element in particular index
al.add(3,50);
//To replace element in particular index
al.set(0, 70);
//To find index of element
al.indexOf(30);
//To sort in ascending order
Collections.sort(al);
System.out.println("In ascending order");
for(Integer x:al) {
	System.out.println(x);
}
//To sort in descending order
Collections.reverse(al);
System.out.println("In descending order");
for(Integer x:al) {
	System.out.println(x);
}
Collections.swap(al, 2, 4);
System.out.println("After swap");
for(Integer x:al) {
	System.out.println(x);
}
List <Integer> ll=new LinkedList<>();
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
System.out.println("Linked List");
for(Integer x:ll) {
	System.out.println(x);
}
}
}