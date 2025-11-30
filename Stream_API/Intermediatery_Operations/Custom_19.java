package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;

public class Custom_19 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Puja"));
        students.add(new Student(1, "Amit")); // duplicate
        students.add(new Student(3, "Rita"));

        students.stream()
            .distinct()
            .forEach(new StudentPrinter());
    }
}

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.roll == s.roll;
    }

    public int hashCode() {
        return roll;
    }
}

class StudentPrinter implements java.util.function.Consumer<Student> {
    public void accept(Student s) {
        System.out.println("Roll: " + s.roll + " | Name: " + s.name);
    }
}
