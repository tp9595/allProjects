package org.selenium_02basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TusharCalender {
	static WebDriver driver;
	public static void main(String[] args) {
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		//WebDriver driver=bu.startup("CH","https://www.oyorooms.com/");
		driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']")).click();
		driver.findElement(By.xpath("(//span[text()='15'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='20'])[2]")).click();

	}

}
