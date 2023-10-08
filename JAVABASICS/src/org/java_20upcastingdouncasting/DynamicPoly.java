package org.java_20upcastingdouncasting;

class AA{
	public void test1 () {
		System.out.println("P1");
	}
}
class BB extends AA{
	public void test1 () {
		System.out.println("P2");
	}
}
class CC extends BB{
	public void test1 () {
		System.out.println("P3");
	}
}
public class DynamicPoly extends CC {
	public void test1 () {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		System.out.println("****************");
		DynamicPoly obj =new DynamicPoly();
		obj.test1();//Child Only 
		
		CC obj1=(CC)obj;
		obj.test1();//Child only
		
//HERE JAVA IS NOT ABLE TO DIFFERENTIATE BETWEEN METHODS NAME THERFORE CALLING  CHILD CLASS METHOD ONLY
// IF WE WANT TO CALL ANY SPECIFIC PARENT CLASS METHOD THEN WE NEED TO CREATE OBJECT OF THAT CLASS.		
		CC obj2 =new CC();
		obj2.test1();//P3
	}
}	