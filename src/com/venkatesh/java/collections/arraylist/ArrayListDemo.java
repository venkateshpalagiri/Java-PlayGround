package com.venkatesh.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import com.venkatesh.java.entity.Employee;

public class ArrayListDemo {
	
	ArrayList<Employee> arrayList=new ArrayList();
	
	public void addEmployee(Employee employee) {
		arrayList.add(employee);
		
		System.out.println(employee.toString());
	}
	public void deleteEmployee(long employeeId) {
		System.out.println(arrayList.toString());
		arrayList.clear();
		System.out.println(arrayList.toString());
	}
	
	public void addEmployeeForLoop() {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for (int i=0;i<101;i++) {
			if(i%5==0) {
				arrayList.add(i);
			}
		}
		System.out.println(arrayList);
	}

}
