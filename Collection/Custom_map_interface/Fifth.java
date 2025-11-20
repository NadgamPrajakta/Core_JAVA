package custom_map_if;

import java.util.LinkedHashMap;
import java.util.Map;

public class Fifth {

	public static void main(String[] args) {
		
		Map<Integer, Product> map = new LinkedHashMap<Integer, Product>();
		
		map.put(1, new Product(101, "Laptop"));
		map.put(2, new Product(102, "Mobile"));
		map.put(2, new Product(103, "Projectors"));
		map.put(2, new Product(104, "LED TV"));
		map.put(2, new Product(105, "Combo"));
		
		System.out.println(map);
		
	}

}


class Product {
	
	int id;
	String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + "-" + name;
	}
	
	
}
