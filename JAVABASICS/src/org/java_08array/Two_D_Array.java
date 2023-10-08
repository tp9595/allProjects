package org.java_08array;

public class Two_D_Array {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};//2*3///lenght=2
		//		System.out.println(arr[0][0]);
		//		System.out.println(arr[0][1]);
		//		System.out.println(arr[0][2]);
		//		System.out.println(arr[1][0]);
		//		System.out.println(arr[1][1]);
		//		System.out.println(arr[1][2]);
		int size=arr.length;
		System.out.println(size);
		System.out.println(arr.length);
		System.out.println("************************");
		for(int i=0;i<arr.length;i++) {//0//1
			for(int j=0;j<=arr.length;j++) {//0//1//2//3//3
				System.out.println(arr[i][j]);
			}
		}
		int arr2d[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=40;
		arr[1][0]=80;
		arr[1][1]=90;
		arr[1][2]=100;
		System.out.println("************************");
		for(int i=0;i<arr.length;i++) {//0//1
			for(int j=0;j<=arr.length;j++) {//0//1//2//3//3
				System.out.println(arr[i][j]);
			}
		}                         
	}

}

