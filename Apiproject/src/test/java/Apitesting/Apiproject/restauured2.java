package Apitesting.Apiproject;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class restauured2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sdsd = "[[\r\n"
				+ "			{ \"id\": \"5001\", \"type\": \"None\" },\r\n"
				+ "			{ \"id\": \"5002\", \"type\": \"Glazed\" },\r\n"
				+ "			{ \"id\": \"5005\", \"type\": \"Sugar\" },\r\n"
				+ "			{ \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\r\n"
				+ "			{ \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\r\n"
				+ "			{ \"id\": \"5003\", \"type\": \"Chocolate\" },\r\n"
				+ "			{ \"id\": \"5004\", \"type\": \"Maple\" }\r\n"
				+ "		],\r\n"
				+ "        [\r\n"
				+ "			{ \"id\": \"5001\", \"type\": \"None\" },\r\n"
				+ "			{ \"id\": \"5002\", \"type\": \"Glazed\" },\r\n"
				+ "			{ \"id\": \"5005\", \"type\": \"Sugar\" },\r\n"
				+ "			{ \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\r\n"
				+ "			{ \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\r\n"
				+ "			{ \"id\": \"5003\", \"type\": \"Chocolate\" },\r\n"
				+ "			{ \"id\": \"5004\", \"type\": \"Maple\" }\r\n"
				+ "		]]";
	
		JsonPath jsonpath = new JsonPath(sdsd);
		System.out.println(jsonpath.getString("[1][2]"));
		System.out.println(jsonpath.getList("$").size());
		List<List<Object>> all =jsonpath.getList("");
		System.out.println(all.size());
		System.out.println(all.get(1).size());
		
	
	
	
	}
	

}
