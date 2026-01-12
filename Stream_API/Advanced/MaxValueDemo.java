package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class MaxValueDemo {
	
    public static void main(String[] args) {
    	
        Integer max = List.of(10, 40, 20, 5)
                .stream()
                .collect(new MaxCollector());

        System.out.println("Max value = " + max);
    }
}

class MaxCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return List::add;
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> {
            a.addAll(b);
            return a;
        };
    }

    public Function<List<Integer>, Integer> finisher() {
        return list -> Collections.max(list);
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}

