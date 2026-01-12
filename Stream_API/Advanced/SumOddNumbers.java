package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class SumOddNumbers {
	
    public static void main(String[] args) {
    	
        Integer result = List.of(10, 15, 20, 25, 30, 35, 44, 67, 88, 90, 13, 14)
                .stream()
                .collect(new OddSumCollector());

        System.out.println("Sum of odd numbers = " + result);
    }
}

class OddSumCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (n % 2 != 0) list.add(n);
        };
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (l1, l2) -> {
            l1.addAll(l2);
            return l1;
        };
    }

    public Function<List<Integer>, Integer> finisher() {
        return list -> list.stream().mapToInt(Integer::intValue).sum();
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
