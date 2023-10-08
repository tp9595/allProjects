package Stringprogramprac;

import java.util.Scanner;

public class Reversestringpalindromeand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner fg = new Scanner(System.in);
     System.out.println("enter a number");
     int num = fg.nextInt();
     int org= num;
     
     int rev =0;
     while(num!=0)
     {
    	 rev=rev*10+num%10;
    			 num=num/10;
     }
     
     if(org==rev)
     {
    	 System.out.println(org+"number is palindrome");
     }else
     {
    	 System.out.println(org+"number is not palindrome");
     }
    	//System.out.println(rev);	 
	}

}
