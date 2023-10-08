package collectionpratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new LinkedHashSet<Integer>(); // upcasting example
		System.out.println(set.add(8));
		set.add(8);
		set.add(12);
		set.add(15);
		set.add(null);

		System.out.println(set.add(8));
		// set.add("tushar");
		set.add(null);
		System.out.println(set.contains(8));
		System.out.println(set);
		set.remove(10);
		System.out.println(set);
		Set<Integer> set1 = new HashSet<Integer>();//we cant add other type of data
		set1.add(20);
		set1.add(21);
		set1.add(22);
		set1.add(33);
		System.out.println(set1);
		System.out.println("add all");
		set.addAll(set1);
		
		System.out.println(set);
		set.remove(8);
		System.out.println(set1);
		System.out.println(set);
		System.out.println("retain all");
		set.retainAll(set1);//it will retain all element of set1 from set
		
          System.out.println(set);
          set.removeAll(set1);
          System.out.println(set);
		// Set<Integer> seta = new LinkedHashset<>();
		// Set<Integer> setu = new LinkedHashSet<>();
		System.out.println("tree map");
		Set<Integer> setuu = new TreeSet<>();
		setuu.add(8);
		setuu.add(2);
		setuu.add(5);

		System.out.println(setuu);
		Iterator itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] { 4, 5, 6, 7 }));

		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);

		Set<Integer> duplicate = new HashSet<Integer>(first);
		duplicate.removeAll(second);
		System.out.println(duplicate);

		Set s1 = new TreeSet();
		s1.add(8);
		s1.add(86);
		s1.add(10);
		// s1.add(null);
		System.out.println(s1);
		// Collections.reverse(s1);

	}

}
