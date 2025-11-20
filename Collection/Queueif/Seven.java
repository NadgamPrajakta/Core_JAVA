package queueif;

import java.util.ArrayDeque;

public class Seven {

	public static void main(String[] args) {
		
		ArrayDeque<String> d = new ArrayDeque<String>();
		
		d.add("A");
		d.add("B");
		d.add("C");
		d.add("D");
		d.add("E");
		d.add("F");
		
		System.out.println(d);
		
		d.addFirst("Start");
		d.addLast("End");
		
		System.out.println(d);
		
		
		ArrayDeque<Integer> d1 = new ArrayDeque<Integer>();
		
		d1.add(10);
		d1.add(20);
		d1.add(30);
		d1.add(40);
		d1.add(50);
		d1.add(60);
		
		d1.removeFirst();
		d1.removeLast();
		
		System.out.println(d1);
		
	}

}
