package StepDefs;

import org.AppHooks.AppHooks;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStepdef {
	
	
	@Given("Fetch the details of Users")
	public void fetch_the_details_of_users() {
		AppHooks.logger.info("...Fetching All User Deatil");
		AppHooks.repo=RestAssured.given()
		.baseUri("https://jsonplaceholder.typicode.com/users")
		.when()
		.get()
		.then().extract().response();
	}
	
	@Given("Fetch the details of {int}")
	public void fetch_the_details_of(Integer userNum) {
		AppHooks.logger.info("...Fetching Data of Perticular Users");
		AppHooks.repo=RestAssured.given()
		.pathParam("userNumber", userNum)
		.when()
		.get("https://jsonplaceholder.typicode.com/users/{userNumber}")
		.then().extract().response();
		
	}
	
	@Then("Check Response Body")
	public void check_response_body() {
	String respoBody=AppHooks.repo.getBody().asPrettyString();
	AppHooks.logger.info(respoBody);
	Assert.assertTrue(respoBody!=null);
		
	}

	@Then("Validate response code as {int}")
	public void validate_response_code_as(Integer statuscode) {
	AppHooks.logger.info("Status Code = "+AppHooks.repo.getStatusCode());
	AppHooks.reu.checkStatusCode(statuscode, AppHooks.repo);
		
	}

	@Then("Validate response line as {string}")
	public void validate_response_line_as(String statusline) {
	AppHooks.logger.info("Status Line = "+AppHooks.repo.getStatusLine());
	AppHooks.reu.checkStatusLine(statusline, AppHooks.repo);
	  
	}

	@Then("Validate response time less than  {int}")
	public void validate_response_time_less_than(Integer lessthantime) {
	AppHooks.logger.info("Time Required = "+AppHooks.repo.getTime());
	AppHooks.reu.checkResponseTime(lessthantime, AppHooks.repo);
	    
	}

	@Then("Validate header type as {string}")
	public void validate_header_type_as(String contentType) {
	AppHooks.logger.info("Conatent Type = "+AppHooks.repo.contentType());
	AppHooks.reu.checkContentType(contentType, AppHooks.repo);
	    
	}

	@Then("Validate server type as {string}")
	public void validate_server_type_as(String serverType) {
	AppHooks.logger.info("Server type = "+AppHooks.repo.getHeader("Server"));
	AppHooks.reu.checkServer(serverType, AppHooks.repo);    
	}

}
