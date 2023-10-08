package org.java_03methodEx;

public class MethodsEx {
	public static void  test1() { //static class
		System.out.println("Hi");
		System.out.println("Hello");
	
		System.out.println("Hi");
		System.out.println();
		return;//hidden
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("**Program Start**");
		MethodsEx obj1 = new MethodsEx();
		obj1.test1();
		obj1.test1();
		obj1.test1();
		test1();
		System.out.println("**Program End**");
	}
}
