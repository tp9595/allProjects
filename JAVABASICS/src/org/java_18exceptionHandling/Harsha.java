package org.java_18exceptionHandling;

class RohitException extends Exception{
	RohitException (String msg){
		System.out.println();
	}
}
 public class Harsha {
	public static void main(String[] args) {
		try {
			validateAge(30);
			validateAge(17);			
		}catch(RohitException r) {
			r.printStackTrace();
			//System.out.println(r);
		}		
	}
	public static void validateAge(int age) throws RohitException 
	{
		if(age<18) {
			throw new RohitException("You Can't Drink Alcohol");
		}else {
			System.out.println("You Can Enjoy");
		}
	}
}