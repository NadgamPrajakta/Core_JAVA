package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class EvenSquareSum {

	public static void main(String[] args) {
		
        Integer sum = List.of(2, 3, 4, 5, 6, 7, 8, 9, 42, 56, 10)
                .stream()
                .collect(new EvenSquareCollector());

        System.out.println("Even Square Sum = " + sum);
    }
}

class EvenSquareCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n % 2 == 0) list.add(n * n);
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

