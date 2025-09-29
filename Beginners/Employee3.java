package USS.com;

import java.util.Objects;

public class Employee3 {
    private int id;
    private String name;
    private double salary;

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee3 other = (Employee3) obj;
        return this.id == other.id &&
               Double.compare(this.salary, other.salary) == 0 &&
               this.name.equals(other.name);
    }

    // Always override hashCode when overriding equals
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public static void main(String[] args) {
        Employee3 e1 = new Employee3(101, "Prajkta", 50000.0);
        Employee3 e2 = new Employee3(101, "Prajkta", 50000.0);
        Employee3 e3 = new Employee3(102, "Rahul", 60000.0);

        System.out.println("e1.equals(e2): " + e1.equals(e2)); // true (same content)
        System.out.println("e1.equals(e3): " + e1.equals(e3)); // false (different fields)

        // Hash codes should match if objects are equal
        System.out.println("e1.hashCode(): " + e1.hashCode());
        System.out.println("e2.hashCode(): " + e2.hashCode());
        System.out.println("e3.hashCode(): " + e3.hashCode());
    }
}
