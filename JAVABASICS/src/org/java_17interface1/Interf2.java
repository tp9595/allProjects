package org.java_17interface1;

public interface Interf2 {
	
	public static void mtest() {
		System.out.println("hdsjda");
	}
	public int add(int a,int b);
	public int sub(int a,int b);
	

}
class Annonymous{
	public static void main(String[] args) {
		
	
	Interf2 obj = new Interf2() {//implement 
		public int add(int a,int b) {
		System.out.println(a+b);	
			return a+b;
		}
		public int sub(int a,int b) {//implement 
			return a-b;
		}
		
	};
	
	System.out.println(obj.add(10, 20));
	System.out.println(obj.sub(10, 20));
	}
	
}