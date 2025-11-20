package map_interface;

import java.util.Map;
import java.util.TreeMap;

public class Eight {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(30, "ABC");
		map.put(10, "DEF");
		map.put(20, "GHI");
		map.put(40, "JKL");
		map.put(60, "MNP");
		map.put(50, "OQR");
		map.put(80, "XYZ");
		map.put(70, "TVW");
		
		System.out.println(map);
		

	}

}
