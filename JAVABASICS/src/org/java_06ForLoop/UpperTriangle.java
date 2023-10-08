package org.java_06ForLoop;

public class UpperTriangle {
	
	public static void triangle(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	public static void triangle2(int n) {
		for(int i=1;i<=n;i++) { 
			for(int j=i;j<=n;j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}
		
	
	}
	

	public static void main(String[] args) {
		UpperTriangle.triangle(10);
		UpperTriangle.triangle2(10);
	}
	}


