package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptmethod {

	private static final String Script = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			 driver.get("https://www.nopcommerce.com/en/demo");
			    driver.manage().window().maximize();
//			    WebElement cart = driver.findElement(By.xpath("//*[@alt='nopCommerce']"));
//			    javautlilclass.drawborder(cart, driver);
			    
			//    String title = javautlilclass.Getti(driver);
			//    System.out.println(title);
			    
			    
			   // WebElement jsclick = driver.findElement(By.xpath("//*[@alt='nopCommerce']"));
			   // javautlilclass.clickelement(jsclick, driver);
			   // javautlilclass.genratealert(driver, "this is my alert");
			 //   javautlilclass.refreshbrowser(driver);
			   // javautlilclass.scrollpagedown(driver);
			   // javautlilclass.scrollpageup(driver);
			    javautlilclass.zoompage(driver);
			    
		//flash or highlight the method
			//drawing border &take 
			//click action 
			// getting title of page 
			//scrolling down the page
			//scroll up the page 
			// zoom page
			
	
	
	}
	

}
