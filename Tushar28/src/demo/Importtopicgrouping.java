package demo;

import org.testng.annotations.Test;

public class Importtopicgrouping {


	  @Test(groups= {"Smoke Testing"})                     //(enabled = true)
	  void testMethodOneOne() 
		{
			System.out.println("One ");
		}

	  @Test  (groups= {"Smoke Testing"})
	  void testMethodTwoTwo() 
		{
			System.out.println("Two ");
		}
	  @Test (groups= {"Smoke Testing"})
	  void testMethodThreeThree() 
		{
			System.out.println("Three");
		}
	
	
	
}
