package org.selenium_12fileUploadandDownload;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericFileUpload {
//File For Generic Upload
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement browseButton =driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		//browseButton.click();
		for(int i =0;i<2;i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		}
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",browseButton);
		//browseButton.click();	
		js.executeScript("arguments[0].click();",browseButton);	
		
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec("./autoItFiles/Generic.exe"+" "+"File_For_Generic_Upload");
		} catch (InterruptedException | IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
