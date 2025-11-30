package intermediatary_ops;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Custom_3 {
    public static void main(String[] args) {
    	
        List<Employee> employees = Arrays.asList(
            new Employee("Asha", 22, 50000),
            new Employee("Bimal", 35, 75000),
            new Employee("Chitra", 28, 62000),
            new Employee("Dipak", 19, 30000)
        );

        
        employees.stream()
                 .filter(new AgePredicate(25))                 // keep age >= 25
                 .map(new EmpToDisplay())                      // convert to display string
                 .sorted(new NameStringComparator())          // sort by name (string)
                 .forEach(new PrintConsumer());               // print each
    }
}


class Employee {
    final String name;
    final int age;
    final double salary;
    
    Employee(String name, int age, double salary) { 
    	this.name = name; 
    	this.age = age; 
    	this.salary = salary; }
}


class AgePredicate implements Predicate<Employee> {
    private final int minAge;
    AgePredicate(int minAge) { this.minAge = minAge; }
    public boolean test(Employee e) { return e.age >= minAge; }
}


class EmpToDisplay implements Function<Employee, String> {
    public String apply(Employee e) {
        return String.format("%s (age:%d) - ₹%.2f", e.name, e.age, e.salary);
    }
}


class NameStringComparator implements Comparator<String> {
    public int compare(String a, String b) { 
    	return a.compareToIgnoreCase(b); }
}


class PrintConsumer implements Consumer<String> {
    public void accept(String s) { System.out.println(s); }
}
