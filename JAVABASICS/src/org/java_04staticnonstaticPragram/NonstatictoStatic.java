package org.java_04staticnonstaticPragram;

public class NonstatictoStatic {
	static int a=10;//static global variable
	
	public static void main (String[] args) {
		System.out.println("**Program Start**");
//		// Need object to shift control to non-static method
		NonstatictoStatic obj = new NonstatictoStatic();
		obj.test1();
//		
//		
		System.out.println("**Program End**");
		
	}
    public void test1() {//non static method
    	System.out.println("**Non Static Start**");
    	//1.Direct By using Name
    	System.out.println("a="+a);
    	test2();
    	
    	//2.By Class Name
    	System.out.println("a="+NonstatictoStatic.a);
    	NonstatictoStatic.test2();
    	
    	//3 By Using Object
    	NonstatictoStatic obj =new NonstatictoStatic();
    	obj.test2();
    	System.out.println("a="+obj.a);
    	System.out.println("**Non Static End**");
    	
    }
    public static void test2() {//static method
    	System.out.println("Static Method");
    }
}
