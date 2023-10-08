package org.java_03methodEx;

public class NarrowingAndWidenning {

	public static void main(String[] args) {
		//*********Widening (To fit small data type in big data type)
		byte b = 120;
		//int a =b ; //always implicit widening
		int a=(byte)b;  //explicit widening
		//System.out.println("b="+b);
		//System.out.println("a="+a);
		
		
		
		//*********Narrowing (To fit big data type in small data type)
		//Explicit narrowing without data loss
		int k =129;
		//byte l= k//error
		byte l=(byte)k;//explicit narrowing --->-128 to  127 
		long l1=895623741l;
		
		double d=l1;
		float f =l1;
		
		double d1=45.69;
		long l2=(long)d1;
		
		float f1=85.69f;
		long l3=(long)f1;
		
		//System.out.println("k="+k);
		System.out.println("l="+l);
		
		//Explicit narrowing with data loss
		int n = 130;
		//byte l= k//error
		byte o=(byte)n;
		
//		System.out.println("k="+n);
//		System.out.println("l="+o);
		
	}

}
