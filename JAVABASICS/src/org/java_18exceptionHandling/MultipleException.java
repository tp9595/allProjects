package org.java_18exceptionHandling;

public class MultipleException {
	
	public static void main(String[] args) {
		System.out.println("Program Start");
		division(10,0);
		//division(10,20);
		//division(98,5);
		
		System.out.println("Program End");

		}
	public static void division(int a, int b) {
		System.out.println("Div Start");
		int div =0;
		try {
			System.out.println("Try 1.1");	
		
			div=a/b;// (10/0) ArithmeticException}
			
			System.out.println("Try 1.2");	//If Exception occurs in try box it will not execute the remaining part of try block.
			}catch(ArithmeticException obj){//Creted object here class of Arithmeticexception to catch and handle the exception. 
				System.out.println("Catch 1.1");
				obj.printStackTrace();// Use to print Error msg 
				System.out.println("Catch 1.2");
			}
		System.out.println(div);
		System.out.println("Div End");

			
		}

}
