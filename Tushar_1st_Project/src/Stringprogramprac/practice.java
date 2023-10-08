package Stringprogramprac;

import java.util.HashMap;
import java.util.Map;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tushar";
		int count = 0;
		String str1[] = s.split("");
		Map<String, Integer> klk = new HashMap<String, Integer>();
		for (int i = 0; i < str1.length; i++)

		{
			count = 0;
			for (int j = 0; j < str1.length; j++) {
				if (str1[i].equals(str1[j])) {
					count++;
				}
				//klk.put(str1[i], count);
			}
			klk.put(str1[i], count);
		}
		System.out.println(klk);

	}

}
