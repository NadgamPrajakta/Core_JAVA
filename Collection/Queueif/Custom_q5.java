package queueif;

import java.util.ArrayDeque;
import java.util.Queue;

public class Custom_q5 {

	public static void main(String[] args) {
		
		Queue<Order> orderQueue = new ArrayDeque<Order>();
		
		orderQueue.offer(new Order(101, "Laptop"));
		orderQueue.offer(new Order(102, "Phone"));
		orderQueue.offer(new Order(103, "Tablet"));
		
		System.out.println("Processing Orders:");
		
		while(!orderQueue.isEmpty()) {
			
			System.out.println(orderQueue.poll());
		}
	}

}


class Order {
	
	int orderId;
	String item;
	
	public Order(int orderId, String item) {
		
		this.orderId = orderId;
		this.item = item;
		
	}
	
	public String toString() {
		
		return "OrderID: " + orderId + ", Item: " + item;
	}
}
