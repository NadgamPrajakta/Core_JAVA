package ObjectClass;

public class Fifth {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Prajkta", 50000);
		Employee e2 = new Employee(101, "Prajkta", 50000);
		Employee e3 = new Employee(102, "John", 60000);
		
		System.out.println("e1.equals(e2): " + e1.equals(e2));
		System.out.println("e1.equals(e3): " + e1.equals(e3));
		System.out.println("e1.hashCode(): " + e1.hashCode());
		System.out.println("e2.hashCode(): " + e1.hashCode());
		
	}

}
  

class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
				
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) return false;
		
		if(obj == null || getClass () != obj.getClass()) return false;
		
		Employee emp = (Employee) obj;
		return id == emp.id && Double.compare(emp.salary, salary) == 0 && name.equals(emp.name);
	}
	
	
	public int hashCode() {
		
		return(int) (id * 31 + name.hashCode() + salary);
	}
	
	public String toString() {
		return id + " - " + name + " - " + salary;
 				
	}
}

