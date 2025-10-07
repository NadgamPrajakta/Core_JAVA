package Functional_Interface;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Program_1 {
    public static void main(String[] args) {
        // Lambda for addition
        Calculator add = (a, b) -> a + b;
        // Lambda for multiplication
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.operate(5, 3));
        System.out.println("Product: " + multiply.operate(5, 3));
    }
}
