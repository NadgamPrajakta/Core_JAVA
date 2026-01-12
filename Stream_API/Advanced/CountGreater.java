package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class CountGreater {
	
    public static void main(String[] args) {
    	
        Integer count = List.of(40, 60, 80, 20, 10, 50, 90, 70, 30, 55)
                .stream()
                .collect(new Greater50Collector());

        System.out.println("Count > 50 = " + count);
    }
}

class Greater50Collector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n > 50) list.add(n);
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

