package org.java_04staticnonstaticPragram;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NonstatictoNonstatic {
int a =90; //Non static global variable
	public static void main(String[] args) {
		System.out.println("**Program start**");
		NonstatictoNonstatic obj =new NonstatictoNonstatic();
		obj.test1();
		System.out.println(obj.a=100);
		obj.test1();
		NonstatictoNonstatic obj2 =new NonstatictoNonstatic();
		System.out.println(obj2.a);
		obj2.a=96582;
		obj2.test1();
		System.out.println("**Program end**");
	}

	public void test1 () {//non static 
//		System.out.println("NS start");
//		//1.By direct name
//		System.out.println("a="+a);
//		test2();
//		
//		//2.By using object
//		NonstatictoNonstatic obj1 =new NonstatictoNonstatic();
//		System.out.println("a="+obj1.a);
//		obj1.test2();
		
		//3.By using this Keyword
		System.out.println("This="+this.a);
		//this.test2();
		System.out.println("NS end");
		
		
	}
//	public void test2() {//non static method 
//		System.out.println("sunny");
//		
//	}
}

