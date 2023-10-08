package org.java_18exceptionHandling;

public class Scientech {

	public static void main(String[] args) {
		
		try {
		 int a=20/0;
		 //if (value < 10)
			 
		    throw new RuntimeException("Value is less than 10");
		 }
		catch (RuntimeException re) {
			//re.printStackTrace();
		   System.out.println(re.getMessage());
		  }
		System.out.println("Outside try-catch block");	
		  }
		

	}


