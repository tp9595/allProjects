package org.java_09string;


public class FirstwordSmall2 {
	public static void main(String[] args) {
		
	
	String str = "There is garden and it is beautiful";
	str=str.toLowerCase();
	System.out.println(str);
	String [] ar = str.split(" ");
	String Str1 = ar[0];//There
	String Str2 = Str1.substring(0,1);//t
	String Str3 =Str1.substring(2);//here
	System.out.println(Str3);
	String Str4 = Str3.toUpperCase();//HERE
	String Str5 = Str2+Str4;
	System.out.println(Str5);
	
	String Result1="";
	String Result2="";
	for(int i=0;i<ar.length;i++) {
		Result1 =Result1+" " + ar[i].substring(0,1)+ar[i].substring(1).toUpperCase();
		Result2 =Result2+" " + ar[i].substring(0,1).toUpperCase()+ar[i].substring(1);	
	}
	Result1=Result1.trim();//
	System.out.println(Result1);
	
	Result2=Result2.trim();
	System.out.println(Result2);
		
	
	
	}
}