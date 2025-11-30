package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_6 {

    Consumer<Integer> consumer;

    public Consumer_6() {
        Consumer<Integer> custom = new SquarePrinter();
        Consumer<Integer> lambda = n -> System.out.println("Number: " + n);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_6 obj = new Consumer_6();
        obj.consumer.accept(7);
    }
}


class SquarePrinter implements Consumer<Integer> {

    @Override
    public void accept(Integer n) {
        System.out.println("Square: " + (n * n));
    }
}