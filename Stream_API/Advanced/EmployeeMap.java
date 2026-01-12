package advanced;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMap {

    public static void main(String[] args) {

        Map<String, Double> map =
                List.of(
                        new Employee("IT",5000,"John"),
                        new Employee("HR",4000,"Max")
                )
                .stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        System.out.println(map);
    }
}

