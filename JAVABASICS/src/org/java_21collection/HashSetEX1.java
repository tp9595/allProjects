package org.java_21collection;

import java.util.Collections;
import java.util.HashSet;

public class HashSetEX1 {

	public static void main(String[] args) {
		HashSet<Object> h1= new HashSet<Object> ();
		h1.add("Rohit");
		h1.add(20);
		h1.add("20LPA");
		h1.add(null);
		h1.add(26.2f);
		h1.add(20);//Can not add duplicate value.
		h1.add("rohit24@gmail.com");
		System.out.println("h1 :"+ h1);
		
		for(Object obj:h1) {
			if (obj==null) {
				continue;
			}
			if (obj.equals("Rohit")) {
				
			System.out.println(obj);
			break;
			}
		}
		for(Object obj:h1) {
			System.out.println(obj);
		}
	//Collections.sort(h1); Not Applicable for (HashSet<Object>)
	}

}
