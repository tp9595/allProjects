package Apitesting.Apiproject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class multipleselectiom {
	RequestSpecification requestspcification;

@BeforeClass
public void setupRequest()
{
	requestspcification =RestAssured.given();
	requestspcification
	.log()
	.all()
	.baseUri("https://reqres.in/")
	.basePath("api/users");
}

	@Test
	public void createboking() {

		RestAssured.given().spec(requestspcification)
     	.body("{\r\n" + "    \"name\": \"morpheus\",\r\n"
		+ "    \"job\": \"leader\",\r\n"
		+ "    \"id\": \"305\",\r\n" 
		+ "    \"createdAt\": \"2022-10-11T05:15:32.020Z\"\r\n" 
		+ "}")
		.contentType(ContentType.JSON)
		.when()
		.post()
		.then()
		.statusCode(201);

	}

	@Test
	public void updatebooking() {

		RestAssured.given().spec(requestspcification)
     	.body("{\r\n" + "    \"name\": \"morpheus\",\r\n"
		+ "    \"job\": \"leader\",\r\n"
		+ "    \"id\": \"305\",\r\n" 
		+ "    \"createdAt\": \"2022-10-11T05:15:32.020Z\"\r\n" 
		+ "}")
		.contentType(ContentType.JSON)
		.when()
		.post()
		.then()
		.statusCode(201);

	}

}
