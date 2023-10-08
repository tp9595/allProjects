package org.java_21collection;

import java.util.ArrayList;
import java.util.List;

public class ListArrayEX {

	public static void main(String[] args) {
		
		
		List<Integer> ar11 = new ArrayList<Integer> ();//Need to import ArrayList Class present in java.util
		List ar = new ArrayList ();
		
		ar.add(25);
		ar.add("Bunny");
		for(Object obj: ar) {
			System.out.println(obj);
		}
		ArrayList<Short> ar1 = new ArrayList<Short> ();//Homogeneous Data 
		
		ArrayList<Byte> ar2 = new ArrayList<Byte> ();//Homogeneous Data
		
		ArrayList<Integer> ar3 = new ArrayList<Integer> ();//Homogeneous Data 
		
		ArrayList<Double> ar4 = new ArrayList<Double> ();//Homogeneous Data
		
		ArrayList<ListArrayEX> ar5 = new ArrayList<ListArrayEX> ();//Object of class 
		
		ArrayList<Object> ar12 = new ArrayList<Object> ();//Object of Super class its Heterogeneous 
		
		
		

	}

}
