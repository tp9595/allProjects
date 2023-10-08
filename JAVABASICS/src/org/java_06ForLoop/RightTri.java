package org.java_06ForLoop;

public class RightTri {
	public static void main (String[] args) {
		for(int i =1; i<=5;i++) {//no. of rows
			for(int j=i;j<5;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


