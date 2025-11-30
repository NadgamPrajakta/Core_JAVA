package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Custom_18 {

    public static void main(String[] args) {

        List<Staff> list = new ArrayList<>();
        list.add(new Staff("Rohit", 45000));
        list.add(new Staff("Sneha", 70000));
        list.add(new Staff("Karan", 55000));

        list.stream()
            .sorted(new SalarySorterDesc())
            .forEach(new StaffPrinter());
    }
}

class Staff {
    String name;
    int salary;

    Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class SalarySorterDesc implements Comparator<Staff> {
    public int compare(Staff s1, Staff s2) {
        return s2.salary - s1.salary; // descending order
    }
}

class StaffPrinter implements java.util.function.Consumer<Staff> {
    public void accept(Staff s) {
        System.out.println(s.name + " → " + s.salary);
    }
}
