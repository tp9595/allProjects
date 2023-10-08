package org.java_13polymorphism;

 public class PolyByChangingPositionOfParameter2 {
	//Method Over Loading  by changing position of  parameter 
	//there is same scenario for static & non-static 
	public static void test(boolean flag, short s) {
		System.out.println("No Parameter");
	}
	
	public static void test(int a,int b ,char t) {
		System.out.println("a="+a);
	}
	public void test(float a, float b,int r ) {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("r="+r);
	}
	public void test(char a, double d,byte p, int f) {
		System.out.println("a="+a);
		System.out.println("b="+d);
		System.out.println("p="+p);
		
	}
	public void addition (char ch, boolean b, int a) {
		System.out.println(a+a);
	}
	public void addition (boolean b, char ch, int a) {
		System.out.println(b+" "+ch+" "+a);
		}
	
	
	   public static void   main(String[] args) {
		test(true,(byte)3);
		test(98,98,'k');
		PolyByChangingPositionOfParameter2 obj = new PolyByChangingPositionOfParameter2();
		obj.test(85.5f, 65f,(int)85.63);
		obj.test('c',986.56,(byte)129);//data loss
		obj.addition('d', true, 98);
		obj.addition(false, 'b', 85);
		}

}

 class Polychecks{
	 public static void test() {// we can write same method  name in different classes 
			System.out.println("No Parameter");
	 
	 }
 }