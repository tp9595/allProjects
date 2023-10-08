package org.java_06ForLoop;

public class DigitTra2 {
	
	public static void main(String[] args) {
		DigitTra2.numeric1();
		DigitTra2.numeric2();
		
	}


public static void numeric1() {
for(int i=1; i<=3;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		
	}
	System.out.println();
}
}

public static void numeric2() {
	for(int i=1; i<=3;i++) {
		for(int j=i;j<3;j++) {
			System.out.print("  ");
		}
		for(int k =1;k<=i;k++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
}