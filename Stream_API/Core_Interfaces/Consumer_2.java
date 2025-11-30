package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_2{

    Consumer<String> consumer;

    public Consumer_2() {
        Consumer<String> custom = new UppercasePrinter();
        Consumer<String> lambda = s -> System.out.println("Original: " + s);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
        Consumer_2 obj = new Consumer_2();
        obj.consumer.accept("hello world");
    }
}


class UppercasePrinter implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("Uppercase: " + s.toUpperCase());
    }
}