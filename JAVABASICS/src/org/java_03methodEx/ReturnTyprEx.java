package org.java_03methodEx;

public class ReturnTyprEx {
	
	
	public byte test1(byte a,byte b) {
		return (byte)(a+b);//result should be type catse into return data type
		}
	public short test2(short a,short b) {
		return (short) (a+b);	
	}
	public void  test3(int a,int b) {
	 System.out.println(a+b);	
	}
	public float test4(float a,float b) {
		return a+b;	
	}
	public double test5(double a,double b) {
		return a+b;	
	}
	public void test6(byte b,short s) {
		System.out.println("b="+b);	
	}
	

	public static void main(String[] args) {
		ReturnTyprEx obj = new ReturnTyprEx();
		//obj.test6(7,8);// By Default Java consider int data so we need to typecast here,
		obj.test6((byte)7,(short)8);
		obj.test1((byte)10,(byte)30);
		obj.test2((short) 12,(short)19);
		
		

	}

}
