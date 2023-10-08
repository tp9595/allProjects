package org.java_09string;


import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		//StringBuilder sb = new StringBuilder();

		for(int i = str.length() - 1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}

		//System.out.println("Reversed string is:");
		//System.out.println(sb.toString());
	}
}
