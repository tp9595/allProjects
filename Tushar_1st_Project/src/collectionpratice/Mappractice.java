package collectionpratice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mappractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer ,Integer> numbers = new HashMap<>();
      numbers.hashCode();
	numbers.put(1, 8);
	numbers.put(2, 6);
	numbers.put(3, 8);
	numbers.put(4, 16);
	numbers.hashCode();
	Map<Integer, Integer> map = new HashMap<>();
	map.put(1, 8);
	map.put(2, 6);
	map.put(3, 6);
	map.put(4, 6);
	map.put(8, 98);
	numbers.putAll(map);
	System.out.println(numbers);
	System.out.println(map.get(4));
	System.out.println();
	System.out.println("key set"+ map.keySet());
	System.out.println("key value" +map.values());
	System.out.println("key and value " + map.entrySet());
//	System.out.println(numbers);
	
	for(Map.Entry<Integer, Integer>  e : numbers.entrySet())
		{
		System.out.println(e);
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
	}
	for(Map.Entry entry :map.entrySet())
	{
		System.out.println(entry.getKey() + "=" + entry.getValue());
	}
	
//	Set s = map.entrySet();
//	Iterator itr = s.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
//	
//	for (String key : numbers.keySet())
//	{
//		System.out.println(key);
//	}
//	
//	
//	for (Integer value : numbers.values())
//	{
//		System.out.println(value);
//	}
//	
//	
//	//iteratore by using forEach and lambda function
//	
//	numbers.forEach((k,v)-> System.out.println("key="+k +  " and value="+v));;
//	}
	
}}
