package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryandcatchcheckbox {
       
	void openwebpage1( WebDriver driver)
	{
		try {
			String url ="https://rahulshettyacademy.com/AutomationPractice/";
			  driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	void clickcheckbox1(WebDriver driver)
	{
		try {
			WebElement chickboxone = driver.findElement(By.xpath("//*[contains(@id,'checkBoxOption1')]"));
			chickboxone.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		void clickcheckbox2(WebDriver driver)
		{
			try {
				WebElement chickboxone = driver.findElement(By.xpath("//*[starts-with(@name,'checkBoxOption2')]"));
				chickboxone.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			void clickcheckbox3(WebDriver driver)
			{
				try {
					WebElement chickboxone = driver.findElement(By.xpath("//*[@value='option3' and @name='checkBoxOption3']"));
					chickboxone.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	
			void closewebpage(WebDriver driver)
			{
				 try
				   {
					  driver.close();
					   
				   }catch(Exception e)
				   {
					   System.out.println(e);
		           }
			}
			
	
	
	public static void main(String[] args) throws Exception {
		
	   // System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    tryandcatchcheckbox obj = new tryandcatchcheckbox();
		   obj.openwebpage1(driver);
		    obj.clickcheckbox1(driver); 
		    Thread.sleep(3000);
		    obj.clickcheckbox2(driver);
		    Thread.sleep(3000);
		    obj.clickcheckbox3(driver);
		    Thread.sleep(3000);
		    driver.close();
		    
		    
		
	}
}
