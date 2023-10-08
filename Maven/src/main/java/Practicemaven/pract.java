package Practicemaven;

import org.testng.annotations.Test;

import windowpractice.WebElement;
@Test
public class pract {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.myntra.com/");
     WebElement search=driver.findElement(By.className("desktop-searchBar"));
   Thread.sleep(1000);
 search.sendKeys("Plant");
 Thread.sleep(1000);
 search.sendKeys(Keys.ENTER);
 driver.switchTo().alert().accept();
 
 WebElement click1 = driver.findElement(By.xpath("//img[@class='img-responsive'])[5]"));
 click1.click();
}
