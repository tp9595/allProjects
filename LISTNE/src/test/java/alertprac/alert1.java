package alertprac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url ="https://demoqa.com/alerts";
    	driver.navigate().to(url);
    	driver.manage().window().maximize();
    	Actions gh= new Actions(driver);
    	WebElement alt = driver.findElement(By.id("alertButton"));
		//WebElement alt = driver.findElement(By.id("timerAlertButton"));
		alt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//Actions gh= new Actions(driver);
		gh.sendKeys(Keys.TAB).perform();
		gh.sendKeys(Keys.TAB).perform();
		gh.sendKeys(Keys.TAB).perform();
		
		//driver.switchTo().defaultContent()
		Thread.sleep(3000);
		WebElement alta = driver.findElement(By.id("promtButton"));
		alta.click();
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",alta);
		driver.switchTo().alert().sendKeys("tushar");
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
