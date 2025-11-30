package coreInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_11 {

    Consumer<List<String>> consumer;

    public Consumer_11() {
        Consumer<List<String>> custom = new RemoveEmptyConsumer();
        Consumer<List<String>> lambda = list -> System.out.println("Before Clean: " + list);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_11 obj = new Consumer_11();
        List<String> data = new java.util.ArrayList<>();
        data.add("Hello");
        data.add("");
        data.add("World");

        obj.consumer.accept(data);
        System.out.println("Final List: " + data);
    }
}


class RemoveEmptyConsumer implements Consumer<List<String>> {
    @Override
    public void accept(List<String> list) {
        list.removeIf(String::isEmpty);
        System.out.println("Removed empty strings");
    }
}