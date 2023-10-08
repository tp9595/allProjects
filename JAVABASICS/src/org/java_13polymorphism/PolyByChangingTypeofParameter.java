package org.java_13polymorphism;

public class PolyByChangingTypeofParameter {
	//Overloading  by changing type of  parameter 
	//there is same scenario for static & non-static 
	public static void test(boolean flag, short s) {
		System.out.println("No Parameter");
	}
	
	protected static void test(int a,int b ) {
		System.out.println("a="+a);
	}
	public void test(float a, float b ) {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public void test(char a, double d) {
		System.out.println("a="+a);
		System.out.println("b="+d);
		
	}
	
	   public static void   main(String[] args) {
		test(true,(byte)3);
		test(98,98);
		PolyByChangingTypeofParameter obj = new PolyByChangingTypeofParameter();
		obj.test(85.5f, 85.63f);
		obj.test('c',986d);
		}
}

 class Roman{
	 public static void test() {// we can write same method  name in different classes 
			System.out.println("No Parameter");
	 
	 }
 }