package org.java_16abstractt;

abstract class Abst{
	public abstract void test();
	public void test2() {
		System.out.println("concrete parent ");
	}
}

public class AbstrctPrac extends Abst{
	public  void test() {
	System.out.println("Abstrct Method Implement");
	}
	public void test2() {
		System.out.println("concrete child");
		super.test2();//
	}
public static void main(String[] args) {
	AbstrctPrac obj = new AbstrctPrac();
	obj.test();
	obj.test2();
	Abst obj1=new Abst(){
		public  void test() {
			System.out.println("rohit");
		}
	};
	obj1.test2();
	obj1.test();
	
	
	}

}
