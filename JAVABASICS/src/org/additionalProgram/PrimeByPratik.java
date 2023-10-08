package org.additionalProgram;

public class PrimeByPratik {

	public static void prime(int num) {
		
		int count=0 ;
		if(num>1) {
			for (int i= 1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Number is prime");
			}else {
				System.out.println("Number is not prime");
			}
		}else
			{
			System.out.println("Bhai tuze prime ki condition pata  bhi he kya");
			}
		
	}
	
	public static void main(String[] args) {
		prime(15);
		prime(7);
		prime(1);
		prime(2);
		
	}
}
