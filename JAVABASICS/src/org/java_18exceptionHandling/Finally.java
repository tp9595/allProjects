package org.java_18exceptionHandling;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		try {
			System.out.println("Try 1.1");
			//Scanner scn =new Scanner(System.in);
			System.out.println("Enter Value Of a ");
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.println(a);
			System.out.println(b);
			System.out.println("Try 1.2");
			//scn.close();//We can not write here if exceptions occurs before this line it will not reach till this line
			}catch(Exception e) {
			System.out.println("Catch 1");
			e.printStackTrace();
			System.out.println("Catch 1");
			//scn.close()//We can not write here if exceptions not occurs then catch block not get executed.  
		}finally {
			System.out.println("Finally Executed");
			scn.close();
		}//Finally block is use to execute imp statement such as closing connection,stream etc.
		//Finally block always execute whether exception occurs or not (Handled or not)

	}

}
