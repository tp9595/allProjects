package programpractice;


public class countspecificcharcter {

	
	
//	
	public void lettercnt(String chara) {
		String str= "Tushatr jjj";
		String str2 = str.replace(" ", "");
		int lettercount=0;
		
		String str1[] =str2.split("");
		
		for(int i=0; i<str1.length; i++)
		{
		if(str1[i].equalsIgnoreCase(chara))
		{
			lettercount++;
		}
		
		}
		System.out.println(chara +"lettercount" +lettercount);
		
		
		
		
		
		
		
		
		
		
		
		
		//String str4 =str.toLowerCase();
		//System.out.println(str4);
//		int LetterCount=0;
//		String[] str1 =str.split("");
//		//System.out.println(str1);
//		//String temp;
//		for(int i= 0;i<str.length();i++) {
//			
//			if(str1[i].equalsIgnoreCase(chara))
//			{
//				LetterCount++;	//3
//			}
//		}
//		System.out.println(chara+ " Letter occurs "+LetterCount+" Times in given string");
	}
	public static void main(String[] args) {
	
		countspecificcharcter obj =new countspecificcharcter();
      	obj.lettercnt("t");//
		obj.lettercnt("u");//
		obj.lettercnt("s");
		obj.lettercnt("h");
		obj.lettercnt("r");
		obj.lettercnt("j");
	}}

