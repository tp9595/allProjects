package org.StepDefination;

import java.util.List;
import java.util.Map;

import org.Pages.Homepage1;
import org.Pages.Loginpage;
import org.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagestepdef {
	private static  String tit;
	private Loginpage loginpage = new Loginpage(DriverFactory.getDriver());
	private Homepage1 homepage;
	@Given("user has already logged in application")
	public void user_has_already_logged_in_application(DataTable dataTable) {
	    List<Map<String , String>> credlist = dataTable.asMaps();
	   String userName= credlist.get(0).get("username");
	   String password= credlist.get(0).get("password");
	   DriverFactory.getDriver().get("https://www.saucedemo.com/");
	   homepage= loginpage.dologin(userName, password);
	   
	}
//
//	@Given("user is on the home page")
//	public void user_is_on_the_home_page() {
//		 tit= homepage.gethomepagetitle();
//			System.out.println("login page title"+ tit);
//	    
//	}
//
	@When("User click on tshirt")
	public void user_click_on_tshirt() {
	   homepage.getclickontshirt();
	    
	}

	@Then("we can thshirt window")
	public void we_can_thshirt_window() {
	 homepage.gethomepagetitle();
	    
	}

	@When("User click second tshirt")
	public void user_click_second_tshirt() {
	   homepage.getclickonsecondtshirt();
	    
	}

	@Then("we can  second thshirt window")
	public void we_can_second_thshirt_window() {
		 homepage.gethomepagetitle();
	   
	}

	
	
}
