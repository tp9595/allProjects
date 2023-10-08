package org.java_03methodEx;

public class StaticNonstaticDeclaration {
	
		public static int a=20 , b=30;//Global Static Variable
		public int x=50 , y=60;//Global Not static Variable 
		
		public static void  test1() { //static Method	
		System.out.println("Hi");
		
	}

	public static void main(String[] args) {//Main method
		System.out.println("**Program Start**");
		
		System.out.println("**Program End**");
		
	}
	public void test2 () { // non static method 
		System.out.println("Hello");
		
	}
	

}
