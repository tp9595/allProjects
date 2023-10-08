package collectionpratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class arraypratice 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList list = new ArrayList<>(); 
     System.out.println(list.lastIndexOf(list));
      list.add("tushar");
      list.add("akshay");
      list.add("pratik");
      list.add(2);
      list.add(2);
      System.out.println(list.size());
      System.out.println(list);
      Set<Integer> set = new LinkedHashSet<Integer>(list);
      System.out.println(set);
      //arraylist element using for loop
      for(int i=0; i < list.size();i++)
 		
			System.out.println("element is :"+ list.get(i));
  		
      //arraylist elelments using for each loop
      
      for(Object obj1 :list)
      {
    	  System.out.println(obj1);
      }
      
     
   		//arraylist using lambda element
      list.forEach(str-> { System.out.println(str);});
        list.set(2, "pankaj");
        System.out.println(list);
        //collections is class and collection is interface
//        Collections.sort(list);
//        list.forEach(str-> { System.out.println(str);});
        System.out.println("iteratormethod");
        Iterator itr = list.iterator();
        while(itr.hasNext()){//check if iterator has the elements  
     	   System.out.println(itr.next());//printing the element and move to next  
     	  }  
        System.out.println(itr.hasNext());
      //System.out.println(itr);
        System.out.println(itr.next());
        itr.remove();
     System.out.println(itr.next());
       System.out.println(itr.next());
       System.out.println(itr.next());
       System.out.println(itr.hasNext());
        //iterator has three method
       // hasNext()-retuen true or false value
        //,next,
        //remove.it remover element 
        System.out.println(list);
//		  al.isEmpty();
//		  ArrayList<String> al1=new ArrayList<String>() ; 
//		  al1.add("java"); 
//		  al1.add("python"); 
//		  al1.add("ruby"); 
//		  al.addAll(al1);
//		  System.out.println(al);
//		  al.addAll(3, al1);
//		  System.out.println(al);
//		  //al.clear();
//		  System.out.println(al);
//		  ArrayList<String> clonearray  =(ArrayList<String>)al.clone();
//		  System.out.println(clonearray);
//		  
//		
        LinkedList  hgg= new LinkedList();
        hgg.add(hgg);
	}
}
