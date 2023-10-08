package org.java_18exceptionHandling;

import java.util.Scanner;

public class FinallyNotExecute1 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		try {
			System.out.println("Try 1.1");
			
			System.out.println("Enter Value Of a ");
			int a = scn.nextInt();
			System.exit(0);//When we use System.exit(0) execution of programm stops at this point. Nothing will execute after this line.
			//Therefore finally box also not executed. 
			int b = scn.nextInt();
			System.out.println(a);
			System.out.println(b);
			System.out.println("Try 1.2");
			
			}catch(Exception e) {
			System.out.println("Catch 1");
			//System.exit(0);// If there is no exception occur in try block then it will not execute catch block.
			e.printStackTrace();
			System.out.println("Catch 1");
			  
		}finally {
			System.out.println("Finally Executed");
			scn.close();
		}
	}

}
