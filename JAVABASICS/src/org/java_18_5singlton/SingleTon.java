package org.java_18_5singlton;
//Singleton class :- after converting class into singleton then it will allocates memory at once only.  
public class SingleTon {
	int a= 10;
	private SingleTon() {//Public 
		
	}
	public static  SingleTon returcon() {//use to return object of 
		SingleTon obj =new SingleTon();
		return obj;
	}//to retun object we need to change return type void->class name
	
}
	class check{
	public static void main(String[] args) {
		// Able to call constructor when constructor is public therefore turn it into private	
		//SingleTon obj =new SingleTon();// Able to call constructor when 
		//now we are able to create obj of singleton method.
		SingleTon obj = SingleTon.returcon();//New Object //Method call by class name
		//here we are not creating object to call method, here we are calling method by class name which return object of private constructor.
		System.out.println(obj.a);//10
		obj.a=500;
		System.out.println(obj.a);//500
		SingleTon obj1 = SingleTon.returcon();
		System.out.println(obj1.a);//10
		obj1.a=900;
		System.out.println(obj1.a);//500
		// so here new memory is getting created when we create new object.
		

	}


}