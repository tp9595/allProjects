package org.additionalProgram;


public class TestClass {

	public static void main(String[] args) {
		
	int a=153;
	int arm =0;
	int temp = a;
	
	while(a>0)
	{
		  int rev =a%10; //3
		 
		 arm = arm+rev*rev*rev;//0+27
		 a=a/10;
		 
		 
	}
	if(temp==arm)
	{
		System.out.println("armstrong number");
	}else
	{
		System.out.println("not armstrong number");
	}

	}

}
