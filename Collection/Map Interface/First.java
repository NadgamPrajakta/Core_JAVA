package map_interface;

import java.util.HashMap;
import java.util.Map;

public class First {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,"ABC");
		map.put(2, "DEF");
		map.put(3, "GHI");
		map.put(4, "XYZ");
		
		System.out.println(map);

	}

}
