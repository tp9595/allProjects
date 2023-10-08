package org.java_15Inheritance;

public class ChainofConstructor  {// extends Object //hidden. 
	public ChainofConstructor () {
		//super();//hidden
		System.out.println("Default");
	}
}
class A extends ChainofConstructor{

	public A () {
		//super();//hidden

		System.out.println("Con A");
	}
}
class B extends A{

	public B () {
		//super();//hidden

		System.out.println("Con B");
	}
}
class C extends B{
	public C () {//zero 
		//super();//hidden

		System.out.println("Con C");
	}

	public static void main(String[] args) {
		C obj =new C();
		
	}
}
//Object is super Class in Java		




