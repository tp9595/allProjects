package org.java_18_4scannerClass;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//Scanner Class is Inbuilt class of java.util
		//its shows error after importing.
		//it is parameterized class so here we need to pass (System.in)
		System.out.println("Enter value of a ");
		int  a = scn.nextInt();
		System.out.println(a);
		System.out.println("Enter string ");
		String Str=scn.next();
		System.out.println(Str);
		System.out.println("Enter string1 ");
		String Str1=scn.nextLine();
		System.out.println(Str1);
		String Str3 = scn.nextLine();
		
		
		
		System.out.println("Enter value of b ");
		int b = scn.nextInt();
		System.out.println(a+b);
	}
	 

}
