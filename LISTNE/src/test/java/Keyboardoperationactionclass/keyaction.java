package Keyboardoperationactionclass;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyaction {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement  fg =driver.findElement(By.id("firstName"));
		fg.sendKeys("tus");
//		Actions gh= new Actions(driver);
//		gh.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		gh.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		gh.sendKeys(Keys.TAB).perform();
////		gh.sendKeys(Keys.CONTROL ,"a").perform();
////		gh.sendKeys(Keys.CONTROL ,"c").perform();
////		gh.sendKeys(Keys.TAB).perform();
//		gh.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		//gh.sendKeys(Keys.CONTROL ,"v").perform();
		Robot rob =new Robot();
		//Robot rob = new Robot();
		 rob.keyPress(KeyEvent.VK_CONTROL);
		 fg.sendKeys("a");
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_DELETE);
		 rob.keyRelease(KeyEvent.VK_DELETE);
		// for zoom in out 
		 rob.keyPress(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_ADD);
		 rob.keyRelease(KeyEvent.VK_ADD);
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		
	
	}

}
