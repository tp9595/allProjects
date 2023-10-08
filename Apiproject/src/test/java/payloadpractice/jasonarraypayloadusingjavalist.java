package payloadpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class jasonarraypayloadusingjavalist {

	 public static void main (String[] arg )
	 {
		 Map<String,String> payload = new HashMap<>();
		   
		   payload.put("id", "1");
		   payload.put("firstName", "tushar");
		 List<Map<String,String>> allemp =new ArrayList<>();
		 allemp.add(payload);
		 
		 RestAssured
		   .given()
		   .log()
		   .all()
		   .body(allemp)
		   .get();
		 
		 
	 }
	
	
	
	
	
}
