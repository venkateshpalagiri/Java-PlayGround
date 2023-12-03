package com.venkatesh.java.collections.arraylist;

import com.venkatesh.java.entity.Employee;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo arrayListDemo=new ArrayListDemo();
		Employee employee=new Employee(1,"Venky","Canada");
		arrayListDemo.addEmployee(employee);
		arrayListDemo.deleteEmployee(1);

	}

}
