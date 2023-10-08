package org.java_04staticnonstaticPragram;

public class Thiskeyword {
	int a=10;

	public static void main(String[] args) {
		System.out.println("**Program Start**");
		
		Thiskeyword obj = new Thiskeyword();
		System.out.println("obj="+obj.a);//10
		obj.a=900;
		System.out.println("obj="+obj.a);//900
		obj.test1();//10
		System.out.println("**Program End**");
	}

	public void test1() {//non static 
		//we can call directly by name,by object & by this keyword
		
		  Thiskeyword obj1 = new Thiskeyword();
		  
		  System.out.println("obj1="+obj1.a);//900
		  
		System.out.println("this="+this.a);
		System.out.println("a="+a);
		//updated value of A will get printed.(i.e.900)
		//reason-this keyword will point out to the class which is currently being use. 
	
	}
}
