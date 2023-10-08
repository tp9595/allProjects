package Practicemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceglobalsqa {
	WebDriver driver;

	@BeforeTest
	void setupmethod() {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.get("https://www.amazon.in/");
		
		
	}

	@Test()
	void alphamethod() {
		 driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();;
			//signin.click();
			
		 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("tp12345007@gmail.com");
			//.sendKeys("tp12345007@gmail.com");
			driver.findElement(By.xpath("//*[contains(@class,'a-button-input')]")).click();
		
			 driver.findElement(By.xpath("//*[contains(@id,'ap_password')]")).sendKeys("Sangita@123");
			
			driver.findElement(By.xpath("//*[contains(@id,'signInSubmit')]")).click();
		
		
	}
	
	

}
