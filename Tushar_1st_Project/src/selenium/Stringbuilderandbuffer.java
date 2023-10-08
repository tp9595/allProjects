package selenium;

public class Stringbuilderandbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuffer buffer = new StringBuffer("this is test data");
//		StringBuilder builder = new StringBuilder("This is test data");
//		
//		buffer.append("alpha");
//		System.out.println(buffer);
//		buffer.replace(8, 12, "my");
//		System.out.println(buffer);
//		// now we will do it without puting manually index number
//		int startpoint = builder.indexOf("t");
//		System.out.println(startpoint);
//		int endpoint  = builder.indexOf("t", startpoint+1);
//		System.out.println(endpoint);
//		
		
	//	System.out.println(builder.replace(startpoint, endpoint+1, "my"));
		
		StringBuilder build = new StringBuilder("Hey Hello.My name is Harry.");
//		int point1 = build.indexOf("H");
//		System.out.println(point1);
//		int endpoint2  = build.indexOf("o");
//		System.out.println(endpoint2);
		//System.out.println(build.replace(point1, endpoint2+1, "Hi"));
	System.out.println(build.replace(4, 9, "hi"));
	System.out.println(build.replace(18, 23, "nick"));
	
	
	
	
	
	}

}
