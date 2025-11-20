package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class Seven {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>(3, 0.75f, true){
			
			protected boolean removeEldestEntry(Map.Entry e) {
				
				return size() > 3;
			}
		};
		
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
		map.put(6,"F");
		map.put(7,"G");
		map.put(8,"H");
		
		System.out.println(map);



	}

}
