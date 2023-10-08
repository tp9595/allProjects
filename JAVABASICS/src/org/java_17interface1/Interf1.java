package org.java_17interface1;

public interface Interf1 {
	int a=5;
	//public Interf() {//Interfaces do not  have constructors
	//}
	//public void concrete() {
		//can not define concrete method in interface till java 7
	//}Can Define static method  and default (Keyword)  method in java 8
	public void concrete();//Abstract method is only allowed
	public static void main(String[] args) {
		Interf1 obj =new Interf1 () {

			@Override
			public void concrete() {
				// TODO Auto-generated method stub
				System.out.println("anonymous class");
			}
			
			
		};
		obj.concrete();
	}
//	We can write main method in interface and  can execute with that method.
	//Main method should present in class only.
}

class Ruhu {
	//Interf obj = new Interf();// Can not create object of interface. 
}
//