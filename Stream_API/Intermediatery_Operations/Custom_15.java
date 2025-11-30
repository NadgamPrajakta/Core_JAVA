package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Custom_15 {

    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Amit", 45000));
        list.add(new Employee2("Riya", 55000));
        list.add(new Employee2("John", 30000));
        list.add(new Employee2("Sara", 70000));

        list.stream()
            .filter(new SalaryFilter())
            .forEach(new EmployeeDetailsPrinter());
    }
}

class Employee2 {
    String name;
    int salary;

    Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class SalaryFilter implements Predicate<Employee2> {
    public boolean test(Employee2 e) {
        return e.salary >= 50000;
    }
}

class EmployeeDetailsPrinter implements java.util.function.Consumer<Employee2> {
    public void accept(Employee2 e) {
        System.out.println(e.name + " | Salary = " + e.salary);
    }
}
