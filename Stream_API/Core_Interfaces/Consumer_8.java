package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_8 {

    Consumer<Integer> consumer;

    public Consumer_8() {
        Consumer<Integer> custom = new DoublePrinter();
        Consumer<Integer> lambda = n -> System.out.println("Original: " + n);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_8 obj = new Consumer_8();
        obj.consumer.accept(12);
    }
}


class DoublePrinter implements Consumer<Integer> {

    @Override
    public void accept(Integer n) {
        System.out.println("Doubled: " + (n * 2));
    }
}