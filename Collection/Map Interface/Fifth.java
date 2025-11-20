package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class Fifth {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(3, "CDE");
		map.put(1, "ABC");
		map.put(2, "EFG");
		map.put(4, "HIK");
		map.put(6, "MNP");
		map.put(5, "XYZ");
		map.put(8, "SOP");
		map.put(7, "JKL");
		
		System.out.println(map);

	}

}
