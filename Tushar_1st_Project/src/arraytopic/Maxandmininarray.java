package arraytopic;

public class Maxandmininarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {58,20,56,5};
int max = a[0];
		
		for(int i = 1; i<a.length; i++)
		{
			if( a[i]> max)
			{
				max = a[i];
			}
		}
		
		System.out.println(max);
	}

}
