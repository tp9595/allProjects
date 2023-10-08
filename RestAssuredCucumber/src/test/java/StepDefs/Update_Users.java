package StepDefs;

import java.io.IOException;

import org.AppHooks.AppHooks;
import org.apache.poi.EncryptedDocumentException;

import com.POJO.Root;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Update_Users {
	
	@Given("Upadte the detail of {string}")
	public void upadte_the_detail_of(String user)  throws EncryptedDocumentException, IOException {
		
		Root rt = new Root();
		
		rt.setEmail(AppHooks.exutil.getDataFromExcel("email",1));
		rt.setName(AppHooks.exutil.getDataFromExcel("name",1));
		rt.setPhone(AppHooks.exutil.getDataFromExcel("phone",1));
		rt.setUsername(AppHooks.exutil.getDataFromExcel("username",1));
		
		String payLoad=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(rt);
		System.out.println(payLoad);
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		AppHooks.repo=
		RestAssured.given()
		.body(payLoad)
	//	.pathParam(user,1)
		.when()
		.patch("users/1")
		.then().extract().response();
	}
}


