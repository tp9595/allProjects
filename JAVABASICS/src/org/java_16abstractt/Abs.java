package org.java_16abstractt;
//Abstraction is a technique by which we can hide the unnecessary data that is not
// needed from a user ,and expose only that data is of interest to the user.

abstract public  class Abs {
	//Both Methods are Abstract
	
	 //abstrct void test1();//we can not write static method abstract 
	abstract public  void test2(int a, int b);

}
	 abstract class Ex1{
	// One Abstract one Concrete	
		  abstract public  void test1();
		
		public void test2(int a ,int b) {//Concrete Method
			System.out.println(a+b);
		}
	}
	abstract class Ex2{
		 
		 public void test1() {
			 System.out.println("Cocrete");
			 }
		 public void test1(int a ,int b) {
			 System.out.println(a-b);
		 }
		 public static void main(String[] args) {
			// Ex2 obj =new Ex2();//
		}
	 }

