package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoQcalender {
	
	
	
	
	void rundemoq(WebDriver driver) throws Exception
	{
		String url = "https://demoqa.com/automation-practice-form";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		//WebElement date = driver.findElement(By.xpath("//input[@class='form-control react-datepicker-ignore-onclickoutside']"));
		WebElement datee =driver.findElement(By.id("dateOfBirthInput"));
		datee.click();
		 Thread.sleep(3000);
	 JavascriptExecutor js =(JavascriptExecutor)driver;
   js.executeScript("arguments[0].scrollIntoView",datee );
   Thread.sleep(3000);
	WebElement calender = driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
	calender.click();
	
	Select df = new Select(calender);
  df.selectByVisibleText("1995");

//	WebElement month = driver.findElement(By.xpath("//*[@class='react-datepicker__month-select']"));
//    
//	//Select df = new Select(month);
//	df.selectByValue("8");

		
	}
	

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 DemoQcalender obj = new  DemoQcalender();
		 Thread.sleep(3000);
		 obj.rundemoq(driver);
		 
		
	}

}
