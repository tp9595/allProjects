package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invokedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	
	
	
	//driver.get("https://demoqa.com/automation-practice-form");
	//driver.get("https://rahulshettyacademy.com/#/documents-request");
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	 WebElement textbox = driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
	   textbox.sendKeys("tushar padalkar");
	  // WebElement radioOone = driver.findElement(By.id("radioButton")); 
	 //  radioOone.click();
	
	   //WebElement texbox = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	  // texbox.click();
	
	
	}


	
  // WebElement textbox = driver.findElement(By.id("autocomplete"));
  // textbox.sendKeys("tushar");
	
	
	
	

}
