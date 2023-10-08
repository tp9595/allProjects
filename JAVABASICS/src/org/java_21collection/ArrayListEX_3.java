package org.java_21collection;

import java.util.ArrayList;



public class ArrayListEX_3 {

	public static void main(String[] args) {
		//Declare Arraylist
		ArrayList<String> ar = new ArrayList<String>();
		System.out.println("isEmpty = "+ar.isEmpty());//true
      
		System.out.println(ar.size());//0
		ar.add("Mumbai");
		ar.add(new String ("Pune"));
		ar.add(String.valueOf("Suraj"));
		ar.add("Be Cool");
		ar.add(null);
		ar.add("RAM RAM");
		ar.add("Haapy Journey");
		ar.trimToSize();//ArrayList Allocate 10 default index so to trim unoccupied index place we use this method.
		ar.add("Bhai");
		System.out.println("ar : "+ar);
		System.out.println("*********************");
		System.out.println("Size = "+ar.size());
		System.out.println("*********************");
		System.out.println("0 : "+ar.get(0));
		System.out.println("*********************");
		for(String obj:ar) {//For each Loop
			System.out.println(obj);
		}
		//ar.indexOf("Be Cool");
	
		System.out.println(ar.indexOf("Be Cool"));
		System.out.println("*********************");
		String str;
		for (int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));//With Null	
			str =ar.get(i);

			if(str==null) {
				continue;
			}
				
			//System.out.println(ar.get(i));//Without Null
			if(str.equals("RAM RAM"))
				System.out.println(ar.get(i));
			
		}
			
		}
	}






