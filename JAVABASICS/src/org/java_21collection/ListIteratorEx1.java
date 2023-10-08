package org.java_21collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList<String> str =new ArrayList<String>();		
		
		str.add("rohit");
		str.add("Sunny");
		
		str.add("Munny");
		str.add("Bunny");	
		System.out.println("Str : "+str);		
		ListIterator<String> itr=str.listIterator();
		System.out.println(itr.hashCode());
		System.out.println("Has Next = "+itr.hasNext());//true
		//System.out.println(itr.previous());
		System.out.println("Has Previous before Next = "+itr.hasPrevious());//It Gives False Because it not travels any object till time.
		System.out.println("Next = "+itr.next());//It will print first object.(1 Object Travels)
		System.out.println("Has Previous after Next = "+itr.hasPrevious());//Now it will give true. 
		System.out.println("Previous = "+itr.previous());//havet
		//System.out.println("Previous = "+itr.previous());
		System.out.println("Next = "+itr.next());
		System.out.println("Next = "+itr.next());
		System.out.println("Previous="+itr.previous());
		System.out.println("Has Previous after Next = "+itr.hasPrevious());//true
		itr.remove();		 
		System.out.println(str);
	}

}
