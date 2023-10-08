package org.java_03methodEx;

public class MethodcallingwithParameter {
	//calling methods from another class within from same package.

	public static void main(String[] args) {
		System.out.println("**Program Start**");
		AirthmeticwithParameter obj = new AirthmeticwithParameter();
		obj.addition(45,56);
		obj.substraction(25,(byte)30);
		obj.multiplication(98,89);
		obj.Division(77,85);
	
		System.out.println("**Program End**");
	}

}
