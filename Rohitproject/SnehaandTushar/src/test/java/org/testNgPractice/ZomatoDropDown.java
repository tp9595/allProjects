package org.testNgPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZomatoDropDown { 
	BaseUtilityUpdated bu;
	WebDriver driver;
	@BeforeSuite
	public void test () {
		System.out.println("Thread for Suite "+Thread.currentThread().getId());
	}
	
	@BeforeTest
	public void browserdtail() {
		bu = new BaseUtilityUpdated();
		driver=bu.startup("CH","https://www.zomato.com/");
	}

	@Test 
	public void searchMenu() {
		WebElement searchMenu= driver.findElement(By.cssSelector("input[placeholder^='Search']")); 
		searchMenu.sendKeys("Paneer Chilly");
		searchMenu.click();
		searchMenu.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		searchMenu.sendKeys("Paneer");
		driver.findElement(By.xpath("//*[text()='Paneer - Delivery']")).click();
		
		//		List<WebElement> cuisines =driver.findElements(By.xpath("//div[@class='sc-hjRWVT jGcBsD']//input"));
		//		for(int i =0;i<cuisines.size();i++) {
		//			System.out.println(cuisines.get(i));
		//			cuisines.get(i).click();
		System.out.println("Zomato Firts Test Allocated Thread "+Thread.currentThread().getId());
	}

	@Test
	public void trial() {
		driver.findElement(By.xpath("//div[text()='Cuisines']")).click();
		List<WebElement> cuisines =driver.findElements(By.xpath("//div[@class='sc-hjRWVT jGcBsD']//input"));
		for(int i =0;i<cuisines.size();i++) {
			//System.out.println(cuisines.get(i));
			cuisines.get(i).click();
			
		}
		driver.findElement(By.xpath("(//span[text()='Apply'])[1]")).click();
		System.out.println("Zomato second Test Allocated Thread"+Thread.currentThread().getId());
	}
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
}