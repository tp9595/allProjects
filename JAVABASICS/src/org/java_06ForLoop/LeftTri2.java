package org.java_06ForLoop;

public class LeftTri2 {
	
	public void Triangle(int n) {
		for(int i=1;i<n;i++) {
			for(int j =i;j<=n;j++) {
				System.out.print("* ");
		}
		System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		LeftTri2 obj =new LeftTri2();
		obj.Triangle(10);
	}

}
