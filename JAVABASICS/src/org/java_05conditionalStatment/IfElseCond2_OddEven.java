package org.java_05conditionalStatment;

// Odd Even program Using parameter and OR OR Operator 
public class IfElseCond2_OddEven {
	
public void oddeven(float a) {
	if (a%2>0 || a%2<0) { //13/2  
		System.out.println("Given No. is Odd");
	}else {
		System.out.println("Given No. is Even");
		}
}
public static void main (String[] args) {
	System.out.println("Program Start");
	IfElseCond2_OddEven obj = new IfElseCond2_OddEven();
	obj.oddeven(-97f);
	obj.oddeven(28f);
	obj.oddeven(108f);
	
	System.out.println("Program End");
}
}
