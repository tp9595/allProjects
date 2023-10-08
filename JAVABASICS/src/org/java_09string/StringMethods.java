package org.java_09string;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pune";
		str.length();//4
		System.out.println(str.length());
		str = "  Pune ";
		
		System.out.println(str);
		System.out.println("length before trim="+str.length());
		//str=str.trim();//it is use to trim the leading and trailing spaces
		String str1=(str.trim());
		
		System.out.println("length after trim="+str1.length());
	}

}
