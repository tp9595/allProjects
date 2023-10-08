package org.java_15Inheritance;
//The technique of constructing a new class by using an existing class functionality 
//is called inheritance.
public class Inheritance {
	
	int a=29;
	public  void  Inheritance() {
		System.out.println("Parent");
	}
	public  void Inmethod2 (int a, int b) {
		System.out.println(a+b);
	}
}
class sunny extends Inheritance{	
	int x= 59;
	public static void main(String[] args) {
		sunny obj = new sunny();
		obj.Inmethod2(10,20);
		System.out.println(obj.a);
		obj.x=98;
		obj.Inheritance();
		System.out.println(obj.x);//98
		obj.a=89;
		System.out.println(obj.a);//89
		obj.Chmethod();
		
		}
	
	public void Chmethod() {
		System.out.println("child");
	}

}
//In inheritance we can call parent data using object of child class.