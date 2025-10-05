package MethodOverriding;

class Student {
    void showGrade() {
        System.out.println("Grade: Not defined");
    }
}

class Undergraduate extends Student {
    @Override
    void showGrade() {
        System.out.println("Undergraduate Grade: A");
    }
}

class Postgraduate extends Student {
    @Override
    void showGrade() {
        System.out.println("Postgraduate Grade: A+");
    }
}

public class College {
    public static void main(String[] args) {
        Student s1 = new Undergraduate();
        Student s2 = new Postgraduate();

        s1.showGrade();
        s2.showGrade();
    }
}
