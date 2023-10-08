package org.java_21collection;

import java.util.ArrayList;

public class ClassAgumentToArrayList {
	
	public static int test() {
		int a=20;
		System.out.println("Rohit");
		return a;
		
		
	}

	public static void main(String[] args) {
		ClassAgumentToArrayList obj = new ClassAgumentToArrayList();
		ClassAgumentToArrayList obj1 = new ClassAgumentToArrayList();
		System.out.println(obj.test());
	
		ArrayList< ClassAgumentToArrayList> arlist = new ArrayList< ClassAgumentToArrayList> ();
		arlist.add(obj);
		arlist.add(obj1);
		arlist.add(0, obj1);
		for(ClassAgumentToArrayList obj3 :arlist){//for each 
			System.out.println(obj3);
		
		}
		System.out.println("**********************");
		for(int i =0;i< arlist.size();i++) {//for loop 
		System.out.println(arlist.get(i));
		}
		//System.out.println(arlist.get(0));
		
		

	}

}
