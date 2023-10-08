package programpractice;

import java.util.Scanner;

public class Reverseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {5,3,4,7};
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter a number ");
		//int num = sc.nextInt();
		int num =12345;
		int org =num;
		// usnig alogorithem
		//
		int rev =0;
		while(num>0)
		{
			//if you divide any number by 10 then you will get the reminder as last number
			//in divicision you get the last neumber will be removed.
			rev =rev*10+num%10;  // 1234 4321
			num = num/10;
		}
		
		System.out.println(rev);
	// using string buffer class we can directly get the reverse number

	StringBuffer sb = new StringBuffer(String.valueOf(num));
	sb.reverse();
	
	if(org==rev)
	{
		System.out.println("given string is palindrome");
	}
	else
	{
		System.out.println("given string is not palindrome");
	}
	
	
	
	//stringbuilder class
//	StringBuilder df = new StringBuilder();
//	df.append(num);
//	StringBuilder rev = df.reverse();2
	
	
	
	
	
		System.out.println("reverse number ;" +rev);
	}

}
