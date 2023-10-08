package org.java_06ForLoop;

public class Harsha {
	


	public static void main(String[] args) {
		Harsha.test(1,1);

	}
	public static void test(int a,int b) {
		for(;a<=3;a++) {
			System.out.println(a);
			b=1;
			for(;b<=3;b++) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(a+b);
			}
			//System.out.println(a);
			System.out.println(b);
			
			System.out.println();
		}
	}

}
