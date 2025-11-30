package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;

public class Custom_10 {

    public static void main(String[] args) {

        List<Employeee> emps = new ArrayList<>();

        emps.add(new Employeee(101, "Amit"));
        emps.add(new Employeee(102, "Ravi"));
        emps.add(new Employeee(101, "Amit")); // duplicate based on ID

        emps.stream()
            .distinct()
            .forEach(new EmployeeePrinter());
    }
}

class Employeee {
    int id;
    String name;

    Employeee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
    	Employeee e = (Employeee) obj;
        return this.id == e.id;
    }

    public int hashCode() {
        return id;
    }
}

class EmployeeePrinter implements java.util.function.Consumer<Employeee> {
    public void accept(Employeee e) {
        System.out.println(e.id + " - " + e.name);
    }
}
