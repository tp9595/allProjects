package stepDefinitions;

import org.applicationHooks.AppHooks;
import org.pages.FlipkartLoginPage;
import org.qa.factory.DriverFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLoginStepDef {
	FlipkartLoginPage flp_obj = new FlipkartLoginPage(DriverFactory.getDriver());
	
//	@Given("User is on the login page")
//	public void user_is_on_the_login_page() {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//	}
//	@Then("Title of login page should be {string}")
//	public void title_of_login_page_should_be(String expTitle) {
//		String actTitle = flp_obj.getLoginPageTitle();
//		Assert.assertEquals(actTitle, expTitle);
//		AppHooks.scn.log("Login page title matched!");
//	}
//	@Then("Page url is displayed as {string}")
//	public void page_url_is_displayed_as(String expUrl) {
//		String actUrl = flp_obj.getLoginPageUrl();
//		Assert.assertEquals(actUrl, expUrl);
//		AppHooks.scn.log("Login page URL matched!");
//	}
//	@Then("Verify UserName and Password fields are displayed")
//	public void verify_user_name_and_password_fields_are_displayed() {
//		Assert.assertTrue(flp_obj.isUserNameFieldDisplayed());
//		Assert.assertTrue(flp_obj.isPasswordFieldDisplayed());
//	}
//	@Then("Login button is displayed")
//	public void login_button_is_displayed() {
//		Assert.assertTrue(flp_obj.isLoginBtnDisplayed());
//	}
//	@When("User enters username")
//	public void user_enters_username() {
//		flp_obj.enterUserName(AppHooks.prop.getProperty("userName"));
//	}
//	@When("User enters password")
//	public void user_enters_password() {
//		flp_obj.enterPassword(AppHooks.prop.getProperty("password"));
//	}
//	@When("User clicks on login button")
//	public void user_clicks_on_login_button() {
//		flp_obj.clickLoginButton();
//	}
//	@Then("My Account button is displayed")
//	public void my_account_button_is_displayed() {
//		Assert.assertTrue(flp_obj.isMyAccountBtnDisplayed());
//		AppHooks.scn.log("My Account button is displayed!");
//	}
//	@Then("Tabs displayed are {string}")
//	public void tabs_displayed_are(String allTabs) {
//		Assert.assertTrue(flp_obj.verifyDashboardTabs(allTabs));
//	}
}