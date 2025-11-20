package queueif;

import java.util.ArrayDeque;

public class Eight {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		
		stack.pop();
		
		System.out.println(stack);
		
		ArrayDeque<String> q1 = new ArrayDeque<String>();
		
		q1.offer("A");
		q1.offer("B");
		q1.offer("C");
		q1.offer("D");
		q1.offer("E");
		q1.offer("F");
		
		System.out.println(q1);
	}
}
