package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class NegativeSum {
	
    public static void main(String[] args) {
    	
        Integer sum = List.of(-5, 10, -15, 20, -40, -8, -30, -19)
                .stream()
                .collect(new NegativeSumCollector());

        System.out.println("Negative Sum = " + sum);
    }
}

class NegativeSumCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n < 0) list.add(n);
        };
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<List<Integer>, Integer> finisher() {
        return list -> list.stream().mapToInt(Integer::intValue).sum();
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
