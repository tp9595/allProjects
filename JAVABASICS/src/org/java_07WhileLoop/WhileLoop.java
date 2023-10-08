package org.java_07WhileLoop;

public class WhileLoop {
	
	public static void wloop(int a) {//Exit control loop.
		while(a<=100) {
			//System.out.println(a);
			for(int i =1; i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		System.out.println(a);
			a++;
			}
	}
	
	public static void dowloop(int a) {
		do {
			System.out.println(a);//50
			a++;
		}while(a<=15);
	}

	public static void main(String[] args) {
		System.out.println(" While");
		WhileLoop.wloop(1);
		System.out.println("*******");
		System.out.println("Do While");
		WhileLoop.dowloop(50);//50
		WhileLoop.dowloop(12);//12 13 14 15 
		
		
	}

}
