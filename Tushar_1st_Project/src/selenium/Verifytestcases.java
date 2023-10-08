package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytestcases {
	
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
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Verifytestcases obj = new Verifytestcases();
			obj.openwebpage(driver);
	}

}
