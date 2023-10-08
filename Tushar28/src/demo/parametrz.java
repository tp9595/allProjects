package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrz {

	@Test
	@Parameters("MyParam")
	void Audimethod(String MyName) //for two parameter we have to create two parameter tag
	
	{
		System.out.println(MyName);
	}
//	
	
	
}
