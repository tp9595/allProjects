package org.java_10accspecifier;

public class AccSpecPrivate {//within class Private
	private  int a =10;
	private static void test() {
		System.out.println("within Class Private ");
		
	}

	
	public static void main(String[] args) {
		AccSpecPrivate obj = new AccSpecPrivate();
		test();
		System.out.println(obj.a);
	}

}
