package variables;

public class dowhileloop 
{
	
	void primenumber()
	{
		
		int i = 1;
		do
		{
			if(i%2==0)
			{
			System.out.println(i);
		
		    }
			i++;
			
		}while(i<=10);
	}
	
	void oddnumber()
	{
		int i = 1;
		while(i<=10)
		{
			if(i%2==1)
			{
			System.out.println(i);
		
		    }
			i++;
			
		}
		
		
	}

	void evennumber()
	{
	
	}

	public static void main(String[] args) {
	  dowhileloop obj = new dowhileloop();
			  obj.oddnumber();
	 
	  
}	

}
