package org.java_12constructor;

public class MultiConstr {
//	//public MultiConstr() {// Default or zero constructor
//		System.out.println("Default Consrt");
//	}
	public MultiConstr(int a ) {// parameterized constructor
		System.out.println("int a");
	}
	public MultiConstr(int a,int b ) {// parameterized constructor
		System.out.println("int a int b");
	}
	public MultiConstr(float a,boolean flag, byte b, char c  ) {// parameterized constructor
		System.out.println("float a,boolean flag, byte b, char c");
	}
	public MultiConstr(byte b, double d   ) {// parameterized constructor
		System.out.println("byte b, double d ");
	}
	
	
	

	public static void main(String[] args) {
		//MultiConstr obj = new MultiConstr();//Default constructor is hidden
		MultiConstr obj = new MultiConstr(52);
		MultiConstr obj1 = new MultiConstr(10,60);
		MultiConstr obj2 = new MultiConstr(20);

	}

}
