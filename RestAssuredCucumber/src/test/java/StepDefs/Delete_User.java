package StepDefs;

import org.AppHooks.AppHooks;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Delete_User {


	@Given("Delete {int}")
	public void delete(Integer int1) {

		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		AppHooks.repo=
				RestAssured.given()
				.when()
				.pathParam("id", int1)
				.delete("users/{id}")
				.then().extract().response();


	}
}
