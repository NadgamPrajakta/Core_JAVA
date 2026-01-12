package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class UniqueCount {
	
    public static void main(String[] args) {
    	
        Integer count = List.of(1, 2, 2, 3, 3, 3)
                .stream()
                .collect(new UniqueCollector());

        System.out.println("Unique Count = " + count);
    }
}

class UniqueCollector implements Collector<Integer, Set<Integer>, Integer> {

    public Supplier<Set<Integer>> supplier() {
        return HashSet::new;
    }

    public BiConsumer<Set<Integer>, Integer> accumulator() {
        return Set::add;
    }

    public BinaryOperator<Set<Integer>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<Set<Integer>, Integer> finisher() {
        return Set::size;
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}

