package arraytopic;

public class Additionoftwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//max and min number in array
		int a[]= {50,30,56,68,25};
		int max =a[0];
		int min = a[0];
		for(int i =1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			
			}
        }
		System.out.println(max);
		
		
		for(int i =1; i<a.length;i++)
		{
			if(a[i]<min)
			{
				min =a[i];
			
			}
        }
		System.out.println(min);
	
	
	
	
	
	
	
	}

}
