package variables;

public  class statickeyword {
	
	
	
// global static variable
	static int i =10;
	static String s ="test";
	static char c = 'a';
	static float f = 10.5f;
			

// 	nonstatic global variable
			int p = 12 ;
	 String q ="test";
	 char r = 'a';
	 float t = 10.5f;
	  
	 void nonstaticmethod()
	 {
		  int p=54;
		 System.out.println(i);
		 System.out.println(s);
		
	 }
	   static void staticmethod()
	   {
		   c =100;
		   System.out.println("i");
		   System.out.println("hi");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statickeyword obj =new statickeyword ();
  obj.nonstaticmethod();
 System.out.println(statickeyword.c);
  staticmethod();
	}

}
