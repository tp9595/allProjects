package org.java_10accspecifier;

public class AccSpecPublic {//within class public
	public int a =10;
	public static void test() {
		System.out.println("within Class");
		
	}

	
	public static void main(String[] args) {
		AccSpecPublic obj = new AccSpecPublic();
		test();
		System.out.println(obj.a);
	}

}
