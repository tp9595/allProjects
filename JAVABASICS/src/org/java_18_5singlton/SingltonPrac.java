package org.java_18_5singlton;


class Singlton{
	int a=10;
	static Singlton obj;//null
	
    private  Singlton() {
		}
	public static Singlton getInstance() {//return type =class name which returns object of that class
		if(obj==null) {
			Singlton obj = new Singlton();
		}
		return obj;
	}	
}
public class SingltonPrac {
	public static void main(String[] args) {
		//Singlton obj15 = new Singlton();//
		//System.out.println(obj15.a);
		Singlton obj1 = Singlton.getInstance();
		System.out.println(obj1.a);
		obj1.a=8956;
		System.out.println(obj1.a);
		Singlton obj2 = Singlton.getInstance();
		System.out.println(obj2.a);
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
