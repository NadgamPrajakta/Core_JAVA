package advanced;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeGroup {

    public static void main(String[] args) {

        Map<String, List<Employee>> map =
                List.of(
                        new Employee("IT",5000,"John"),
                        new Employee("HR",3000,"Max"),
                        new Employee("IT",8000,"Alex")
                )
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(map);
    }
}
