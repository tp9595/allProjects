package variables;

public class Constructor {
	int a ;
	protected Constructor() 
	{
		System.out.println("NO VOID KEYWORD");
		
     }
	
	 Constructor (int a)
	{
	
	System.out.println("void keyword");
	
	
	}
	
	

	public static void main(String[] args) {
		Constructor obj = new Constructor();
	//	Constructor objTWO = new Constructor();
		//Constructor objTHREE = new Constructor(10);
	System.out.println(obj.a);
	}
	

}
