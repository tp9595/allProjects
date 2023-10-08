package daterrange;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oyocalender {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.redbus.in/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement dateone =driver. findElement(By.xpath("//*[@id='onward_cal']"));
		
		  dateone.click();
		  
		  
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

}
