package org.additionalProgram;

public class FibonaciiSeries3 {//0 1 1 2 3 5 8 13 21 34 55.....
	//Print Fibonacii  of first 10 Numbers
	public static void main(String[] args) {
		 int a=0,b=1, temp=0;
		System.out.println(a+" ");
		System.out.println(b+" ");
		
		for(int i=1;i<=8;i++) {
			temp=a+b;
			System.out.println(temp+" ");
			a=b;
			b=temp;
		}

	}
}
	



