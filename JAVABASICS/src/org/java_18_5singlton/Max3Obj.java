package org.java_18_5singlton;
//Singleton class :- after converting class into singleton then it will allocates memory at once only.  
public class Max3Obj {
	int a= 10;
	static int count =1;
	private static Max3Obj obj;//by default value of any class object is null
	private Max3Obj() {//Public 
		
	}
	public static  Max3Obj GetConstruct() {//use to return object of 
		if(count<=3) {
		 obj =new Max3Obj();
		 count++;
		}
		return obj;
	}//to retun object we need to change return type void->class name
	
}

	class check2{
	public static void main(String[] args) {
		// Able to call constructor when constructor is public therefore turn it into private
		
		//SingleTon obj =new SingleTon();// Able to call constructor when 
		//now we are able to create obj of singleton method.
		Max3Obj obj1 = Max3Obj.GetConstruct();//New Object //Method call by class name
		//here we are not creating object to call method, here we are calling method by class name which return object of private constructor.
		System.out.println(obj1.a);//10
		obj1.a=500;
		System.out.println(obj1.a);//500
		Max3Obj obj2 = Max3Obj.GetConstruct();
		System.out.println(obj2.a);//10
		obj2.a=900;
		System.out.println(obj2.a);//900
		Max3Obj obj3 = Max3Obj.GetConstruct();
	
		System.out.println(obj3.a);//10
		obj3.a=300;
		System.out.println(obj3.a);//300
		
		Max3Obj obj4 = Max3Obj.GetConstruct();
		//obj4.GetConstruct();
		System.out.println(obj4.a);//It will return updated value of obj3
		
		
	}


}