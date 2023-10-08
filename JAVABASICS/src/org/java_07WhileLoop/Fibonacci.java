package org.java_07WhileLoop;

public class Fibonacci {//Entry Control Loop.
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int fibo = 1;
		//System.out.print(a);
		//System.out.print(" "+b+"");
		
		while(fibo<100) {//1
			//fibo=a+b;
			if(fibo>50) {
			System.out.print(" "+fibo);
			}
			a=b;//1
			b=fibo;//1
			fibo=a+b;//2
			
			
		}//0 1 1
		
		
	}
}
	


