package queueif;

import java.util.LinkedList;
import java.util.Queue;

public class Custom_q9 {

	public static void main(String[] args) {
		
		Queue<Call> callQueue = new LinkedList<Call>();
		
		callQueue.offer(new Call("Customer1"));
		callQueue.offer(new Call("Customer2"));
		callQueue.offer(new Call("Customer3"));
		callQueue.offer(new Call("Customer4"));
		callQueue.offer(new Call("Customer5"));
		
		while(!callQueue.isEmpty()) {
			
			System.out.println("Answering -> " + callQueue.poll());
		}
		
	}

}


class Call {
	
	String caller;
	
	public Call(String caller) {
		
		this.caller = caller;
	}
	
	public String toString() {
		
		return "Call from: " + caller;
	}
}
