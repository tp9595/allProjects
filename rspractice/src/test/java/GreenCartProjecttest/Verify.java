package GreenCartProjecttest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





	public class Verify {
		
		void openwebpage(WebDriver driver)
		{
			String url ="https://www.redbus.in/";
		       driver.get(url);
			    driver.manage().window().maximize();
			    System.out.println(driver.getTitle());
		
		}
		void verifytitle(WebDriver driver)
		{   String actualtitle = driver.getTitle();
			String Expectedtitle ="Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";
		Assert.assertEquals(actualtitle ,Expectedtitle);
		//Assert.assertTrue(true);
		
		}
		
		void veritypassorfail(WebDriver driver)
		{
			boolean value= false;
			Assert.assertTrue(value);
			//SoftAssert SoftAssert  = new SoftAssert();
			Assert.assertEquals(0, 0);
		}

		
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
			   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Verify obj = new Verify();
//				obj.openwebpage(driver);
//				obj.verifytitle(driver);
				obj.veritypassorfail(driver);
		}

	}
