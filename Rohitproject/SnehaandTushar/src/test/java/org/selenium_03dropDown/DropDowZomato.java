package org.selenium_03dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DropDowZomato {

	public static void main(String[] args) throws InterruptedException {

		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		WebDriver driver =bu.startup("CH","https://www.zomato.com/");
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		//bu.waitForVisibilityofElement(driver,20, By.xpath("//span[text()='Continue with Google']"));
//		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
//		
//		String parentWindow =driver.getWindowHandle();
//		
//		for(String childWindow:driver.getWindowHandles())
//			driver.switchTo().window(childWindow);
//		bu.waitForVisibilityofElement(driver,20,By.xpath("//div[text()='Sign in with Google']"));
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("rohitmahaj2480@gmail.com");
		
		WebElement searchMenu= driver.findElement(By.cssSelector("input[placeholder^='Search']")); 
		searchMenu.sendKeys("Paneer Chilly");
		searchMenu.click();
		//To clear the input field 
		//searchMenu.clear();
		//searchMenu.sendKeys(Keys.CONTROL+"a");
		//searchMenu.sendKeys(Keys.DELETE);
		searchMenu.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		searchMenu.sendKeys("Paneer");
		driver.findElement(By.xpath("//*[text()='Paneer - Delivery']")).click();
		driver.findElement(By.xpath("//div[text()='Cuisines']")).click();

		List<WebElement> cuisines =driver.findElements(By.xpath("//div[@class='sc-hjRWVT jGcBsD']//input"));
		
		for(int i =0;i<cuisines.size();i++) {
//			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
//			wt.until(ExpectedConditions.visibilityOfAllElements(cuisines));
			
			//System.out.println(cuisines.get(i));
			cuisines.get(i).click();
			
		}
		
		
		
		
		
		//Select Separately 
//		//WebElement check =driver.findElement(By.xpath("(//label[@label='Cantonese']/input)[1]"));
//		check.click();
//		System.out.println("check Is selected or not :"+check.isSelected());
//		WebElement check2 =driver.findElement(By.xpath("(//label[text()='Afghan'])[1]"));
//		check2.click();
//
		//System.out.println("check Is selected or not :"+check2.isSelected());
		driver.findElement(By.xpath("(//span[text()='Apply'])[1]")).click();
		
		
	}

}


