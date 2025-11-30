package collection_class;


@FunctionalInterface
interface Calculate {
    void calculate(int a, int b);
}

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        Calculate add = (a, b) -> System.out.println("Add: " + (a + b));
        add.calculate(6, 5);

        Calculate sub = (a, b) -> System.out.println("Subtract: " + (a - b));
        sub.calculate(6, 5);

        Calculate mult = (a, b) -> System.out.println("Multiply: " + (a * b));
        mult.calculate(6, 5);

        Calculate div = (a, b) -> System.out.println("Divide: " + (a / b));
        div.calculate(6, 5);
    }
}