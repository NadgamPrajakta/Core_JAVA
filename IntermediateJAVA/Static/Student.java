package Static;

public class Student {
    // Static variable (shared among all students)
    static String collegeName = "NKOCET";

    // Non-static (specific to each student)
    private String name;
    private int rollNo;

    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Non-static method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + collegeName);
    }

    // Static method
    public static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }

    public static void main(String[] args) {
        // Access static variable directly using class name
        System.out.println("Default College: " + Student.collegeName);

        // Create student objects
        Student s1 = new Student("Prajkta", 101);
        Student s2 = new Student("Sneha", 102);

        // Display info
        s1.displayInfo();
        s2.displayInfo();

        System.out.println("\n--- Changing College Name Using Static Method ---");
        Student.changeCollege("MIT-WPU");

        // Display info again after changing static variable
        s1.displayInfo();
        s2.displayInfo();
    }
}
