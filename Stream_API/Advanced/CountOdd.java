package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class CountOdd {
	
    public static void main(String[] args) {
    	
        Integer count = List.of(1, 2, 3, 4, 5, 7)
                .stream()
                .collect(new OddCountCollector());

        System.out.println("Odd Count = " + count);
    }
}

class OddCountCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n % 2 != 0) list.add(n);
        };
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<List<Integer>, Integer> finisher() {
        return List::size;
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
