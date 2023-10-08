package org.java_08array;

public class WithsingleFor {

	public static void main(String[] args) {

		int ar[]= {10,20,96,52,85,100};
		int i=0;

		for(int j=i+1;j<ar.length;j++){
			if(ar[i]<ar[j]) {
				int temp =ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			System.out.println(ar[i]);
			if(j==ar.length-1) {
				i++;
			}

		}
		if (i==1) {
			System.out.println("large Number= " +ar[1]);
			//break;

		}

	}
}
