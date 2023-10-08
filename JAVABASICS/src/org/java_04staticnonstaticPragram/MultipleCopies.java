package org.java_04staticnonstaticPragram;

//Multiple Copies 
// Every new objects point towards the initial value of non static variable.

public class MultipleCopies {
	int a=50  ;//non static global variable
	public static void main(String[] args) {//static method
		
		System.out.println("**Program start**");
		MultipleCopies obj1 = new MultipleCopies();//object
		//By using Object static to non static. 
		System.out.println(obj1);
		System.out.println("a="+obj1.a);//variable call by object 50
		obj1.test1();//method call by object 
		
		obj1.a=600;
		System.out.println("a="+obj1.a);//600
			MultipleCopies obj2 = new MultipleCopies();
			System.out.println("a="+obj2.a);//50
	    obj2.a=980;
	    System.out.println("a="+obj2.a);//980
	    
	
		
		System.out.println("**Program End**");
	}	


	public void test1 () { // Non Static Method
		System.out.println("Non Static");
		this.a=98;
		System.out.println(a);
		MultipleCopies obj2 = new  MultipleCopies();
		System.out.println(obj2.a);
		System.out.println(obj2);
		obj2.a=852;
		int a=26;
		System.out.println(obj2.a);//98
		System.out.println(obj2.a);
		
		
	}

}
