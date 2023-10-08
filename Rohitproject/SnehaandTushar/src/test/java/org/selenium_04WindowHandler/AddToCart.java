package org.selenium_04WindowHandler;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {	
	static WebDriver driver;
	static WebDriverWait wt;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594623769");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rohit@241095");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")));
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Wing of Fire");
		searchText.sendKeys(Keys.ENTER);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")));
		String currentWindow =driver.getWindowHandle();//To strore Current window
		driver.findElement(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")).click();
		
		//It Returns All Window 
//		Set<String> allWindow = driver.getWindowHandles();
//		//To Trvarrse it we need Iteartor
//		Iterator<String> itr =allWindow.iterator();
//		
//		String childWindow =itr.next();
//		if(childWindow.equalsIgnoreCase(currentWindow)) {
//			childWindow=itr.next();
//		}
//		driver.switchTo().window(childWindow);
//		
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//		
//		
		}
	
	public void windowSwitch(By locator,By WebElement) {
		
		String parentWindow =driver.getWindowHandle();
		driver.findElement(locator).click();
		Set<String> allWindow =driver.getWindowHandles();
		Iterator<String> itr=allWindow.iterator();
		
		String str ="";
		WebElement wb;
		while(itr.hasNext()){
			str=itr.next();
			if(str.equalsIgnoreCase(parentWindow)) {
				continue;
			}
			driver.switchTo().window(str);
			try {
			wb=driver.findElement(WebElement);
			break;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
		
}		
//	Another Method of switch window	
//		
//		//driver.close();//to close new window when this window no longer to use
//		Thread.sleep(10000);
//		driver.findElement(By.xpath(" //div[@class='_6t1WkM _3HqJxg']/div[1]/div[1]/div[1]/div[2]//div[text()='Save for later']")).click();
		
		
		
		
		
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
		
	


