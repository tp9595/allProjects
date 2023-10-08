package org.java_12constructor;

public class tushar {

	tushar(float f) {
			//this(20);
			System.out.println("One");
		}
	tushar(int i) {
			this(null); 
			System.out.println("Two");	 
		}
	tushar(tushar test) {
			this(12.5f);
			System.out.println("Three");	  
		}
	
	public static void main(String[] args) {
		
		new tushar(20);
	}

}
