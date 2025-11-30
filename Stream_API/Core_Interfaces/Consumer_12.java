package coreInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_12 {

    Consumer<List<String>> consumer;

    public Consumer_12() {
        Consumer<List<String>> custom = new UppercaseListConsumer();
        Consumer<List<String>> lambda = list -> System.out.println("Original List: " + list);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_12 obj = new Consumer_12();
        List<String> fruits = new java.util.ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");

        obj.consumer.accept(fruits);
        System.out.println("Updated List: " + fruits);
    }
}


class UppercaseListConsumer implements Consumer<List<String>> {
    @Override
    public void accept(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println("Converted all items to uppercase");
    }
}