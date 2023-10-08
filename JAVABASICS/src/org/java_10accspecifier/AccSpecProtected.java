package org.java_10accspecifier;

public class AccSpecProtected {//within class protected 
	protected int a =10;
	protected static void test() {
		System.out.println("within Class Protected");
		
	}

	
	public static void main(String[] args) {
		AccSpecProtected obj = new AccSpecProtected();
		test();
		System.out.println(obj.a);
	}

}
