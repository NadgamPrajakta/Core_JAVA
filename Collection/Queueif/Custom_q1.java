package queueif;

import java.util.LinkedList;
import java.util.Queue;

public class Custom_q1 {

	public static void main(String[] args) {
		
		Queue<Task> taskQueue = new LinkedList<Task>();
		
		taskQueue.offer(new Task("Send Email"));
		
		taskQueue.offer(new Task("Generate Report"));
		
		taskQueue.offer(new Task("Backup Database"));
		
		System.out.println("Processing Tasks (FIFO):");
		
		while(!taskQueue.isEmpty() ) {
			System.out.println(taskQueue.poll());
		}
	}

}

class Task {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Task: " + name;
	}
}
