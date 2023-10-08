package org.java_09string;

public class Vowels {

	public static void main(String[] args) {

		String str="There is garden and it Is Beautiful";
		String[] str1=str.split("");
		int vowels_count = 0;
		for (int i=0;i<str1.length;i++) {
			
			if(str1[i].equalsIgnoreCase("a")||str1[i].equalsIgnoreCase("e")||str1[i].equalsIgnoreCase("i")||str1[i].equalsIgnoreCase("o")||str1[i].equalsIgnoreCase("u"))

			{
				vowels_count++;//1
				System.out.println("In given String vowel "+str1[i]+" Present at index " +i);
			}		
		}
		System.out.println("Vowels Count in string = "+vowels_count);
	}
}