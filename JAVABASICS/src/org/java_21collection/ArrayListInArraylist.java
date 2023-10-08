package org.java_21collection;

import java.util.ArrayList;

public class ArrayListInArraylist {

	public static void main(String[] args) {
		
		ArrayList<ArrayList> ar =new  ArrayList<ArrayList>();
		
		ArrayList<Integer> ar1 =new ArrayList<Integer>();//0
		ArrayList<String> ar2 =new ArrayList<String>();//1
		ArrayList<Integer> ar3 =new ArrayList<Integer>();//2
		
		ar.add(ar1);
		ar.add(ar2);
		ar.add(ar3);
		System.out.println("ar : "+ar);
		System.out.println("First ArrayList "+ar.get(0));
		System.out.println("Second ArrayList "+ar.get(1));
		System.out.println("Third ArrayList "+ar.get(2));
		ar1.add(10);//0
		ar1.add(25);//1
		ar1.add(98);//2
		ar2.add("Rohit");//0
		ar2.add("Sunny");//1
		ar3.add(12);//0
		ar3.add(63);//1
		ar3.add(9658);//2
		ar3.add(8564);//3
		System.out.println("ar : "+ar);
		System.out.println("First ArrayList "+ar.get(0));//will return ar1
		System.out.println("Second ArrayList "+ar.get(1));//will return ar1
		System.out.println("Third ArrayList "+ar.get(2));//will return ar1
		//ArrayList<Integer>x1=ar.get(0);//ar.get(0) is store in X1.So we can print first ArrayList by using X1.
		//System.out.println("First ArrayList with X1 :"+x1);
		//To print specific object of inn
		//System.out.println(ar.get(0).get(2));
		//To print whole ArrayList we will use Nested for loop.
		
		for(int i =0;i<ar.size();i++) {//0,1,2
			for(int k =0;k<ar.get(i).size();k++) {//0
				System.out.println(ar.get(i).get(k));//0.0//0.1//0.2
			}
		}
		
		
}

}
