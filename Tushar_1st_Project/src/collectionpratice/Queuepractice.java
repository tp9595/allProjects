package collectionpratice;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> tushar = new PriorityQueue<>();
		//tushar.add(5);
		tushar.offer(1);
		tushar.offer(2);
		tushar.offer(8);
		tushar.offer(4);
		tushar.offer(5);
		System.out.println(tushar);
		//tushar.poll();
		System.out.println(tushar.peek());

		System.out.println(tushar);
		for(Object  oh :tushar)
		{
			System.out.print(oh + " ");
		}
		System.out.println();
		Iterator itr = tushar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}

		PriorityQueue<Integer> uii = new PriorityQueue<>(); // all queue function work here coz quene implete priority
															// class
		uii.add(1);
		uii.add(22);
		uii.add(33);
		uii.add(344);
		System.out.println("\nsize of queue" + uii.size() + "\nQuene element " + uii);
		// uii.add(null)

		ArrayDeque<Integer> jkkk = new ArrayDeque<>();
		jkkk.offer(56);
		jkkk.offerFirst(52);
		jkkk.offerLast(89);

		System.out.println(jkkk);

	}

}
