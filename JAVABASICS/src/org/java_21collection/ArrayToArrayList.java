package org.java_21collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer  ar[]= {10,20,30,45,50,60,45,120,6359};
		Object ar1[]= {"rohit",45,22.5f,'H',56.56,true};
		//List objectList=Arrays.asList(ar1);
		ArrayList <Object>arlist12=new ArrayList<Object>(Arrays.asList(ar));
		arlist12.add("Rohit");
		System.out.println(arlist12);
		
//		List ArrayList = Arrays.asList(ar);
//		System.out.println(ArrayList);

		String  str[]= {"10","20","30","45","50","60"};
		 List arlist = Arrays.asList(str);
		System.out.println(arlist);
		//arlist.add("420");// We can not update List Here 
		System.out.println(arlist);
		
//Therefore Its recommended to create new ArrayList and pass Arrays.asList(array reference)
// as an argument to it (i.e. as an constructor argument of ArrayList)		
		ArrayList<String> arlist1 =new ArrayList<String>(Arrays.asList(str));//preffered
		arlist1.add("zhala ka mag");
		arlist1.add(1, "Ho mag");
		System.out.println(arlist1);
	}
	

}
