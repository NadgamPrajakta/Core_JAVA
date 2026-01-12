package advanced;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary{

    public static void main(String[] args) {

        Map<String, Optional<Employee>> map =
                List.of(
                        new Employee("IT",5000,"John"),
                        new Employee("IT",9000,"Alex"),
                        new Employee("HR",4000,"Max")
                )
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        System.out.println(map);
    }
}
