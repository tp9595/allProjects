package collectionpratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class arraylistpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al = new ArrayList();					
     System.out.println(al.isEmpty());
     al.add("tushar");
     al.add("amit");
     al.add("roshan");
     al.add(null);
     al.add(null);
     
     System.out.println(al.isEmpty()); //return true or file
		System.out.println(al.size());
		System.out.println(al);
		Collections.reverse(al);
		
		//Collections.shuffle(al);
		
		//System.out.println("collection shuffule" +al);
		//Collections.shuffle(al);
		//System.out.println("collection shuffule" +al);
		
		System.out.println(al);
		 ArrayList al1 = new ArrayList();
		 al1.add("akash");
		 al.addAll(al1);
		 System.out.println(al);
		 al.retainAll(al1);
		 System.out.println(al); //it will give you the common element
		 al.removeAll(al1);
		 System.out.println(al);
		// generic method
		 ArrayList<Integer > up = new ArrayList<Integer>(al);
		 System.out.println(up);
		 System.out.println("--------------");
		 //how to remove duplicate elements from arraylist
		 List<String> l = new ArrayList<String>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple");  
	        System.out.println(l);  
	        Set<String> s = new LinkedHashSet<String>(l);  
	       // we have taken linkedhash set coz of to maintain order
	        System.out.println(s);  
	     
	//make arraylist read only 
    List<String>fruitList = new ArrayList<String>();  
    
    fruitList.add("Mango");  
    fruitList.add("Banana");  
    fruitList.add("Apple");  
    fruitList.add("Strawberry");  
    fruitList.add("Pineapple");  
      
List<String>unmodifiableList= Collections.unmodifiableList(fruitList);  
   //unmodifiableList.add("INDIA");  
   System.out.println(fruitList);  

		 
		 
		 
		 
	}}


