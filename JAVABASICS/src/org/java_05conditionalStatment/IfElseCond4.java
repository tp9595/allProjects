package org.java_05conditionalStatment;

// Marks Criteria  if else ladder
//Marks<40-->Fail
//40<Marks<50-->Pass
//50<Marks<60-->Second Class
//60<Marks<80-->First Class
//80<Marks<100-->distinction
//0>Marks>100 --> Invalid

public class IfElseCond4 {

	public void checkresult(float marks) {

		if (marks>100 || marks <0 ) {
			System.out.println("Invalid marks");
		} else if ( marks>=40) {
			if(marks>=50) {
				if (marks>=60) {
					if (marks >= 80 ) {
						System.out.println("Distinction");
					}else {
						System.out.println("First Class");
					}

				}else {
					System.out.println("Second class");
				}


			}else {
				System.out.println("Pass");
			}
		}else {
			System.out.println("Fail");
		}


	}
	public static void main (String[] args) {
		System.out.println("Program Start");
		IfElseCond4 obj = new IfElseCond4();
		obj.checkresult(38f);//fail
		obj.checkresult(55f);//second class
		obj.checkresult(89f);//Distinction
		obj.checkresult(75f);//First Class
		obj.checkresult(60f);//First Class
		obj.checkresult(-60f);//Invalid Marks
		obj.checkresult(160f);//
		System.out.println("Program End");
	}
}
