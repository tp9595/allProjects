package programpractice;

public class Evenandaddfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {5,2,3,6,8,2,12};
    //String  rev ="";
//	System.out.println(a);
	
	System.out.println(a.length);
	System.out.println("even number in array");
	for(int i= 0;i<a.length; i++)
	{
	  if(a[i]%2==0)
	  System.out.println(a[i]);

}
	System.out.println(a);
	System.out.println("odd number in array");
	for(int i= 0;i<a.length; i++)
	{
	  if(a[i]%2==1)
	  System.out.println(a[i]);

     }
	
	for (int val: a)
	{
		if(val%2==1)
				System.out.println(val);				
	}
	
	
	}}
