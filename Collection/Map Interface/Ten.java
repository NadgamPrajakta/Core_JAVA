package map_interface;

import java.util.TreeMap;

public class Ten {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
		map.put(6,"F");
		map.put(7,"G");
		map.put(8,"H");
		
		System.out.println("HeadMap(<3): " + map.headMap(3));
		
		System.out.println("TailMap(>=3): " + map.tailMap(3));
		
		System.out.println(map);
		
		
	}

}
