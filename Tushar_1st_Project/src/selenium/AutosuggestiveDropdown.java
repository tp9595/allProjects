package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {
	
	void openwebpage1( WebDriver driver)
	{
		
			//String url ="https://www.zomato.com/";
			String url ="https://www.redbus.in";
			
			  driver.get(url);
			driver.manage().window().maximize();
		
	}
	
	void clickcheckbox1(WebDriver driver) throws Exception
	{
	      WebElement chickboxone = driver.findElement(By.xpath("//*[contains(@id,'src')]"));
	       chickboxone.sendKeys("pune");
	//	WebElement chickboxone = driver.findElement(By.xpath("//*[contains(@placeholder,'Search for restaurant, cuisine or a dish')]"));
		//chickboxone.sendKeys("pune");
			//List<WebElement> areas = driver.findElements(By.xpath("//li[@class='sub-city']"));
			List<WebElement> areas = driver.findElements(By.xpath("//li[@class='sub-city']"));
			//Thread.sleep(2000);
			for(WebElement i : areas)
			{
				if(i.getText().equalsIgnoreCase("Viman Nagar,Pune"))
				{
					Thread.sleep(3000);
					i.click();
				}				
			//System.out.println(i.getText());
			
				WebElement chickboxtwo = driver.findElement(By.xpath("//*[contains(@id,'dest')]"));
				chickboxtwo.sendKeys("mumbai");
				List<WebElement> areass = driver.findElements(By.xpath("//li[@class='sub-city']"));
				Thread.sleep(2000);
				for(WebElement g: areass)
				{
					if(g.getText().equalsIgnoreCase("Borivali East, Mumbai"))
					{
						Thread.sleep(3000);
						g.click();
						WebElement chickboxthree = driver.findElement(By.xpath("//td[@class='current day']"));
						chickboxthree.click();
						WebElement search  = driver.findElement(By.xpath("//button[@id='search_btn']"));
						search.click();
								
					}				
				//System.out.println(i.getText());
					
				}
//		WebElement chickboxthree = driver.findElement(By.xpath("//td[@class='current day']"));
//		chickboxthree.click();
//		driver.close();				//td[contains(@class,'current day')]
			
			
			
			
			
			
			}
			
			
			
//		WebElement chickboxtwo = driver.findElement(By.xpath("//*[contains(@id,'dest')]"));
//			chickboxtwo.sendKeys("mumbai");
//			List<WebElement> areass = driver.findElements(By.xpath("//li[@class='sub-city']"));
//			Thread.sleep(2000);
//			for(WebElement i : areass)
//			{
//				if(i.getText().equalsIgnoreCase("Borivali East, Mumbai"))
//				{
//					Thread.sleep(3000);
//					i.click();
//				}				
//			//System.out.println(i.getText());
//			}
	
	
	
	
	
	
	
	
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    AutosuggestiveDropdown obj = new AutosuggestiveDropdown();
		    obj.openwebpage1(driver);
		    obj.clickcheckbox1(driver);
		    Thread.sleep(3000);
		   
		    
	}

}
