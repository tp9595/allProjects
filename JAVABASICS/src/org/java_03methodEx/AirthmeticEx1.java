package org.java_03methodEx;

public class AirthmeticEx1 {

	public void addition() {
		int a=10,
		b=20;//Local Variable 
		int sum = a+b;
		System.out.println("Sum = "+sum);
		return;//hidden
		
		//System.out.println("program end");//will give error statment is written after "return"
	}
	public int addition1() {
	int a =10;
	int b=20;
	//return a+b;
	System.out.println(a+b);
	return a;
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public void substraction() {
		int a=10, b=20;
		int sub = a-b;
		System.out.println("Sub = "+sub);
	
	}
	
	public void multiplication() {
		int a=10, b=20;
		int mul = a+b;
		System.out.println("Mul = "+mul);
	}
	
	public void Division() {
		int a=10, b=20;
		int div = a+b;
		System.out.println("Div = "+div);
	}
	
}

class Merge{
	public static void main(String[] args) {
		AirthmeticEx1 rohit = new AirthmeticEx1();
		rohit.addition();
		rohit.substraction();
		rohit.addition1();
		rohit.add(10,20);
		rohit.add(30,40);
		int a=40;
		AirthmeticEx1 rohit1 = new AirthmeticEx1();
		rohit.addition();
	}
}
