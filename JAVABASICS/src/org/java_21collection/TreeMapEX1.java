package org.java_21collection;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEX1 {

	public static void main(String[] args) {
		//TreeMap<> hm1 = new TreeMap<>();
		TreeMap<Integer,String> hm1 = new TreeMap<Integer,String>();
		hm1.put(45,"Rohit Sharma");
		hm1.put(11,"Sachin Tendulkar");
		hm1.put(12, "12");
		hm1.put(45, "My Fvrt Player");//If We use Duplicate Key It update latest value for that key.
		hm1.put(48, "Rohit Sharma");
		//hm1.put(null, "Sunny");
		hm1.put(19, null);
		System.out.println(hm1);
		NavigableMap<Integer,String> sorted =hm1.descendingMap();
		System.out.println(sorted);
		hm1.remove(45);
		hm1.replace(07, "Mahi");
		//hm1.remove(hm1, sorted)
		System.out.println(hm1);

	}
}


