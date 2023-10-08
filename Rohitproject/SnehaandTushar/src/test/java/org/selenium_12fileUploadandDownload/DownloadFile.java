package org.selenium_12fileUploadandDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

public class DownloadFile {

	public static void main(String[] args) {
		
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		WebDriver driver= bu.startup("ch","https://unsplash.com/photos/AL3-bZwiBbU");
		driver.findElement(By.xpath("//button[text()='Got it']")).click();
		driver.findElement(By.xpath("//span[text()='Download free']")).click();

	}

}
