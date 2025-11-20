package queueif;

import java.util.PriorityQueue;

public class Custom_q3 {

	public static void main(String[] args) {
		
		PriorityQueue<Job> pq = new PriorityQueue<Job>();
		
		pq.offer(new Job("Fix Server Issue", 1));
		pq.offer(new Job("Update Website", 3));
		pq.offer(new Job("Database Cleanup", 2));
		
		System.out.println("Processing jobs by Priority");
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

}

class Job implements Comparable<Job> {
	
	String desc;
	int priority;
	
	public Job(String desc, int priority) {
		
		this.desc = desc;
		this.priority = priority;
		
		
	}

	@Override
	public int compareTo(Job o) {
		
		return this.priority - o.priority;
	}
	
	public String toString() {
		return desc + "(Priority: " + priority + ")";
	}
}
