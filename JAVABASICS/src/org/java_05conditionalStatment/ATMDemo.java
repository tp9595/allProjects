package org.java_05conditionalStatment;

public class ATMDemo {
	
	public void atmflow(int pin, float amt ) {
		
		
		if (pin==1234) {
			if(amt>100 ) {
				System.out.println("You can withdraw money");
			}else {
				System.out.println("Insufficint Fund");
			}
		}else {
			System.out.println("You Have Enter Invalid Pin");
		}
	}

	public static void main(String[] args) {
		ATMDemo obj = new ATMDemo();
		obj.atmflow(9856, 86.56f);
		obj.atmflow(1234, 86.56f);
		obj.atmflow(1234, 1100);
		
				

	}

}
