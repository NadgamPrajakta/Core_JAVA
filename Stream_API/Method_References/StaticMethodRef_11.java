package method_references;

import java.util.function.BiFunction;

public class StaticMethodRef_11 {
	
    public static void main(String[] args) {
    	
        BiFunction<Integer, Integer, Integer> bf = Calculator::add;
        
        System.out.println(bf.apply(10, 60));
    }
}


class Calculator {
	
    static int add(int a, int b) {
        return a + b;
    }
}