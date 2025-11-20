package queueif;

import java.util.PriorityQueue;

public class Fifth {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.add(40);
		pq.add(60);
		pq.add(50);
		pq.add(70);
		pq.add(80);
		
		System.out.println(pq);
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("C");
		pq1.add("A");
		pq1.add("B");
		pq1.add("D");
		pq1.add("E");
		pq1.add("F");
		pq1.add("P");
		
		System.out.println("Peek:" + pq1.peek());
		
		pq1.poll();
		
		System.out.println(pq1);
	}

}
