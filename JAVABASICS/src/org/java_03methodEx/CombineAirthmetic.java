package org.java_03methodEx;

class Combine {

	public void addition(int a, int b) {

		int sum = a+b;
		System.out.println("Sum = "+sum);
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

	public void substraction(int a, int b) {

		int sub = a+b;
		System.out.println("Sub = "+sub);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	public void multiplication(byte a, int b) {

		int mul = a+b;
		System.out.println("Mul = "+mul);
	}

	public void Division(int a, int b) {

		int div = a+b;
		System.out.println("Div = "+div);
	}

}

public class CombineAirthmetic {

	public static void main(String[] args) {
		System.out.println("**Program Start**");
		Combine obj = new Combine();
		obj.addition(10,30);
		obj.substraction(10,30);
		obj.multiplication((byte)98,89);
		obj.Division(77,85);
		System.out.println("**Program End**");

	}

	
}
