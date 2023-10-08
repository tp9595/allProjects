package org.java_21collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetEX3 {

	public static void main(String[] args) {
		HashSet<Object> h1= new HashSet<Object> ();
		h1.add("Rohit");
		h1.add(20);
		h1.add("20LPA");
		h1.add(null);
		h1.add(26.2f);
		h1.add(20);//Can not add duplicate value.
		h1.add("rohit24@gmail.com");
		h1.add("Nana");
		System.out.println("h1 :"+ h1);
		System.out.println("Initial Size of h1 :"+h1.size());
		HashSet<Object> h2= new HashSet<Object> ();
		h2.add("Rohit");
		h2.add(20);
		h2.add("20LPA");
		h2.add(null);
		h2.add(26.2f);
		h2.add(20);//Can not add duplicate value.
		h2.add("rohit24@gmail.com");
		System.out.println("h2 :"+ h2);
		System.out.println("Initial Size of h2 :"+h2.size());
		System.out.println("***Contains****");
		System.out.println(h1.contains(26.2f));
		System.out.println(h1.contains("LPA"));
		System.out.println("***ContainsAll****");
		//It Checks all Objects of h2 present in h1 or not 
		System.out.println(h1.containsAll(h2));//true
		System.out.println(h2.containsAll(h1));//false
		System.out.println("***removeAll****");
		//h1.removeAll(h2);
		System.out.println("h1 after removeall :"+h1);
		System.out.println("***retainAll****");
		h1.retainAll(h2);
		System.out.println("h1 after reatainAll :"+h1);
		System.out.println("h2 after reatainAll :"+h2);
		
		
	}

}
