package equalsMethod;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	String department;
	
	Employee(int id, String name, String department) {
		
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(!(obj instanceof Employee)) return false;
		
		Employee e = (Employee) obj;
		
		return id == e.id && name.equals(e.name) && department.equals(e.department);
				
	}
	
	public int hashCode() {
		return Objects.hash(id, name, department);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Prajkta", "IT");
		Employee e2 = new Employee(101, "Prajkta", "IT");
//		Employee e2 = new Employee(103, "Sweetu", "Java");
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode() == e2.hashCode());
	}

}
