package org.selenium_04WindowHandler;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tushar {
    static WebDriver driver;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		driver.findElement(By.cssSelector("[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']")));
//		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Rohit");
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.cssSelector("[style='width: 200px;']")).sendKeys("India");
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	}
}
