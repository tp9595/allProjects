package org.java_21collection;

import java.util.ArrayList;



public class ArrayListEX4 {

	public static void main(String[] args) {
		//Declare Arraylist
		ArrayList<String> ar = new ArrayList<String>();
		System.out.println("isEmpty = "+ar.isEmpty());

		System.out.println(ar.size());
		ar.add("Mumbai");
		ar.add(new String ("Pune"));
		ar.add(String.valueOf("Suraj"));
		ar.add("Be Cool");
		ar.add(null);
		ar.add("RAM RAM");
		ar.add("Haapy Journey");
		System.out.println("Size = "+ar.size());
		System.out.println("ar : "+ar);
		System.out.println("*********************");
		
		
		ar.add(7, "Kalu");
		ar.add(1,"Rohit");
		//ar.add(8,"Lalu");
		//ar.add(8, "Kalu");//You can add in exiting index only
		//it changes the size of previous array and shift also from input  index 
		System.out.println("ar : "+ar);
		System.out.println("Size = "+ar.size());
		System.out.println("*********************");
		System.out.println(ar.set(3,"Dude"));//set replace the existing value in array.
		System.out.println("ar : "+ar);
		System.out.println("Size = "+ar.size());//
		System.out.println("*********************");
		
		}

	}







