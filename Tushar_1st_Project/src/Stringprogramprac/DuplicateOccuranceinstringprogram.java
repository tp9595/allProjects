package Stringprogramprac;

import java.util.HashMap;

public class DuplicateOccuranceinstringprogram {

	static void findduplicate(String str)
	
{
		int count =0;
		char [] chars=str.toCharArray();
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(chars[i]==chars[j]) {
					System.out.println(chars[j]);
					count++;
					
				}
			}
				
		}System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		HashMap<String, Integer> hm = new HashMap<>();
//		String[] s =str.split(" ");
//		for(String temp: s)
//		{
//			//System.out.println(temp);
//			//after hashmap apply
//			hm.put(temp, 1);
//			
//		}
//		System.out.println(hm);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findduplicate("i m m learing java");
		findduplicate("tuuushar");
	}

}
