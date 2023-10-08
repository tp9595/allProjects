package org.java_09string;

public class StringPrac {

	public static void main(String[] args) {
		String str1 = new String("Pune");//will create new memory ,pointed by obj,memory will allocate in non-Consant pool
		String str2="Pune";///will create new memory ,pointed by obj,memory will allocate in Consant pool//will create new memory
		
		String str3 = new String("Pune");//will create new memory ,pointed by obj,memory will allocate in non-Consant pool//will create new memory
		String str4="Pune";//it will point out same memory as str2 as both store same data. 
		
		
		//Comparison operator use to compare memory only.
		System.out.println("str1==str2 :"+(str1==str2));//false
		System.out.println("str1==str3 :"+(str1==str3));//false
		System.out.println("str1==str3 :"+(str2==str4));//true
		
		str4 ="mumbai";//it will crete new memmory and that will point out by str4 & previous linking will be removed 
		System.out.println("after Updating the value of str4 it's create new memory in constant pool ");
		System.out.println("str1==str3 :"+(str2==str4));
	}

}
