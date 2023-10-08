package org.java_09string;

public class LetterCount {
	public void lettercnt(String chaAra) {
		String str= "There is a garden and it is beautiful";
		int LetterCount=0;
		String[] str1 =str.split("");
		//System.out.println(str1);
		//String temp;
		for(int i= 0;i<str.length();i++) {
			
			if(str1[i].equalsIgnoreCase(chaAra))
			{
				LetterCount++;	//3
			}
		}System.out.println(chaAra+ " Letter occurs "+LetterCount+" Times in given string");
	}
	
	

//To count both cases use split method which store string in array.
//to count specific case letter use charAt method which stores Char in array
//equalsIgnoreCase limitation only useful for string type



	public static void main(String[] args) {
		LetterCount obj =new LetterCount();
		obj.lettercnt("t");//
		obj.lettercnt("T");//
		obj.lettercnt("e");
		obj.lettercnt("h");
		obj.lettercnt("x");
	}
		

	
}


