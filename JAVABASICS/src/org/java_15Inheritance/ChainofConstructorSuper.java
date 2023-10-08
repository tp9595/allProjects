package org.java_15Inheritance;

public class ChainofConstructorSuper extends B2  { 
	public ChainofConstructorSuper()  {
		super(20,89);
		System.out.println("Default");
	}
}
class A2 extends ChainofConstructorSuper{
	public A2 (int b) {
		System.out.println(b);
	}
}
class B2 {// extends Object //hidden.
	public B2 (int a ,int b){
		System.out.println("Con B");
	}
}
class C2 extends A2{
	public C2 () {
		
		super(50);
		System.out.println("Con C");
	}
	public static void main(String[] args) {
		System.out.println("Program Start");
		C2 obj =new C2();
		System.out.println("Program End");
	}
}
//Object is super Class in Java		




