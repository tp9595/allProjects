package org.java_16abstractt;

 abstract class Abstract {
	//Both Methods are Abstract
	public abstract int test1 ();
	abstract  public void test2(int a, int b);
	public void test2() {
		System.out.println("concrete method");
	}
	
}//while inheriting abstract method in child class it  will gives error.
 //for concrete method it will not give any error. 
 public class Abs3 extends Abstract{
		public int test1 () {
		 System.out.println("Implementing abstract method ");
	return 15;
	 }
	  public void test2(int a, int b) {
		  System.out.println(a+b);
	  }
	  
	  public static void main(String[] args) {
		  Abs3 obj = new Abs3();
		  obj.test1();
		  obj.test2();
		  obj.test2(10,59);
	}
} 
	



//Here we implemented both the abstract method.