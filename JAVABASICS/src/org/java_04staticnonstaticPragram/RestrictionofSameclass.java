package org.java_04staticnonstaticPragram;

//We can not call static data from another class
class parent{
	static int a=10;
	public static void test1() {
		System.out.println("Diferrent Class");
	}
	
}

public class RestrictionofSameclass {

	public static void main(String[] args) {
		System.out.println("**Program Start**");
		//System.out.println("a="+a);// It will give  error
		parent obj = new parent();
		obj.test1();
		System.out.println("a="+obj.a);
		
		/*
		 * we will call it by using obj or class name,
		 *  but obj also gives the warning
		 * therefore we will use class name here to call static data
		 */ 
		
		System.out.println("a="+parent.a);
		parent.test1();
		System.out.println("**Program End**");
		
	}

}
