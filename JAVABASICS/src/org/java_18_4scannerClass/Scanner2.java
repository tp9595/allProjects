package org.java_18_4scannerClass;

import java.util.Scanner;

public class Scanner2 {

	public static void test() {
		Scanner scn = new Scanner(System.in);//Scanner Class is Inbuilt class of java.util
		//its shows error after importing.
		//it is parameterized class so here we need to pass (System.in)
		System.out.println("Enter value of a ");
		int  a = scn.nextInt();
	
		System.out.println("Enter value of b ");
		int b = scn.nextInt();
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		test();
		test();
	}

}
