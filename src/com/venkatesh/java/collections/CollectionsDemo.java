package com.venkatesh.java.collections;

import java.util.ArrayList;

import com.venkatesh.java.entity.Employee;

public class CollectionsDemo {
	
	public void addEmployee(Employee employee) {
		ArrayList<Employee> arrayList=new ArrayList();
		arrayList.add(employee);
		System.out.println(employee.toString());
	}

}
