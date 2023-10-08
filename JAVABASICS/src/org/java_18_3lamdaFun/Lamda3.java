package org.java_18_3lamdaFun;

interface interf5{//Functioanl Interface conatins only one abstrct method
	public int addition(int a,int b);////abstract method
}


public class Lamda3 {

	public static void main(String[] args) {
	// Here no need to use new keyword while creating objet
	//No need to define whole signature of abs method here only by parameter part body get define.
	//Need to implement abstract method as we do in annanymous fun.	
	//interf obj =( a, b)->{System.out.println(a+b);return a+b;}	;
		interf5 obj= (a, b)->{
			System.out.println(a+b);
			return a+b;};
			obj.addition(10,30);
			System.out.println(obj.addition(10, 50));
			
		}

	}


