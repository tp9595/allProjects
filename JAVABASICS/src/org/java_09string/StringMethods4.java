package org.java_09string;

public class StringMethods4 {

	public static void main(String[] args) {
		String str = "There is a garden and it is beautiful";
		String str1 = "There is a garden and it is beautiful ";
		//Ends With :- Check End char Sequence
		System.out.println("endssWith = "+str.endsWith("ful"));//true
		System.out.println("endsWith = "+str.endsWith(" "));//false
		System.out.println("startsWith = "+str.startsWith("t"));//false
		System.out.println("startsWith = "+str.startsWith("T"));//True
		System.out.println(str1.endsWith("ful"));//false
		System.out.println(str1.endsWith(" "));//true
		String str3 = "Pune";
		String str4 = "pune";
		String str5 = "Pune";
		System.out.println("str3==str4 = "+(str3==str4));//Case sensitive//false
		System.out.println("str3==str5 = "+(str3==str5));//Case sensitive//true
		System.out.println(str3.equals(str4));////Case sensitive//false
		System.out.println(str3.equals(str5));////Case sensitive//true
		System.out.println("Ignoring Case = "+str3.equalsIgnoreCase(str4));//true
		System.out.println("Ignoring Case ="+str3.equalsIgnoreCase(str5));//true
		//Last Index Of
		System.out.println(str.lastIndexOf('e'));//index of 'e' from beautiful
		System.out.println(str.lastIndexOf("is"));//index of last "is" in string
	}
}