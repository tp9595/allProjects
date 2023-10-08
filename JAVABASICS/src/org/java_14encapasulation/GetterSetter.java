package org.java_14encapasulation;

class Getset{
	
	private  int a ,b;
	private static int rohit(int a) {
		return 50;
	}
	public int getA() {
		return b;
	}
	
	public int getB() {
		return b;
	}
	public void setA() {
		a=55;
	}
	public void setB() {
		b=89;
		
		
	}

}



public class GetterSetter {

	public static void main(String[] args) {
		
		Getset obj =new Getset();
		System.out.println(obj.getA());//0
		System.out.println(obj.getB());//0
		obj.setA();//55
		obj.setB();//89
		System.out.println(obj.getA());//55
		System.out.println(obj.getB());//89
		Getset obj1 =new Getset();
		System.out.println(obj1.getA());//0
		
		
		System.out.println(obj1.getB());//0
	}// Multiple Copies 

}
