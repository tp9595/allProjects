package org.selenium_02basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

public class AddToCart {	
	static WebDriver driver;
	static WebDriverWait wt;
	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		WebDriver driver =bu.startup("FF",  "https://www.flipkart.com/");
		
//		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		String url = "https://www.flipkart.com/";
//		driver.get(url);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594623769");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rohit@241095");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")));
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Wing of Fire");
		searchText.sendKeys(Keys.ENTER);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")));
		
		driver.findElement(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")).click();
		
		String currentWindow =driver.getWindowHandle();//To strore Current window
		//To strore and switch to new window 
		for(String newWindow : driver.getWindowHandles()){
		    driver.switchTo().window(newWindow);
		}   
		wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		//driver.close();//to close new window when this window no longer to use
		Thread.sleep(10000);
		driver.findElement(By.xpath(" //div[@class='_6t1WkM _3HqJxg']/div[1]/div[1]/div[1]/div[2]//div[text()='Save for later']")).click();
		
//		driver.findElement(By.xpath("//div[text()='Remove']")).click();
//		
//		String newWindow =driver.getWindowHandle();
//		
//		for(String thirdWindow : driver.getWindowHandles()){
//		    driver.switchTo().window(thirdWindow);
//		}
//		 driver.findElement(By.xpath("//div[text()='Remove']")).click();
		
		
//		driver.findElement(By.xpath("//div[text() ='Save for later']")).click();
		
		
		
//      driver.switchTo().window(currentWindow);
//		
//		WebElement element = driver.findElement(By.xpath("//div[@class='_2Xfa2_']/div[@class='go_DOp'][1]//*[local-name()='svg']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
//		
//		
//		//driver.findElement(By.xpath("//div[text()='Logout']")).click();
		
	}

}
