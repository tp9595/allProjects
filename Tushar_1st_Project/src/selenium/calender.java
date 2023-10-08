package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	
	
	void firstmethodone(WebDriver driver)
	{
		String url = "https://www.redbus.in/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	void redbuscalender(WebDriver driver) throws Exception
	{
		WebElement dateone =driver. findElement(By.xpath("//*[@id='onward_cal']"));
		
		  dateone.click();
		  
//		  WebElement nextbtn =driver.findElement(By.xpath("//*[@class='next']"));
//			
//		  nextbtn.click();
		  
		  
//		  WebElement month =driver.findElement(By.xpath("//*[@class='monthTitle']"));
//			String s = month.getText();
//			System.out.println(s);
		 while(!driver.findElement(By.xpath("//*[@class='monthTitle']")).getText().equalsIgnoreCase("Nov 2023"))
				 {
			 Thread.sleep(2000);
				WebElement nextbtn =driver.findElement(By.xpath("//*[@class='next']"));
				nextbtn .click();
			 }
				 List<WebElement>  date =driver.findElements(By.xpath("//*[contains(@class,'day')]"));
				 
			 
			for(WebElement selectDate : date )
			{
				if(selectDate.getText().equalsIgnoreCase("4"))
				{
				selectDate.click();
				WebElement serch =driver.findElement(By.id("search_btn"));
				serch.click();
				}
			}
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  calender obj = new calender();
			  obj.firstmethodone(driver);
			  obj.redbuscalender(driver);
			  
			  
		
		
		
	}

}
