package Jsonpackage;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class json3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String jsoppath ="[\r\n"
		+ "  \"10\",\r\n"
		+ "  \"20\",\r\n"
		+ "  \"30\",\r\n"
		+ "  \"40\",\r\n"
		+ "  \"50\"\r\n"
		+ "]";
JsonPath jsonpath = new JsonPath(jsoppath);
System.out.println(jsonpath.get("[0]"));
System.out.println(jsonpath.getList("$").size());
		
String json ="[\r\n"
		+ "  [\r\n"
		+ "    \"10\",\r\n"
		+ "    \"20\",\r\n"
		+ "    \"30\",\r\n"
		+ "    \"40\",\r\n"
		+ "    \"50\"\r\n"
		+ "  ],\r\n"
		+ "  [\r\n"
		+ "    \"100\",\r\n"
		+ "    \"200\",\r\n"
		+ "    \"300\",\r\n"
		+ "    \"400\",\r\n"
		+ "    \"500\"\r\n"
		+ "  ]\r\n"
		+ "]";

JsonPath jsoppa = new JsonPath(json);
System.out.println(jsoppa .get("[1][1]"));
System.out.println(jsoppa .getList("$").size());

List<Object>  interlist =(List<Object>)jsoppa.getList("$").get(0);
System.out.println(interlist.size());

	}

}
