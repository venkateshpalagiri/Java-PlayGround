package com.venkatesh.java.oop.interfaces;

public interface Service {
	
	default void defaultMethod() {
		System.out.println("default method calling...");
	}
	static void staticMethod() {
		System.out.println("Staic method calling...");
	}

}
