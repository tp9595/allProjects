package org.java_09string;

public class StringMethods2 {

	public static void main(String[] args) {
		String str = "There is a garden and it is beautiful";
		System.out.println(str.length());
		System.out.println(str.charAt(0));//Use to specifie the char present at specific index
		//System.out.println(str.charAt(37));//Give error outof bounds
		//System.out.println(str.charAt(-1));//Give error outof bounds
		for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			//System.out.println(str.charAt(i));
		}
		System.out.println();
		System.out.println(str.indexOf('e'));//it gives the index of char present in string
		System.out.println(str.indexOf('z'));//it will gives (-1) index if char not present in string.
	}

}
