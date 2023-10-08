package org.java_21collection;

import java.util.Collections;
import java.util.HashSet;

public class HashSetEX4 {

	public static void main(String[] args) {
		HashSet <Integer>h2 =new HashSet<Integer>();
		h2.add(20);
		h2.add(895623);
		h2.add(Integer.valueOf(56));
		h2.add(85);
		h2.add(8956);
		System.out.println(Collections.min(h2));
		System.out.println("h2: "+h2);
		//Sorting Not Possible here 
		
		System.out.println(h2);
		

	}

}
