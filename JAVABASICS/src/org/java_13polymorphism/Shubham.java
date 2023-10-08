package org.java_13polymorphism;

public class Shubham {
	public static void main(String[] args) {
		Shubham obj= new Shubham();
		
		obj.addition();//1 obj.addition(10,20);//2
		obj.addition(11.11f,50,(short)80);//3
		obj.addition((byte)10,22.44f,55.44d);//4    
		obj.addition('a',true,10);//5
		obj.addition(false,'g',80);//6
	}  //1 number of parameter
	public int addition() {

		System.out.println("addition()");  //1
		int a=10,b=20;
		return a+b;
	}
	public int addition(int a,int b) {
		System.out.println("addition(int a,int b)");  //2
		return a+b;


	}  //2 type of parameter
	public int addition(float a,long b, short s) {
		System.out.println("float,long, short");      //3
		return (int)( a+b+s);

	}public int addition(byte a, float b,double d) {
		System.out.println("byte,float,double");       //4
		return (int)(a+b+d);

	}// 3 position of  parameter
	public void addition(char ch, boolean b, int a) {  //5
		System.out.println("char,boolean,int");

	}
	public void addition(boolean b,char ch,int a) {//6
		System.out.println("boolean,char,int");
	}

}