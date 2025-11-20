package map_interface;

import java.util.HashMap;
import java.util.Map;

public class Fourth {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "Grapes");
		map.put(5, "Mango");
		map.put(6, "Strawberry");
		map.put(7, "Watermelon");
		map.put(8, "Pineapple");
		map.put(9, "Peach");
		map.put(10, "Guava");
		map.put(11, "Kiwi");
		
		
		map.remove(8);
		
		System.out.println(map);
		
		
	}

}
