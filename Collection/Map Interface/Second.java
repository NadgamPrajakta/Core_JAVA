package map_interface;

import java.util.HashMap;
import java.util.Map;

public class Second {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "Java");
		map.put(20, "Python");
		map.put(30,  "C++");
		map.put(40,  "Javascript");
		map.put(50, "HTML & CSS");
		
		System.out.println("Keys: " + map.keySet());
		
		System.out.println("Values: " + map.values());   // Access keys & values

	}

}