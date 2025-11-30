package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_7 {

    Consumer<Integer> consumer;

    public Consumer_7() {
        Consumer<Integer> custom = new EvenCheckPrinter();
        Consumer<Integer> lambda = n -> System.out.println("Checking: " + n);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_7 obj = new Consumer_7();
        obj.consumer.accept(14);
        obj.consumer.accept(9);
    }
}


class EvenCheckPrinter implements Consumer<Integer> {

    @Override
    public void accept(Integer n) {
        System.out.println("Is Even? " + (n % 2 == 0));
    }
}