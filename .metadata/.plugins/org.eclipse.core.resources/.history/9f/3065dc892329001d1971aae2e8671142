package org.java_18_5singlton;
//Singleton class :- after converting class into singleton then it will allocates memory at once only.  
public class SingleTon2 {
	int a= 10;
	static SingleTon2 obj;//by default value of any class object is null
	private SingleTon2() {//Public 

	}
	public static  SingleTon2 GetConstruct() {//use to return object of 
		if(obj==null) {
			obj =new SingleTon2();
		}
		return obj;
	}//to retun object we need to change return type void->class name

}

class check1{
	public static void main(String[] args) {
		// Able to call constructor when constructor is public therefore turn it into private

		//SingleTon obj =new SingleTon();// Able to call constructor when 
		//now we are able to create obj of singleton method.
		SingleTon2 obj1 = SingleTon2.GetConstruct();//New Object //Method call by class name
		//here we are not creating object to call method, here we are calling method by class name which return object of private constructor.
		System.out.println(obj1.a);//10
		obj1.a=500;
		System.out.println(obj1.a);//500
		SingleTon2 obj2 = SingleTon2.GetConstruct();
		System.out.println(obj2.a);//500
		obj2.a=900;
		System.out.println(obj2.a);//900
		// so here new memory getting created when we create new object.
		//Till Singleton is not achieved 

	}


}