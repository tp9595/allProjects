package Apitesting.Apiproject;

import io.restassured.RestAssured;

public class pathparameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given().log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("{basepath}/{bookingId}")
		.pathParam("basepath", "booking")
		.pathParam("bookingId", "2")
		.when()
		.get()
		.then().log().all();
		
		
	
	}

}
