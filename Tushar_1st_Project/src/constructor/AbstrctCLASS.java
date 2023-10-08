package constructor;

public abstract class AbstrctCLASS {
	
		public AbstrctCLASS () {//Default constructor
			System.out.println("Default");
		}
		abstract int addition (int a ,int b);//abstract class
		abstract int substraction (int a ,int b);//abstract class
	}

 class Annonymous {
		

		public static void main(String[] args) {
			//Abs4 obj =new Abs4();// Show Error can not create objetc of abstract class 
	// but by using annonymous function we can create object oc abstrct class
			AbstrctCLASS obj1 =new AbstrctCLASS() {
				 int addition (int a ,int b) {
					 System.out.println(a+b);
					 return a;
				 }	
				 int substraction (int a ,int b) {
					 System.out.println(a-b);
					 return b;
				 }
				
			};
			obj1.substraction(98, 65);
			obj1.addition(96, 65);
			//obj1.Multiplication(10,20);
			//sunny obj2=new sunny();//Show Error can not create objetc of abstract class
			sunny obj2=new sunny() {};//Here no need to implement method (Methods are already completed)
			obj2.Div(89,56);
			obj2.multi(78,96);
		}

	}
	abstract class sunny {
		public void multi(int a , int b) {
			System.out.println(a*b);
		}
		public void Div(int a , int b) {
			System.out.println(a/b);
		}
	}


	


