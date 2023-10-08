package org.java_22threading;

public class Theading extends Thread {

	public static void main(String[] args) {
		System.out.println("Program Start");
		Theading td=new Theading();
		td.start();
		for(int i = 1;i<=10;i++) {
			System.out.println("i="+i);
		}
		
		System.out.println("Program ends");

	}
	public  void run() {
		System.out.println("Method Strat");
		for(int k = 1;k<=10;k++) {
			System.out.println("k ="+k);
		}
		System.out.println("Method ends");
	}

}
