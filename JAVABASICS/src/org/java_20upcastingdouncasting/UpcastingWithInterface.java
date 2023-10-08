package org.java_20upcastingdouncasting;
//Assignment 
interface Interf{
	public void test1 ();
}
class BC implements Interf {
	public void test1 () {
		System.out.println("test1 BC Wali");
	}
	
	
	
}class MM extends BC implements Interf {
		public void test2() {
			System.out.println("test 2");
		}
	}


public class UpcastingWithInterface {
	
	
	public static void main(String[] args) {
		System.out.println("****************");
		MM obj = new MM();	
		
		obj.test2();
		obj.test1();
		//Upcasting
		BC bobj=(BC)obj;
		//bobj.test2();
		bobj.test1();
		Interf iobj=(Interf)obj;
		iobj.test1();
		
		//DownCasting
		BC bcobj=(BC)iobj;
		bcobj.test1();
		
		MM mmobj =(MM)iobj;
		mmobj.test1();
		mmobj.test2();
		

		
	}
}