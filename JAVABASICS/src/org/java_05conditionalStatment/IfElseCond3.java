package org.java_05conditionalStatment;

// Marks Criteria  if else ladder
//Marks<40-->Fail
//40<Marks<50-->Pass
//50<Marks<60-->Second Class
//60<Marks<80-->First Class
//80<Marks<100-->distinction
//0>Marks>100 --> Invalid
//marks =89
public class IfElseCond3 {

	public void ifelseladder(float marks) {
		if(marks>0 && marks<40 ) {//Need Both condition True
			System.out.println("Fail");
		}else if (marks>=40 && marks<50) {
			System.out.println("Pass");
		}else if (marks>=50 && marks<60) {//55
			System.out.println("Second Class");
		}else if (marks>=60 && marks<80) {
			System.out.println("First Class");	
		}else if (marks>=80 && marks<100) {
			System.out.println("Distinction");
		}else {
			System.out.println("Invalid Input");
		}
		
		}
	public static void main (String[] args) {
		System.out.println("Program Start");
		IfElseCond3 obj = new IfElseCond3();
		obj.ifelseladder(38f);//fail
		obj.ifelseladder(55f);//second class
		obj.ifelseladder(89f);//Distinction
		obj.ifelseladder(75f);//First Class
		obj.ifelseladder(60f);//First Class
		obj.ifelseladder(-60f);//Invalid Input
		obj.ifelseladder(160f);//Invalid Input
		System.out.println("Program End");
	}
}
