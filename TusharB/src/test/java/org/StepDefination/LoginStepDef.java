package org.StepDefination;


import org.Pages.Loginpage;
import org.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;



public class LoginStepDef {
	private static  String title;
	private Loginpage loginpage = new Loginpage(DriverFactory.getDriver());
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		 DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}
	
	@When("^user get the title of the page$")
	public void user_get_the_title_of_the_page() throws Throwable {
		 title= loginpage.gettitle();
			System.out.println("login page title"+ title);
	}
	
	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String expectedTitlrname ) throws Throwable {
		Assert.assertTrue(title.contains(expectedTitlrname));
	}

	
	@When("^click on username \"([^\"]*)\"$")
	public void click_on_username(String username) throws Throwable {
	   loginpage.enterusername(username);
	}

	@When("^click on password  \"([^\"]*)\"$")
	public void click_on_password(String password) throws Throwable {
	   loginpage.enterpassword(password);
	}
	
	@When("^user click on thelogin buton$")
	public void user_click_on_thelogin_buton() throws Throwable {
	    loginpage.enterbutton();
	}
	@Then("^user gets the title of the home page$")
	public void user_gets_the_title_of_the_home_page() throws Throwable {
		 title= loginpage.gettitle();
			System.out.println("home page title"+ title);
	}

	
	
    
}
