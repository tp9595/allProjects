package org.java_21collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {
		//Default capacity 16
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(45,"Rohit Sharma");
		hm.put(10,"Sachin Tendulkar");
		hm.put(07,"MSD");
		hm.put(45, "My Fvrt Player");//If We use Duplicate Key It update latest value for that key.
		hm.put(48,"Rohit Sharma");
		hm.put(null, "Sunny");
		hm.put(19, null);
		hm.put(null, "Harsha");
		System.out.println("Key=Values = "+hm);
		System.out.println(hm.size());
		System.out.println(/* "45 :"+ */hm.get(45));
		System.out.println("******Keys******");
		Set <Integer> s1=hm.keySet();
		for(Integer obj:s1) {
			System.out.println(obj);
		}
		System.out.println(hm.keySet());
		System.out.println("******Values******");
		Collection<String> c1= hm.values();
		for(String obj:c1 ) {
			System.out.println(obj);
		
		}
		System.out.println(hm.values());
		System.out.println("********");
		
		Set<Entry<Integer, String>>  pair =hm.entrySet();
		for(Object st:pair) {
			System.out.println(st);
			
		}
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.get(45));
		
		System.out.println(hm.containsKey(45));
		System.out.println(hm.containsValue("Sachin"));
		
	}

}
