package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class CountEvenNumbers {
	
    public static void main(String[] args) {
    	
        Integer count = List.of(2, 3, 4, 5, 6, 8, 9, 10, 45, 78, 33, 45)
                .stream()
                .collect(new EvenCountCollector());

        System.out.println("Even count = " + count);
    }
}

class EvenCountCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n % 2 == 0) list.add(n);
        };
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> {
            a.addAll(b);
            return a;
        };
    }

    public Function<List<Integer>, Integer> finisher() {
        return List::size;
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}

