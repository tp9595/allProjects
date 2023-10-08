package variables;

public class pratice {
	
	
	public  static void test1(int a) //we can use only int and float
	{ 
	switch(a)
	{
	case 1: System.out.println("jan");
	  break;
	case 2: System.out.println("feb");
	  break;
	case 3: System.out.println("march");
	  break;
	case 4: System.out.println("april");
	  break;
	case 5: System.out.println("june");
	  break;
		
	}
	
	}
      public void test2(int a)
     {
    	  if (a>100 || a <0)
    	  {
    		  System.out.println("inavlid marks");
    	  }else if(a>=40){
    		  
    	  }
    		  
    	  {
    		  System.out.println("fail");
    		  
    	  }
     }  
	public void test3 (int b)
	
	{
	 if (b>100 || b<0) 
	 {
			 System.out.println("inavlid marks");
     }else if(b>=40|| b<50)
     {
    	 System.out.println("fail");
     }else if(b>=50|| b<60)
     {
    	 System.out.println("fail");
     }
    

     }
	
	
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1(12);
		//pratice();
		//pratice  obj = new pratice();
		//obj.test3(50);
	}

}
