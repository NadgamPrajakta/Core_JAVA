package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class SumOfDigits {
	
    public static void main(String[] args) {
    	
        Integer sum = List.of(12, 34, 78, 54, 34, 23, 11, 32, 54)
                .stream()
                .collect(new DigitSumCollector());

        System.out.println("Sum of Digits = " + sum);
    }
}

class DigitSumCollector implements Collector<Integer, List<Integer>, Integer> {

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
            int sum = 0;
            for (int n : list) {
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
            }
            return sum;
        };
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
