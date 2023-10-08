package org.java_14encapasulation;

class Rohit{
	
	private int a ,b;
	private int encpMethod(int a) {
		
		return a;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	public void setA(int x) {
		a=x;
	}
	public void setB(int b) {
		b=b;
	}
	public int  setMethod() {
		return encpMethod(10);
	}

}



public class GetterSetter2 {

	public static void main(String[] args) {
		
		Rohit obj =new Rohit();
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		obj.setA(89);
		obj.setB(9636);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		Rohit obj1 =new Rohit();
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		obj1.setA(12);
		obj1.setB(23);
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		System.out.println(obj.setMethod());
	}// Multiple Copies created for another object i.e.obj1

}
