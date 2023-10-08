package org.java_18_3lamdaFun;

interface interf{//Functioanl Interface conatins only one abstrct method
	int a=100;//final is hidden
	public void addition(int a );////abstract method
	public void Subs(int a ,int b);
}


public class Lamda {
	int a=10;

	public static void main(String[] args) {
 
		
		interf obj = (int a)->{//applicable for functional interface only
			System.out.println("Hello");
			};
			obj.addition(11);
		System.out.println(obj.a=20);
		
			
			
			interf2 obj1 = (s) -> {
				return s.length();
			};	
			System.out.println("Length of Mumbai string ="+obj1.LengthOfStr("Mumbai"));
			
			interf obj15= new interf (){
				public void addition(int a ) {
					System.out.println();
				}
				public void Subs(int a ,int b) {
				System.out.println();
				}
					
				};
			}
			
	}

	

interface interf2{
	public int LengthOfStr(String str);
}
