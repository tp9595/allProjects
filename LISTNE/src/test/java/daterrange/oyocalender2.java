package daterrange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oyocalender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.wpeverest.com/user-registration/multi-step-form/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement username = driver.findElement(By.id("user_login"));
		   username.sendKeys("tushar");;
		   WebElement mail = driver.findElement(By.id("user_email"));
		   mail.sendKeys("tushar12@gmail.com");;
		   WebElement pass = driver.findElement(By.id("user_pass"));
		   pass.sendKeys("Tushar@87");
		   WebElement conpass = driver.findElement(By.id("user_confirm_password"));
		   conpass.sendKeys("Tushar@87");
		   WebElement next = driver.findElement(By.xpath(" //*[@class='user-registration-multi-part-nav user-registration-multi-part-nav-next btn button']"));
		   next.click();
		   WebElement firstname = driver.findElement(By.id("first_name"));
		   firstname .sendKeys("tushar");
		   WebElement lastname = driver.findElement(By.id("last_name"));
		   lastname .sendKeys("padalkar");
		   WebElement url1 = driver.findElement(By.id("user_url"));
		  url1.sendKeys("https://www.zomato.com/");
		   
		   WebElement male = driver.findElement(By.id("radio_1569440596_Male"));
		   male .click();
			Actions act = new Actions(driver);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   WebElement phone = driver.findElement(By.id("phone_1569440626"));
			  phone.sendKeys("9865328574");
			  driver.switchTo().activeElement().sendKeys(Keys.TAB);
			  driver.switchTo().activeElement().sendKeys(Keys.TAB);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  WebElement p = driver.findElement(By.id("load_flatpickr"));
			  p.click();
			  WebElement dropdown = driver.findElement(By.xpath("//label[@class='ur-label']"));
			  Select sel =new Select(dropdown);
			  sel.selectByVisibleText("Albania");
			  
			  //(//*[@class='flatpickr-calendar animate arrowTop arrowLeft open']/div)[1]/div
			  
			  
		   
	}} 
		   
		 //*[@class='user-registration-multi-part-nav user-registration-multi-part-nav-next btn button']
		   
		   
//		   first_name_field
//		   last_name
//		   WebElement fgg = driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']"));
//		   fgg.click();
//		   WebElement fgg = driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']"));
//		   fgg.click();
		   
	  //div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']
	  //div[@class='DateRangePicker__CalendarSelection DateRangePicker__CalendarSelection--start']
//	    WebElement fgg = driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']"));
//		   fgg.click();
//	   WebElement fg = driver.findElement(By.xpath("(//table[@class='DateRangePicker__MonthDates']/tbody/tr)[5]/td[5]"));
//	   fg.click();
//	 //  ((//table[@class='DateRangePicker__MonthDates'])[2]//tbody/tr)[1]/td[7]
//	    
//	  WebElement f = driver.findElement(By.xpath(" ((//table[@class='DateRangePicker__MonthDates'])[2]//tbody/tr)[1]/td[7]"));
//   f.click();
	//}

//}
