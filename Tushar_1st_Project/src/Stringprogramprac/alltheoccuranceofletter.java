package Stringprogramprac;

public class alltheoccuranceofletter {
	
	void countallletter( String Char)
	{
		String s="java is programming language";
		int count =0;
		String str1[]=s.split("");
		for(int i=0; i<str1.length;i++)
		{
		  if(str1[i].equalsIgnoreCase(Char))
		  {
			  count++;
		  }
		}
		System.out.println("count the value of"+Char+count);
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alltheoccuranceofletter obj = new alltheoccuranceofletter ( );
		obj.countallletter("j");
	}

}
