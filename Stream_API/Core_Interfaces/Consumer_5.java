package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_5 {

    Consumer<String> consumer;

    public Consumer_5() {
        Consumer<String> custom = new PrefixPrinter();
        Consumer<String> lambda = s -> System.out.println("Input received...");

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_5 obj = new Consumer_5();
        obj.consumer.accept("System started successfully.");
    }
}


class PrefixPrinter implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("[INFO] " + s);
    }
}