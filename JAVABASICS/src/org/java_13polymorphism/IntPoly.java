package org.java_13polymorphism;
// Polymorphism is concepts in which method can take more than one form based on
// the type of parameters, order of parameters,and number of parameters.

public class IntPoly {
	
	public int addition (int a , int b) {
		System.out.println("Kem che Mazama??");
		return a+b;		
	}
	
	public int addition (char a , long b) {
			
		System.out.println(a+" "+" "+b);
		return (int)(a+b);
	}
	
	public int addition (char a , boolean flag,byte b) {
		System.out.println(a+" "+" "+b+" "+flag);
		;
		return a+b;	
		
	}
	public int addition (float a , double b,short s) {
		System.out.println(a+b+s);
		return (int)(a+b+s);	
		
	}
	public int addition (float a , long b) {
		return (int)(a+b);		
	}
	public int addition (long a , long b) {
		return (int)(a+b);		
	}


	public static void main(String[] args) {
		IntPoly obj =new IntPoly();
		obj.addition(12,98);
		
		obj.addition('R',956l);
		obj.addition(989,89560 );
		obj.addition('N', 89598569l);
		

	}

}
