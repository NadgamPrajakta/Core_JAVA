package MethodOverloading;

public class EmployeeSalary {

    // Calculate salary (basic only)
    public void calculateSalary(double basicSalary) {
        System.out.println("Total Salary: ₹" + basicSalary);
    }

    // Calculate salary with bonus
    public void calculateSalary(double basicSalary, double bonus) {
        double total = basicSalary + bonus;
        System.out.println("Total Salary with Bonus: ₹" + total);
    }

    // Calculate salary with bonus and deductions
    public void calculateSalary(double basicSalary, double bonus, double deductions) {
        double total = basicSalary + bonus - deductions;
        System.out.println("Net Salary: ₹" + total);
    }

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary();

        e.calculateSalary(40000);
        e.calculateSalary(40000, 5000);
        e.calculateSalary(40000, 5000, 2000);
    }
}
