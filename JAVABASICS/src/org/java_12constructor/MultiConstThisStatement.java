package org.java_12constructor;

public class MultiConstThisStatement {
	public MultiConstThisStatement() {// Default or zero constructor
		this(12);// Recursive Consrtuctor  
		System.out.println("Default Consrt");
		
	}
	public MultiConstThisStatement(int a ) {// parameterized constructor
		//this();//one constructor should not contains this keyword.
		System.out.println("int"+a);
	}
	public MultiConstThisStatement(int a,int b ) {// parameterized constructor
		this(56.59f,true,(byte)(120),'f');
		System.out.println("int a int b");
	}
	public MultiConstThisStatement(float a,boolean flag, byte b, char c  ) {// parameterized constructor
		this();
		System.out.println("float a,boolean flag, byte b, char c");
	}
	public MultiConstThisStatement(byte b, double d   ) {// parameterized constructor
		//this();
		this(20,30);
		System.out.println("byte b, double d ");
		//this();// This call must be a first call in constructor
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("Program Start");
		MultiConstThisStatement obj = new MultiConstThisStatement((byte)(12),963.23);//
		

	}

}
