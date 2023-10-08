package org.additionalProgram;

public class FibonaciiSeries2 {//0 1 1// 2 //3 5 8 13 21 34 55.....

	public static void main(String[] args) {
		int a=0,b=1,temp=0;
		System.out.print(a);
		System.out.print(" "+b+" ");
		
		for(int i=1;i<=10-2;i++) {//running the loop
			temp=a+b;//1//2//3
			System.out.print(temp+" ");//1
			a=b;//1//1
			b=temp;//1//2
		}

	}
}
	
/*
 * If interviewer ask to print first 10 digits of Fibonaci series then for loop
 * will run (10-2)times. because wehave already print the first two number (0 1
 * ) with syso statment.
 */
