package org.testNGparallelTesting;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerManager {

	WebDriver driver=null;
	Configwithconstr crread;
	BaseUtilityUpdated bobj;
	String description1;
	String name;
	Object name1;
	String url;
	String bName;
	String uName;
	String pwd;

	@BeforeClass
	public void getCustomerData() throws EncryptedDocumentException, IOException {
		crread = new Configwithconstr("./PropertiesFile/Actitime.properties");
		bobj = new BaseUtilityUpdated();
		url = crread.getPropertyValue("url");
		bName = crread.getPropertyValue("browserNameCH");
		uName = crread.getPropertyValue("userName");
		pwd = crread.getPropertyValue("password");
	}

	@BeforeMethod
	public void loginActitime() {
		bobj = new BaseUtilityUpdated();
		driver = bobj.startup(bName,url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton")).click();
	}
	@Test
	public void createCusomer() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.findElement(By.cssSelector("#container_tasks")).click();
		for(int i=1; i<=4; i++) {			
			bobj.waitForVisibilityofElement(driver, 20, By.xpath("//div[text()='Add New']"));
			WebElement newBtn = driver.findElement(By.xpath("//div[text()='Add New']"));
			bobj.clickByJs(driver, newBtn);	
			bobj.waitForVisibilityofElement(driver, 30, By.xpath("//div[@class='item createNewCustomer']"));
			WebElement newcust=driver.findElement(By.xpath("//div[@class='item createNewCustomer']"));
			bobj.clickByJs(driver, newcust);
			name =	(String) bobj.returnDataOfAnyCellWithRespectToTableHeading("C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\ExcelFile\\TestData.xlsx","CustomerData","CustomerName",i);
			description1 = (String) bobj.returnDataOfAnyCellWithRespectToTableHeading("C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\ExcelFile\\TestData.xlsx","CustomerData","Description",i);
			bobj.waitForVisibilityofElement(driver,30,By.id("customerLightBox_content"));
			bobj.waitForVisibilityofElement(driver,30, By.xpath("//textarea[@placeholder='Enter Customer Description']"));
			driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description1);
			WebElement createCust=driver.findElement(By.xpath("//div[text()='Create Customer']"));
			bobj.clickByJs(driver, createCust);
			bobj.waitForInvisibilityofElement(driver,30,By.id("customerLightBox_content"));
		
		}
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	public void deleteCustomer() throws InterruptedException {
		System.out.println("delete customer");
		driver.findElement(By.cssSelector("#container_tasks")).click();

		WebElement editBtn1 = driver.findElement(By.xpath("//div[@class='itemsContainer']/div[6]/div[@class='editButton']"));
		bobj.clickByJs(driver, editBtn1);
		
		//bobj.waitForVisibilityOfElementLocated(driver,20, (By.xpath("(//div[@class='actions'])[1]")));
		WebElement actionBtn = driver.findElement(By.xpath("(//div[@class='actions'])[1]"));
		bobj.scrollByJs(driver, actionBtn);  //scroll into view
		bobj.clickByJs(driver, actionBtn);

		WebElement deleteBtn = driver.findElement(By.xpath("(//div[@class='dropdownContainer actionsMenu'])[1]//div[@class='deleteButton']"));
		bobj.clickByJs(driver, deleteBtn);

		WebElement submitBtn = driver.findElement(By.xpath("//span[@class='submitTitle buttonTitle']"));
		bobj.clickByJs(driver, submitBtn);
		System.out.println(Thread.currentThread().getId());
	}

	@AfterMethod
	public void actiLogout() {
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
	}
}
	




