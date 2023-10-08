package org.java_06ForLoop;

public class RightTraiangle {



	
	public static void triangle(int n) {
		for(int i=1;i<n;i++) {
			for(int j=i;j<n;j++) {//i=1,j=10//i=2 j=8-n times
				System.out.print("  ");
				}
			for(int k=1;k<=i;k++) {//i=1 //*=1
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {//1//2
			for(int j=1;j<i;j++) {//1
				System.out.print("  ");
			}
				
			for(int k=i;k<=n;k++) {//k=1;10,K=2
				System.out.print("* ");
				}
			System.out.println();
		}

		
	}
	

	public static void main(String[] args) {
		RightTraiangle.triangle(10);
		RightTraiangle.triangle(5);
		
	}

}