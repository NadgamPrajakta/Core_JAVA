package queueif;

import java.util.LinkedList;
import java.util.Queue;

public class Custom_q7 {

	public static void main(String[] args) {
		
		Queue<Passenger> queue = new LinkedList<Passenger>();
		
		queue.offer(new Passenger("Prajkta"));
		queue.offer(new Passenger("Riya"));
		queue.offer(new Passenger("Peter"));
		queue.offer(new Passenger("John"));
		queue.offer(new Passenger("Angelina"));
		
		System.out.println("Boarding Order:");
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
		}
	

	}

}


class Passenger {
	
	String name;
	
	public Passenger(String name) {
		 
		this.name = name;
	}
	
	public String toString() {
		
		return "Passenger: " + name;
	}
}
