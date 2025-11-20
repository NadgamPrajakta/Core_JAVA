package queueif;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Six {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(10);
		pq.add(40);
		pq.add(20);
		pq.add(30);
		pq.add(50);
		pq.add(60);
		
		System.out.println(pq);
		
		
		PriorityQueue<String> pq1 = new PriorityQueue<>(Comparator.comparingInt(String::length));
		
		pq1.add("Apple");
		pq1.add("Banana");
		pq1.add("Kiwi");
		pq1.add("Mango");
		
		System.out.println(pq1);
		
	}

}
