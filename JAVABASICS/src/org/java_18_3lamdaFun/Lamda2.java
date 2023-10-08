package org.java_18_3lamdaFun;

interface interf4{//Functioanl Interface conatins only one abstrct method
	int a=10;//by default final
	public int addition(int a,int b);////abstract method
}


public class Lamda2 {

	public static void main(String[] args) {
	// Here no need to use new keyword while creating objet
	//No need to define whole signature of abs method here only by parameter part body get define.
	//Need to implement abstract method as we do in annanymous fun.	
	//interf obj =(int a,int b)->{System.out.println(a+b);return a+b;}	
		interf4 obj = (int a,int b)->{
			System.out.println(a+b);
			return a+b;};
			obj.addition(10,30);
			System.out.println(obj.addition(10, 50));
			System.out.println(obj.a);
		}

	}


