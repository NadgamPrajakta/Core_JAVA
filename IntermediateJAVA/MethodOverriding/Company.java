package MethodOverriding;

class Employee {
    double getSalary() {
        return 30000;
    }
}

class Developer extends Employee {
    @Override
    double getSalary() {
        return 50000;
    }
}

class Manager extends Employee {
    @Override
    double getSalary() {
        return 70000;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Manager();

        System.out.println("Developer Salary: ₹" + e1.getSalary());
        System.out.println("Manager Salary: ₹" + e2.getSalary());
    }
}
