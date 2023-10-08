package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkbox {
	
	
	void openwebpage1( WebDriver driver)
	{
		try {
			//String url ="https://rahulshettyacademy.com/AutomationPractice/";
			String url ="http://register.rediff.com/register/register.php?FormName=user_details";
			  driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	 
	void checkbox1 (WebDriver driver)
	{
		WebElement dri = driver.findElement(By.xpath("//*[@name ='name93caff85']"));
		dri.sendKeys("tushar");
//		  WebElement dropdown = driver.findElement(By.id("firstName"));
//		 dropdown.sendKeys("Tushar");
		  
		  //WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		//  dropdown.click();
	  // Select dro = new Select(dri);
	 //  dro.selectByValue("option1");
	  // dro.selectByIndex(2);
	  // dro.selectByVisibleText("Option3");
	   
	}
	
	void checkbox2 (WebDriver driver)
	{
		  WebElement dropdown = driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]"));
		  dropdown.click();
		  Select dro = new Select(dropdown);
		   dro.selectByValue("07");
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(45));
		  wait.until(ExpectedConditions.visibilityOf(null));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  List<WebElement> list = driver.findElements(By.xpath("jjkjk"));
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
	    //System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
	   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    checkbox obj = new checkbox ();
	    obj.openwebpage1(driver);
	 //   obj.checkbox2(driver);
	    
	    
	}

}
