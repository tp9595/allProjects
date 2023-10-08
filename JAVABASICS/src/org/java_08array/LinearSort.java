package org.java_08array;

public class LinearSort {

	public static void main(String[] args) {
		linearSerchMax();
		linearSerchMin();
		
	}
	
	public static void linearSerchMax() {
		int ar[]= {10,20,98,5,6,89};
		int max =ar[0];
		for(int i=1;i<ar.length;i++) {
			if(max<ar[i]) {//10<20,10<98,10<5
				max=ar[i];
			//	System.out.println(max);
			}
		}System.out.println("Max No. :"+max);
	}
	public static void linearSerchMin() {
		int ar[]= {10,20,98,5,6,89};
		int min =ar[0];
		for(int i=1;i<ar.length;i++) {
			if(min>ar[i]) {//10<20,10<98,10<5
				min=ar[i];
			//	System.out.println(max);
			}
		}System.out.println("Min No."+min);
	}
}
