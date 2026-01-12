package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class MultipleOfThree {
	
    public static void main(String[] args) {
    	
        Integer sum = List.of(3, 6, 10, 12, 14, 15, 64, 34, 44, 56)
                .stream()
                .collect(new MultipleThreeCollector());

        System.out.println("Sum of multiples of 3 = " + sum);
    }
}

class MultipleThreeCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n % 3 == 0) list.add(n);
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
