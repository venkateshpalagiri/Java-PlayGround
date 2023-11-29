package com.venkatesh.java.entity;

public class Employee {
	private long id;
	private String name;
	private String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
 class Main{
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(2);
		System.out.println(employee.getId());
	}
}
