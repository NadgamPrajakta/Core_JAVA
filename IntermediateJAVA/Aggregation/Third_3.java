package aggregation;

public class Third_3 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Prajkta");
		
		Company c = new Company(emp);
		
		c.displayemployee();
	}

}


class Employee {
	private String empName;
	
	public Employee(String empName) {
		
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
}


class Company {
	private Employee employee;
	
	public Company(Employee employee) {
		
		this.employee = employee;
	}
	
	public void displayemployee() {
		
		try {
			if(employee == null) 
				
				throw new Exception("No employee data available..!");
			
			System.out.println("Employee Name: " + employee.getEmpName());
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
