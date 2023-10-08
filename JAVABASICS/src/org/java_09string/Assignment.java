package org.java_09string;

public class Assignment {

	public static void main(String[] args) {
		String str1=new String ("Pune");//Non Constant Pool
		String str2="Pune";//Constant
		//char ch[]= {'j','a','v','a'}	;
		//String str10=new String(ch,1,3);
		String str3=new String ("Pune");//Non Constant Pool
		String str4="Pune";
		
		//System.out.println(str10);
		System.out.println("str1==str2:"+(str1==str2));//false
		System.out.println("str1==str3:"+(str1==str3));//false
		System.out.println("str2==str4:"+(str2==str4));//true
		str4="Mumbai";
		System.out.println("str2==str4:"+(str2==str4));//false
		
		String str5=str1;
		System.out.println("str5==str1:"+(str5==str1));
		System.out.println("str5=str1:"+(str5=str1));
		String str6=str2;
		System.out.println("str6==str2:"+(str6==str2));
		System.out.println("str6=str2:"+(str6=str2));
		String str7=str3;
		System.out.println("str7==str3:"+(str7==str3));
		System.out.println("str7=str3:"+(str7=str3));
		String str8=str4;
		System.out.println("str8==str4:"+(str8==str4));
		System.out.println("str8=str8:"+(str8=str4));
		
		System.out.println(str5==str7);//non constal pool
		System.out.println(str6==str8);//true constant pool(before updating value of str4
		System.out.println(str6==str8);//false  constant pool after updating value of str4
		System.out.println(str8);
	}

}
