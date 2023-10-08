package org.SelfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.cssSelector("#dateOfBirthInput")).click();
		WebElement selectYear=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select sel =new Select(selectYear);
		sel.selectByVisibleText("1995");
		WebElement selectMonth =driver.findElement(By.cssSelector("Select[class='react-datepicker__month-select']"));
		Select sel1 =new Select(selectMonth);
		sel1.selectByIndex(9);
		driver.findElement(By.cssSelector("div[class='react-datepicker__month']>:nth-child(4)>:nth-child(3)")).click();

	}//SenKeys not working here therfore we need to use here select class

}
