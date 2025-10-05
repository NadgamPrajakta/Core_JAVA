package Static;

public class StaticDemo {
    // Static variable
    static int counter;

    // Static block (runs once when the class is loaded)
    static {
        counter = 100;
        System.out.println("Static Block Executed. Counter initialized to 100.");
    }

    // Non-static method
    public void incrementCounter() {
        counter++;
        System.out.println("Counter incremented to: " + counter);
    }

    // Static method
    public static void displayCounter() {
        System.out.println("Current Counter Value: " + counter);
    }

    public static void main(String[] args) {
        // Static block executes before main()

        // Access static method without creating object
        StaticDemo.displayCounter();

        // Create objects
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.incrementCounter();
        obj2.incrementCounter();

        StaticDemo.displayCounter();  // Can also call using class name
    }
}
