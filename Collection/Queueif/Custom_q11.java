package queueif;

import java.util.LinkedList;
import java.util.Queue;

public class Custom_q11 {

	public static void main(String[] args) {
		
		Queue<RideBooking> rideQueue = new LinkedList<RideBooking>();
		
		rideQueue.offer(new RideBooking("Prajkta"));
		rideQueue.offer(new RideBooking("Angelina"));
		rideQueue.offer(new RideBooking("Peter"));
		rideQueue.offer(new RideBooking("John"));
		rideQueue.offer(new RideBooking("Bob"));
		
		while(!rideQueue.isEmpty()) {
			
			System.out.println("Processing: " + rideQueue.poll());
		}
		
	}

}


class RideBooking {
	
	String customer;
	
	public RideBooking(String customer) {
		
		this.customer = customer;
	}
	
	public String toString() {
		
		return "Booking for: " + customer;
	}
}
