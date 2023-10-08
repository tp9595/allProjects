package org.java_09string;

public class Pankaj {

	public static void main(String[] args) {
		String name = "my name is pankaj";

		String [] n1 = name.split(" ");
		
		String rev="";
		String op="";
		for(int i = n1.length-1; i>=0; i--){
			
			if(n1[i].equals("is")||n1[i].equals("name")){
				n1[i]=n1[i]+"* ";
			}else{
				n1[i]=n1[i]+" ";
			}
			for(int j=n1[i].length()-1; j>=0;j--){
			
				rev = rev+n1[i].charAt(j);
			}
			
		}
		
		System.out.println(rev.trim());
	}

}
