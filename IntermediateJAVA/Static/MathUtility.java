package Static;

public class MathUtility {

    // Static method to add numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to multiply numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to find max of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // No object creation needed!
    public static void main(String[] args) {
        System.out.println("Addition: " + MathUtility.add(10, 5));
        System.out.println("Multiplication: " + MathUtility.multiply(4, 7));
        System.out.println("Maximum: " + MathUtility.max(9, 15));
    }
}
