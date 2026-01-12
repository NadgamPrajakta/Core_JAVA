package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class PrimeCount {
	
    public static void main(String[] args) {
    	
        Integer count = List.of(2, 3, 4, 5, 6)
                .stream()
                .collect(new PrimeCollector());

        System.out.println("Prime Count = " + count);
    }
}

class PrimeCollector implements Collector<Integer, List<Integer>, Integer> {

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, n) -> {
            if (isPrime(n)) list.add(n);
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
