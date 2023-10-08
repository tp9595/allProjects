package org.java_09string;

import java.util.Scanner;

public class String_01Pract {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		//System.out.println(str);
		
		String str1[]=str.split(" ");
		 String fname=str1[0];
		 String lName=str1[1];
		 
		 for(int i=fname.length()-1;i>=0;i--) {
			 System.out.print(fname.charAt(i));
		 }
		 System.out.println(" "+lName);
		

	}

}
