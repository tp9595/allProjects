package selenium;


//public class CalenderD {
//	
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
//				WebDriver driver = new ChromeDriver();
//				String url = "https://demoqa.com/automation-practice-form";
//				driver.manage().window().maximize();
//				driver.get(url);
//			   // driver.manage().window().maximize();
//			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			    WebElement datee =driver.findElement(By.id("dateOfBirthInput"));
//			    JavascriptExecutor js =(JavascriptExecutor)driver;
//			    js.executeScript("arguments[0].scrollIntoView",datee);
//				datee.click();
////				WebElement calender = driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
////				calender.click();
////				
////				Select df = new Select(calender);
////			  df.selectByVisibleText("1995");
//			    
//	}
//
//}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalenderD {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		WebElement np = driver.findElement(By.id("userNumber"));
		np.sendKeys("9865327845");
//		WebElement datee =driver.findElement(By.cssSelector("#dateOfBirthInput"));
//		datee.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		WebElement selectYear=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select sel =new Select(selectYear);
		sel.selectByVisibleText("1995");
		WebElement selectMonth =driver.findElement(By.cssSelector("Select[class='react-datepicker__month-select']"));
		Select sel1 =new Select(selectMonth);
		sel1.selectByIndex(9);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--027']")).click();

	}//SenKeys not working here therfore we need to use here select class

}