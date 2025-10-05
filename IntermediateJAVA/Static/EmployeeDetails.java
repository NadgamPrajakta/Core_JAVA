package Static;

public class EmployeeDetails {
    static String companyName = "TechNova Pvt. Ltd.";

    private String name;
    private double salary;

    public EmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Non-static method
    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name + ", Company: " + companyName + ", Salary: ₹" + salary);
    }

    // Static method
    public static void changeCompany(String newCompany) {
        companyName = newCompany;
    }

    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails("Prajkta", 75000);
        EmployeeDetails e2 = new EmployeeDetails("Sneha", 68000);

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();

        System.out.println("\n--- Changing Company (Static) ---");
        EmployeeDetails.changeCompany("InfyTech Systems");

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
    }
}
