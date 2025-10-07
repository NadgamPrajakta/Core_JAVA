package Functional_Interface;

@FunctionalInterface
interface Printer {
    void print(String message);

    default void greet() {
        System.out.println("Welcome to Functional Interfaces!");
    }

    static void info() {
        System.out.println("This is a static method in an interface.");
    }
}

public class Demo_1 {
    public static void main(String[] args) {
        Printer p = (msg) -> System.out.println("Message: " + msg);

        p.print("Hello, Prajkta!");
        p.greet();
        Printer.info();
    }
}
