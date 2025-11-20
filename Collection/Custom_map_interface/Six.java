package custom_map_if;

import java.util.TreeMap;

public class Six {

	public static void main(String[] args) {
		
		TreeMap<Student_1, String> map = new TreeMap<Student_1, String>();
		
		map.put(new Student_1(3, "Prajkta"), "ABC");
		map.put(new Student_1(1, "John"), "DEF");
		map.put(new Student_1(2, "Bob"), "XYZ");
		map.put(new Student_1(4, "Alice"), "MNP");
		map.put(new Student_1(5, "Charlie"), "SOP");
		
		System.out.println(map);
	}
}


class Student_1 implements Comparable<Student> {
	
	int id;
	String name;
	
	Student_1(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student obj) {
		return this.id - obj.id;
	}
	
	public String toString() {
		return "S" + id;
	}
}
