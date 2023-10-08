package orgstringpractice;

public class eveoddprogema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8};

int  s=a.length;
System.out.println(s);
for(int i =0;i<s;i++) {
	if(a[i]%2==1)
	{
		System.out.print("even" + a[i]+" ");
	}else
		System.out.print("odd" + a[i] +" ");
	}

}}
