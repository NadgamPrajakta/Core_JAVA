package USS.com;

public class Employee2 {
	private int Empid;
	private String name;
	private float salary;
	
	public Employee2(int Empid, String name, float salary) {
		this.Empid= Empid;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee2 emp1 = new Employee2(101, "Prajkta", 50000.0f);
		Employee2 emp2 = new Employee2(101, "Prajkta", 50000.0f);
		
		System.out.println("emp1 == emp2:"+(emp1 == emp2));
		
		System.out.println("emp1.equals(emp2):"+emp1.equals(emp2)); // object.equals()
		
	}

}
