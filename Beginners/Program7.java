package USS.com;

class Student {
    String name;
    int age;

    // Sole Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Program7{
    public static void main(String[] args) {
        // Creating objects using the sole constructor
        Student s1 = new Student("Prajkta", 22);
        Student s2 = new Student("Pratibha", 21);

        s1.display();
        s2.display();
    }
}
