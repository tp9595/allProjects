package org.selenium_12fileUploadandDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileInFirefox {
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		WebElement browseButton =driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		//browseButton.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",browseButton);
		//browseButton.click();	
		js.executeScript("arguments[0].click();",browseButton);

		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec("./autoItFiles/Firefox.exe");
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
