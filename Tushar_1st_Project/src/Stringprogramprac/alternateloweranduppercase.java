package Stringprogramprac;

public class alternateloweranduppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "tushar";
		String pddd = "";

		int p = s.length();
		
		for (int i = 0; i <s.length(); i++) {
			if (i % 2 == 0) {   // 2
				pddd=pddd + Character.toUpperCase(s.charAt(i));
				
			} else {
				pddd=pddd + Character.toLowerCase(s.charAt(i));
			}
			
		}System.out.println(pddd);

	}
}
