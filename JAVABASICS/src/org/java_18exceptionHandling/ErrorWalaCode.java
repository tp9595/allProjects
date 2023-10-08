package org.java_18exceptionHandling;

public class ErrorWalaCode {

	public static void main(String[] args) {

		try {
			System.out.println("Program Start ");
			int a=10,b=10, div=0;
			System.out.println("Try_1");
			div=a/0;
			System.out.println(div);
			System.out.println("Try_2");
			String Str= "Mumbai";
			System.out.println("CharAt = "+ Str.charAt(5));
			System.out.println("Try_3");
			int ar[]= {50,60,89,85,63};
			System.out.println(ar[10]);


		}catch(ArithmeticException obj) {
			System.out.println("Catch_1.1");
			obj.printStackTrace();//to Print Exception
			System.out.println("Catch_1.2");

		}catch(StringIndexOutOfBoundsException obj) {
			System.out.println("Catch_2.1");
			obj.printStackTrace();
			System.out.println("Catch_2.2");
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Catch_3.1");
			obj.printStackTrace();
			System.out.println("Catch_3.2");
		}

	}
}
