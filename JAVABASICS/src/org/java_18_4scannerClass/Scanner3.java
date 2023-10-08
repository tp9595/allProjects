package org.java_18_4scannerClass;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter string");
	String str= scn.nextLine();
	System.out.println(str);
	String str1= scn.next();
	System.out.println(str1);
	
			
	scn.close();// To close the object of scanner class otherwise it will give warning (Resource leak: 'scn' is never closed)
	//float f =scn.nextFloat();//illegal state exception
	}
	 

}
