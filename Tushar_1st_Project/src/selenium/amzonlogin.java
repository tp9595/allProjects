package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzonlogin {
	
	void  amzonurl(WebDriver driver) throws Exception
	{
//	String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Findia%2Fs%3Fk%3Dindia%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	  String url ="https://www.amazon.in/" ;
	driver.get(url);
	    driver.manage().window().maximize();
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//void amzonclicksign(WebDriver driver)
	
	
		WebElement signin  = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		
	WebElement dyt  = driver.findElement(By.xpath("//input[@id='ap_email']"));
		dyt.sendKeys("tp12345007@gmail.com");
		WebElement sign = driver.findElement(By.xpath("//*[contains(@class,'a-button-input')]"));
		sign.click();
		WebElement tyu = driver.findElement(By.xpath("//*[contains(@id,'ap_password')]"));
		tyu.sendKeys("Sangita@123");
		WebElement dyu = driver.findElement(By.xpath("//*[contains(@id,'signInSubmit')]"));
		dyu.click();
	
	
		//WebElement cart =driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		//cart.click();
		WebElement carte =driver.findElement(By.id("twotabsearchtextbox"));
		carte.click();
        carte.sendKeys("bike");
		List<WebElement> areas = driver.findElements(By.xpath("s-suggestion s-suggestion-ellipsis-direction"));
		//System.out.println("size of auto suggestion"+ areas.size());
	Thread.sleep(2000);
		for(WebElement i :areas)
		{
			//WebElement auto =driver.findElement(By.xpath("//*[@class='discover-tr-suggestion-header']"));
			//auto.click();
			Thread.sleep(3000);
			//javautlilclass.scrollpagedown(driver);
			if(i.getText().equalsIgnoreCase("bike mobile holder"))
			{
				//javautlilclass.scrollpagedown(driver);
				Thread.sleep(3000);
				i.click();
			}
		
	}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		//D:\Users\akshay\Downloads\chromedriver_win32 (2)
			WebDriver driver = new ChromeDriver();
			amzonlogin obj =new amzonlogin();
			obj.amzonurl(driver);
			//obj.amzonclicksign(driver);
			//obj.addtocart(driver);
			 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   }
	

}
