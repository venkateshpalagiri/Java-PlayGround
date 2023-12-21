package com.venkatesh.java.collections.util;

import java.util.Collection;

import com.venkatesh.java.entity.Employee;

public class EmployeeObjectCreation {
	public Collection<? extends Employee> employeeObjectCreation() {
		Employee employee1=new Employee(1,"First Emp","Toronto");
		Employee employee2=new Employee(2,"Second Emp","Mississauga");
		Employee employee3=new Employee(3,"Third Emp","Brampton");
		Employee employee4=new Employee(4,"Fourth Emp","London");
		Employee employee5=new Employee(5,"Fifth Emp","Oshawa");
		return null;
	}

}
