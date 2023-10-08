package Apitesting.Apiproject;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class httpdelete {
	ValidatableResponse validatableResponse;
	 
    @Test
    public void deleteUser() {
 
         
    validatableResponse = given()
                                .baseUri("http://dummy.restapiexample.com/api/v1/delete/3")
                                .contentType(ContentType.JSON)
                         .when()
                                .delete()
                         .then()
                                .assertThat().statusCode(200)
                                .body("message", equalTo("Successfully! Record has been deleted"));
 
        System.out.println("Response :" + validatableResponse.extract().asPrettyString());
 
    }
 
}

