package org.java_21collection;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayLisstToArray {

	public static void main(String[] args) {
		ArrayList<Integer> arlist =new ArrayList<Integer>();
		arlist.add(45);
		arlist.add(Integer.valueOf(78));
		arlist.add(4512);
		arlist.add(null);
		System.out.println("arlist =" +arlist);
		Object ar[]=arlist.toArray();//To convert ArrayList into Array
		System.out.println("after convertion form arraylist to array");
		for (Object obj  :ar) {
			System.out.println(obj);
			
		}
		
		 
		System.out.println("**************");
		for (int i=0;i<arlist.size();i++) {
			System.out.println(ar[i]);
		}
		
		
		
	}

}
