package org.java_12constructor;

public class Shubham2 {
	public Shubham2() {
		this(20,56.56,true,'p');
		System.out.println(" default con");
	}

	public Shubham2(int a) { // parameterise con this();
		
		System.out.println("int a"); }

public Shubham2(float a,boolean o,char ch) { // parameterise con
		this((int)(a));
		System.out.println("float a"); } 
	
	public Shubham2(int a,double x,boolean b,char f) { // parameterise con this((float) a,b,ch);
		this(a,b,f);
		
		System.out.println("int a,double b");
	} 
	public Shubham2(short s,double z,float a, boolean b,char ch,int n,long p) { // parameterise con
		this(); 
		
		
		System.out. println("para con -short s,float a, boolean b,char ch,int n,long p"); }




	public static void main (String[] args) {
		System.out.println("**********");
		Shubham2 obj = new Shubham2((short)10,23.23,450.23f,true,'Q',52,-968);
		System.out.println("**********");
	}
}
