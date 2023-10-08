package org.java_03methodEx;

public class Methodcalling {
	//calling methods from another class within same package.

	public static void main(String[] args) {
		System.out.println("**Program Start**");
		AirthmeticEx1 obj = new AirthmeticEx1();
		obj.addition();
		obj.substraction();
		obj.multiplication();
		obj.Division();
	
		System.out.println("**Program End**");
	}

}
