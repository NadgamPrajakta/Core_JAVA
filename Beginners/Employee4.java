package USS.com;

public class Employee4 {
	static int companyCount = 0; // static field 
	int empid;
	String empName;
	double salary;  // Instance field
	
	int taskCount = 0;  // Non-Static field
	
	// Constructor
	public Employee4(int id, String name, double salary, int companyCount){
		empid = empid;
		empName = empName;
		salary = salary;
		companyCount = companyCount;    // Increment company employee count when a new employee is created 
		
		}
	
	// Static Method
      static void showCompanyCount() {
		  System.out.println("Total Employees in company:"+companyCount);
      }
      
      // Non-Static Method
      void doTask() {
    	  taskCount++;   // Increase per-employee task count
    	  System.out.println(empName+"completed a task. Task count ="+taskCount);
      }
      
      // Non-static method to display details
      void displayDetails() {
    	  System.out.println("Employee Id:"+empid);
    	  System.out.println("Employee Name:"+empName);
    	  System.out.println("Employee Salary:"+salary);
    	  System.out.println("Task Count:"+taskCount);
    	  System.out.println("-----------------------------------------------");
    	  
      }
	
     // Main method to test
	public static void main(String[] args) {
		
		// Call Static method before creating employees
		Employee4.showCompanyCount();
		
		// Create Employee objects
		Employee4 e1 = new Employee4(101, "Prajkta", 50000, 0);
		Employee4 e2 = new Employee4(102, "Namarta", 60000, 0);
		
		// Each employee does some tasks
		e1.doTask();
		e1.doTask();
		e2.doTask();
		
		// display details
		e1.displayDetails();
		e2.displayDetails();
		
		// show total company count
		Employee.showCompanyCount();
		
		
		
	}

}
