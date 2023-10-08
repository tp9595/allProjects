package org.additionalProgram;

public class ReverseNumber {
	
	public static void reverse(int a) {
		int rev=0;
		int temp=a;//150
		while(a>0) {//150,15,1
			int rem = a%10;//0,5,1
			rev=rev*10+rem;//0//5//51
			a=a/10;//15,1,0
			
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("Given No. is Palindrome");
		}else {
			System.out.println("Given No. is Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		ReverseNumber.reverse(895632);
		System.out.println("**************************");
		ReverseNumber.reverse(10509);
		System.out.println("**************************");
		ReverseNumber.reverse(10002);
		System.out.println("**************************");
		ReverseNumber.reverse(10000);
		System.out.println("**************************");
		ReverseNumber.reverse(123321);
		System.out.println("**************************");
		ReverseNumber.reverse(150);
		

	}
	
//	public void reverse(int num ) {
//		int rev=0;
//		while(num>0) {
//			rev = rev*10+num%10;
//			num=num/10;
//		}
//	}

}
