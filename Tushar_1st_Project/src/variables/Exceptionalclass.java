package variables;

public class Exceptionalclass {
	  
	void ArithmeticException()
	{
		try
		{
			int i =10;
			int k = 1/0;
		   System.out.println(k);  	
		}
		catch(ArithmeticException e) 
		{
			System.out.println("exception is catched");
		}
		
	}
	
	void testnull()  //null pont exception
	{
		try
		{
			String s = "tushar";
			System.out.println(s.length());	
		}
		catch(ArithmeticException e) 
		{
			System.out.println("exception is null");
		}
		
		
	}
	
	void testIndexOutOfBoundsException()  
	{
		try
		{
			String s = "hello";
			System.out.println(s.charAt(10));	
		}
		catch(Exception e) 
		{
			System.out.println("exception is generic");
		}
		
		
		  
		 
	}
	
	public static void main(String[] args) {
		Exceptionalclass  obj = new Exceptionalclass ();
		obj.ArithmeticException();
		obj.testnull();
//		obj.testIndexOutOfBoundsException();
		
		
	}

}
