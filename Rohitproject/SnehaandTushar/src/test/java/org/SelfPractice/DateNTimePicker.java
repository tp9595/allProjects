package org.SelfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateNTimePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.cssSelector("#dateAndTimePickerInput")).click();
		driver.findElement(By.cssSelector("span[class$='selected-year']")).click();
		for(int i=1;i<=22;i++) {
			WebElement click=driver.findElement(By.cssSelector("a[class$='previous']"));
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",click);
			driver.findElement(By.cssSelector("a[class$='previous']")).click();
		}
		driver.findElement(By.xpath("//div[text()='1995']")).click();
		driver.findElement(By.cssSelector("span[class$='month']")).click();
		driver.findElement(By.xpath("//div[text()='October']")).click();
		driver.findElement(By.cssSelector("div[class$='24']")).click();
		driver.findElement(By.xpath("//li[text()='20:45']")).click();
	}
	
	

}
