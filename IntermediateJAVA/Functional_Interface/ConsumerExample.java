package Functional_Interface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> display = name -> System.out.println("Hello, " + name);
        display.accept("Prajkta");
    }
}
