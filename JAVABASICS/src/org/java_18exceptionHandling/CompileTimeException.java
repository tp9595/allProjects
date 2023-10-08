package org.java_18exceptionHandling;

public class CompileTimeException {

	public static void main(String[]args) {
		System.out.println("Program Start");
		try {
			System.out.println("try 1.1");
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				if(i==5) {
					Thread.sleep(5000);//Unhandled exception type InterruptedException
				}
			}System.out.println("try 1.2");
		}catch(Exception e) {//Can write InterruptedException also here 
			System.out.println("catch 1.1");
			e.printStackTrace();
			System.out.println("catch 1.2");

		}

	}
}

