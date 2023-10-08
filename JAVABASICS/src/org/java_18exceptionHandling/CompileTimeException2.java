package org.java_18exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException2 {

	public static void main(String[] args) throws FileNotFoundException {// It's only declare Exception (Not handle) 
//		System.out.println("Program Start");
//		String path=System.getProperty("user.dir");//In_build class to get path of current directory. 
//		System.out.println("Path = "+path);//
//		FileInputStream fis = new FileInputStream(path +"\\TestDocument\\TestDoc");//Unhandled exception type FileNotFoundException
//		//FileInputStream fis = new FileInputStream(path +"\\TestDocument\\TestDoc");
		division(20,0);
	}
	public static void division(int a, int b) {
		if(b==0){
			throw new ArithmeticException("Value of b Can't be zero");
			
		}else {
			System.out.println("Division ="+a/b);
		}
		System.out.println("Value of a & b" +a +"&"+b);
	}
}

