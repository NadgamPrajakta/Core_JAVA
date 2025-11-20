package queueif;

import java.util.LinkedList;
import java.util.Queue;

public class Custom_q10 {

	public static void main(String[] args) {
		
		Queue<Token> tokenQueue = new LinkedList<Token>();
		
		tokenQueue.offer(new Token(10));
		tokenQueue.offer(new Token(11));
		tokenQueue.offer(new Token(12));
		tokenQueue.offer(new Token(14));
		tokenQueue.offer(new Token(16));
		
		while(!tokenQueue.isEmpty()) {
			
			System.out.println("Calling: " + tokenQueue.poll());
		}

	}

}


class Token {
	int number;
	
	public Token(int number) {
		
		this.number = number;
	}
	
	public String toString() {
		return "Token No: " + number;
	}
}
