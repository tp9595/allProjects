package Stringprogramprac;

import java.util.HashMap;
import java.util.Map;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calculate number each number of character in string
		String str = "tussshar";
		Map<Character,Integer> charmap = new HashMap<Character,Integer>(); 
		
		char strArray[] =str.toCharArray();
		
		for (char c : strArray)
		{
			if (charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}else
			{
				charmap.put(c, 1);
			}
			
		}
		System.out.println("name " +charmap);
		
		
	}

}
