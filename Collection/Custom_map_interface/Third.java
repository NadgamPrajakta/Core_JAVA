package custom_map_if;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Third {

	public static void main(String[] args) {
		
		Map<Employee, Employee> map = new HashMap<Employee, Employee>();
		
		map.put(new Employee(1, "Prajkta"), new Employee(10, "AA"));
		map.put(new Employee(2, "John"), new Employee(20, "BB"));
		map.put(new Employee(3, "Bob"), new Employee(30, "CC"));
	    map.put(new Employee(4, "Alice"), new Employee(40, "DD"));

	    System.out.println(map);
	}

}


class Employee { 
	
	 int id;
	 String name;
	 
	 public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	 }

	 @Override
	 public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	 }

	 @Override
	 public int hashCode() {
		return Objects.hash(id, name);
	 }

	 @Override
	 public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	 }	 	 
}
