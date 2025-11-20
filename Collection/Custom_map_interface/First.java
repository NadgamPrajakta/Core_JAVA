package custom_map_if;

import java.util.HashMap;
import java.util.Map;

public class First {

	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		

		map.put(1, new Student(101, "Prajkta"));
		map.put(2, new Student(102, "John"));
		map.put(3, new Student(103, "Bob"));
		map.put(4, new Student(104, "Alice"));
		map.put(5, new Student(105, "Charlie"));
		
		System.out.println(map);
	}

}

class Student {
	
	int id;
	String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + "-" + name;
	}
	
}


