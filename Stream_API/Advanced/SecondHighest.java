package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class SecondHighest {
	
    public static void main(String[] args) {
    	
        Integer result = List.of(10, 40, 30, 50, 66, 89, 43, 65, 1234)
                .stream()
                .collect(new SecondHighestCollector());

        System.out.println("Second Highest = " + result);
    }
}

class SecondHighestCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return List::add;
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<List<Integer>, Integer> finisher() {
        return list -> {
            list.sort(Collections.reverseOrder());
            return list.get(1);
        };
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
