package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_20 {

    public static void main(String[] args) {

        List<Department> departments = new ArrayList<>();

        departments.add(new Department("HR", List.of("Amit", "Seema")));
        departments.add(new Department("IT", List.of("Ravi", "Karan")));
        departments.add(new Department("Sales", List.of("John", "Neha")));

        departments.stream()
            .flatMap(new DeptFlattener())
            .forEach(new EmpNamePrinter());
    }
}

class Department {
    String deptName;
    List<String> employees;

    Department(String deptName, List<String> employees) {
        this.deptName = deptName;
        this.employees = employees;
    }
}

class DeptFlattener implements Function<Department, java.util.stream.Stream<String>> {
    public java.util.stream.Stream<String> apply(Department d) {
        return d.employees.stream();
    }
}

class EmpNamePrinter implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println("Employee: " + t);
    }
}
