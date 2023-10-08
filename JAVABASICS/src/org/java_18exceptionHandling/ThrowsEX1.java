package org.java_18exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class ThrowsEX1 {

	public static void main(String[] args) throws IOException    {
		System.out.println("Program Start ");
		ThrowsEX1 obj =new ThrowsEX1();
		obj.readData();// at time of calling also it gives the error here again we need to use throws.

	}
	public void readData() throws FileNotFoundException   {
		System.out.println("Method Start ");
		//FileInputStream fis =new FileInputStream("./TestDocument/TestDoc.txt");//It gives error if exception not declared therefore her ewe use throws
		FileInputStream fis =new FileInputStream("./TestDocument/TestDoc.txt");
		}

	
}
