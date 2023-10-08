package org.java_21collection;

import java.util.HashSet;
import java.util.Iterator;


public class Iterator1 {

	public static void main(String[] h1gs) {
		HashSet<Integer> h1 = new HashSet <Integer>();
		System.out.println("isEmpty = "+h1.isEmpty());
		//Define h1rayList
		System.out.println(h1.size());
		h1.add(50);
		h1.add(98);
		h1.add(Integer.valueOf(52));
		h1.add(-13);
		h1.add(0);
		h1.add(20+98);
		h1.add(51%2);
		h1.add(50);
		System.out.println("Size = "+h1.size());
		System.out.println("h1 = "+h1);
		
		Iterator<Integer>itr= h1.iterator();
		//System.out.println("HasNext :"+itr.hasNext());
		while(itr.hasNext()) {
		
		
		Integer ruhu =	itr.next();
		System.out.println(ruhu);
		if (ruhu.equals(98)) {
			System.out.println(ruhu);
			itr.remove();
		    break;
		}
		
		}
	//	System.out.println(itr.hasNext());
	//	System.out.println(itr.next());
		System.out.println("after remove "+h1);
		
		//for()
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		

	}

}
