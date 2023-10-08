package org.java_03methodEx;

public   class ReturnTypeEX2 {
	
	public char test1() {
		return'a';
	
	}
	public boolean test2() {
		return true;
		
	}
	
	public int  addition(int a,int b) {
		System.out.println(a+b);
		return 5565;
	}
	
	public void  add(int a,int b) {
		System.out.println("add"+(a+b));
	}
	public static void main(String[] args) {//main method
		System.out.println("Program Start");
		ReturnTypeEX2 obj = new ReturnTypeEX2();
		// We can call method with the help of sysout statment
		//If and only if when method is not returning expect than void.
		System.out.println("Ch="+obj.test1());
		System.out.println("Flag="+obj.test2());
		System.out.println("add="+obj.addition(20,30));
		//System.out.println("add="+obj.add(12, 19));//if we use void as data type then we can not  use sysout statment to call that method.
//		char ch=obj.test1();
//		boolean flag = obj.test2();
//		System.out.println("Char="+ch);
//		System.out.println("flag="+flag);
//		
//		
	obj.addition(10,30);
//		int nana = obj.addition(90, 30);
		
		//
		System.out.println("nana");
		
		
		System.out.println("Program End");
	

	}

}
