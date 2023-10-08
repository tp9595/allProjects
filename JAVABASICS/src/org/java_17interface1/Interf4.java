package org.java_17interface1;

public interface Interf4 {
	
	public int add(int a,int b);
	public int sub(int a,int b);
	

}
 class Interf86 implements Interf4{
	 
	 public static void main(String[] args) {
		 Interf86 obj = new Interf86();
		 System.out.println(obj.add(56));
		 System.out.println(obj.sub(56, 85));
		 System.out.println(obj.div(10, 2,82));
		 System.out.println(obj.multi(10,85));
	}
	public int add(int a) {//For Understanding can we overload method or not. 
		return a;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int multi(int a,int b) {
		return a*b;
	}
	public int sub(int a,int b,int c) {
		return a-c;
	}
	public int div(int a,int b,int c) {
		return a/b;
	}
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}