package org.java_06ForLoop;

public class Assignment {
	
	public static void tri(int n) {
		
		for(int i=1 ;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
				}
			for(int k=i;k<n;k++) {
				System.out.print("* ");
				}
			for(int k=i;k<=n;k++) {
				System.out.print("* ");
				}
			
			
			System.out.println();
			}
		for(int i=1 ;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
				}
			System.out.println();
			
		}
		
			
	}

	public static void main(String[] args) {
		Assignment.tri(5);
		System.out.println("********");
		Assignment.tri(10);
	}

}
