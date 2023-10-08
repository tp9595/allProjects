package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	
	void flipkartlogin(WebDriver driver)
	{
		String url ="https://www.flipkart.com/";
		//String url = "https://rahulshettyacademy.com/AutomationPractice/";
		//String url ="https://www.flipkart.com/television-store?fm=neo%2Fmerchandising&iid=M_dbea9c3a-c709-4cd4-a1f6-255463deca3f_2_372UD5BXDFYS_MC.AZUJARBK0TT8&otracker=hp_rich_navigation_1_2.navigationCard.RICH_NAVIGATION_Appliances~Televisions_AZUJARBK0TT8&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&cid=AZUJARBK0TT8";
		 driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	
	void flipkartlogin2(WebDriver driver)
	{
		WebElement cart = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		cart.sendKeys("9594368542");
		WebElement carte = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		carte.sendKeys("Tushar@123");
		WebElement cartee = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		cartee.click();
		WebElement car = driver.findElement(By.xpath("//img[contains(@src,'https://rukminim1.flixcart.com/flap/128/128/image/0ff199d1bd27eb98.png?q=100')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(car).perform();
		WebElement vty = driver.findElement(By.xpath("//a[contains(@class,'_6WOcW9 _2-k99T')]"));
		act.moveToElement(vty).perform();
		vty.click();
		String mainwindow =driver.getWindowHandle();
		WebElement dfg = driver.findElement(By.xpath("//*[@title='NOKIA 165 cm (65 inch) Ultra HD 4K LED Smart Android TV with Sound by Onkyo and Dolby Atmos' and @class='s1Q9rs']"));
		dfg.click();
		
		//String mainwindow =driver.getWindowHandle();
		 Set<String> windows =driver.getWindowHandles();
		 Iterator itr =windows.iterator();	
		 
		 while(itr.hasNext())
		 {
			 String nextwindow= (String) itr.next();
			 if(!mainwindow.equalsIgnoreCase(nextwindow))
			 {
				 driver.switchTo().window(nextwindow);
				 WebElement dfgg = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
					
					dfgg.click();
//				 WebElement txt = driver.findElement(By.id("sampleHeading"));
//						 String grabText = txt.getText();
//				 System.out.println(grabText);

			 
			 }
			 
		 }
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   //System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			flipkart obj = new flipkart ();
			obj.flipkartlogin(driver);
			obj.flipkartlogin2(driver);
	}
}
