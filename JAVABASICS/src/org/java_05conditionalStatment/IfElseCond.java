package org.java_05conditionalStatment;

// Odd Even program Using parameter 
public class IfElseCond {
	
public void oddeven(float a) {
	if (a%2==0) {//13%2 remainder ==1 //13/2==6 quotient         
		System.out.println("Given No. is Even");
	}else {
		System.out.println("Given No. is Odd");
		}
}
public static void main (String[] args) {
	System.out.println("Program Start");
	IfElseCond obj = new IfElseCond();
	obj.oddeven(12f);
	obj.oddeven(13f);
	obj.oddeven(-12f);
	obj.oddeven(-19f);
	System.out.println("Program End");
}
}
