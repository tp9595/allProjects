package normalpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextandgetattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement gh =driver.findElement(By.id("user-name"));
		gh.sendKeys("standard_user");
		System.out.println(gh.getText());
		System.out.println(gh.getAttribute("class"));
		
	}

}
