package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class OddProduct {
	
    public static void main(String[] args) {
    	
        Integer product = List.of(1, 2, 3, 5)
                .stream()
                .collect(new OddProductCollector());

        System.out.println("Odd Product = " + product);
    }
}

class OddProductCollector implements Collector<Integer, List<Integer>, Integer> {

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
        return list -> {
            int product = 1;
            for (int i : list) product *= i;
            return product;
        };
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
