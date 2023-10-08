package org.java_22threading;

//public class Theading2 extends Thread implements Runnable {
//Java not support multiple inheritance
	public class Theading2 implements Runnable{
	static Thread td1 ;
	public static void main(String[] args) {
		System.out.println("Program Start ");
		Theading2 td=new Theading2();
		td1 =new Thread(td);//Object of Inbuilt java class created. 
		td1.start();
		if(td1.currentThread().getName().contains("main")){
		for(int i = 1;i<=10;i++) {
			System.out.println("i"+td1.currentThread().getName() +" "+i);
			System.out.println("Main Method Thread = "+td1.currentThread().getName());
		}}
		
		System.out.println("Program ends");
		
	}
	public  void run() {
		System.out.println("Method Strat");
		for(int k = 1;k<=10;k++) {
			System.out.println("k ="+k);
		}
		System.out.println("Method ends");
		System.out.println("Run Method Thread = "+td1.currentThread().getName());
	}

}
