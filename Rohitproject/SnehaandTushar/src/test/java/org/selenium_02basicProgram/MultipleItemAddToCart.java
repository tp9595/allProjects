package org.selenium_02basicProgram;


import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Generic_Method;

public class MultipleItemAddToCart {

	static WebDriver driver;
	static WebDriverWait wt;
	
	public static void main(String[] args) throws InterruptedException {
		Generic_Method gobj = new Generic_Method();
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(500,500));
		String url = "https://www.flipkart.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8378914512");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harshu@56");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		gobj.waitForInvisibilityOfElement(driver, 20,(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")));
		
		//To enter value in search tab and 'Enter'
		WebElement searchtab = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchtab.sendKeys("wing of fire");
		searchtab.sendKeys(Keys.ENTER);
		
		//Apply wait for visibilty of item then Click on item
		//bobj.waitForVisibilityOfElementLocated(driver, 30,(By.xpath("//div[@data-id='RBKG6ZDHAY5R6DJB']")));
		driver.findElement(By.xpath("//div[@data-id='RBKG6ZDHAY5R6DJB']")).click();
		
		//To store current window
		String currentWindow = driver.getWindowHandle() ;
		
		//Store and switch to new window
		for(String newWindow : driver.getWindowHandles()) {
			driver.switchTo().window(newWindow);
		}
		// Perform operation on new window(Add item to cart)
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(9000);
		
		//Go back to currentWindow by clicking on 'flipkart'img
		driver.findElement(By.xpath("//img[@src='//static-assets-web.flixcart.com/www/linchpin/fk-cp-zion/img/flipkart-plus_8d85f4.png']")).click();
		
		WebElement applinces = driver.findElement(By.cssSelector("img[alt='Appliances']"));
		Actions act =new Actions(driver);
		act.moveToElement(applinces).perform();
		
		WebElement ac = driver.findElement(By.cssSelector("a[class='_6WOcW9 _2-k99T']"));
		act.moveToElement(ac).perform();

		
	}	
}		


