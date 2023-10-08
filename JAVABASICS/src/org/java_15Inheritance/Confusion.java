package org.java_15Inheritance;

public class Confusion {
	int a =78;
	public static void harsha1() {//this.harsha1()
		System.out.println("Parent-Harsha");

	}
}

class MoreConfusion  extends Confusion  {
	int a=98;
	public void harsha() {//this.harsha()
		System.out.println("Zop Harsha ");
		//super.a;
	}
	public void child() {
		System.out.println("Child");
		this.harsha();
		this.harsha1();
		harsha1();
		super.harsha1();
		//super.harsha();
		//System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		MoreConfusion obj =new MoreConfusion();
		obj.child();
		

	}

}

