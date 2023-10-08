package Stringprogramprac;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "this is mango tree";
String rev= "";
int len = str.length();

System.out.println(len);
for(int i= len-1; i>=0;i--) 
{
	rev = rev +str.charAt(i);
}
	System.out.println(rev);

	
//	char a[]=str.toCharArray();
//	int len =a.length;
//	
//	for(int i =len-1; i>=0;i--)
//	{
//		rev = rev +a[i];
//	}
//	
//	System.out.println(rev);
	
	// string buffer method
	StringBuffer ghhh = new StringBuffer(str);

	System.out.println(ghhh.reverse());
	//regular expression [^a-zA-Z0-9]
	String s ="tushar 321314&&&   gcgcjg@@$$**";
	String str1=s.replaceAll("[^a-zA-Z0-9 ]", "");
	System.out.println(str1);
	System.out.println();
	String f="tushar padalakr";
	String rev1 ="";
	String f2[]=f.split(" ");
	for(int i =f2.length-1;i>=0;i--)
	{
		rev1= rev1 +f2[i]+" ";
	}
	System.out.println(rev1);
	
	
	
	}
	
	

}
