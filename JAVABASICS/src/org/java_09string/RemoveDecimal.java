package org.java_09string;

public class RemoveDecimal {

	public static void main(String[] args) {
		String Str ="11.300";
		String str1=Str.replaceAll("\\.\\d+$","");
		String str2=Str.replaceAll("[.]","");
		System.out.println("str1 : "+str1);
		System.out.println("str2 :"+str2);
	}

}
