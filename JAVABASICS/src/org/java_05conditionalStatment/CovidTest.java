package org.java_05conditionalStatment;

public class CovidTest {
	
	public void antigentest(int no_of_line_on_stip) {
		if (no_of_line_on_stip==1) {
			System.out.println("You are safe");

		}else if(no_of_line_on_stip==2) {
			System.out.println("You are positive");
		}else if(no_of_line_on_stip==3) {
			System.out.println("You are Critical");
			}		
		else {
			System.out.println("Plz Retest");
		}
		
	}

	public static void main(String[] args) {
		CovidTest obj = new CovidTest();
		obj.antigentest(1);
		obj.antigentest(2);
		obj.antigentest(3);
		obj.antigentest(0);
		obj.antigentest(-1);
		
	}

}
