package queueif;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Custom_q2 {

	public static void main(String[] args) {
		
		Queue<Customer> queue = new LinkedList<Customer>();
		
		queue.offer(new Customer("Prajkta", 101));
		queue.offer(new Customer("John", 102));
		queue.offer(new Customer("Bob", 103));
		queue.offer(new Customer("Alice", 104));
		queue.offer(new Customer("Peter", 105));
		queue.offer(new Customer("Charlie", 106));
		
		System.out.println("Serving Customers:");
		
		while(!queue.isEmpty()) {
			System.out.println("Serving: " + queue.poll());
		}
		
	}

}


class Customer {
	
	String name;
	int token;
	
	public Customer(String name, int token) {
		this.name = name;
		this.token = token;
	}
	
	public String tostring() {
		
		return name + "(token: " + token + ")";
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, token);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(name, other.name) && token == other.token;
	}
}
