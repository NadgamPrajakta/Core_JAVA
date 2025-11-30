package coreInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_10 {

    Consumer<List<String>> consumer;

    public Consumer_10() {
        Consumer<List<String>> custom = new AddNameConsumer();
        Consumer<List<String>> lambda = list -> System.out.println("Initial List: " + list);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_10 obj = new Consumer_10();
        List<String> names = new java.util.ArrayList<>();
        obj.consumer.accept(names);
        System.out.println("Final List: " + names);
    }
}


class AddNameConsumer implements Consumer<List<String>> {
    @Override
    public void accept(List<String> list) {
        list.add("John");
        System.out.println("Added 'John' to list");
    }
}