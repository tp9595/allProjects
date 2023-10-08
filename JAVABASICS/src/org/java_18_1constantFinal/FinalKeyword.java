package org.java_18_1constantFinal;

public class FinalKeyword {
	long AdharCard= 89562337485l;
	final long ADHARCARD1=859632145778l;// Variable name should be in capital letter
	final public void rohit() {
		System.out.println("Final method");
	}
	
}
class Ex2 extends FinalKeyword{
//	// public void rohit() {// Can not override final method
//		System.out.println("Final method");
//	}
	public void rohit(int a) {// we can overload final method
	System.out.println("Final method");
}
		
	

	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		obj.rohit(50);
		obj.rohit();
	}

}
