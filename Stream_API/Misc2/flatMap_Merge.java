package misc2;

import java.util.HashMap;
import java.util.Map;

public class flatMap_Merge {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Laptop", 10);
		map.put("Mobile", 20);
		
		Map<String, Integer> map1 = new HashMap<>();
		
		map1.put("Mobile", 8);
		map1.put("Tablet", 4);
		
		map1.forEach((key, value) -> map.merge(key, value, Integer::sum));
		
		System.out.println(map);
	}

}
