package demo;

import org.testng.annotations.Test;

public class Imptopic {
  @Test(dependsOnMethods= {"WebDriver"})
	void OpenWebPage()
	{
		System.out.println("web page will bw open ");
	}
  @Test
	void UITesting() 
	{
		System.out.println("Selenium testing ");
	}
  @Test(description="This method will connect webdriver with remote driver")
	void WebDriver() 
	{
		System.out.println("intial stage ");
	}

  @Test(groups= {"Smoke Testing"})                     //(enabled = true)
  void testMethodOne() 
	{
		System.out.println("One ");
	}

  @Test  (groups= {"Smoke Testing"})
  void testMethodTwo() 
	{
		System.out.println("Two ");
	}
  @Test (groups= {"Smoke Testing"})
  void testMethodThree() 
	{
		System.out.println("Three");
	}

}
