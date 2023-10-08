package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
    @DataProvider(name="data")
    Object[][] multiplevalueMethod()
		{
			return new Object [][] {{"one"},{"two"}};
	
		}
	
	
   @Test(dataProvider ="data")
    void test(String val)
   {
	System.out.println(val);
   }

}
