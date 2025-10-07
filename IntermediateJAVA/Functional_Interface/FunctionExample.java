package Functional_Interface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFinder = str -> str.length();
        System.out.println(lengthFinder.apply("Functional")); // 10
    }
}
