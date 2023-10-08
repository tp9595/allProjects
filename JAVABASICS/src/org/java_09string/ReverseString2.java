package org.java_09string;

public class ReverseString2 {
	
	public void Reverse(String str){
		String temp=str;
		String[] ar=str.split("");
		String Reverse ="";
		for(int i=str.length()-1;i>=0;i--) {
			//System.out.print(ar[i]);
			Reverse = Reverse + ar[i];
			
		}
//		System.out.println(Reverse);
//		System.out.println(temp);
		
		if(Reverse.equals(temp)) {
			System.out.println("string is palindrome");
		}else
		{
			System.out.println("string is not palindrome");	
		}
	}

	public static void main(String[] args) {
		ReverseString2 obj =new ReverseString2();
		obj.Reverse("Rohit is Good Boy");
		
		obj.Reverse("NAMAN DOD NAMAN");
		

	}

}
