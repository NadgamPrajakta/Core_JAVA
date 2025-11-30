package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_25 {

    public static void main(String[] args) {

        List<Officer> officers = new ArrayList<>();
        officers.add(new Officer("Rohan", "IT", 60000));
        officers.add(new Officer("Sneha", "HR", 55000));
        officers.add(new Officer("Amit", "Sales", 45000));

        officers.stream()
            .map(new OfficerDetailMaker())
            .forEach(new OfficerDetailPrinter());
    }
}

class Officer {
    String name;
    String dept;
    int salary;

    Officer(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

class OfficerDetailMaker implements Function<Officer, String> {
    public String apply(Officer o) {
        return o.name + " (" + o.dept + ") → Salary: " + o.salary;
    }
}

class OfficerDetailPrinter implements java.util.function.Consumer<String> {
    public void accept(String s) {
        System.out.println("Details: " + s);
    }
}
