package org.java_19wrapperclass;

public class StringToInt {

	public static void main(String[] args) {
		int a =1000;
		String sObj = String.valueOf(a);//boxing 
		System.out.println(sObj);
		
		String str2="89567412";//can not pass char here 
		Integer iObj= Integer.valueOf(str2);//here it returns obj of wrapper class. 
		int e = Integer.parseInt(str2);
		long c =Long.parseLong(str2);//here it returns primitive data
		long d =iObj.intValue(); 
		//int z=(int) iObj.longValue();
		System.out.println(iObj);;
		System.out.println(c);
		System.out.println(d);
	}

}
