package coreInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_13 {

    Consumer<List<String>> consumer;

    public Consumer_13() {
        Consumer<List<String>> custom = new PrintListConsumer();
        Consumer<List<String>> lambda = list -> System.out.println("List size: " + list.size());

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_13 obj = new Consumer_13();
        List<String> items = java.util.Arrays.asList("Java", "Python", "C++");

        obj.consumer.accept(items);
    }
}


class PrintListConsumer implements Consumer<List<String>> {
    @Override
    public void accept(List<String> list) {
        System.out.println("Elements:");
        list.forEach(System.out::println);
    }
}