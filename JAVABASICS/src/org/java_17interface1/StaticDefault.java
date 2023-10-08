package org.java_17interface1;

interface interf11{
	public void test();
	public static void test1() {
		System.out.println("Static method");
	}

	default void test2() {
	System.out.println("default");
}
}

public class StaticDefault implements interf11  {

	
	public void test() {
		
		
	}
	public static void test1() {
		System.out.println("Static pool ");//Harsha 
	}
	public void test2() {
		System.out.println("default");
	}
	
	
}
