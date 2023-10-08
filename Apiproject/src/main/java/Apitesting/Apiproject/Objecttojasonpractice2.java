package Apitesting.Apiproject;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Objecttojasonpractice2 {

	void postmethod2() throws Exception, Exception
	{
		String payload ="{\r\n"
				+ "	    \"name\": \"morpheus\",\r\n"
				+ "	    \"job\": \"leader\",\r\n"
				+ "	    \"id\": \"592\",\r\n"
				+ "	    \"createdAt\": \"2022-06-21T15:30:45.871Z\"\r\n"
				+ "	}";
	
	ObjectMapper objmap = new ObjectMapper();
	Encapsulationpractice2 objEncap =objmap.readValue(payload, Encapsulationpractice2.class);
	System.out.println("id" +objEncap.getId());
	System.out.println("job" +objEncap.getJob());
	System.out.println("name" +objEncap.getName());
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Objecttojasonpractice2  obj = new Objecttojasonpractice2 ();
		obj.postmethod2();
	
	
	
	}

}
