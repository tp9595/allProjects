package org.java_21collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEX2 {

	public static void main(String[] args) {
		//Declare Arraylist
		ArrayList<Object> ar=new ArrayList<Object>();
		System.out.println("isEmpty = "+ar.isEmpty());//boolean

		System.out.println(ar.size());
		ar.add("Mumbai");
		ar.add(new String ("Pune"));
		ar.add(Boolean.valueOf(true));
		ar.add(Double.valueOf(44.88));
		ar.add(new Boolean(true));//Deprecated 
		ar.add('R');//Implicit boxing 
		ar.add(new ArrayListEX2());//It Will Store object of User defined class
		//Here its Calling toString Method & Printing (Fully Qualified Class)
		//Collections.sort(ar);Can not use for object argument.
		System.out.println("ar : "+ar);
		System.out.println("*********************");
		System.out.println("Size = "+ar.size());
		System.out.println("*********************");
		System.out.println("1 : "+ar.get(1));
		System.out.println("*********************");
		for(Object obj:ar) {//For each Loop
			System.out.println(obj);
		}
		System.out.println("*********************");
		for (int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}


}


