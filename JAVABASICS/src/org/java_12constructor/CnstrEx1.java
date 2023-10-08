package org.java_12constructor;

public class CnstrEx1 {
 int a =12;


	public  CnstrEx1(int a) {// Default constructor 
		System.out.println("Default Constructor");
		this.a=a;//Initialize global variable by constructor
	}
	
	
}

class Harsha {
	public static void main(String[] args) {

	CnstrEx1 obj = new CnstrEx1(13);
	System.out.println(obj.a);
	}
}