package Functional_Interface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> power = (a, b) -> (int)Math.pow(a, b);
        System.out.println(power.apply(10, 20)); // 8
    }
}

