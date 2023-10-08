package org.selenium_02basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLogin {

	static WebDriver driver;
	static WebDriverWait wt;

	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
		// System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wt = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.manage().window().maximize();
		String url = "https://www.flipkart.com/";
		driver.get(url);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594623769");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rohit@241095");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']/span")).click();

		// Thread.sleep(9000);
		wt.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']/span")));
		// wt.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='_2Xfa2_']/div[@class='go_DOp'][1]//*[local-name()='svg']"))));
		// bObj.waitForVisibilityofElement(driver,30,By.xpath("//div[@class='_2Xfa2_']/div[@class='go_DOp'][1]//*[local-name()='svg']"));

		WebElement element = driver
				.findElement(By.xpath("//div[@class='_2Xfa2_']/div[@class='go_DOp'][1]//*[local-name()='svg']"));
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();
		// action.

		driver.findElement(By.xpath("//div[text()='Logout']")).click();

	}
}