package com.venkatesh.java.oop.interfaces;

public class ServiceImpl implements Service {
	
	public static void main(String[] args) {
		Service.staticMethod();
		
		Service service=new ServiceImpl();
		
		service.defaultMethod();
		service.defaultMethod();
		
	}

}
