package Stringprogramprac;

public class Occuranceofletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tushar padalkar tushar";
		int count = 0;
		//String s2[]=s.split(" ");
		//s1=s.replace( "a", "@");
		//String s1="";
		//s1=s.replace( "a", "@");
		//String s2[]=s.split(" ");
		//char[] ar=s.toCharArray();
		//System.out.println(s1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
			{
				s=s.replace( "a", "@");				//System.out.println(count);
				char letter=s.charAt(4);
				letter++;
			}
			
			
			
		//	s1=s.
                
		}
		//String s2[]=s.split(" ");
		//char ar=s.toCharArray();
	
		System.out.println("number of occrancr of a :" + s);

	}
}
