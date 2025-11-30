package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Custom_22 {

    public static void main(String[] args) {

        List<EmployeeAge> employees = new ArrayList<>();
        employees.add(new EmployeeAge("Amit", 28));
        employees.add(new EmployeeAge("Riya", 32));
        employees.add(new EmployeeAge("Karan", 45));
        employees.add(new EmployeeAge("Neha", 25));

        employees.stream()
            .filter(new AgeFilter())
            .forEach(new EmployeeAgePrinter());
    }
}

class EmployeeAge {
    String name;
    int age;

    EmployeeAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeFilter implements Predicate<EmployeeAge> {
    public boolean test(EmployeeAge e) {
        return e.age >= 30;
    }
}

class EmployeeAgePrinter implements java.util.function.Consumer<EmployeeAge> {
    public void accept(EmployeeAge e) {
        System.out.println(e.name + " | Age = " + e.age);
    }
}
