package com.list;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedArrList {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(1234);
		e1.setName("almas");
		Employee e2=new Employee();
		e2.setId(1345);
		e2.setName("shayina");
		Employee e3=new Employee();
		e3.setId(4567);
		e3.setName("mohamed");
		
		List<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		for(Employee x:al) {
			System.out.println(x.getId()+" "+x.getName());
		
		}
		
		

	}

}
