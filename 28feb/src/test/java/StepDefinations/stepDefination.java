package StepDefinations;

import org.openqa.selenium.WebDriver;

import ObjectRe.Loginpage;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumutil.Utilfiles;

public class stepDefination extends Utilfiles{
	public static WebDriver diver = null;
       static String url ,userName, pwd ;
       Loginpage loginpage;
       
	@Given("^user open the application$")
	public void user_open_the_application() throws Throwable {
	    url= readProperFile("appurl");
	   
	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() throws Throwable {
		userName =readProperFile("username");
		pwd =readProperFile("password");
		
	   
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    
		System.out.println("user click on the login button");
	}

	@Then("^User navigated to home page$")
	public void user_navigated_to_home_page() throws Throwable {
		System.out.println("User navigated to home page");
	   
	}

	@Then("^It shows the error message$")
	public void it_shows_the_error_message() throws Throwable {
		System.out.println("It shows the error message");
	   
	}



}
