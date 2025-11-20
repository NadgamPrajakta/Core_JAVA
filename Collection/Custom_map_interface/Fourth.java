package custom_map_if;

import java.util.LinkedHashMap;
import java.util.Map;

public class Fourth {

	public static void main(String[] args) {
		
		Map<Car, Integer> map = new LinkedHashMap<Car, Integer>();
		
		map.put(new Car("BMW"), 100);
		map.put(new Car("Audi"), 200);
		map.put(new Car("Tesla"), 300);
		map.put(new Car(" Hyundai"), 400);
		map.put(new Car(" Mahindra"), 500);
		map.put(new Car("Maruti"), 600);
		map.put(new Car(" MG Hector"), 700);
		
		System.out.println(map);
	}
}


class Car {
	
	String model;
	
	Car(String model) {
		this.model = model;
	}
	
	public int hashCode() {
		return model.hashCode();
	}
	
	public boolean equals(Object obj) {
		return this.model.equals(((Car)obj).model);
	}
	
	public String toString() {
		return model;
	}
}