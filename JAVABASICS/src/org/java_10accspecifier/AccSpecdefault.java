package org.java_10accspecifier;


public class AccSpecdefault {//within class Default
	int a =10;
	 void test() {
		System.out.println("within Class Default");
		
	}

	
//	public static void main(String[] args) {
//		AccSpecdefault obj = new AccSpecdefault();
//		test();
//		System.out.println(obj.a);
//	}

}

class dcheck extends AccSpecdefault{
	public static void main(String[] args) {
		
	
	dcheck obj = new dcheck();
	System.out.println(obj.a);
	obj.test();
	
	}
}
