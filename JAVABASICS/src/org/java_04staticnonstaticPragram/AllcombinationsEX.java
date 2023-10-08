package org.java_04staticnonstaticPragram;

public class AllcombinationsEX {
static int a = 50, b=60;//static gloabal variable 
int x=50, y=60;//non static global variable
	public static void main(String[] args) {
		System.out.println("**Program start**");
		System.out.println("a="+AllcombinationsEX.a);//static to static variable call by using STD method(by class)
		System.out.println("a="+AllcombinationsEX.b);//static to static variable call by using STD method(by class)
		AllcombinationsEX.test1();//Static to static Method Call by using STD method(By Class)
		AllcombinationsEX obj = new AllcombinationsEX();//object created to call non static method
		obj.test2();//Static to non static method call by using object 
	
		System.out.println("**Program start**");
	}
	public static void test1() {//static method
		System.out.println("Static Method 1");
		System.out.println("a="+AllcombinationsEX.a);
		System.out.println("a="+AllcombinationsEX.b);
	}
	public void test2() {//non static method
		System.out.println("Non Static Method 1");
		System.out.println("x="+x);//non static to non static call by direct name
		System.out.println("y="+y);//non static to non static call by direct name
		System.out.println("this="+this.x);//non static to non static call by this keyword
		System.out.println("this="+this.y);//non static to non static call by this keyword
		System.out.println("a="+AllcombinationsEX.a);//Non static to static call by class name
		System.out.println("a="+AllcombinationsEX.b);//Non static to static call by class name
		
	}
}

