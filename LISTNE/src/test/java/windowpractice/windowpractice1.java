package windowpractice;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594368542");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Tushar@95");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")));
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Wing of Fire");
		searchText.sendKeys(Keys.ENTER);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")));
		// To strore Current window
		String currentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")).click();

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow.size());
		// To Trvarrse it we need Iteartor
//			Iterator<String> itr =allWindow.iterator();
//			
//			String childWindow =itr.next();
//			if(childWindow.equalsIgnoreCase(currentWindow)) {
//				childWindow=itr.next();
//			}
//			driver.switchTo().window(childWindow);
//			
//			
//			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//			driver.switchTo().window(currentWindow);
		// using arraylist
		List<String> windowid = new ArrayList(allWindow);
		String parentwindowid = windowid.get(0);
		String childwindowid = windowid.get(1);

//			System.out.println("parent window id:" +parentwindowid);
//			System.out.println("child window id:" +childwindowid);
//			//how to use window id for switching
//			
//           driver.switchTo().window(parentwindowid)	;
//           System.out.println("parent window titile " +driver.getTitle());
//           
//           driver.switchTo().window(childwindowid);
//           System.out.println("child  window titile " +driver.getTitle());
//           

		// for each loop
		for (String winid : windowid) {
			// System.out.println(winid);
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
	}

}
