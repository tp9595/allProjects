package org.java_03methodEx;

public class ReturnType {
	
	 public static void test() {
		 
		 
		 //return//hidden 
	 }
	
	//public void addition () {//return type should be any type of integer
		public int addition1 () {	
		int a=10, b=70;
		int sum=a+b;//
		//System.out.println("Sum="+sum);
		//return sum;//data type of return value should match with the return type 
		return  b;//Its only return value stored in that variable 
		
	}
		public int addition2 () {	
			int a=20, b=50;
			return a+b;//no need to create any extra variable to store sum 
		}
		public void addition3 (int a,int b) {// while calling we need to paasargument in sequential manner	
			System.out.println("Original wala "+(a+b));
			//return a+b;
		}
		
	

	public static void main(String[] args) {
		ReturnType Obj = new ReturnType();
		
		int Returncap = Obj.addition1();// Returncap variable created here to catch return value from addition1 method 
		System.out.println("Return Value ="+Returncap);
	    Obj.addition1();
		Obj.addition2();
		int Returncap2 = Obj.addition2();
		
		System.out.println("Return Value ="+Returncap2);
		//int sunny = Obj.addition3(98,78);
	//	System.out.println("Sunny ="+sunny);
	//	System.out.println(Obj.addition3(45,90));
		
		
		
		
		
		//System.out.println("Add"+Obj.a);// Can not call local variable 
					
	}

}
