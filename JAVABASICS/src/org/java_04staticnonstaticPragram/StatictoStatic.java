package org.java_04staticnonstaticPragram;
//Static to Static Call & Single Copy Concept Value of a getting Updated at Every stage. 
public class StatictoStatic {
static int a=10; //Static global variable

	public static void main(String[] args) {//main method 
	System.out.println("**Program Start**");
	
	//1.By Direct
	System.out.println("a="+a);//10
	test1();//No Need to create object we can call directly from static to static
	a=900;//value of a is updated now
	System.out.println("a="+a);//900
	
	
	  //2.By Using Class Name (Standard & Recommended)
	  System.out.println("raj"+StatictoStatic.a); 
	  StatictoStatic.test1();
	  StatictoStatic.a=9500;//Value of a is updated by using class name.
	  System.out.println("Upadted "+StatictoStatic.a);
	  
	  //3.By Using Object 
	  StatictoStatic obj = new StatictoStatic();
	  System.out.println("obj.a="+obj.a); 
	  obj.test1();//not Recommended jave gives warning here.
	  
	 
	  
	  //
	 System.out.println("**Program End**");
	  
	 
	}
	public static void test1() {//Static Method
		System.out.println("static method");
		
		
	}
}
