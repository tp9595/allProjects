package org.java_14encapasulation;


// class Dummy{
//	
//	 int a =10;
//	 public void test() {
//		System.out.println("Rohit");
//	}
//}
//
////public class Encap {
//
//	public static void main(String[] args) {
//		Dummy obj =new Dummy();
//		System.out.println(obj.a);
//		obj.test();
//		}
//}//It Gives proper O/P.
//But when we mark the data from that class as private we can not accees this data in another class

//class Dummy1{
//	
//	 private int a =10;
//	 private  void test() {
//		System.out.println("Rohit");
//	}
//}
//
//public class Encap {
//
//	public static void main(String[] args) {
//		Dummy1 obj =new Dummy1();
//		System.out.println(obj.a);
//		obj.test();
//		}
//}// It gives error because of we can not access private data of another class.
//Therefore to to access the private data of class we will create public method
//in same class and will access that private data in that public method
//and this public method will  accessible by another class.

class Dummy{
	
	  private int a =10;//non static 
	  private void test() {//non static
		System.out.println("Rohit");
	}
	 public void test2() {//Public method to access private data of same class.
		System.out.println(a); 
		test();
	 }
}

public class Encap {

	public static void main(String[] args) {
		
		Dummy obj =new Dummy();
		//System.out.println(obj.a);//error
		//obj.test();//error
		obj.test2();
		}
}

