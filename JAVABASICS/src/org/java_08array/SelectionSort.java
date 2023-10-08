package org.java_08array;

public class SelectionSort {

	
	public static void sort(int ar[]) {
		//{20,95,62,69,58,62,56};
		System.out.println("Before Sorting");
		for (int i=0;i<ar.length;i++) {
			
			System.out.println(ar[i]);
		}
		
		for(int i=0;i<ar.length;i++) {
			for (int j=i+1;j<ar.length;j++){
				if(ar[i]<ar[j]) {//i =20//j=95
					int temp =ar[i];//20
					ar[i]=ar[j];//95
					ar[j]=temp;//20
					
				}
			}
			
		}

		
		  System.out.println("After Descending  Sorting"); 
		  for (int i=0;i<ar.length;i++) {
		  
		  System.out.println(ar[i]); }
		 
		
		for(int i=0;i<ar.length;i++) {
			for (int j=i+1;j<ar.length;j++){
				if(ar[i]>ar[j]) {
					int temp =ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("After Ascending   Sorting");
		for (int i=0;i<ar.length;i++) {
			
			System.out.println(ar[i]);
		}
		
		
	}
	public static void main(String[] args) {
		int ar[]= {20,95,62,69,58,62,56};
		SelectionSort.sort(ar);
	}

}
