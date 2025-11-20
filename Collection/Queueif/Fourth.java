package queueif;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fourth {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("Apple");
		q.add("Banana");
		q.add("Orange");
		q.add("Grapse");
		q.add("Watermelon");
		q.add("Lemon");
		q.add("Mango");
		
		System.out.println("Head:" + q.element());
		
		q.remove();
		
		System.out.println(q);
		
		Iterator<String> itr = q.iterator();
		
		while(itr.hasNext());
		
		System.out.println(itr.next());
			

	}

}
