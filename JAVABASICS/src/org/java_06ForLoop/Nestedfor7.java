package org.java_06ForLoop;

public class Nestedfor7 {

	public static void main(String[] args) {


		for (int i=7,j=8,k=9;i<=7;i++) {
			for(int l=1;l<=3;l++) {
				if(l==2) 
				continue;
				
				System.out.println(i+" "+j+" "+k);

			}
		}

	}
}



