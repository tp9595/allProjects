package org.java_18_4scannerClass;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
////		System.out.println("Enter Value of a = ");
////		int a = obj.nextInt();//Input from console
////		System.out.println("Enter Value of b = ");
////		int b = obj.nextInt();//
//		System.out.println("sum = "+(a+b));
		//obj.close();
		System.out.println("Enter Sting1  = ");
		String str = obj.nextLine();
		System.out.println(str);
		System.out.println("*************");
		System.out.println("Enter Sting2  = ");
		String str1 = obj.next();
		System.out.println(str1);
	}

}
