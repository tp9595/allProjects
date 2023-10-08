package demo;

import java.io.File;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(demo.Listenerpratice.class )
public class Itestlisternclass {

	@Test
	void testCase1()
	{
		System.out.println("1");
	}
	
	@Test
	void testCase2()
	{
		
		int i = 10/0;
		System.out.println(i);
		System.out.println("2");

	
	
	
	
	}
	
	
	@Test
	void testCase3()
	{
		System.out.println("3");
	}



}
