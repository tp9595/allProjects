package Apitesting.Apiproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Objecttojsonmethod {
	
	
	//serilization -
   String    payloadmethod() throws Exception
	{
		Encapclass obj = new Encapclass();
		obj.setJob("QA");
		obj.setName("tushar");
		obj.setUpdatedAt("2022-06-21T14:44:16.295Z");
		
		ObjectMapper objmap = new ObjectMapper();
		String payload =objmap.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(payload);
		return payload;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Objecttojsonmethod  obj = new Objecttojsonmethod ();
		obj.payloadmethod();
		
		
	
	
	
	}

}
