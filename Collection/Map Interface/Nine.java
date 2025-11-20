package map_interface;

import java.util.Map;
import java.util.TreeMap;

public class Nine {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(1, "One");
		map.put(9, "Nine");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(6, "Six");
		map.put(8, "Eight");
		map.put(7, "Seven");
		map.put(10, "Ten");
		
		System.out.println("First key: " + map.firstEntry());
		
		System.out.println("Last key: " + map.lastEntry());
		
		System.out.println(map);
	}

}
