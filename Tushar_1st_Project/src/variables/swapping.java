package variables;

public class swapping {

	void swapingmethod(int a, int b)
	{
		
		  //java program using third variable System.out.println("before swapping");
		  System.out.println( a); 
		  System.out.println(b); 
		  int temp =a; 
		  a=b; 
		  b=temp;
		  System.out.println("after swapping");
		  System.out.println(a);
		  System.out.println(b);
		 
	//java program without using third variable
   System.out.println("after swapping");
      a=a+b;
     b=a-b;
     a=a-b;
     System.out.println(a);
     System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapping obj = new swapping();
		obj.swapingmethod(10, 20);
	}

}
