package org.java_15Inheritance;


class parent {
	public parent() {
		this(true,'c');
		System.out.println("Parent Default Con");
	}
	public parent(int a) {
		this();
		System.out.println("Para Parent con");
		
	}
	public parent(boolean flag, char ch) {
		
		System.out.println("second Para Parent con");
	}
}
public class ThisSuperCombo extends parent {
	public ThisSuperCombo() {
		
		super(50);
		System.out.println("Child default Con");
	}
	public ThisSuperCombo(float f) {
		
		
		System.out.println("Para child  con");
		
	}
	public ThisSuperCombo(long l, double d,float f) {
		//super();hidden
		System.out.println("second Para child con");
	}
	

	public static void main(String[] args) {
		ThisSuperCombo obj =new ThisSuperCombo();//object call default construtor of child
//there is super(),statement is hidden therefore it call to the default of parent also.		
		
	}

}
