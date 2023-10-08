package org.java_06ForLoop;

public class ForloopCombineint {
	
	public void Increment(int a ,int b) {
		for(;a<=b;a++) {         ///for incremental  
			System.out.println(a);
		}
		
			
		}
	public void Decrement(int a ,int b) {
		for(;a>=b;a--) {         ///for incremental  
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		ForloopCombineint obj =new ForloopCombineint();
		obj.Increment(1,100);
//		System.out.println("********");
//		obj.Increment(1,100);
//		System.out.println("********");
//		obj.Increment(-50,60);
//		System.out.println("********");
//		obj.Decrement(-45,-97);
	System.out.println("********");
	obj.Decrement(100,1);
		System.out.println("********");
//		obj.Decrement(50,-60);
		
		}
	}
