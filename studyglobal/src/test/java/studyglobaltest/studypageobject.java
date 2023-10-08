package studyglobaltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class studypageobject {
WebDriver idriver;  //GLOBAL DRIVER
	public studypageobject (WebDriver driver)
	{
		idriver = driver;
		PageFactory.initElements(idriver, this);
	}
	@FindBy(name ="user-name")

	WebElement  txtusername;
	@FindBy(name ="password")
	WebElement  txtpassword;
	@FindBy(name ="login-button")
	WebElement  loginbutton ;
	

	public void setusename(String userName) {
		// TODO Auto-generated method stub
		{
			 txtusername.sendKeys( userName);
		}
	}
	public void setpassword(String password) {
		// TODO Auto-generated method stub
		{
			 txtpassword.sendKeys(password);
		}
	}
	
	public  WebElement loginbuttton() {
		// TODO Auto-generated method stub
		 loginbutton.click();
		return loginbutton;
	}
	
}
