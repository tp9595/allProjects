package org.java_09string;

public class StringAssignment {

	public static void main(String[] args) {
		String str ="a2b3d4e1";
		//o/p=aabbbdddde

		
		for(int i =0;i<str.length();i++) {
			//System.out.println(str.charAt(i));

			if(Character.isDigit(str.charAt(i))){//2
				//System.out.println(str.charAt(i));
				//System.out.println(str.charAt(i-1));
				//int a =Integer.parseInt(str.valueOf(str.charAt(i)));//2
				int ab= str.charAt(i)-'0';
				//System.out.println(a);
				for(int j =0;j<ab;j++) {//2
					System.out.print(str.charAt(i-1));

				}
			}
		}


	}
}

