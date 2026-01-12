package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class AverageDemo {
	
    public static void main(String[] args) {
    	
        Double avg = List.of(10, 20, 30, 60, 50, 40, 80, 90, 33, 44, 77)
                .stream()
                .collect(new AverageCollector());

        System.out.println("Average = " + avg);
    }
}

class AverageCollector implements Collector<Integer, List<Integer>, Double> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return List::add;
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<List<Integer>, Double> finisher() {
        return list -> list.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}

