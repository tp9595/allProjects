package org.java_03methodEx;

public class ParameterEX1 {
	
	public void test1(char d ,boolean flag,double db){
		
		System.out.println("ch="+d);
		System.out.println("boolean="+flag);
		System.out.println("double="+db);
	}
	public void test2(float f, double d,char c,boolean flag) {
		System.out.println("test 2");
	}
	public static void main(String[] args) {
		ParameterEX1 obj =new ParameterEX1();
		obj.test1('a', false, 25.9);
		obj.test1('b', true, 420);
		  //obj.test1('R', true);
		//obj.test2(0, 0, 0, false);//by default value
		obj.test2(22.3f, 88.98, 'r', false);
		
	}
	public void test3(short s, byte b) {
		
	}

}
