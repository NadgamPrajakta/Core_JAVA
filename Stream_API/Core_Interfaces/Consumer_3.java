package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_3 {

    Consumer<String> consumer;

    public Consumer_3() {
        Consumer<String> custom = new LengthPrinter();
        Consumer<String> lambda = s -> System.out.println("Received: " + s);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
        Consumer_3 obj = new Consumer_3();
        obj.consumer.accept("Programming");
    }
}


class LengthPrinter implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("Length: " + s.length());
    }
}