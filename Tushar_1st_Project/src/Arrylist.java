import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Arrylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		List<Integer>list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		 System.out.println(list);
		// list.add(4);
		 list.add(0, 4);
		 System.out.println(list);
		// System.out.println(list.get(0));
		 list.remove(0);
		 System.out.println(list);
		 list.clear();
		 System.out.println(list);
		 
		 
		
		 
		 
		 Iterator<Integer> it =list.iterator();
		 
		 while( it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		 
		 Stack<String>animals =new Stack<>();
		 animals.push("lion");
		 animals.push("horse");  //first in 
		 animals.push("dog");
		 animals.push("cat");
		 System.out.println(animals);
		
		
		
		
		
		
	}

}
