package org.java_09string;

public class RemoveSpaces {
	
	public static  void removeSpace(String Str) {
		//String str1=Str.trim();//it is use to remove leading and trailing spaces.
		System.out.println(Str);
		System.out.println(Str.replaceAll("\\s",""));//use to remove spaces in between.
	 
		       
	}

	public static void main(String[] args) {
		removeSpace("  Suraj Sir Your Teaching Method is    very nice   ");
		

	}

}
