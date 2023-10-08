package org.selenium_12fileUploadandDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UplodPdf {

	public static void main(String[] args) {

		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-ppt");
		driver.manage().window().maximize();
		//WebDriver driver =bu.startup("CH","https://smallpdf.com/pdf-to-ppt");
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Choose')]")).click();

//		try {
//			Thread.sleep(2000);
//			Runtime.getRuntime().exec("./autoItFiles/Generic.exe"+" "+"Feb17EveBatch");
//		} catch (InterruptedException | IOException e) {
//
//			e.printStackTrace();
//		}
		//by generic Method
		fileUpload("./autoItFiles/Generic.exe", "Feb17EveBatch");
	}
	public static void fileUpload(String exePath, String file_name){
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec(exePath+" "+file_name);
		} catch (InterruptedException | IOException e) {

			e.printStackTrace();
		}	
		
	}

}
