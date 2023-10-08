package org.java_05conditionalStatment;

public class Phpaper {
	
	public static void test(int a) {
		if(a>0 && a<7) {
			System.out.println("Acidic");
		}else if(a==7) {
			System.out.println("Nutral");
		}else if(a>7 && a<=14) {
		System.out.println("Basic");
		}
	else {System.out.println("Invalid Input");
	
	}
	}


	public static void main(String[] args) {
		Phpaper.test(1);
		Phpaper.test(0);
		Phpaper.test(7);
		Phpaper.test(6);
		Phpaper.test(8);
		Phpaper.test(14);
		Phpaper.test(16);
		Phpaper.test(-80);
		

	}

}
