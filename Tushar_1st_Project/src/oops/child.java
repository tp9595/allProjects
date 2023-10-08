package oops;

public class child extends parent
{
    void  methodchild ()
    {
    	System.out.println("child class method/same class");
    }
    
	public static void main(String[] args) 
	{
		//child class to child class 
		
		// TODO Auto-generated method stub
         child obj = new child();
         obj.finaldefaultmethod();
         
         
         // we can access child class method and parent class method except private
         
         parent obj1 = new child();
         obj.;
         
         //we can access only parent class method except private
        		 
		parent obj2 = new parent();
		//we can access only parent class method except private
		
	
		
		//invalid
		
		
		
	}

}
