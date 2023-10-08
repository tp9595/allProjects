package org.selenium_03dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {

		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		
		//WebDriver driver =bu.startup("CH","https://demoqa.com/select-menu");
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.xpath("(//div[@class=' css-2b097c-container'])[1]")).click();
		//String str=driver.getPageSource();
		//System.out.println(str);
		driver.findElement(By.xpath("//*[text()='Group 2, option 1']")).click();

		//driver.findElement(By.tagName("Body")).sendKeys(Keys.PAGE_DOWN);
		//bu.pgDown(driver,1);//scroll by pgdown
		WebElement multiSelect =driver.findElement(By.xpath("(//div[@class=' css-2b097c-container'])[3]"));
		//Selcet checking by normal way.
		//WebElement tryBySelect =driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		//tryBySelect.click();
		//driver.findElement(By.xpath("//option[@value='1']")).click();
		bu.scrollByJs(driver, multiSelect); 
		
		
		multiSelect.click();
		bu.waitForVisibilityofElement(driver,30, By.xpath("//div[text()='Green']"));
		
//		
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		driver.findElement(By.xpath("//div[text()='Red']")).click();
	}

}

