package org.java_17interface1;

public interface Interf5 {
	
	public int add(int a,int b);
	public int sub(int a,int b);
	

}
 interface Interf6 extends Interf5  {
	
	public int Div(int a,int b);
	public int Multi(int a,int b);
	}
 class EX implements Interf6 {
	 public static void main(String[] args) {
		 EX obj =new EX();
		 System.out.println(obj.add(10, 20));
		 System.out.println(obj.sub(10, 20));
		 System.out.println(obj.Multi(10, 20));
		 System.out.println(obj.Div(10, 20));
	}

	
	public int add(int a, int b) {
		
		return a+b;
	}

	
	public int sub(int a, int b) {
		
		return a-b;
	}

	
	public int Div(int a, int b) {
		
		return a/b;
	}

	
	public int Multi(int a, int b) {
		
		return a*b;
	}
	 
	 
 }
	
