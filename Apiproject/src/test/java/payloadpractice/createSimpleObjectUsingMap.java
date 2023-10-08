package payloadpractice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

public class createSimpleObjectUsingMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   Map<String,String> jsonObjectPayload = new HashMap<>();
   
   jsonObjectPayload.put("id", "1");
   jsonObjectPayload.put("firstName", "tushar");
   jsonObjectPayload.put("LastName", "padalkar");
   jsonObjectPayload.put("married", "false");
   jsonObjectPayload.put("salery", "123.44");
		
   //by object mapper
   String json = new ObjectMapper().writeValueAsString(jsonObjectPayload);
   System.out.println(json);
   //by rest assured
   RestAssured
   .given()
   .log()
   .all()
   .body(jsonObjectPayload)
   .post();
	
   
	}

}
