package org.java_21collection;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListEX5 {

	public static void main(String[] args) {
		//Declare Arraylist
		ArrayList<Integer> ar = new ArrayList<Integer>(); //int --->Integer 
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
		
		System.out.println("ar : "+ar);
		System.out.println(ar.size());
		System.out.println("***************************");
		ar.remove(2);//It Removes the object at given index
		
		System.out.println("ar : "+ar);
		System.out.println(ar.size());
		System.out.println("***************************");
	    //ar.remove(98);//Error for removing object with its own identity follow below method
		System.out.println("Removed : "+ar.remove(Integer.valueOf(98)));
		System.out.println(ar.remove(Integer.valueOf(51)));//it will not throw any exception.
		System.out.println("ar : "+ar);
		System.out.println(ar.size());
		System.out.println("Contains : "+ar.contains(56));
		System.out.println("Contains : "+ar.contains(98));
		System.out.println("Contains : "+ar.contains(50));
//for Sorting of array need to take help of "Collections" class method.
		Collections.sort(ar);//By default ascending 
		System.out.println("Ascending :"+ar);
		//For Descending (First sort in ascending and then use reverse method)
		Collections.reverse(ar);//it just reverse the array do not sort 
		System.out.println("Descending :"+ar);
		
		}
		
	}
//}





