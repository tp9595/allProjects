package org.java_09string;

public class ToStringMetho2 {
	static int a=25;
	static String Str="USA";
	static String str =new String("Harsha");
 public static void main(String[] args) {
	 ToStringMetho2 obj =new ToStringMetho2();
	 System.out.println("Object :"+obj);//by default it will call toString method
	 ToStringMetho2 obj1 =new ToStringMetho2();
	 System.out.println("Object :"+obj1);
	 System.out.println(a);//96
	 System.out.println(Str);//NewYork
	 System.out.println(Str.toString());
	 System.out.println(str);
 }
  public String toString() {//return type of tostring() method is string.//tostring method is overided here from Object Class
	  a=96;
	  Str="New York";
	  return "Rohit";
	  
  }
	
}

