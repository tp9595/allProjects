package org.java_08array;

public class Pnkaj {
	
	public static void main (String[]args) {
	
	int arr[] = {20,36,52,89,86};	
	int a=0;
	int i=1;
	int temp=0;
	for(; a<arr.length; i++){
		if(arr[a]>arr[i]){
			temp=arr[a];
			arr[a]=arr[i];
			arr[i]=temp;
		}
		System.out.println(arr[i]);
		if(i==arr.length-1){
			i=a;
			a++;
			
		}
	}
	System.out.println(arr[arr.length-2]);

}
	}
