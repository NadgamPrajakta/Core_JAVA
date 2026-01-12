package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class MinValueDemo {
	
    public static void main(String[] args) {
    	
        Integer min = List.of(8, 3, 9, 1)
                .stream()
                .collect(new MinCollector());

        System.out.println("Min value = " + min);
    }
}

class MinCollector implements Collector<Integer, List<Integer>, Integer> {

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
        return list -> Collections.min(list);
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
