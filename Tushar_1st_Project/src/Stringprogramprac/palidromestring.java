package Stringprogramprac;

import java.util.Scanner;

public class palidromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter you string");
	String str = sc.next();
	String org_str =str;
	String rev= "";
	int len = str.length();
	//System.out.println(str.length());
	for(int i= len-1; i>=0; i--) 
	{
		rev = rev +str.charAt(i);
	}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
		
		
		
	}

}
