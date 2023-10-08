package org.java_09string;

public class RemoveSpecialChar {

	public static void main(String[] args) {
//1.Remove all special char from string [^ ]Plays Important Roll Here
//When we Specify older string with ^ then it will replace everything except the data written with ^ 
		String str="T!@he-re&*is#g$arden^and$it?><is.,Beauti@#89.48ful";
		String str1=str.replaceAll("[^a-zA-Z0-9]", " ");//to remove Special Character 
		// Here it will keep a-z,A-Z,0-9 except this all will be replace by new string.
		System.out.println(str1);
		System.out.println("**************************************");
		
//2.Remove all alphabet from string
		String str2 =str.replaceAll("[a-zA-Z]", " ");
		// here it will replace all alphabets with spcae.
		System.out.println(str2);
		System.out.println("**************************************");
		
//3.Remove all number from string
		String str3 =str.replaceAll("[0-9]", " ");
		// here it will replace all number with spcae.
		System.out.println(str3);	
		System.out.println("**************************************");
		
//4.Remove Decimal Point from String 
		String str4 =str.replaceAll("[.]", "");
		// here it will replace all alphabets with spcae.
		System.out.println(str4);
		System.out.println("**************************************");
	}
}