package org.java_06ForLoop;

public class Differentlogic {
	
	public static void multi2(int n) {
		for(int i=1, p= 2;i<=n;i++,p+=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Differentlogic.multi2(10);
	}

}
