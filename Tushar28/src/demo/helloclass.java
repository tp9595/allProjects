package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class helloclass {
	@BeforeMethod
	void hellometh()
	{
		System.out.println("hello ");
	}
	
	@Test
	void hellomethod()
	{
		System.out.println("hello world");
	}

	@BeforeClass
	void hellomethodm()
	{
		System.out.println("Before class");
	}

	@AfterClass
	void hellomethodx()
	{
		System.out.println("After class");
	}

}



