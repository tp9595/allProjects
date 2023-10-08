package Apitesting.Apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class getrequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   given()
				.log()
				.all()
				.baseUri("https://reqres.in/")
				.basePath("/api/users/")
				//.pathParam("page", 2)
				.queryParam("page", 2)
			.when()
				.get()
			.then()
				.log()
				.all()
				.statusCode(200);
		
		
	}

}
