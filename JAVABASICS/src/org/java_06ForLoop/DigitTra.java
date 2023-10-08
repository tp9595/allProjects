package org.java_06ForLoop;

public class DigitTra {

	public static void main(String[] args) {
		DigitTra.numeric1();
		DigitTra.numeric2();
		//		
	}


	public static void numeric1() {
		for(int i=1; i<=3;i++) {//How many line to be  print
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");

			}
			System.out.println();
		}
	}

	public static void numeric2() {
		for(int i=1; i<=3;i++) {
			for(int j=i;j<3;j++) {
				System.out.print("  ");	
			}
			int l=i;//1
			for(int k =1;k<=i;k++) {

				System.out.print(l-- +" ");

			}
			//l++;
			System.out.println();

		}
	}
}