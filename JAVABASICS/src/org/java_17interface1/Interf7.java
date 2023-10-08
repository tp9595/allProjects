package org.java_17interface1;

public interface Interf7 {
	
	public int add(int a,int b);
	public int sub(int a,int b);
	

}
class inter_c{
	public void test() {
		System.out.println("Class");
	}
}
 interface Interf8 {// extends Interf6  {
	
	public int Div(int a,int b);
	public int Multi(int a,int b);
	}
 //class Exe implements Interf7, Interf8 extends inter{// We can not extends class after implementation
class Exe extends inter_c implements Interf7, Interf8 {	//First Extends and then implement
 public static void main(String[] args) {
		 Exe obj =new Exe();
		 System.out.println(obj.add(10, 20));
		 System.out.println(obj.sub(10, 20));
		 System.out.println(obj.Multi(10, 20));
		 System.out.println(obj.Div(10, 20));
		 obj.test();
	}

	
	public int add(int a, int b) {
		
		return a+b;
	}

	
	public int sub(int a, int b) {
		
		return a-b;
	}

	
	public int Div(int a, int b) {
		
		return a/b;
	}

	
	public int Multi(int a, int b) {
		
		return a*b;
	}
	 
	 
 }
	
