package windowpractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowpratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parenentwindow =driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions gh= new Actions(driver);
		WebElement gha=	driver.findElement(By.xpath("//*[@name='username']"));
		gh.sendKeys(Keys.TAB).perform();
		gh.sendKeys(Keys.TAB).perform();
		gh.sendKeys(Keys.TAB).perform();
		WebElement lindin=	driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]"));
		lindin.click();
		WebElement facbook=	driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]"));
		facbook.click();
		WebElement twitter=	driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]"));
		twitter.click();
		Set<String> handles =driver.getWindowHandles();
		System.out.println(handles.size());
		List <String> hlist = new ArrayList<String>(handles);
		for(String e : hlist)
		{
			System.out.println(e);
			String title =driver.switchTo().window(e).getTitle();
			System.out.println(title);
			
		}
		
		driver.switchTo().window( parenentwindow);
		
			
		
	}

}
