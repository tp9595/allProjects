package org.java_04staticnonstaticPragram;


public class StatictoNonstatic {
	int a =50;//non static global variable 
	
	public static void main (String[] args) {//static method
		System.out.println("**Program start**");
		StatictoNonstatic obj = new StatictoNonstatic();
		System.out.println("a="+obj.a);
		obj.test2();
		}
	public void test2 () {//non static method
		
		System.out.println("No static");
	}
		












//static to no static call.
//public class StatictoNonstatic {
	//int a =50 ;
	//public static void main(String[] args) {//static method
		//System.out.println("**Program start**");
		//StatictoNonstatic obj = new StatictoNonstatic();
		//By using Object static to non static. 
		//System.out.println("a="+obj.a);
		//obj.test1();
		//System.out.println("**Program End**");
	//}	


	public void test1 () { // Non Static Method
		System.out.println("Non Static");
	}

}
