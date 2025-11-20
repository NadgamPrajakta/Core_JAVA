package custom_map_if;

import java.util.HashMap;

public class Nine {

	public static void main(String[] args) {
		
		HashMap<Dept, HashMap<Integer, Employee_1>> org = new HashMap<>();
		
		HashMap<Integer, Employee_1> empList = new HashMap<Integer, Employee_1>();
		
		empList.put(1, new Employee_1("Prajkta"));
		empList.put(2, new Employee_1("John"));
		empList.put(3, new Employee_1("Bob"));
		empList.put(4, new Employee_1("Alice"));
		empList.put(5, new Employee_1("Charlie"));
		
		org.put(new Dept(101), empList);
		
		System.out.println(org);

	}

}


class Dept {
	int id ;
	
	Dept(int id) {
		this.id = id;
		
	}
	
	public String toString() {
		return "Dept:" + id;
		
	}
}

class Employee_1 {
	 String name;
	 
	 Employee_1(String name) {
		 this.name = name;
		 
	 }
	 
	 public String toString() {
		 return name;
	 }
}