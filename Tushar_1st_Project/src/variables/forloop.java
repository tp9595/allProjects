package variables;

public class forloop 
{
	
    void printnumber()
    {
	int n =5;
    	for(int i = 1; i<=n; i++ )
    	 {
    		for(int k = 1; k<=i; k++)
    		{	
    			System.out.print("*");
    		}
    		
//    		for(int k = 1; k<i; k++)
//    		{	
//    			System.out.print("*");
//    		}
//    		
//    		for(int k = 1; k<=i; k++)
//    		{	
//    			System.out.print("*");
//    		}
  		System.out.println();
    	 }
   
			/*
			 * for(int k =i; k<=3; k++ ) { System.out.print("*"); } System.out.println();
			 */
    	//}
    	
    		 
    }
    
    public static   void main(String[] args) {
	forloop obj = new forloop();
	obj.printnumber();
	
    }  
    public static   void main(int[] args) {
    	forloop obj = new forloop();
    	obj.printnumber();
    	
        }  
}
