package org.java_09string;

public class CountLetter {

	public static void main(String[] args) {

		String str ="There is a garden and it is beautiful";
		for(char ch='A';ch<='z';ch++) {
		//for( i=0;i<arch.length;i++) {//ABCDEF......
			int count=0;
			for(int k=0;k<str.length();k++) {//T

				if(ch==str.charAt(k)) {		
					count++;	
				}	
			}
			if(count!=0) {
				System.out.println(ch+"is Repeted "+count+" times" );	
			}
		}

	}
}
