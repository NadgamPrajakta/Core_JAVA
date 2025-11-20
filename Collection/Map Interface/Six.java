package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class Six {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>(16, 0.75f, true);
		
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Blue");
		map.put(4, "White");
		map.put(5, "Black");
		map.put(6, "Yellow");
		map.put(8, "Pink");
		map.put(9, "Purple");
		map.put(10, "Mustard");
		map.put(11, "Crimson");
		
		map.get(5);
		
		map.get(7);
		
		System.out.println(map);
	}

}
