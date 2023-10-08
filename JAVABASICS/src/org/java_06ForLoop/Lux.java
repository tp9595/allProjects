package org.java_06ForLoop;

public class Lux {

	public static void test (int n) {
		for(int i =1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");

			}
			for (int k=1;k<i;k++) {
				System.out.print("* ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("* ");
			}System.out.println();
		}
	}



	public static void main(String[] args) {
		Lux obj = new Lux();
		obj.test(5);

	}
}