package com.venkatesh.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import com.venkatesh.java.collections.methods.CollectionMethods;
import com.venkatesh.java.entity.Employee;

public class ArrayListDemo implements CollectionMethods {
	
	ArrayList<Employee> arrayList=new ArrayList();
	ArrayList<Employee> arrayList1=new ArrayList();
	@Override
	public void addEmployee(Employee employee) {
		arrayList.add(employee);
		
		System.out.println(employee.toString());
	}
	@Override
	public void deleteEmployee(long employeeId) {
		System.out.println(arrayList.toString());
		arrayList.clear();
		System.out.println(arrayList.toString());
	}
	@Override
	public void addEmployeeWithForLoop() {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for (int i=0;i<101;i++) {
			if(i%5==0) {
				arrayList.add(i);
			}
		}
		//Appends the specified element to the end of this list.
		arrayList.add(333);
		
		//Inserts the specified element at the specified position in thislist.
		arrayList.add(0, 1000);
		
		System.out.println(arrayList);
	}
	//Different ways to add Employee object to ArrayList
	@Override
	public void addEmployeeWithObject() {
		//Type-1
		Employee employee=new Employee(1, "emp1", "Toronto");
		Employee employee2=new Employee(2, "emp2", "SCR");
		Employee employee3=new Employee(3, "emp3", "London");
		
		arrayList.add(employee);
		arrayList.add(employee2);
		arrayList.add(employee3);
		
		System.out.println("Type-1 "+arrayList.toString());
		
		//Type-2
		arrayList1.add(new Employee(4,"emp4","USA"));
		arrayList1.add(new Employee(5, "emp5", "ENG"));
		arrayList1.add(new Employee(6, "emp6", "IND"));
		
		System.out.println("Type-2 "+arrayList1.toString());
	}

}
