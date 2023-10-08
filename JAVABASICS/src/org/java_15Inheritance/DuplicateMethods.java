package org.java_15Inheritance;

class Parent1 {
	public void test() {
		System.out.println("Parent- Test 1");
	}
}
class Parent2 extends Parent1 {
	public void test() {
		System.out.println("Parent2- Test 1");
		
	}
	public void test2() {
		Parent1 prt =new Parent1();
		Parent1 prt1 =new Parent2();
		prt.test();//"Parent- Test 1"
		prt1.test();//"Parent2- Test 1"
	}
}

public class DuplicateMethods extends Parent2 {
	
	public static void main(String[] args) {
		DuplicateMethods obj = new DuplicateMethods();
		//obj.test();
		obj.test2();
		
	}
	public void test() {
		System.out.println("Child- Test");
	}

}//Obj called methods as per nearest availability
