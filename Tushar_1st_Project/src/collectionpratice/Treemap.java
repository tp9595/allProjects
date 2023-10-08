package collectionpratice;

import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeMap<Integer , String> map = new TreeMap<>();
    
    map.put(100, "virat");
    map.put(10, "sachin");
    map.put(108, "bolt");
    map.put(88, "peter");
    map.put(98, "tushar");
    System.out.println(map);
    
    map.forEach((k,v) -> System.out.println("key="+k +"and value=" + v));
		
		System.out.println(map.lastKey());
		//less than 108
		Set<Integer> leassthan =map.headMap(108).keySet();
		System.out.println(leassthan);
		
		//greater than 88
		Set<Integer> greaterthan =map.tailMap(88).keySet();
		System.out.println(greaterthan);
	}

}
