package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class SumOfSquares {
	
    public static void main(String[] args) {
    	
        Integer sum = List.of(1, 2, 3, 4)
                .stream()
                .collect(new SquareSumCollector());

        System.out.println("Sum of Squares = " + sum);
    }
}

class SquareSumCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> list.add(n * n);
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
