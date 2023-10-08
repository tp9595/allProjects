package org.java_20upcastingdouncasting;

class AAAA{
	public void test1 () {
		System.out.println("test1");
	}
}
class BBBB extends AAAA{
	public void test2 () {
		System.out.println("test2");
	}
}
class CCCC extends BBBB{
	public void test3 () {
		System.out.println("test3");
	}
}
public class Downcasting2  {
	
	
	public static void main(String[] args) {
		System.out.println("****************");
		AAAA obj =new CCCC();//Upcasting or referncing of child to parent for down casting
		obj.test1();
		//obj.test2();
		//obj.test3();
		
		BBBB obj1=(BBBB)obj;
		obj1.test1();
		obj1.test2();
		//obj1.test3();
		
		AAAA obj2 =new BBBB();//Upcasting or referncing of child to parent for down casting
		obj2.test1();			//but this not last child therefore it not downcast till last child			
		//obj.test2();
		//obj.test3();
		CCCC obj3 =(CCCC)(obj2);
//Exception in thread "main" java.lang.ClassCastException: class org.upcastingdouncasting.BBBB cannot be cast to class org.upcastingdouncasting.CCCC (org.upcastingdouncasting.BBBB and org.upcastingdouncasting.CCCC are in unnamed module of loader 'app')
//at org.upcastingdouncasting.Downcasting2.main(Downcasting2.java:37)
		obj3.test1();
		obj3.test2();
		obj3.test3();
		
	}
}