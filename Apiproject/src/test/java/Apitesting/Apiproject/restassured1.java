package Apitesting.Apiproject;

import java.util.Arrays;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class restassured1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String jsonarray ="[\r\n"
  		+ "  [\r\n"
  		+ "    \"10\",\r\n"
  		+ "    \"20\",\r\n"
  		+ "    \"30\"\r\n"
  		+ "  ]\r\n"
  		+ "  ,\r\n"
  		+ " [\r\n"
  		+ "   \"10\",\r\n"
  		+ "    \"20\",\r\n"
  		+ "    \"30\"\r\n"
  		+ " ]\r\n"
  		+ "      \r\n"
  		+ "]";
	
	JsonPath jsonpath = new JsonPath(jsonarray);
	System.out.println(jsonpath.getString("[1][2]"));
	System.out.println(jsonpath.getList("$").size());
	
	List<Object> inter =(List<Object>) jsonpath.getList("$").get(1);
	System.out.println(inter.size());
	
	
	}

}
