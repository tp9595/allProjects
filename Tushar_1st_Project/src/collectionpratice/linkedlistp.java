package collectionpratice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlistp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList<>();
		list.add("tushar");
		list.add("akshay");
		list.add("pratik");
		list.add("amit");
		System.out.println(list);
		list.add("vnvnbv");
		System.out.println(list);
		list.addFirst("gjgjhgjgjggj");;
		System.out.println(list);
		System.out.println(list.indexOf("tushar"));
	}

}
