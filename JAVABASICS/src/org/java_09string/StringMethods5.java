package org.java_09string;

public class StringMethods5 {

	public static void main(String[] args) {
		String str = "There is a garden and it is beautiful";
		System.out.println(str);
		//replace use to replace any char or string in string
		System.out.println("replace ="+str.replace('e', 'r'));//for single and string
		System.out.println("replace string ="+str.replace("and", "or"));
		System.out.println("replaceAll string ="+str.replaceAll("is", "r"));//for string
		System.out.println("replaceAll string ="+str.replaceFirst("a","b"));
		
		//substring
		System.out.println("substring ="+str.substring(5));//it will print whole string from index 5
		System.out.println("substring ="+str.substring(5,str.length()));//it will print whole string from index 5
		System.out.println("substring ="+str.substring(5, 10));//it will print from 5 to 9 
		//System.out.println("substring ="+str.substring(5, 40));out of bound
	}
}