package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_4 {

    Consumer<String> consumer;

    public Consumer_4() {
        Consumer<String> custom = new ReversePrinter();
        Consumer<String> lambda = s -> System.out.println("Input: " + s);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
        Consumer_4 obj = new Consumer_4();
        obj.consumer.accept("Java");
    }
}


class ReversePrinter implements Consumer<String> {
    @Override
    public void accept(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Reversed: " + sb.reverse());
    }
}