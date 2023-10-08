package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javautlilclass {


public static void  drawborder(WebElement element,WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
public static  String Getti(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String title =js.executeScript("return document.title;").toString();
	return title;
	}


public static void  clickelement(WebElement element,WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);
	}

public static void  genratealert(WebDriver driver, String message)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("alert('"+ message + " ')");
	}

public static void  refreshbrowser(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("history.go(0)");
	}

public static void  scrollpagedown(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  //arguments[0].scrollIntoView",datee
	}
public static void  scrollpageup(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");  
	}


public static void  zoompage(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.body.style.zoom ='50%'");  
	}
}
