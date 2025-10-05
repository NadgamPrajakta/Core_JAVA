package MethodOverloading;

public class DisplayInfo {

    // Method 1: Display only name
    public void display(String name) {
        System.out.println("Name: " + name);
    }

    // Method 2: Display name and age
    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method 3: Display name, age, and city
    public void display(String name, int age, String city) {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        DisplayInfo info = new DisplayInfo();

        info.display("Prajkta");
        info.display("Prajkta", 21);
        info.display("Prajkta", 21, "Pune");
    }
}
