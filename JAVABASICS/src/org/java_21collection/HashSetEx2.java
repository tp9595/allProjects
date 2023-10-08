package org.java_21collection;

import java.util.HashSet;

import org.java_01basicProgram.SysoutEx1;

public class HashSetEx2 {

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
		System.out.println("Initial Size of h1 :"+h1.size());
		HashSet<Object> h2= new HashSet<Object> ();
		h2.add("Sunny");
		h2.add(99);
		h2.add(89.59);
		h2.add('R');
		h2.add(true);
		System.out.println("h2 :"+ h2);
		System.out.println("Initial Size of h2 :"+h2.size());
		h1.addAll(h2);
		System.out.println("h1 :"+ h1);
		System.out.println("Size of h1 After addall :"+h1.size());
		System.out.println("Size of h2 After addall :"+ h2.size());
		System.out.println("******Remove*******");
		h1.remove(String.valueOf("Rohit"));//Indexing Is not present in set 
		//therefore we need to pass object to remove method.
		System.out.println("h1 After Removing the Rohit:"+ h1);
		System.out.println("******isEmpty*******");
		System.out.println(h1.isEmpty());
		System.out.println(h2.isEmpty());
		System.out.println("******clear*******");
		h1.clear();
		
		System.out.println("h1 :" +h1);
		System.out.println(h1.isEmpty());
		System.out.println("h2 :" +h2);
		
	}

}
