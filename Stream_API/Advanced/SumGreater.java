package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class SumGreater {
	
    public static void main(String[] args) {
    	
        Integer sum = List.of(10, 25, 30, 5)
                .stream()
                .collect(new GreaterThan20Collector());

        System.out.println("Sum > 20 = " + sum);
    }
}

class GreaterThan20Collector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n > 20) list.add(n);
        };
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> {
            a.addAll(b);
            return a;
        };
    }

    public Function<List<Integer>, Integer> finisher() {
        return list -> list.stream().mapToInt(Integer::intValue).sum();
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
