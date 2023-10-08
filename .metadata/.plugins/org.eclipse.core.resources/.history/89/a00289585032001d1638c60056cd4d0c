package org.java_09string;


public class FirstwordCap {
	public static void main(String[] args) {
		
	
	String str = "There is garden and it is beautiful";
	System.out.println(str);
	//System.out.println(str.split("is"));
	//String [] ar=(str.split("is"));//return type of split method is string therefore here we use array to store string array. 
	String str1=str.toLowerCase();
//	String [] ar=(str1.split(" "));//return type of split method is string therefore here we use array to store string array.		
//	String str3=(ar[0]);//thereX
//	String str4=(str3.substring(0, 1));//t
//	System.out.println(str4);//t
//	String str5=(str4.toUpperCase());//T
//	System.out.println(str5);//T
//	
//	String str6=(str3.substring(1));//here
//	System.out.println(str6);//here
//	String str7 = str5+str6;
//	System.out.println(str7);
	
	String ar[]= str1.split(" ");
	String Result="";
	String Result2=" ";
	for(int i=0;i<ar.length;i++) {
		//System.out.println(ar[i]);
		String str2= ar[i].substring(0, 1);
		//String str3=str2.toUpperCase();
	    String str4= ar[i].substring(1);
		//Result =Result+" " + str3+ str4;
		Result =Result+" "+str2.toUpperCase()+ar[i].substring(1);
		Result2=Result2+" "+ar[i].substring(0, 1)+str4.toUpperCase();
		//System.out.println(Result);
	}
	Result=Result.trim();
	Result2=Result2.trim();
	System.out.println(Result);
	System.out.println(Result2);
	
	
}}