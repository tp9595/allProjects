package variables;

	public class Staticmethod
	{ 
	  public  static void m1()
	  { 
	     System.out.println("m1-AB"); 
	  } 
	} 
       class DF extends Staticmethod
	{ 
	  public static void m1()
	  { 
	     System.out.println("m1-ABC"); 
	  } 
	 } 
	 class TestABC 
	{ 
	  public static void main(String[] args) 
	  {
		  Staticmethod obj1 = new Staticmethod(); 
	     obj1.m1(); 
	     DF  obj2 = new DF (); 
	     obj2.m1(); 
	     Staticmethod obj3 = new DF (); 
	     obj3.m1(); 
	   } 
	}
	
	
	
	
	
	

	


