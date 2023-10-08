package org.java_06ForLoop;

public class Diamond {
	
	public void daim(int n) { 
		for(int i=1;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
			}
			for (int l=1;l<=i;l++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=n;i++) {
			for(int j= 1;j<i;j++) {
				System.out.print("  ");
			}
			for (int k=i;k<n;k++) {
				System.out.print("* ");
			}
			for(int l=i;l<=n;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Diamond obj = new Diamond();
		obj.daim(10);

	}

}
