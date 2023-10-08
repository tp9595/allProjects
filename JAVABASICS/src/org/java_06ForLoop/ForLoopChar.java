package org.java_06ForLoop;

public class ForLoopChar {
	
	public void test2(char initch, char lastchr) {
		for (;initch<=lastchr;initch++)//
		{
		System.out.println(initch+"="+(int)(initch));//
		}
	}

	public static void main(String[] args) {// MAIN METHOD 
		ForLoopChar obj =new ForLoopChar ();
		obj.test2('A','Z');
		obj.test2('a','z');
		

	}

}
