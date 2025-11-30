package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_9 {

    Consumer<Integer> consumer;

    public Consumer_9() {

        Consumer<Integer> custom = new SignPrinter();
        Consumer<Integer> lambda = n -> System.out.println("Input: " + n);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_9 obj = new Consumer_9();
        obj.consumer.accept(-10);
        obj.consumer.accept(0);
        obj.consumer.accept(5);
    }
}


class SignPrinter implements Consumer<Integer> {

    @Override
    public void accept(Integer num) {
        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}