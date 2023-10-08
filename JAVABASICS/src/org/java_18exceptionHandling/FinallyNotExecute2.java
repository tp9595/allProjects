package org.java_18exceptionHandling;

import java.util.Scanner;

public class FinallyNotExecute2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try 1.1");
			
			System.out.println("Check when finally block not get executed ");
			
			System.out.println("Try 1.2");
			
			}catch(Exception e) {
			System.out.println("Catch 1");
			e.printStackTrace();
			System.out.println("Catch 1");
			  
		}finally {
			System.out.println("Finally Executed");
			
			int a =1,b=0,div;
			div=a/b;//Here Exceptions occurs and finally block not get fully executed.
			System.out.println(div);
			
		}
	}

}
