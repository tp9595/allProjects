package org.selenium_12fileUploadandDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingSikuli {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/edit-pdf");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id='pickfiles']")).click();
		
		Screen sc =new Screen();
		
		Pattern fileTextBox=new Pattern("C:\\Acceleartion\\Automation\\Selenium\\FORSikuli\\FileTextBox.png");
		Pattern openBtn=new Pattern("C:\\Acceleartion\\Automation\\Selenium\\FORSikuli\\openButton.png");
		
		sc.wait(fileTextBox,10);

		sc.type(fileTextBox,"C:\\Users\\rohit\\Desktop\\AutoIT Files\\Feb17EveBatch.pdf");
		sc.click(openBtn);
		

	}

}
