package org.StepDefination;

import org.Pages.Loginpage;
import org.Pages.practicepage1;
import org.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practicestepdefination1 {
	private static  String title;
	private practicepage1  page1 = new practicepage1(DriverFactory.getDriver());
	@Given("user log on the appication")
	public void user_log_on_the_appication() {
		 DriverFactory.getDriver().get("http://live.techpanda.org/index.php/");
		
	}

	@When("click on the mobile menu")
	public void click_on_the_mobile_menu() {
		 page1.clickonmobile();
	    
	}

	@Then("verify the title of the page")
	public void verify_the_title_of_the_page() {
		title= page1.gettitle();
		System.out.println(title);
	    
	}

	@Then("click on the sort by and filter by name")
	public void click_on_the_sort_by_and_filter_by_name() {
	    
	    
	}

	@Then("verify all the product sorted by name")
	public void verify_all_the_product_sorted_by_name() {
	    
	    
	}
}
