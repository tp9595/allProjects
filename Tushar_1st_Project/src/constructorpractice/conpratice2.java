package constructorpractice;

public class conpratice2 {



 // extends Object //hidden. 
//	public conpratice2 () {
//		//super();//hidden
//		System.out.println("Default");
//		
//	}
//	public static void main(String[] args) {
//		C obj =new C();
//		
}

class A1{

	public A1 () {
		//super();//hidden

		System.out.println("Con A1");
	}
}
class BB extends A1{

	public BB () {
		//super();//hidden

		System.out.println("Con BB");
	}
}
class CC extends BB{
	public CC () {//zero 
		//super();//hidden

		System.out.println("Con CC");
	}

	
	}

//Object is super Class in Java		

