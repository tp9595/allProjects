package org.selenium_02basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.Generic_Method;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class IsSelectedEnabledDispalyed2 {
	
	static WebDriverWait wt;
	public static void main(String[] args) throws InterruptedException {
		
		Generic_Method Gobj =new Generic_Method();
		
		WebDriver driver =Gobj.startup("https://www.amazon.in/","CH",90);
		
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span")).click();		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohitmahaj24@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Rohit@241095");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		WebElement changelang =driver.findElement(By.cssSelector("span[class='icp-nav-link-inner']"));
		Actions act = new Actions(driver);
		act.moveToElement(changelang).perform();
		WebElement english =driver.findElement(By.cssSelector("div[id='nav-flyout-icp'] span[class='nav-text']>i[class='icp-radio icp-radio-active']"));
		//When Radio Button is Dynamic in that scenario we can not use isSelect Method
		//System.out.println(english.isSelected());
		
		WebElement hindi = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']/div[2]/a[1]//i[@class='icp-radio']"));
		
		System.out.println("Check Hindi enabled or not :"+ hindi.isEnabled());
		
		
		if(hindi.isEnabled()) {
			hindi.click();
			WebElement afterclickEnglish=driver.findElement(By.xpath("// div[@id='nav-flyout-icp']/div[2]/a[1]//i[@class='icp-radio']"));					
			WebElement afterclickHindi=driver.findElement(By.xpath("//div[@id='nav-flyout-icp']/div[2]/span//i[@class='icp-radio icp-radio-active']"));
			System.out.println(afterclickEnglish.getAttribute("class"));
			System.out.println(afterclickHindi.getAttribute("class"));
			String value =afterclickHindi.getAttribute("class");
			if(value.endsWith("icp-radio-active")) {
				System.out.println("Hindi Is selected");
			}
				
		}
		
		
	}

}
