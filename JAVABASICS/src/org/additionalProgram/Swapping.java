package org.additionalProgram;

public class Swapping {
	
	public static void swap(int a,int b) {
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("*************************");
		int temp=a;//10
		a=b;//20
		b=temp;//10
		
		
		
		System.out.println("After  swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		  
		a=a+b;//20+10//30
		b=a-b;//30-10//20
		a=a-b;//30-20//10
		System.out.println("Again After  swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

	public static void main(String[] args) {
		Swapping.swap(10, 20);
		Swapping.swap(189,890);
		

	}

}
