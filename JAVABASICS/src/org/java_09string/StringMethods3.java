package org.java_09string;

public class StringMethods3 {

	public static void main(String[] args) {
		String str = "There is a garden and it is beautiful";
		String str1 = "There is a garden and it is beautiful ";
		System.out.println(str1.trim());
		System.out.println(str.indexOf('s'));//it gives index of only very first coming letter in string from left to right. 
		System.out.println(str.indexOf("garden "));//it gives index of first letter of string
		System.out.println(str.indexOf(" garden "));//it gives index of first letter of string
		System.out.println(str.indexOf('i', 12));//(char from 12)//i of it
		System.out.println(str.indexOf("it", 10));
		//concat :-to add two string 
		String Str1=" Pune";
		String Str2=" Mumbai";
		String Str3= Str1+Str2;
		System.out.println(Str3);
		String Str4 =Str2.concat(Str1).concat(Str2);	
		System.out.println(Str4);
		//contains :- To find specific contain in given string
		System.out.println("Contains:"+str.contains("aut"));
		System.out.println("Contains:"+str.contains("is  "));
		System.out.println("Contains:"+str.contains("is "));
		//toUppercase,toLowercase:-change the case of string
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		
	}
}
