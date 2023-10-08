package org.additionalProgram;
public class CombinPractice {
	int a = 10,b=98; //Not static global variable
	static int x=88, y=12;	
	public static void main(String[] args) {//main method 
		System.out.println("Prgm Start");
		CombinPractice obj = new CombinPractice();
		obj.test2();// to call non static method 
		obj.test1();//to call non static method 
		System.out.println("Prgm End");
		//Static to static 
		System.out.println("x="+CombinPractice.x);//By Classname
		System.out.println("x="+x);//By name 
		//Static to Non static  (//Non static call in static 
		System.out.println("a="+obj.a);
		System.out.println("b="+obj.b);
		}
	public void test1() {	
		System.out.println("Non Static Method");
		//Non static to non static
		System.out.println("this.a="+this.a);//By this key word
		System.out.println("this.b="+this.b);//By this key word
		System.out.println(a);// By name 
		System.out.println(b);//By name
		this.test2();
		System.out.println("x="+x);//Non Static to Static by using name 
		System.out.println("y="+CombinPractice.y);
		CombinPractice.test3();// by class non static to static method call
		test3();//direct by name non static to static method call
//		this.test3();//Not Recommended 
//		CombinPractice obj = new CombinPractice();
//		obj.test3();// Not Recommended 	
	}
	public void test2() {
		System.out.println("Non Static Method 2 ");

}
	public static void test3() {// static method
		System.out.println("Static Method");
	}
}

