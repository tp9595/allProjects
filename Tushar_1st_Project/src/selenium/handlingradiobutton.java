package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingradiobutton {
	
	void openwebpage( WebDriver driver)
	{
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		//driver.navigate().to("");
	driver.manage().window().maximize();
	 driver.close();
	}
	
	void radiobutton(WebDriver driver)
	{
		//WebElement ame = driver.findElement(By.name("firstName"));
		// ame.sendKeys("");
		 WebElement ame = driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
		 ame.sendKeys("tushar padalkar");
	
	}
	
	void emailid (WebDriver driver)
	{
		 WebElement email = driver.findElement(By.xpath("//input[@name='altemail58d4cda1']] "));
		 email.sendKeys("jp82984507@gmai.com");
	}
	
	void mobilenumber (WebDriver driver)
	{
		 WebElement email = driver.findElement(By.xpath("//input[@name='altemail58d4cda1']] "));
		 email.sendKeys("jp82984507@gmai.com");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
	   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    handlingradiobutton obj = new handlingradiobutton();
	    obj.openwebpage(driver);
	    obj.radiobutton(driver);
	    driver.close();
	}

}
