package org.java_06ForLoop;

public class NestedforTringle2 {

	public static void main(String[] args){
		
		for(int i=1;i<=5;i++) {//number of row 
			for(int j=i;j<5;j++) {//number of spaces 
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
	    }
	}
}

		
		
  	

