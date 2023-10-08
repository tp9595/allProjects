package seleniumutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilfiles {
    public static WebDriver driver = null;
    protected Actions action;
    
    public WebDriver setup(String browser, String url)
    {
    	if(browser.equalsIgnoreCase("chrome"))
    	{
    		WebDriverManager.chromedriver().setup();
    		driver= new ChromeDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.get(url);
    	return driver;
    }
    
    public WebDriver getDriver()
    {
    	return driver;
    }
    
  //  private Properties prop;
	public  String readProperFile(String key)
	{
		Properties	prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/Resource/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	public void performMouseopration(WebElement element)
	{
		action.moveToElement(element).perform();
	}
	
	public void performRightClickOperation(WebElement element)
	{
		action.moveToElement(element).contextClick().build().perform();
	}
	public void performDragandDrop(WebElement source,WebElement target)
	{
		action.dragAndDrop(source, target).build().perform();
	}
	
	public void takescreenshot(String location)
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File file =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getCurrentTitleofapplication()
	{
		return driver.getTitle();
	}
	
	public String getCurrentUrlofapplication()
	{
		return driver.getCurrentUrl();
	}
	
	public void typeInput(WebElement element, String input)
	{
		waitForElementDisplayed(element);
		element.clear();
		element.sendKeys(input);
	}
	
	public void clickonElement(WebElement element)
	{
		waitForElementToBeClickable(element);
		element.click();
	}

	private void waitForElementToBeClickable(WebElement element) {
		// TODO Auto-generated method stub
		//new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(element));
	}

	private void waitForElementDisplayed(WebElement element) {
		// TODO Auto-generated method stub
		//new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public List<String> getDropdownoption(List<WebElement> list)
	{
		List <String> strlist = new ArrayList <String>();
		
		for(WebElement e : list)
		{
			strlist.add(e.getText());
		}
		return strlist;
	}
}
