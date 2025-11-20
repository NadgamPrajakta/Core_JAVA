package queueif;

import java.util.PriorityQueue;

public class Custom_q6 {

	public static void main(String[] args) {
		
		PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
		
		pq.offer(new Patient("Prajkta", 3));
		pq.offer(new Patient("Angelina", 2));
		pq.offer(new Patient("John", 4));
		pq.offer(new Patient("Bob", 5));
		
		while(!pq.isEmpty()) {
			
			System.out.println("Treating: " + pq.poll());
		}
		
	}

}


class Patient implements Comparable<Patient> {
	
	String name;
	int severity;
	
	public Patient(String name, int severity) {
		
		this.name = name;
		this.severity = severity;
	}
	
	public int compareTo(Patient p) {
		
		return Integer.compare(this.severity, p.severity);
	}
	
	public String toString() {
		
		return name + "(Severity: " + severity +")";
	}
}