package shadabcucumberproject;

import io.restassured.RestAssured;

public class shadabputrequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String responceboy =RestAssured.given()
		.header("Content-Type","application/json")
		.baseUri("https://reqres.in/")
		.log()
		.all()
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}").when()
		.put("api/users/2")
		.then()
		.assertThat()
		.statusCode(200).extract().response().asPrettyString();
		
	System.out.println(responceboy);
	
	}

}
