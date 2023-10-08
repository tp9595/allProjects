package org.java_06ForLoop;

public class ForloopCombineChar2 {
	
	public void Increment(char ch ,char ch1) {
		for(;ch<=ch1;ch++) {         ///for incremental  
			System.out.println(ch);
		}
		
			
		}
	public void Decrement(char ch ,char ch1) {
		for(;ch>=ch1;ch--) {         ///for incremental  
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		ForloopCombineChar2 obj =new ForloopCombineChar2();
		obj.Increment('A','Z');
		System.out.println("********");
		obj.Increment('a','z');
		System.out.println("********");
		
		
		obj.Decrement('Z','A');
		System.out.println("********");
		obj.Decrement('z','a');
		System.out.println("********");
		
		
		}
	}
