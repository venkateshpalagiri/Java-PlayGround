package com.venkatesh.java.collections.vector;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import com.venkatesh.java.collections.methods.CollectionMethods;
import com.venkatesh.java.collections.util.EmployeeObjectCreation;
import com.venkatesh.java.entity.Employee;

public class VectorDemo extends EmployeeObjectCreation implements CollectionMethods {
	Vector<Employee> vector=new Vector<>();
	EmployeeObjectCreation employeeObjectCreation=new EmployeeObjectCreation();
	
	public static void main(String[] args) {
		
	}
//	@Override
//	public void addEmployee(Collection<Employee> employeeList) {
//		
//		vector.addAll(employeeObjectCreation.employeeObjectCreation());
		
//	}

	@Override
	public void deleteEmployee(long employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployeeWithForLoop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployeeWithObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	

}
