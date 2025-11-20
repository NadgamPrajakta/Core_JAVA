package custom_map_if;

import java.util.Comparator;
import java.util.TreeMap;

public class Seven {

	public static void main(String[] args) {
		
		Comparator<Person> comp = (p1, p2) -> p1.age - p2.age;
		
		TreeMap<Person, String> map = new TreeMap<Person, String>(comp);
		
		map.put(new Person(30), "Alice");
		map.put(new Person(20), "Bob");
		map.put(new Person(40), "John");
		map.put(new Person(50), "Charlie");
		map.put(new Person(60), "Prajkta");
		
		System.out.println(map);
		
	}

}


class Person {
	int age;
	
	Person(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Age:" + age;
	}
}
