package org.java_08array;

public class One_D_Array {
	
	

	public static void main(String[] args) {
		
		//data type array_name []= {1,2,3,4}//syntax of array
		int rohit[]= {18,28,37,40,85,96};
		        //i=   0  1  2  3  4  5
		System.out.println(rohit[0]);
		System.out.println(rohit[1]);
		System.out.println(rohit[2]);
		System.out.println(rohit[3]);
		System.out.println(rohit[4]);
		System.out.println(rohit[5]);
		System.out.println("*******ForEach**********");
		for(int arroh:rohit) {
			System.out.println(arroh);
		}
		System.out.println("************************");
		System.out.println(rohit.length);//6
//		System.out.println(rohit[0]);//Index  out of bounds for length 6
//		System.out.println(rohit[-1]);//Index  out of bounds for length 6
//		System.out.println(rohit[-2]);//Index  out of bounds for length 6
//		System.out.println(rohit[-3]);//Index  out of bounds for length 6
//		System.out.println(rohit[-4]);//Index  out of bounds for length 6
//		System.out.println(rohit[-5]);//Index  out of bounds for length 6
	
		System.out.println("************************");
		//array declaration 
		int arr[]=new int[5];
		//define
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=10;
		//arr[5]=18;//Index 5 out of bounds for length 5
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("Lenghtof array "+arr.length);
		//System.out.println(arr[5]);//Index 5 out of bounds for length 5
		
	
	}

}
