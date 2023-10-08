package org.additionalProgram;

public class FibonaciiSeries {//0 1 1// 2 3 5 8 13 21 34 55.....
                              //a b temp
  	public static void main(String[] args) {
		int a=0,b=1,temp=1;
		System.out.print(a);//0
		System.out.print(" "+b+" ");//1
		
		while(temp<50) {//0//1//2//3//5//8//13//21//34//55--->Condition fail
			//temp=a+b;//1//2//3//5//8//13//21//34//55
			System.out.print(temp+" "); 
//0 1 1//0 1 1 2 //0 1 1 2 3//0 1 1 2 3 5//0 1 1 2 3 5 8//0 1 1 2 3 5 8 13
//0 1 1 2 3 5 8 13 21//0 1 1 2 3 5 8 13 21 34//	0 1 1 2 3 5 8 13 21 34 55	
			a=b;//1//1//2//3//5//8//13//21//
			b=temp;//1//2//3//5//8//13//21//34//55
			temp=a+b;//55
			System.out.print(temp+" "); 
		}

	}
}// When interviewer ask to print fibonacci series upto 50 or 100 then 
//we will use while loop.
	



