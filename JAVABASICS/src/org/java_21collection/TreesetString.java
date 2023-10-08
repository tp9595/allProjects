package org.java_21collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreesetString {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Rohit");
		tset.add("Sunny");
		tset.add("royal");
		tset.add("mahajan");
		
		System.out.println("tset : "+tset);
		Set<String> s1=tset.descendingSet();
	
		//TreeSet<String> rev = (TreeSet<String>)tset.descendingSet(); No need 
		//System.out.println("rev : "+rev);
		System.out.println("S1 :" +s1);
		TreeSet<Integer> iset = new TreeSet<Integer>();
		iset.add(10);
		iset.add(20);
		iset.add(90);
		iset.add(30);
		iset.add(40);
		
		
		System.out.println("iset : "+iset);
		TreeSet<Integer> rev1 = (TreeSet<Integer>)iset.descendingSet(); 
		System.out.println("iset Rev :"+rev1);
		
		TreeSet<Object> obj = new TreeSet<Object>();
//		obj.add("10");
//		obj.add("Rohit");
//		obj.add("true");
//		obj.add("23.5f");
//		obj.add("56.89");
		obj.add(10);
		//obj.add("Rohit");
		//obj.add("true");
		obj.add(23);
		obj.add(56);
		
		//TreeSet<Object> rev2 = (TreeSet<Object>)obj.descendingSet();
		System.out.println("obj : "+obj);
		System.out.println("obj : "+rev1);
	}

}
