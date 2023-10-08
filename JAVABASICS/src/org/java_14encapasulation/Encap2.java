package org.java_14encapasulation;
 
 class EncapS {

	
	private int a = 98;
	private void test() {
		System.out.println("Encap Start");
	}
	public void result() {
		System.out.println("Result");
		System.out.println(a);
		test();
		
	}

	
 }
public class Encap2{
	public static void main(String[] args) {
		EncapS obj = new EncapS();
		//obj.test();//error private can not call outside class
		//System.out.println(a);//error private can not call outside class
		obj.result();
	
	}

}
