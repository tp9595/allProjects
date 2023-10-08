package programpractice;

public class checknumberisprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//prime number 
	//	natural number>1
	//	which has only 2 factors 1 and itself
		//example =2,3,5,7
		//1 is not a prime number
		int num =8;
		int count =0;
		if(num>1)
		{
			
			for(int i=1; i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
				
			}
			if(count ==2)
			{
				System.out.println("prime number");
			}else
			{
				System.out.println("not a prime number");
			}
			
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
