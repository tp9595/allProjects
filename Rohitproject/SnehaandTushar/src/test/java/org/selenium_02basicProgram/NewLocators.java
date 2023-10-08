package org.selenium_02basicProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NewLocators {
	static WebDriver driver;
	static BaseUtilityUpdated bu;
	public static void main(String[] args) {
		bu=new BaseUtilityUpdated();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement allMenu = driver.findElement(By.cssSelector("[id='nav-hamburger-menu']"));
		WebElement logo= driver.findElement(with(By.tagName("a")).above(allMenu));
		logo.click();
		
		WebElement allbtn=driver.findElement(By.cssSelector("[id='searchDropdownBox']"));
		WebElement delLoc=driver.findElement(with(By.tagName("a")).toLeftOf(allbtn));
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOf(delLoc));
		
		delLoc.click();
		
		WebElement fornewpg=driver.findElement(By.cssSelector("[class='a-popover-wrapper']"));
//		Set st=driver.getWindowHandles();
//		System.out.println(st);
		wt.until(ExpectedConditions.visibilityOf(fornewpg));
		
		System.out.println(driver.switchTo().activeElement().getText());
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		System.out.println(driver.switchTo().activeElement().getText());
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		System.out.println(driver.switchTo().activeElement().getText());
		System.out.println("end");
		
	}

}
