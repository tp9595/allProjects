package org.java_18exceptionHandling;

public class ErrorEX {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ErrorEX obj = new ErrorEX();
		obj.factorialMethod(5);
		
		
	}
	public void factorialMethod(int num) {
		int sum=1;
		for (int i = 0;i<num;i++ ) {//6/5/4/3/2/1/0
			sum=sum*(num-i);
			
			//System.out.println(sum);
			
			
		}
		
		System.out.println(sum);
	}

}//Stack Overflow 
