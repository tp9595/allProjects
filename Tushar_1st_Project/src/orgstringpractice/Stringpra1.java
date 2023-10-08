package orgstringpractice;

public class Stringpra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char arr[] = {'j','a','v','a'};
     String s = new String(arr);
     System.out.println(s);
     String s1 = "tushar";
     String s2 = "hello";
     String s3 = new String("tushar");
     String s4 = new String("tushar");
     
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s3));
     System.out.println(s1==s2);
     System.out.println(s1==s3);
     s1.concat("he");
     System.out.println(s1.concat(s2));
	}

}
