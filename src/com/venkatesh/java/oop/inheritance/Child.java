package com.venkatesh.java.oop.inheritance;

public class Child extends Parent {
	@Override
	void m1() {
		System.out.println("m1 method in Child class");
	}
	public static void main(String[] args) {
		Parent parent=new Child();
		Parent p=new Parent();
		parent.m1();
		p.m1();
	}

}
