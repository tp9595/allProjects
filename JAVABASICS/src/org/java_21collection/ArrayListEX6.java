package org.java_21collection;

import java.util.ArrayList;

public class ArrayListEX6 {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 =new ArrayList<Integer>();
		ar1.add(1);
	//	ar1.add(Integer.valueOf(123456));
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		ar1.add(9);
		ar1.add(8);
		ArrayList<Integer> ar2 =new ArrayList<Integer>();
		ar2.add(9);
		//ar2.add(Integer.valueOf(987654));
		ar2.add(10);
		ar2.add(11);
		ar2.add(12);
		ar2.add(13);
		ar2.add(14);
		
		
		System.out.println("ar1 : "+ar1);
		System.out.println("ar2 : "+ar2);
		System.out.println("****rtainAll****");
		ar1.retainAll(ar2);
		System.out.println("ar1 : "+ar1);
		System.out.println("ar2 : "+ar2);
		
		System.out.println(ar1.containsAll(ar2));
		System.out.println("****removeAll****");
		ar1.removeAll(ar2);
		System.out.println("ar1 : "+ar1);
		System.out.println("ar2 : "+ar2);
		
		System.out.println("****Addall****");
		ar1.addAll(ar2);
		
		System.out.println("ar1 : "+ar1);
		System.out.println("ar2 : "+ar2);
		ar2.clear();
		System.out.println("After Clear ar2 : "+ar2);
		
		
		
		
		
	}

}
