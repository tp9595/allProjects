package Apitesting.Apiproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojomethod {
	// here we are converting  json to object
	
	void printvalue() throws Exception, Exception 
	{
		String payload ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\",\r\n"
				+ "    \"updatedAt\": \"2022-06-21T14:44:16.295Z\"\r\n"
				+ "}";
	
	ObjectMapper obj = new ObjectMapper();
	Encapclass objEncap =obj.readValue(payload, Encapclass.class);
//	{
//	    "name": "morpheus",
//	    "job": "leader",
//	    "id": "592",
//	    "createdAt": "2022-06-21T15:30:45.871Z"
//	}
	
	
	System.out.println( objEncap.getJob());
	System.out.println(objEncap.getName());
	System.out.println(objEncap.getUpdatedAt());
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Pojomethod obj = new Pojomethod();
		obj.printvalue();
	}

}
