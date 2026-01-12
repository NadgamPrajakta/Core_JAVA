package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class MedianDemo {
    public static void main(String[] args) {
        Integer median = List.of(5, 2, 8, 4, 1)
                .stream()
                .collect(new MedianCollector());

        System.out.println("Median = " + median);
    }
}

class MedianCollector implements Collector<Integer, List<Integer>, Integer> {

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
            Collections.sort(list);
            return list.get(list.size() / 2);
        };
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
