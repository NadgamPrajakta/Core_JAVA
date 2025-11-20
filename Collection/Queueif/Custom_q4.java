package queueif;

import java.util.PriorityQueue;

public class Custom_q4 {

	public static void main(String[] args) {
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>((s1, s2) -> s2.getMarks() - s1.getMarks());
		
		pq.offer(new Student("Prajkta", 94));
		pq.offer(new Student("John", 85));
		pq.offer(new Student("Bob", 92));
		pq.offer(new Student("Alice", 74));
		pq.offer(new Student("charlie", 89));
		
		System.out.println("Students Sorted by Marks (High -> Low):");
		
//		while(!pq.isEmpty());
		
		System.out.println(pq.poll());		
		
	}

}


class Student {
	String name;
	int marks;
	
	public Student(String name, int marks) {
		
		this.marks = marks;
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public String toString() {
		return name + " (Marks: " + marks +")";
	}
}
