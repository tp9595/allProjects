package org.java_09string;

public class StarProgram {

	public static void main(String[] args) {
		
		String str ="My Name is Rohit";
		String rev="";
		for(int i =str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		String fin="";
		String newstr[]=rev.split(" ");
		for(int i=0;i<newstr.length;i++) {
			
			if(i==1 || i==2) {
				newstr[i]=newstr[i].concat("*");
			}
			fin=fin+" "+newstr[i];
		}
		
		System.out.println(fin.trim());
	}

}
