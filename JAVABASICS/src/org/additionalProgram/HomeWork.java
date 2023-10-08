package org.additionalProgram;

public class HomeWork {
	
	//1. Void with parameter 
	
	public void test1(int a,char b) {
		System.out.println("Sub="+(a-b));
		
		
	}

	public static void main(String[] args) {
		HomeWork obj = new HomeWork();
		obj.test1(95, 'a');// ASCII value of a=97// 99-97

	}

}
