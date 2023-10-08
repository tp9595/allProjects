package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oyopractice {
	
	void firstmethodone(WebDriver driver)
	{
		String url = "https://www.oyorooms.com/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	void oyorromsdate(WebDriver driver)
	{
		WebElement date = driver.findElement(By.xpath("//*[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']"));
	  date .click();
	  
//	  WebElement nextbtn = driver.findElement(By.xpath("DateRangePicker__PaginationArrowIker__PaginationArrowIcon--next"));
//	  nextbtn .click();
//	  
//	  WebElement month = driver.findElement(By.xpath("//*[@class='DateRangePicker__MonthHeader']"));
//	  month .click();
//	  
	while(!driver.findElement(By.xpath("//*[@class='DateRangePicker__MonthHeader']")).getText().equalsIgnoreCase("Nov 2022"))
	{
		 WebElement nextbtn = driver.findElement(By.id("root"))	;	 
				 nextbtn .click();
	}
	
	
	
	
	
	
	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			oyopractice obj = new oyopractice();
			obj.firstmethodone(driver);
			obj.oyorromsdate(driver);
	}

}
