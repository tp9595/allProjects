package org.java_02variableEx;

public class GlobalVariable {
	//Global Variable outside method & inside class. 
	static byte b1 =10;
	int f;
	int b = 150;
	long d = 159865;
	float g = 56.25f;
	double e = 98.85;

	public static void main (String[] args) {
		int b;
		int a=15;//Local Variable 
		System.out.println("**Program Start **");
		System.out.println("byte b1 = ");
		System.out.println(b1);
		System.out.println("byte b1=" + b1);
		System.out.println("**Program End **");
		System.out.println(+GlobalVariable.b1);
		GlobalVariable obj2 = new GlobalVariable();
		obj2.test();
		
	}

	public void test() {
		int r = 98;
    System.out.println(r);
    System.out.println("r="+this.b);
    GlobalVariable obj = new GlobalVariable();
    System.out.println(+obj.d);
    
	}
}