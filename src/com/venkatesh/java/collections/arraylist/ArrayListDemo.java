package com.venkatesh.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import com.venkatesh.java.entity.Employee;

public class ArrayListDemo {
	
	public void addEmployee(Employee employee) {
		ArrayList<Employee> arrayList=new ArrayList();
		arrayList.add(employee);
		
		System.out.println(employee.toString());
	}

}
