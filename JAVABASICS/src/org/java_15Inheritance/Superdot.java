package org.java_15Inheritance;
// Super. is use to call non static data of parent class in child class.
//Super. differentiate the non-static variable of parent class and child class  
public class Superdot {
	
	int a =89;//parent class non static variable
	
	public  void parent() {
		
		System.out.println("Superdot");
	}
	
}
class child extends Superdot{
	int b =85;
	public void test() {
		System.out.println("child");
	}
		public static void main(String[] args) {
			
			child obj = new child();
			obj.test2();
			obj.child();//child class 
			System.out.println(obj.a);//85

	}
		public void test2() {
			int a=63;
			this.parent();
			System.out.println("this.a="+this.a);//Calling global Global Variable
			super.parent();//parent class
			System.out.println("Child="+a);//63// Calling local variable 
			System.out.println("Parent="+super.a);//89
			

}
		public void child() {
			System.out.println("Child");
		}
}//this differentiate between local variable and global variable of same class