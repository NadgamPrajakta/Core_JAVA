package Ctor;


public class Emp_1 {
    // Private data members
    private int empId;
    private String name;
    private double salary;

    // Parameterized constructor
    public Emp_1(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Default constructor
    public Emp_1() {
        // Default values
        this.empId = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Getter and Setter for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: ₹" + salary);
    }

    // Main method to test
    public static void main(String[] args) {
        // Using parameterized constructor
        Emp_1 e1 = new Emp_1(101, "Prajkta Nadgam", 75000.50);
        e1.displayEmployeeDetails();

        System.out.println("\n--- After Updating Details ---");

        // Using setters to update details
        e1.setName("Prajkta N.");
        e1.setSalary(80000.75);
        e1.displayEmployeeDetails();

        System.out.println("\n--- Using Default Constructor ---");
        // Using default constructor and setters
        Emp_1 e2 = new Emp_1();
        e2.setEmpId(102);
        e2.setName("John Doe");
        e2.setSalary(50000);
        e2.displayEmployeeDetails();
    }
}
