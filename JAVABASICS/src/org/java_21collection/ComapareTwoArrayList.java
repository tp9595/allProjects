package org.java_21collection;

import java.util.ArrayList;

public class ComapareTwoArrayList {

	public static void main(String[] args) {

		//Declare Arraylist
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("isEmpty = "+ar.isEmpty());
		//Define ArrayList
		System.out.println(ar.size());
		ar.add(50);
		ar.add(98);
		ar.add(Integer.valueOf(52));
		ar.add(-13);
		ar.add(0);
		ar.add(20+98);
		ar.add(51%2);
		ar.add(50);
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(50);
		ar1.add(98);
		ar1.add(48%2);
		ar1.add(50);
//contains All Check whether all ar1 object present in ar or not 
//Will return value in the form of boolean (true/false)
	System.out.println("**********ContainALL*********");	
		System.out.println(ar.containsAll(ar1));
		System.out.println("ar :"+ar);
		System.out.println("ar1 :"+ar1);
		System.out.println("**********RemoveALL*********");	
//remove all method removes all the object from ar which is present in ar1.
	//	ar.removeAll(ar1);
		System.out.println("ar :"+ar);
		System.out.println("ar1 :"+ar1);
		System.out.println("**********RetainAll*********");	
// retain all methods check only retain the object which is present in ar2	
		ar.retainAll(ar1);
		System.out.println("ar :"+ar);
		System.out.println("ar1 :"+ar1);
		

	}

}
