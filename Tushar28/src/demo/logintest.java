package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest {

	@Test
	void loginbyemail()
	{
		System.out.println("login by email");
		Assert.assertEquals("pavan", "pavan");
	}
	
	
	
	
}
