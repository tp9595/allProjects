package org.java_05conditionalStatment;

public class SwitchForMarks {
	
	public void Result(int marks) {
		switch(marks) 
		{
		case 1:
		case 2:
		case 3:	
			System.out.println("Fail");
		break;
		
		case 40-50 : System.out.println("Pass");
		}
	}
	
	

	public static void main(String[] args) {
		SwitchForMarks obj =new SwitchForMarks();
		obj.Result(3);



	}

}
