package programpractice;

import java.util.Scanner;

public class Countoccuranceofcharacter {
//count the charter in string
	public static void main (String[] ard ) 
	{
		
		String s = "java programming java oops";
		int totalcount =s.length();
		System.out.println("total number of charter in string ="+ totalcount );
		int totalcountwithoutr =s.replace("a", "").length(); //total length after removing a
		int count = totalcount -totalcountwithoutr;
		System.out.println(count);
	}
		//count the words 
//		System.out.println("enter the string");
//		Scanner sc = new Scanner(System.in);
//		String srr= sc.nextLine();
//		int count =1;
//		for (int i =0; i<srr.length()-1;i++)
//		{
//		  if((srr.charAt(i)==' ') && (srr.charAt(i+1)!=' '))
//		  {
//			  count++;
//		  }
//		
//		
//		}
//	System.out.println(count);
//	
//	}	
}
