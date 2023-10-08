package org.java_05conditionalStatment;

public class SwitchStatment2 {
	
	public void test1(int a) {
switch(a)
	{
	case 1: System.out.println("Jan");
		break;
	case 2: System.out.println("Feb");
	  	break;	
	case 3: System.out.println("March");
		break;
	case 4: System.out.println("Apr");
		break;
	case 5: System.out.println("May");
		break;
	case 6: System.out.println("Jun");
		break;
	case 7: System.out.println("July");
		break;
	case 8: System.out.println("Aug");
		break;
	case 9: System.out.println("Sep");
		break;
	case 10: System.out.println("Oct");
		break;
	case 11: System.out.println("Nov");
		break;
	case 12: System.out.println("Dec");
		break;
	default : System.out.println("Zopet aahe ka");
	
	}
}
	public static void main(String[] args) {
		System.out.println("Program Start ");
		SwitchStatment2 obj = new SwitchStatment2();
		obj.test1(16);
		obj.test1(1);
		obj.test1(12);
		
		System.out.println("Program End");

	}

}
