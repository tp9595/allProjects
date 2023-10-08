package Apitesting.Apiproject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class postrequest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Build request
//		RequestSpecification requestspcification =RestAssured.given();
//		requestspcification =	requestspcification.log().all();
//		requestspcification.baseUri("https://reqres.in/");
//		requestspcification.basePath("api/users");
//		
//		requestspcification.body("{\r\n"
//				+ "    \"name\": \"morpheus\",\r\n"
//				+ "    \"job\": \"leader\",\r\n"
//				+ "    \"id\": \"305\",\r\n"
//				+ "    \"createdAt\": \"2022-10-11T05:15:32.020Z\"\r\n"
//				+ "}");
//		requestspcification.contentType(ContentType.JSON);
//		//hit request and get responce
//		Response response =requestspcification.post();
//		
//		//validate responce
//		ValidatableResponse     validatableResponce  =response.then().log().all();
//		validatableResponce.statusCode(201);
//		
		//Build request
		RestAssured.given()
		.log()
		.all()
		.baseUri("https://reqres.in/")
		.basePath("api/users")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"305\",\r\n"
				+ "    \"createdAt\": \"2022-10-11T05:15:32.020Z\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		//hit the request and get the responce
		.post()
		//validate the response
		.then()
		.log()
		.all()
		.statusCode(201);
		
		
	}

}
