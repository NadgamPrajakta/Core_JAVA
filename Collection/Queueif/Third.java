package queueif;

import java.util.LinkedList;
import java.util.Queue;

public class Third {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("ABC");
		q.add("CDE");
		q.add("XYZ");
		
		System.out.println(q);
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		
		System.out.println("Head:" + q1.peek());
		
		q1.poll();
		
		System.out.println(q1);
		
	}

}
