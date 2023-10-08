package org.selenium_08actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

public class ClickByusingActiveElement2 {

	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
		
		WebDriver driver=bObj.startup("CH","https://www.flipkart.com/");
		driver.switchTo().activeElement().sendKeys("9594623769");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rohit@241095");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
		//WebElement image =driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/128/128/image/f15c02bfeb02d15d.png?q=100']"));
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.open()");
		
		
		String newlink="https://www.flipkart.com/offers-store?otracker=nmenu_offer-zone&fm=neo%2Fmerchandising&iid=M_8c94876a-1448-4128-b572-d40cc1b60e9f_2_372UD5BXDFYS_MC.G6ZC4RAJ9OHU&otracker=hp_rich_navigation_1_2.navigationCard.RICH_NAVIGATION_Top%2BOffers_G6ZC4RAJ9OHU&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=G6ZC4RAJ9OHU";
		bObj.toOpenLinkInNewTaborWindow(driver, newlink,WindowType.TAB);
		bObj.toOpenLinkInNewTaborWindow(driver, newlink,WindowType.WINDOW);
		
		//driver.get(newlink);
		//driver.switchTo().newWindow(WindowType.TAB);
	}



}