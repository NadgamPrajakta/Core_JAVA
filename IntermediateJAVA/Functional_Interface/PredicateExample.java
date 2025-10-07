package Functional_Interface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println(isPositive.test(10)); // true
        System.out.println(isPositive.test(-3)); // false
    }
}
