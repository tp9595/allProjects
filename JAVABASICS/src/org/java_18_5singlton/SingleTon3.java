package org.java_18_5singlton;
//Singleton class :- after converting class into singleton then it will allocates memory at once only.  
public class SingleTon3 {
	int a= 10;
	 SingleTon3 obj;//by default value of any class object is null
	private SingleTon3() {//Public 
		
	}
	public static  void GetConstruct() {//use to return object of 
	//if
		SingleTon3	obj =new SingleTon3();
		
		//return obj;
	}//to retun object we need to change return type void->class name
	
}

	class check3{
	public static void main(String[] args) {
		// Able to call constructor when constructor is public therefore turn it into private
		
		//SingleTon obj =new SingleTon();// Able to call constructor when 
		//now we are able to create obj of singleton method.
		SingleTon3 obj1 = SingleTon3();//New Object //Method call by class name
		//here we are not creating object to call method, here we are calling method by class name which return object of private constructor.
		System.out.println(obj1.a);//10
		obj1.a=500;
		System.out.println(obj1.a);//500
		SingleTon3 obj2 = SingleTon3.GetConstruct();
		System.out.println(obj2.a);//500
		obj2.a=900;
		System.out.println(obj2.a);//900
		// so here new memory getting created when we create new object.
		//Till Singleton is not achieved 

	}


}