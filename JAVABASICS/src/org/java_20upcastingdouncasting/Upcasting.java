package org.java_20upcastingdouncasting;

class A{
	public void test1 () {
		System.out.println("test1");
	}
}
class B extends A{
	public void test2 () {
		System.out.println("test2");
	}
}
class C extends B{
	public void test3 () {
		System.out.println("test3");
	}
}
public class Upcasting extends C {
	public void test4 () {
		System.out.println("test4");
	}
	
	public static void main(String[] args) {
		System.out.println("****************");
	//Normal Inheritance
		Upcasting obj =new Upcasting();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	//Explicit Upcasting 	
		System.out.println("****************");	
		C obj1 = (C) obj;//Upcasting 
		obj1.test1();
		obj1.test2();
		obj1.test3();
		//obj1.test4();//Error Restricted data
		System.out.println("****************");
		B obj2 = (B)obj;
	//	or
	//	B obj2= (B)obj1;
		obj2.test1();
		obj2.test2();
		//obj2.test3();//Error Restricted data
		//obj2.test4();//Error Restricted data
		System.out.println("****************");
		A obj3 = (A)obj;
		//	or
		//A obj3=(B)obj;
		//A obj3=(A)obj2;
		obj3.test1();
		//obj3.test2();//Error Restricted data
		//obj3.test3();//Error Restricted data
		//obj3.test4();//Error Restricted data
		
	}

}// If we don't have child class object then we use implicit up-casting
//A obj =new Upcasting(); 
//B obj1 =new Upcasting();
//C obj2 =new Upcasting();